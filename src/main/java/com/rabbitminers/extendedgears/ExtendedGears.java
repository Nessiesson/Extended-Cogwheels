package com.rabbitminers.extendedgears;

import com.mojang.logging.LogUtils;
import com.rabbitminers.extendedgears.registry.*;
import com.rabbitminers.extendedgears.util.CogWheelType;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.nullness.NonNullSupplier;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
@Mod(ExtendedGears.MODID)
public class ExtendedGears {
    public static final String MODID = "extendedgears";
    private static final NonNullSupplier<CreateRegistrate> registrate = CreateRegistrate.lazy(ExtendedGears.MODID);
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final CreativeModeTab itemGroup = new CreativeModeTab(MODID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ExtendedCogwheelsBlocks.LARGE_COGWHEELS.get(CogWheelType.DARK_OAK).get());
        }
    };

    public ExtendedGears()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModLoadingContext modLoadingContext = ModLoadingContext.get();

        DistExecutor.unsafeRunWhenOn(Dist.CLIENT,
                () -> ExtendedCogwheelsPartials::init);

        ExtendedCogwheelsBlocks.register();
        ExtendedCogwheelsItems.register(eventBus);
        ExtendedCogwheelsTileEntities.register();

        eventBus.addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {}

    public static CreateRegistrate registrate() {
        return registrate.get();
    }

    public static ResourceLocation asResource(String path) {
        return new ResourceLocation(MODID, path);
    }
}
