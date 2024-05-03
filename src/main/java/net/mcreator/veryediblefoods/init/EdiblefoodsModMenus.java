
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.veryediblefoods.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.veryediblefoods.world.inventory.ProcessorGUIMenu;
import net.mcreator.veryediblefoods.EdiblefoodsMod;

public class EdiblefoodsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, EdiblefoodsMod.MODID);
	public static final RegistryObject<MenuType<ProcessorGUIMenu>> PROCESSOR_GUI = REGISTRY.register("processor_gui", () -> IForgeMenuType.create(ProcessorGUIMenu::new));
}
