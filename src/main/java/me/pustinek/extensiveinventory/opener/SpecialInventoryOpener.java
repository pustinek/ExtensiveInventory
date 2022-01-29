package me.pustinek.extensiveinventory.opener;

import com.google.common.collect.ImmutableList;
import me.pustinek.extensiveinventory.ExtensiveInventory;
import me.pustinek.extensiveinventory.InventoryManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

import java.util.List;

public class SpecialInventoryOpener implements InventoryOpener {

    private static final List<InventoryType> SUPPORTED = ImmutableList.of(
            InventoryType.FURNACE,
            InventoryType.WORKBENCH,
            InventoryType.DISPENSER,
            InventoryType.DROPPER,
            InventoryType.ENCHANTING,
            InventoryType.BREWING,
            InventoryType.ANVIL,
            InventoryType.BEACON,
            InventoryType.HOPPER,
            InventoryType.GRINDSTONE
    );

    @Override
    public Inventory open(ExtensiveInventory inv, Player player) {
        InventoryManager manager = inv.getManager();
        Inventory handle = Bukkit.createInventory(player, inv.getType(), inv.getTitle());

        fill(handle, manager.getContents(player).get());

        player.openInventory(handle);
        return handle;
    }

    @Override
    public boolean supports(InventoryType type) {
        return SUPPORTED.contains(type);
    }

}
