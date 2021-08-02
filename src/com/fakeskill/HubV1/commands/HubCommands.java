package com.fakeskill.HubV1.commands;

import com.fakeskill.HubV1.items.ItemManager;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;




public class HubCommands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
       if (!(sender instanceof Player)) {
           sender.sendMessage("Only Players Can Use That Command");
           return true;
       }
        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("givehub")) {
                player.getInventory().addItem(ItemManager.hub);

        }
        return true;
    }
}
