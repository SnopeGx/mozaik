
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mozaik.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MozaikModTabs {
	public static CreativeModeTab TAB_MOZAIK;

	public static void load() {
		TAB_MOZAIK = new CreativeModeTab("tabmozaik") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MozaikModBlocks.EJDERKALINTISI.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
