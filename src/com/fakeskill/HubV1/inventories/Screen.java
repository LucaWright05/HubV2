package com.fakeskill.HubV1.inventories;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Screen implements InventoryHolder {

    private Inventory inv;

    public Screen() {
        inv = Bukkit.createInventory(this, 27);
        init();
    }

    private void init() {
        ItemStack item;
        //top
        for (int i = 0; i < 9; i++) {
            item = createItem(".", Material.STAINED_GLASS_PANE, Collections.singletonList(""));
            inv.setItem(i, item);
        }

            //HCF
        for (int i = 11; i == 11; i++) {
            List<String> lore = new ArrayList<>();
            lore.add("§fPlayers: 0");
            lore.add("");
            lore.add("§fMap Kit: Prot 2 Sharp 2");
            lore.add("§fFaction Size: 5");
            lore.add("");
            lore.add("§fClick To Join Queue!");
            item = createItem("§b§lKingdoms", Material.DIAMOND_SWORD, lore);
            inv.setItem(i, item);
        }


        //Kits
        for (int i = 13; i == 13; i++) {
            List<String> lore = new ArrayList<>();
            lore.add("§fPlayers: 0");
            lore.add("");
            lore.add("§fMap Kit: Prot 1 Sharp 1");
            lore.add("§fFaction Size: 25");
            lore.add("");
            lore.add("§fClick To Join Queue!");
            item = createItem("§b§lKits", Material.BOW, lore);
            inv.setItem(i, item);
        }

        //???
        for (int i = 15; i == 15; i++) {
            List<String> lore = new ArrayList<>();
            lore.add("§fPlayers: ???");
            lore.add("");
            lore.add("");
            lore.add("§fServer Offline!");
            item = createItem("§b§l???", Material.REDSTONE_BLOCK, lore);
            inv.setItem(i, item);
        }
        for (int i = 9; i == 9; i++) {
            item = createItem(".", Material.STAINED_GLASS_PANE, Collections.singletonList(""));
            inv.setItem(i, item);
        }
        for (int i = 10; i == 10; i++) {
            item = createItem(".", Material.STAINED_GLASS_PANE, Collections.singletonList(""));
            inv.setItem(i, item);
        }
        for (int i = 12; i == 12; i++) {
            item = createItem(".", Material.STAINED_GLASS_PANE, Collections.singletonList(""));
            inv.setItem(i, item);
        }
        for (int i = 14; i == 14; i++) {
            item = createItem(".", Material.STAINED_GLASS_PANE, Collections.singletonList(""));
            inv.setItem(i, item);
        }
        for (int i = 16; i == 16; i++) {
            item = createItem(".", Material.STAINED_GLASS_PANE, Collections.singletonList(""));
            inv.setItem(i, item);
        }
        for (int i = 17; i == 17; i++) {
            item = createItem(".", Material.STAINED_GLASS_PANE, Collections.singletonList(""));
            inv.setItem(i, item);
        }


        //bottom
        for (int i = 18; i < 27; i++) {
            item = createItem(".", Material.STAINED_GLASS_PANE, Collections.singletonList(""));
            inv.setItem(i, item);
        }


    }

    private ItemStack createItem(String name, Material mat, List<String> lore) {
        ItemStack item = new ItemStack(mat, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    @Override
    public Inventory getInventory() {
        return inv;
    }
}
