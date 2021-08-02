package com.fakeskill.HubV1.events;

import com.fakeskill.HubV1.inventories.Screen;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class ScreenEvents implements Listener {
    @EventHandler

    public void onClick(InventoryClickEvent e) {
        if (e.getClickedInventory() == null) { return; }
        if (e.getClickedInventory().getHolder() instanceof Screen) {
            e.setCancelled(true);


    }

}
    }

