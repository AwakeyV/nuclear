package net.awakey.com.registry;

import net.awakey.com.NuclearNourishment;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RAW_URANIUM = registerItem("raw_uranium", new Item(new FabricItemSettings()));



    public static final Item RADIOACTIVE_CARROT = registerItem("radioactive_carrot", new Item(new FabricItemSettings().food(ModFoodComponents.RADIOACTIVE_CARROT)));
    public static final Item RADIOACTIVE_BREAD = registerItem("radioactive_bread", new Item(new FabricItemSettings().food(ModFoodComponents.RADIOACTIVE_BREAD)));
    public static final Item RADIOACTIVE_CHICKEN = registerItem("radioactive_chicken", new Item(new FabricItemSettings().food(ModFoodComponents.RADIOACTIVE_CHICKEN)));
    public static final Item RADIOACTIVE_APPLE = registerItem("radioactive_apple", new Item(new FabricItemSettings().food(ModFoodComponents.RADIOACTIVE_APPLE)));
    public static final Item OMNIPOTENT_APPLE = registerItem("omnipotent_apple", new Item(new FabricItemSettings().food(ModFoodComponents.OMNIPOTENT_APPLE)));
    public static final Item RADIOACTIVE_BAKED_POTATO = registerItem("radioactive_baked_potato", new Item(new FabricItemSettings().food(ModFoodComponents.RADIOACTIVE_BAKED_POTATO)));
    public static final Item RADIOACTIVE_COOKED_BEEF = registerItem("radioactive_cooked_beef", new Item(new FabricItemSettings().food(ModFoodComponents.RADIOACTIVE_COOKED_BEEF)));
    public static final Item RADIOACTIVE_BEETROOT = registerItem("radioactive_beetroot", new Item(new FabricItemSettings().food(ModFoodComponents.RADIOACTIVE_BEETROOT)));
    public static final Item RADIOACTIVE_COOKED_COD = registerItem("radioactive_cooked_cod", new Item(new FabricItemSettings().food(ModFoodComponents.RADIOACTIVE_COOKED_COD)));
    public static final Item RADIOACTIVE_COOKED_MUTTON = registerItem("radioactive_cooked_mutton", new Item(new FabricItemSettings().food(ModFoodComponents.RADIOACTIVE_COOKED_MUTTON)));
    public static final Item RADIOACTIVE_COOKED_PORKCHOP = registerItem("radioactive_cooked_porkchop", new Item(new FabricItemSettings().food(ModFoodComponents.RADIOACTIVE_COOKED_PORKCHOP)));
    public static final Item RADIOACTIVE_COOKED_RABBIT = registerItem("radioactive_cooked_rabbit", new Item(new FabricItemSettings().food(ModFoodComponents.RADIOACTIVE_COOKED_RABBIT)));
    public static final Item RADIOACTIVE_COOKED_SALMON = registerItem("radioactive_cooked_salmon", new Item(new FabricItemSettings().food(ModFoodComponents.RADIOACTIVE_COOKED_SALMON)));














    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {

entries.add(RAW_URANIUM);


    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(NuclearNourishment.MOD_ID, name), item);
    }
    public static void registerModItems() {
        NuclearNourishment.LOGGER.info("Registering Mod Items for "+ NuclearNourishment.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }

}
