package com.fakeskill.HubV1.events;

import com.fakeskill.HubV1.items.ItemManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class LeaveEvent implements Listener {

    @EventHandler
    public void onLeave(PlayerQuitEvent q) {
        Player p = q.getPlayer();
        p.getInventory().removeItem(ItemManager.hub);
    }





}
