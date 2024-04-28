
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.veryediblefoods.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.veryediblefoods.EdiblefoodsMod;

public class EdiblefoodsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EdiblefoodsMod.MODID);
	public static final RegistryObject<CreativeModeTab> VERY_EDIBLE_FOODS = REGISTRY.register("very_edible_foods",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.ediblefoods.very_edible_foods")).icon(() -> new ItemStack(EdiblefoodsModItems.URANIUM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(EdiblefoodsModItems.URANIUM.get());
				tabData.accept(EdiblefoodsModItems.SUGAR_COOKIE.get());
				tabData.accept(EdiblefoodsModBlocks.URANIUM_ORE.get().asItem());
			}).withSearchBar().build());
}
