
package net.mcreator.veryediblefoods.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BeansItem extends Item {
	public BeansItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(15).saturationMod(0.9f).build()));
	}
}
