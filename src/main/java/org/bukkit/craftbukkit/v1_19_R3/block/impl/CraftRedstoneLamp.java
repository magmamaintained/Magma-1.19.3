/**
 * Automatically generated file, changes will be lost.
 */
package org.bukkit.craftbukkit.v1_19_R3.block.impl;

import org.bukkit.craftbukkit.v1_19_R3.block.data.CraftBlockData;

public final class CraftRedstoneLamp extends CraftBlockData implements org.bukkit.block.data.Lightable {

    public CraftRedstoneLamp() {
        super();
    }

    public CraftRedstoneLamp(net.minecraft.world.level.block.state.BlockState state) {
        super(state);
    }

    // data.block.org.bukkit.craftbukkit.v1_19_R3.CraftLightable

    private static final net.minecraft.world.level.block.state.properties.BooleanProperty LIT = getBoolean(net.minecraft.world.level.block.RedstoneLampBlock.class, "lit");

    @Override
    public boolean isLit() {
        return get(LIT);
    }

    @Override
    public void setLit(boolean lit) {
        set(LIT, lit);
    }
}
