package me.pustinek.extensiveinventory.content;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryDragEvent;

public interface InventoryProvider {

    void init(Player player, InventoryContents contents);

    default void update(Player player, InventoryContents contents) {}

    default void onInventoryClick(InventoryClickEvent event){}

    default void onInventoryClose(InventoryCloseEvent event){}

    default void onInventoryDrag(InventoryDragEvent event){}

}
