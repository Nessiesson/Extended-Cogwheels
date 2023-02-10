package com.rabbitminers.extendedgears.cogwheels;

import com.jozufozu.flywheel.core.PartialModel;
import com.rabbitminers.extendedgears.registry.ExtendedCogwheelsTileEntities;
import com.simibubi.create.content.contraptions.base.KineticTileEntity;
import com.simibubi.create.content.contraptions.relays.elementary.CogWheelBlock;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.world.level.block.entity.BlockEntityType;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class CustomCogWheelBlock extends CogWheelBlock implements ICustomCogWheel {
    public PartialModel model;
    protected CustomCogWheelBlock(boolean large, Properties properties, PartialModel model) {
        super(large, properties);
        this.model = model;
    }
    public static CustomCogWheelBlock small(Properties properties, PartialModel model) {
        return new CustomCogWheelBlock(false, properties, model);
    }

    public static CustomCogWheelBlock large(Properties properties, PartialModel model) {
        return new CustomCogWheelBlock(true, properties, model);
    }

    @Override
    public PartialModel getPartialModelType() {
        return this.model;
    }
    @Override
    public BlockEntityType<? extends KineticTileEntity> getTileEntityType() {
        return ExtendedCogwheelsTileEntities.BRACKETED_KINETIC.get();
    }
}
