package net.mcreator.veryediblefoods.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.veryediblefoods.init.EdiblefoodsModMobEffects;

public class BeerDrunkenProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(EdiblefoodsModMobEffects.DRUNK.get(), 1500, 1));
	}
}
