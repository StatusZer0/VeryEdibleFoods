
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.veryediblefoods.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.veryediblefoods.block.UraniumOreBlock;
import net.mcreator.veryediblefoods.block.FoodProcessorBlock;
import net.mcreator.veryediblefoods.EdiblefoodsMod;

public class EdiblefoodsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EdiblefoodsMod.MODID);
	public static final RegistryObject<Block> URANIUM_ORE = REGISTRY.register("uranium_ore", () -> new UraniumOreBlock());
	public static final RegistryObject<Block> FOOD_PROCESSOR = REGISTRY.register("food_processor", () -> new FoodProcessorBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
