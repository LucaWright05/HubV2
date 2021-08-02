package com.fakeskill.HubV1.events;

import com.fakeskill.HubV1.items.ItemManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class HubEvents implements Listener {


    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        p.getInventory().addItem(ItemManager.hub);

        e.setJoinMessage(null);

        p.sendMessage("§8-------------------------------------------");
        p.sendMessage("§oWelcome to the §b§lLoyalty Network§b!");
        p.sendMessage("");
        p.sendMessage(" §8» §bStore§b: https://LoyaltyNetwork.store");
        p.sendMessage(" §8» §bDiscord§b: https://discord.gg/loyaltynetwork");
        p.sendMessage(" §8» §bTeamspeak§b: ts.loyaltynetwork.com");
        p.sendMessage("");
        p.sendMessage("§8-------------------------------------------");
    }
    }




