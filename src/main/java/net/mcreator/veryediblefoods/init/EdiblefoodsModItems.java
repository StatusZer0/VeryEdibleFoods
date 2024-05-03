
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.veryediblefoods.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.veryediblefoods.item.UraniumItem;
import net.mcreator.veryediblefoods.item.SugarCookieItem;
import net.mcreator.veryediblefoods.item.CanItem;
import net.mcreator.veryediblefoods.item.BeansItem;
import net.mcreator.veryediblefoods.EdiblefoodsMod;

public class EdiblefoodsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EdiblefoodsMod.MODID);
	public static final RegistryObject<Item> URANIUM = REGISTRY.register("uranium", () -> new UraniumItem());
	public static final RegistryObject<Item> SUGAR_COOKIE = REGISTRY.register("sugar_cookie", () -> new SugarCookieItem());
	public static final RegistryObject<Item> URANIUM_ORE = block(EdiblefoodsModBlocks.URANIUM_ORE);
	public static final RegistryObject<Item> CAN = REGISTRY.register("can", () -> new CanItem());
	public static final RegistryObject<Item> BEANS = REGISTRY.register("beans", () -> new BeansItem());
	public static final RegistryObject<Item> FOOD_PROCESSOR = block(EdiblefoodsModBlocks.FOOD_PROCESSOR);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
