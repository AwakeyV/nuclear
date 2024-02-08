package net.awakey.com.registry;

import net.awakey.com.NuclearNourishment;
import net.awakey.com.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup NUKE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(NuclearNourishment.MOD_ID, "nuke"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.nuke"))
                    .icon(() -> new ItemStack(ModItems.RAW_URANIUM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_URANIUM);
                        entries.add(ModItems.RADIOACTIVE_BREAD);
                        entries.add(ModItems.RADIOACTIVE_CHICKEN);
                        entries.add(ModItems.RADIOACTIVE_APPLE);
                        entries.add(ModItems.RADIOACTIVE_CARROT);
                        entries.add(ModItems.RADIOACTIVE_BEETROOT);
                        entries.add(ModItems.RADIOACTIVE_BAKED_POTATO);
                        entries.add(ModItems.RADIOACTIVE_COOKED_BEEF);
                        entries.add(ModItems.RADIOACTIVE_COOKED_MUTTON);
                        entries.add(ModItems.RADIOACTIVE_COOKED_PORKCHOP);
                        entries.add(ModItems.RADIOACTIVE_COOKED_RABBIT);
                        entries.add(ModItems.RADIOACTIVE_COOKED_COD);
                        entries.add(ModItems.RADIOACTIVE_COOKED_SALMON);
                        entries.add(ModItems.OMNIPOTENT_APPLE);

                        entries.add(ModBlocks.URANIUM_ORE);







                    }).build());


    public static void registerItemGroups() {
        NuclearNourishment.LOGGER.info("Registering Item Groups for " +NuclearNourishment.MOD_ID);
    }














}
