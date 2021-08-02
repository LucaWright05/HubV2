package com.fakeskill.HubV1.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {

    public static ItemStack hub;

    public static void init() {
        createHub();
    }

    private static void createHub() {
        ItemStack item = new ItemStack(Material.COMPASS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Hub Selector");
        List<String> lore = new ArrayList<>();
        lore.add("Please Select A Hub");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DIG_SPEED, 100, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        hub = item;

    }


}
