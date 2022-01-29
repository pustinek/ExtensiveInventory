package me.pustinek.extensiveinventory;

import org.bukkit.plugin.java.JavaPlugin;

public class ExtensiveInventoryPlugin extends JavaPlugin {

    private static ExtensiveInventoryPlugin instance;
    private static InventoryManager invManager;

    @Override
    public void onEnable() {
        instance = this;

        invManager = new InventoryManager(this);
        invManager.init();
    }

    public static InventoryManager manager() { return invManager; }
    public static ExtensiveInventoryPlugin instance() { return instance; }

}
