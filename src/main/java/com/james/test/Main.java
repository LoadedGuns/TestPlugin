package com.james.test;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("The plugin has started!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("The plugin has turned off!");
    }
}



