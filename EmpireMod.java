package ru.terrashade.empire.item;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class EmpireMod implements ModInitializer {
    public static final Item ENDER_SPEAR = new EnderSpearItem(new Item.Settings().maxCount(1));

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM, Identifier.of("empire_mod", "ender_spear"), ENDER_SPEAR);
    }
}