
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mozaik.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.mozaik.world.features.ores.EjderkalintisiFeature;
import net.mcreator.mozaik.MozaikMod;

@Mod.EventBusSubscriber
public class MozaikModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MozaikMod.MODID);
	public static final RegistryObject<Feature<?>> EJDERKALINTISI = REGISTRY.register("ejderkalintisi", EjderkalintisiFeature::feature);
}
