package org.bukkit.craftbukkit.entity;

import net.minecraft.world.entity.projectile.Snowball;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Snowball;

public class CraftSnowball extends CraftThrowableProjectile implements Snowball {
    public CraftSnowball(CraftServer server, Snowball entity) {
        super(server, entity);
    }

    @Override
    public Snowball getHandle() {
        return (Snowball) entity;
    }

    @Override
    public String toString() {
        return "CraftSnowball";
    }

    @Override
    public EntityType getType() {
        return EntityType.SNOWBALL;
    }
}
