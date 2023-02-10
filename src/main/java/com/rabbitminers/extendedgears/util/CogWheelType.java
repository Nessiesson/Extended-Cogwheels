package com.rabbitminers.extendedgears.util;

import com.jozufozu.flywheel.core.PartialModel;
import com.rabbitminers.extendedgears.registry.ExtendedCogwheelsBlocks;
import com.rabbitminers.extendedgears.registry.ExtendedCogwheelsPartials;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;

public enum CogWheelType {
    DARK_OAK("dark_oak", ExtendedCogwheelsPartials.DARK_OAK_COGWHEEL, ExtendedCogwheelsPartials.LARGE_DARK_OAK_COGWHEEL),
    OAK("oak", ExtendedCogwheelsPartials.OAK_COGWHEEL, ExtendedCogwheelsPartials.LARGE_OAK_COGWHEEL),
    BIRCH("birch", ExtendedCogwheelsPartials.BIRCH_COGWHEEL, ExtendedCogwheelsPartials.LARGE_BIRCH_COGWHEEL),
    JUNGLE("jungle", ExtendedCogwheelsPartials.JUNGLE_COGWHEEL, ExtendedCogwheelsPartials.LARGE_JUNGLE_COGWHEEL),
    ACACIA("acacia", ExtendedCogwheelsPartials.ACACIA_COGWHEEL, ExtendedCogwheelsPartials.LARGE_ACACIA_COGWHEEL),
    WARPED("warped", ExtendedCogwheelsPartials.WARPED_COGWHEEL, ExtendedCogwheelsPartials.LARGE_WARPED_COGWHEEL),
    CRIMSON("crimson", ExtendedCogwheelsPartials.CRIMSON_COGWHEEL, ExtendedCogwheelsPartials.LARGE_CRIMSON_COGWHEEL),
    COPPER("copper", ExtendedCogwheelsPartials.COPPER_COGWHEEL, ExtendedCogwheelsPartials.LARGE_COPPER_COGWHEEL),
    IRON("iron", ExtendedCogwheelsPartials.IRON_COGWHEEL, ExtendedCogwheelsPartials.LARGE_IRON_COGWHEEL),
    STEEL("steel", ExtendedCogwheelsPartials.STEEL_COGWHEEL, ExtendedCogwheelsPartials.LARGE_STEEL_COGWHEEL);
    private final String name;
    private final PartialModel smallModel;
    private final PartialModel largeModel;

    CogWheelType(String name, PartialModel smallModel, PartialModel largeModel) {
        this.name = name;
        this.smallModel = smallModel;
        this.largeModel = largeModel;
    }

    public String getName() {
        return name;
    }

    public PartialModel getSmallModel() {
        return smallModel;
    }

    public PartialModel getLargeModel() {
        return largeModel;
    }
}
