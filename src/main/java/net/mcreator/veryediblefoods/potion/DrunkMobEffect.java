
package net.mcreator.veryediblefoods.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.veryediblefoods.procedures.DrunkTickProcedure;

public class DrunkMobEffect extends MobEffect {
	public DrunkMobEffect() {
		super(MobEffectCategory.NEUTRAL, -13261);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		DrunkTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
