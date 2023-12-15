package com.james.test;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("The plugin has started!");

        getCommand("heal").setExecutor(new HealCommand());
        getCommand("death").setExecutor(new DeathCommand());
//        getCommand("freeze").setExecutor(new FreezeCommand());

        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent e) {
        e.setCancelled(true);
        e.getPlayer().sendMessage(ChatColor.RED + "Stop moving!! You are frozen!!");
    }

    @EventHandler
    public void onPlayerEggThrow(PlayerEggThrowEvent e) {
        e.getPlayer().sendMessage(ChatColor.BLUE + "You just threw an egg!!");
    }

    @EventHandler
    public void onPlayerBedEnter(PlayerBedEnterEvent e) {
        e.getPlayer().sendMessage(ChatColor.AQUA + "Good Night Loser!");
    }
    @EventHandler
    public void onPlayerBedLeave(PlayerBedLeaveEvent e) {
        e.getPlayer().sendMessage(ChatColor.AQUA + "Good Morning Loser!");
    }

    @Override
    public void onDisable() {
        System.out.println("The plugin had an error!");
    }
}