package net.awakey.com.datagen;

import net.awakey.com.registry.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RADIOACTIVE_APPLE, 8)
                .pattern("UUU")
                .pattern("UFU")
                .pattern("UUU")
                .input('F', ModItems.RAW_URANIUM)
                .input('U', Items.APPLE)
                .criterion(hasItem(ModItems.RAW_URANIUM), conditionsFromItem(ModItems.RAW_URANIUM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RADIOACTIVE_APPLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RADIOACTIVE_BAKED_POTATO, 8)
                .pattern("UUU")
                .pattern("UFU")
                .pattern("UUU")
                .input('F', ModItems.RAW_URANIUM)
                .input('U', Items.BAKED_POTATO)
                .criterion(hasItem(ModItems.RAW_URANIUM), conditionsFromItem(ModItems.RAW_URANIUM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RADIOACTIVE_BAKED_POTATO)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RADIOACTIVE_BEETROOT, 8)
                .pattern("UUU")
                .pattern("UFU")
                .pattern("UUU")
                .input('F', ModItems.RAW_URANIUM)
                .input('U', Items.BEETROOT)
                .criterion(hasItem(ModItems.RAW_URANIUM), conditionsFromItem(ModItems.RAW_URANIUM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RADIOACTIVE_BEETROOT)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RADIOACTIVE_BREAD, 8)
                .pattern("UUU")
                .pattern("UFU")
                .pattern("UUU")
                .input('F', ModItems.RAW_URANIUM)
                .input('U', Items.BREAD)
                .criterion(hasItem(ModItems.RAW_URANIUM), conditionsFromItem(ModItems.RAW_URANIUM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RADIOACTIVE_BREAD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RADIOACTIVE_CARROT, 8)
                .pattern("UUU")
                .pattern("UFU")
                .pattern("UUU")
                .input('F', ModItems.RAW_URANIUM)
                .input('U', Items.CARROT)
                .criterion(hasItem(ModItems.RAW_URANIUM), conditionsFromItem(ModItems.RAW_URANIUM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RADIOACTIVE_CARROT)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RADIOACTIVE_CHICKEN, 8)
                .pattern("UUU")
                .pattern("UFU")
                .pattern("UUU")
                .input('F', ModItems.RAW_URANIUM)
                .input('U', Items.COOKED_CHICKEN)
                .criterion(hasItem(ModItems.RAW_URANIUM), conditionsFromItem(ModItems.RAW_URANIUM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RADIOACTIVE_CHICKEN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RADIOACTIVE_COOKED_BEEF, 8)
                .pattern("UUU")
                .pattern("UFU")
                .pattern("UUU")
                .input('F', ModItems.RAW_URANIUM)
                .input('U', Items.COOKED_BEEF)
                .criterion(hasItem(ModItems.RAW_URANIUM), conditionsFromItem(ModItems.RAW_URANIUM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RADIOACTIVE_COOKED_BEEF)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RADIOACTIVE_COOKED_COD, 8)
                .pattern("UUU")
                .pattern("UFU")
                .pattern("UUU")
                .input('F', ModItems.RAW_URANIUM)
                .input('U', Items.COOKED_COD)
                .criterion(hasItem(ModItems.RAW_URANIUM), conditionsFromItem(ModItems.RAW_URANIUM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RADIOACTIVE_COOKED_COD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RADIOACTIVE_COOKED_MUTTON, 8)
                .pattern("UUU")
                .pattern("UFU")
                .pattern("UUU")
                .input('F', ModItems.RAW_URANIUM)
                .input('U', Items.COOKED_MUTTON)
                .criterion(hasItem(ModItems.RAW_URANIUM), conditionsFromItem(ModItems.RAW_URANIUM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RADIOACTIVE_COOKED_MUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RADIOACTIVE_COOKED_PORKCHOP, 8)
                .pattern("UUU")
                .pattern("UFU")
                .pattern("UUU")
                .input('F', ModItems.RAW_URANIUM)
                .input('U', Items.COOKED_PORKCHOP)
                .criterion(hasItem(ModItems.RAW_URANIUM), conditionsFromItem(ModItems.RAW_URANIUM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RADIOACTIVE_COOKED_PORKCHOP)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RADIOACTIVE_COOKED_RABBIT, 8)
                .pattern("UUU")
                .pattern("UFU")
                .pattern("UUU")
                .input('F', ModItems.RAW_URANIUM)
                .input('U', Items.COOKED_RABBIT)
                .criterion(hasItem(ModItems.RAW_URANIUM), conditionsFromItem(ModItems.RAW_URANIUM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RADIOACTIVE_COOKED_RABBIT)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RADIOACTIVE_COOKED_SALMON, 8)
                .pattern("UUU")
                .pattern("UFU")
                .pattern("UUU")
                .input('F', ModItems.RAW_URANIUM)
                .input('U', Items.COOKED_SALMON)
                .criterion(hasItem(ModItems.RAW_URANIUM), conditionsFromItem(ModItems.RAW_URANIUM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RADIOACTIVE_COOKED_SALMON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OMNIPOTENT_APPLE, 1)
                .pattern("UUU")
                .pattern("NFN")
                .pattern("UUU")
                .input('F', Items.GOLDEN_APPLE)
                .input('N', Items.NETHERITE_INGOT)
                .input('U', ModItems.RAW_URANIUM)

                .criterion(hasItem(ModItems.RAW_URANIUM), conditionsFromItem(ModItems.RAW_URANIUM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.OMNIPOTENT_APPLE)));
    }
}
