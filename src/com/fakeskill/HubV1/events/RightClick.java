package com.fakeskill.HubV1.events;

import com.fakeskill.HubV1.items.ItemManager;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;


public class RightClick implements Listener {

    @EventHandler
    public void onPlayerUse(PlayerInteractEvent event) {
        Player p = event.getPlayer();

        if (event.getAction().equals(Action.RIGHT_CLICK_AIR)) {
            if (p.getItemInHand().getType() == Material.COMPASS) {
                Bukkit.dispatchCommand(p, "screen");
            }
        }
    }
}
