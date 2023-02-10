package com.rabbitminers.extendedgears.cogwheels;

import com.jozufozu.flywheel.core.PartialModel;
import com.rabbitminers.extendedgears.registry.ExtendedCogwheelsPartials;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public interface ICustomCogWheel {
    static PartialModel getPartialModelType(BlockState state) {
        return getPartialModelType(state.getBlock());
    }
    static PartialModel getPartialModelType(Block block) {
        if (!(block instanceof ICustomCogWheel cogWheel))
            return null;
        return cogWheel.getPartialModelType();
    }

    default PartialModel getPartialModelType() {
        return ExtendedCogwheelsPartials.METAL_COGWHEEL;
    }
}
