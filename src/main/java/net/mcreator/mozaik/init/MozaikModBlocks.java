
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mozaik.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.mozaik.block.EjderkalintisiBlock;
import net.mcreator.mozaik.MozaikMod;

public class MozaikModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MozaikMod.MODID);
	public static final RegistryObject<Block> EJDERKALINTISI = REGISTRY.register("ejderkalintisi", () -> new EjderkalintisiBlock());
}
