/**
 * Automatically generated file, changes will be lost.
 */
package org.bukkit.craftbukkit.v1_19_R2.block.impl;

import org.bukkit.craftbukkit.v1_19_R2.block.data.CraftBlockData;

public final class CraftTNT extends CraftBlockData implements org.bukkit.block.data.type.TNT {

    public CraftTNT() {
        super();
    }

    public CraftTNT(net.minecraft.world.level.block.state.BlockState state) {
        super(state);
    }

    // type.data.block.org.bukkit.craftbukkit.v1_19_R2.CraftTNT

    private static final net.minecraft.world.level.block.state.properties.BooleanProperty UNSTABLE = getBoolean(net.minecraft.world.level.block.TntBlock.class, "unstable");

    @Override
    public boolean isUnstable() {
        return get(UNSTABLE);
    }

    @Override
    public void setUnstable(boolean unstable) {
        set(UNSTABLE, unstable);
    }
}
