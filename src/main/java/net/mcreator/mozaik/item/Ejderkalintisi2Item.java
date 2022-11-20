
package net.mcreator.mozaik.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.mozaik.init.MozaikModTabs;

public class Ejderkalintisi2Item extends Item {
	public Ejderkalintisi2Item() {
		super(new Item.Properties().tab(MozaikModTabs.TAB_MOZAIK).stacksTo(16).rarity(Rarity.UNCOMMON)
				.food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f)

						.build()));
	}
}
