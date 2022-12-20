package com.rabbitminers.extendedgears.network;

import com.rabbitminers.extendedgears.ExtendedGears;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;

public class Packets {
    private static SimpleChannel INSTANCE;

    private static int packetId = 0;
    private static int id() {
        return packetId++;
    }

    public static void register() {
        SimpleChannel net = NetworkRegistry.ChannelBuilder
                .named(new ResourceLocation(ExtendedGears.MODID, "messages"))
                .networkProtocolVersion(() -> "1.0")
                .clientAcceptedVersions(s -> true)
                .serverAcceptedVersions(s -> true)
                .simpleChannel();

        INSTANCE = net;

        net.messageBuilder(BreakCogwheelPacket.class, id(), NetworkDirection.PLAY_TO_SERVER)
                .decoder(BreakCogwheelPacket::new)
                .encoder(BreakCogwheelPacket::encode)
                .consumer(BreakCogwheelPacket::handle)
                .add();
    }

    public static <MSG> void breakCogwheelServerSide(MSG message) {
        INSTANCE.sendToServer(message);
    }
}
