package net.awakey.com;

import net.awakey.com.block.ModBlocks;
import net.awakey.com.datagen.ModWorldGenerator;
import net.awakey.com.registry.ModItemGroups;
import net.awakey.com.registry.ModItems;
import net.awakey.com.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NuclearNourishment implements ModInitializer {
	public static final String MOD_ID = "nuclear";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModWorldGeneration.generateModWorldGen();


		LOGGER.info("Hello Fabric world!");
	}
}