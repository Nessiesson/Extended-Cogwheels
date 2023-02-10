package com.rabbitminers.extendedgears.registry;

import com.jozufozu.flywheel.core.PartialModel;
import com.rabbitminers.extendedgears.cogwheels.CustomCogWheelBlock;
import com.rabbitminers.extendedgears.cogwheels.CustomCogwheelItem;
import com.rabbitminers.extendedgears.ExtendedGears;
import com.rabbitminers.extendedgears.util.CogWheelBlockList;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.content.contraptions.relays.elementary.BracketedKineticBlockModel;
import com.simibubi.create.foundation.block.BlockStressDefaults;
import com.simibubi.create.foundation.data.BlockStateGen;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.SharedProperties;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MaterialColor;

import static com.simibubi.create.AllTags.axeOrPickaxe;

public class ExtendedCogwheelsBlocks {
    private static final CreateRegistrate REGISTRATE = ExtendedGears.registrate().creativeModeTab(
            () -> ExtendedGears.itemGroup
    );

    public static final CogWheelBlockList<? extends CustomCogWheelBlock> SMALL_COGWHEELS = new CogWheelBlockList<>(type ->
            REGISTRATE.block(type.getName() + "_cogwheel", p -> CustomCogWheelBlock.small(p, type.getSmallModel()))
                .initialProperties(SharedProperties::stone)
                .properties(p -> p.sound(SoundType.WOOD))
                .properties(p -> p.color(MaterialColor.DIRT))
                .transform(BlockStressDefaults.setNoImpact())
                .transform(axeOrPickaxe())
                .blockstate(BlockStateGen.axisBlockProvider(false))
                .onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
                .item(CustomCogwheelItem::new)
                .build()
                .register());

    public static final CogWheelBlockList<? extends CustomCogWheelBlock> LARGE_COGWHEELS = new CogWheelBlockList<>(type ->
            REGISTRATE.block("large_" + type.getName() + "_cogwheel", p -> CustomCogWheelBlock.large(p, type.getLargeModel()))
                    .initialProperties(SharedProperties::stone)
                    .properties(p -> p.sound(SoundType.WOOD))
                    .properties(p -> p.color(MaterialColor.DIRT))
                    .transform(BlockStressDefaults.setNoImpact())
                    .transform(axeOrPickaxe())
                    .blockstate(BlockStateGen.axisBlockProvider(false))
                    .onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
                    .item(CustomCogwheelItem::new)
                    .build()
                    .register());
    public static void register() {}
}
