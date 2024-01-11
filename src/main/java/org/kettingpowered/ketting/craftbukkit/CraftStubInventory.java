package org.kettingpowered.ketting.craftbukkit;

import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Player;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_20_R2.inventory.CraftInventory;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

public class CraftStubInventory extends CraftInventory {
    public static final CraftStubInventory INSTANCE = new CraftStubInventory();
    private CraftStubInventory(){
        super(new Container(){

            @Override
            public int getContainerSize() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return true;
            }

            @Override
            public net.minecraft.world.item.ItemStack getItem(int p_18941_) {
                return net.minecraft.world.item.ItemStack.EMPTY;
            }

            @Override
            public net.minecraft.world.item.ItemStack removeItem(int p_18942_, int p_18943_) {
                return net.minecraft.world.item.ItemStack.EMPTY;
            }

            @Override
            public net.minecraft.world.item.ItemStack removeItemNoUpdate(int p_18951_) {
                return net.minecraft.world.item.ItemStack.EMPTY;
            }

            @Override
            public void setItem(int p_18944_, net.minecraft.world.item.ItemStack p_18945_) {

            }

            @Override
            public void setChanged() {

            }

            @Override
            public boolean stillValid(Player p_18946_) {
                return false;
            }

            @Override
            public void clearContent() {
                
            }
        });
    }
    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public int getMaxStackSize() {
        return 0;
    }

    @Override
    public void setMaxStackSize(int size) {}

    @Override
    public @Nullable ItemStack getItem(int index) {
        return null;
    }

    @Override
    public void setItem(int index, @Nullable ItemStack item) {}

    @Override
    public @NotNull HashMap<Integer, ItemStack> addItem(@NotNull ItemStack... items) throws IllegalArgumentException {
        final HashMap<Integer, ItemStack> out = new HashMap<>();
        for (int i = 0; i < items.length; i++) {
            out.put(i, items[i]);
        }
        return out;
    }

    @Override
    public @NotNull HashMap<Integer, ItemStack> removeItem(@NotNull ItemStack... items) throws IllegalArgumentException {
        final HashMap<Integer, ItemStack> out = new HashMap<>();
        for (int i = 0; i < items.length; i++) {
            out.put(i, items[i]);
        }
        return out;    }

    @Override
    public @NotNull ItemStack[] getContents() {
        return new ItemStack[0];
    }

    @Override
    public void setContents(@NotNull ItemStack[] items) throws IllegalArgumentException {
        if (items.length>0) throw new IllegalArgumentException();
    }

    @Override
    public @NotNull ItemStack[] getStorageContents() {
        return new ItemStack[0];
    }

    @Override
    public void setStorageContents(@NotNull ItemStack[] items) throws IllegalArgumentException {
        if (items.length>0) throw new IllegalArgumentException();
    }

    @Override
    public boolean contains(@NotNull Material material) throws IllegalArgumentException {
        return false;
    }

    @Override
    public boolean contains(@Nullable ItemStack item) {
        return false;
    }

    @Override
    public boolean contains(@NotNull Material material, int amount) throws IllegalArgumentException {
        return false;
    }

    @Override
    public boolean contains(@Nullable ItemStack item, int amount) {
        return false;
    }

    @Override
    public boolean containsAtLeast(@Nullable ItemStack item, int amount) {
        return false;
    }

    @Override
    public HashMap<Integer, ItemStack> all(@NotNull Material material) throws IllegalArgumentException {
        return new HashMap<>();
    }

    @Override
    public HashMap<Integer, ItemStack> all(@Nullable ItemStack item) {
        return new HashMap<>();
    }

    @Override
    public int first(@NotNull Material material) throws IllegalArgumentException {
        return 0;
    }

    @Override
    public int first(@NotNull ItemStack item) {
        return 0;
    }

    @Override
    public int firstEmpty() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public void remove(@NotNull Material material) throws IllegalArgumentException {

    }

    @Override
    public void remove(@NotNull ItemStack item) {

    }

    @Override
    public void clear(int index) {

    }

    @Override
    public void clear() {

    }

    @Override
    public @NotNull List<HumanEntity> getViewers() {
        return Collections.emptyList();
    }

    @Override
    public @NotNull InventoryType getType() {
        return InventoryType.Stub;
    }

    @Override
    public @Nullable InventoryHolder getHolder() {
        return null;
    }

    @Override
    public @NotNull ListIterator<ItemStack> iterator() {
        return Collections.emptyListIterator();
    }

    @Override
    public @NotNull ListIterator<ItemStack> iterator(int index) {
        return Collections.emptyListIterator();
    }

    @Override
    public @Nullable Location getLocation() {
        return null;
    }
}
