package net.awakey.com.datagen;

import net.awakey.com.block.ModBlocks;
import net.awakey.com.registry.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.URANIUM_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_URANIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RADIOACTIVE_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RADIOACTIVE_BEETROOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RADIOACTIVE_BAKED_POTATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.RADIOACTIVE_BREAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.RADIOACTIVE_CARROT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RADIOACTIVE_CHICKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.RADIOACTIVE_COOKED_BEEF, Models.GENERATED);
        itemModelGenerator.register(ModItems.RADIOACTIVE_COOKED_COD, Models.GENERATED);
        itemModelGenerator.register(ModItems.RADIOACTIVE_COOKED_MUTTON, Models.GENERATED);
        itemModelGenerator.register(ModItems.RADIOACTIVE_COOKED_PORKCHOP, Models.GENERATED);
        itemModelGenerator.register(ModItems.RADIOACTIVE_COOKED_RABBIT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RADIOACTIVE_COOKED_SALMON, Models.GENERATED);
        itemModelGenerator.register(ModItems.OMNIPOTENT_APPLE, Models.GENERATED);

    }
}
