
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mozaik.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.mozaik.item.ShelterItem;
import net.mcreator.mozaik.item.Ejderkalintisi2Item;
import net.mcreator.mozaik.MozaikMod;

public class MozaikModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MozaikMod.MODID);
	public static final RegistryObject<Item> EJDERKALINTISI = block(MozaikModBlocks.EJDERKALINTISI, null);
	public static final RegistryObject<Item> EJDERKALINTISI_2 = REGISTRY.register("ejderkalintisi_2", () -> new Ejderkalintisi2Item());
	public static final RegistryObject<Item> SHELTER = REGISTRY.register("shelter", () -> new ShelterItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
