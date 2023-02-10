package com.rabbitminers.extendedgears.registry;

import com.rabbitminers.extendedgears.ExtendedGears;
import com.rabbitminers.extendedgears.util.CogWheelType;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.Create;
import com.simibubi.create.foundation.ponder.PonderRegistrationHelper;
import com.simibubi.create.foundation.ponder.PonderTag;
import com.simibubi.create.foundation.ponder.content.KineticsScenes;
import com.simibubi.create.foundation.ponder.content.PonderIndex;

public class ExtendedCogwheelsPonderIndex {

    // Use under creates id to access relevant schematics
    static final PonderRegistrationHelper HELPER = new PonderRegistrationHelper(ExtendedGears.MODID);

    public static void register() {
        HELPER.forComponents(ExtendedCogwheelsBlocks.LARGE_COGWHEELS)
                .addStoryBoard("cog/small", KineticsScenes::cogAsRelay, PonderTag.KINETIC_RELAYS)
                .addStoryBoard("cog/speedup", KineticsScenes::cogsSpeedUp)
                .addStoryBoard("cog/encasing", KineticsScenes::cogwheelsCanBeEncased);

        HELPER.forComponents(ExtendedCogwheelsBlocks.LARGE_COGWHEELS)
                .addStoryBoard("cog/speedup", KineticsScenes::cogsSpeedUp)
                .addStoryBoard("cog/large", KineticsScenes::largeCogAsRelay, PonderTag.KINETIC_RELAYS)
                .addStoryBoard("cog/encasing", KineticsScenes::cogwheelsCanBeEncased);
    }
}
