
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.veryediblefoods.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.veryediblefoods.EdiblefoodsMod;

public class EdiblefoodsModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, EdiblefoodsMod.MODID);
	public static final RegistryObject<Potion> BEER = REGISTRY.register("beer", () -> new Potion(new MobEffectInstance(EdiblefoodsModMobEffects.DRUNK.get(), 3600, 1, false, true)));
}
