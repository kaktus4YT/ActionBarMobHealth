package me.kaktus;

import org.bukkit.plugin.java.JavaPlugin;

public final class ActionBarMobHealth extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new EntityHitListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
