package org.bukkit.craftbukkit.entity;

import net.minecraft.world.entity.projectile.SmallFireball;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.SmallFireball;

public class CraftSmallFireball extends CraftSizedFireball implements SmallFireball {
    public CraftSmallFireball(CraftServer server, SmallFireball entity) {
        super(server, entity);
    }

    @Override
    public SmallFireball getHandle() {
        return (SmallFireball) entity;
    }

    @Override
    public String toString() {
        return "CraftSmallFireball";
    }

    @Override
    public EntityType getType() {
        return EntityType.SMALL_FIREBALL;
    }
}
