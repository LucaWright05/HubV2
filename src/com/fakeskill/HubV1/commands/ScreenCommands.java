package com.fakeskill.HubV1.commands;

import com.fakeskill.HubV1.inventories.Screen;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ScreenCommands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("Only Players Can Use This Command");
            return true;
        }
        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("screen")) {
            Screen gui = new Screen();
            player.openInventory(gui.getInventory());

        }


        return true;
    }
}
