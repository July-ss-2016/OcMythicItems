package vip.ourcraft.mcserverplugins.ocmythicitems;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import vip.ourcraft.mcserverplugins.ocmythicitems.managers.ItemManager;

import java.util.logging.Logger;

public class OcMythicItem extends JavaPlugin {
    private static OcMythicItem instance;
    private ItemManager itemManager;
    private Logger logger = getLogger();

    public void onEnable() {
        instance = this;
        this.itemManager = new ItemManager(this);

        logger.info("初始化完毕!");
    }

    public void loadConfig() {
        saveDefaultConfig();
        reloadConfig();

        FileConfiguration config = getConfig();
    }

    public Logger getPluginLogger() {
        return logger;
    }

    public ItemManager getItemManager() {
        return itemManager;
    }
}
