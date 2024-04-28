
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.veryediblefoods.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.veryediblefoods.potion.DrunkMobEffect;
import net.mcreator.veryediblefoods.EdiblefoodsMod;

public class EdiblefoodsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, EdiblefoodsMod.MODID);
	public static final RegistryObject<MobEffect> DRUNK = REGISTRY.register("drunk", () -> new DrunkMobEffect());
}
