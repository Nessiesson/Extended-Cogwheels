package com.rabbitminers.extendedgears.registry;

import com.rabbitminers.extendedgears.ExtendedGears;
import com.rabbitminers.extendedgears.tileentities.CustomCogWheelTileEntity;
import com.rabbitminers.extendedgears.tileentities.CogWheelKineticTileEntityInstance;
import com.rabbitminers.extendedgears.tileentities.CustomCogWheelTileEntitiyRenderer;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntityEntry;

public class ExtendedCogwheelsTileEntities {
    private static final CreateRegistrate REGISTRATE = ExtendedGears.registrate();
    public static final BlockEntityEntry<CustomCogWheelTileEntity> BRACKETED_KINETIC = REGISTRATE
            .tileEntity("cogwheeltileentity", CustomCogWheelTileEntity::new)
            .instance(() -> CogWheelKineticTileEntityInstance::new, false)
            .validBlocks(ExtendedCogwheelsBlocks.LARGE_COGWHEELS.toArray())
            .validBlocks(ExtendedCogwheelsBlocks.SMALL_COGWHEELS.toArray())
            .renderer(() -> CustomCogWheelTileEntitiyRenderer::new)
            .register();
    public static void register() {}
}
