package com.james.test;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.Objects;

public class ConfigCommand implements CommandExecutor {

    private Main main;

    public ConfigCommand(Main main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            main.getConfig().set("Word", "Cake");
            List<String> list = main.getConfig().getStringList("String-list");
            list.add("New Value!");
            main.getConfig().set("String-list", list);

            main.saveConfig();
            player.sendMessage("Config Updated!");

//            player.sendMessage(Objects.requireNonNull(main.getConfig().getString("Word")));
//            player.sendMessage(String.valueOf(main.getConfig().getInt("Number")));
//            if (main.getConfig().getBoolean("Boolean")); {
//                player.sendMessage("This feature is enabled!");
//            }
//            for (String string : main.getConfig().getStringList("String-list")) {
//                player.sendMessage(string);
//            }
        }



        return false;
    }
}
