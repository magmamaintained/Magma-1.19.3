package org.bukkit.craftbukkit.v1_19_R2.entity;

import org.bukkit.craftbukkit.v1_19_R2.CraftServer;
import org.bukkit.entity.Chicken;


public class CraftChicken extends CraftAnimals implements Chicken {

    public CraftChicken(CraftServer server, net.minecraft.world.entity.animal.Chicken entity) {
        super(server, entity);
    }

    @Override
    public net.minecraft.world.entity.animal.Chicken getHandle() {
        return (net.minecraft.world.entity.animal.Chicken) entity;
    }

    @Override
    public String toString() {
        return "CraftChicken";
    }
}
