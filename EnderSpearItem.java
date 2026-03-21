package com.yourname.enderspear;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.TypedActionResult;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraft.util.Hand;

public class EnderSpear implements ModInitializer {

    // Создаем само копье (база от меча для урона)
    public static final Item ENDER_SPEAR = new SwordItem(ToolMaterials.NETHERITE, 5, -2.4f, new Item.Settings().maxCount(1));

    @Override
    public void onInitialize() {
        // Регистрируем предмет на сервере
        Registry.register(Registries.ITEM, new Identifier("endersmp", "ender_spear"), ENDER_SPEAR);
    }
}
