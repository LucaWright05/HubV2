package com.fakeskill.HubV1.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class ScreenEvents2 implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (e.isLeftClick()) {
            Player player = (Player) e.getWhoClicked();
            if (e.getCurrentItem() == null) {
                return;
            }
            if (e.getCurrentItem().getType() == Material.DIAMOND_SWORD) {
                player.sendMessage("Sending you to Kingdoms");
                player.chat("/sendhcf");
                player.closeInventory();

            } else if (e.getCurrentItem().getType() == Material.BOW) {
                player.sendMessage("Sending you to Kits");
                player.closeInventory();
            } else if (e.getCurrentItem().getType() == Material.REDSTONE_BLOCK) {
                player.sendMessage("Server Offline!");
                player.closeInventory();
            }
        }
    }
}
