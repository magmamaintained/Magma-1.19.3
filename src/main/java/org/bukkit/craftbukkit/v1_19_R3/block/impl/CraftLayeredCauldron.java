/**
 * Automatically generated file, changes will be lost.
 */
package org.bukkit.craftbukkit.v1_19_R3.block.impl;

import org.bukkit.craftbukkit.v1_19_R3.block.data.CraftBlockData;

public final class CraftLayeredCauldron extends CraftBlockData implements org.bukkit.block.data.Levelled {

    public CraftLayeredCauldron() {
        super();
    }

    public CraftLayeredCauldron(net.minecraft.world.level.block.state.BlockState state) {
        super(state);
    }

    // data.block.org.bukkit.craftbukkit.v1_19_R3.CraftLevelled

    private static final net.minecraft.world.level.block.state.properties.IntegerProperty LEVEL = getInteger(net.minecraft.world.level.block.LayeredCauldronBlock.class, "level");

    @Override
    public int getLevel() {
        return get(LEVEL);
    }

    @Override
    public void setLevel(int level) {
        set(LEVEL, level);
    }

    @Override
    public int getMaximumLevel() {
        return getMax(LEVEL);
    }
}
