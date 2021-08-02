package com.fakeskill.HubV1;

import com.fakeskill.HubV1.commands.HubCommands;
import com.fakeskill.HubV1.commands.LobbyCommands;
import com.fakeskill.HubV1.commands.ScreenCommands;
import com.fakeskill.HubV1.events.*;
import com.fakeskill.HubV1.items.ItemManager;
import org.bukkit.plugin.java.JavaPlugin;



public final class Hub extends JavaPlugin {

    public static Hub plugin;

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ScreenEvents2(), this);
        getServer().getPluginManager().registerEvents(new RightClick(), this);
        getServer().getPluginManager().registerEvents(new ScreenEvents(), this);
        getCommand("screen").setExecutor(new ScreenCommands());
        getServer().getConsoleSender().sendMessage("HubV1 is §2Enabled");
        getServer().getPluginManager().registerEvents(new HubEvents(), this);
        getServer().getPluginManager().registerEvents(new LeaveEvent(), this);
        ItemManager.init();
        getCommand("givehub").setExecutor(new HubCommands());
        getCommand("sendhcf").setExecutor(new LobbyCommands());
        getServer().getMessenger().registerOutgoingPluginChannel(this, "Bungeecord");

    }


    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage("HubV1 is §4Disabled");
    }



    private static Hub instance;
    public static Hub getInstance() {
        return  instance;
    }


    public void registerCommands() {

        getCommand("sendhcf").setExecutor(new LobbyCommands());

    }



    public static Hub getPlugin() {
        return plugin;
    }









}
