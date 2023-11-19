package org.bukkit.craftbukkit.v1_20_R2.entity;

import net.minecraft.world.entity.animal.AbstractGolem;
import org.bukkit.craftbukkit.v1_20_R2.CraftServer;
import org.bukkit.entity.IronGolem;

public class CraftIronGolem extends CraftGolem implements IronGolem {
    public CraftIronGolem(CraftServer server, net.minecraft.world.entity.animal.IronGolem entity) {
        super(server, entity);
    }

    @Override
    public net.minecraft.world.entity.animal.IronGolem getHandle() {
        return (net.minecraft.world.entity.animal.IronGolem) entity;
    }

    @Override
    public String toString() {
        return "CraftIronGolem";
    }

    @Override
    public boolean isPlayerCreated() {
        return getHandle().isPlayerCreated();
    }

    @Override
    public void setPlayerCreated(boolean playerCreated) {
        getHandle().setPlayerCreated(playerCreated);
    }
}
