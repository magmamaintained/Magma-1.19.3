/**
 * Automatically generated file, changes will be lost.
 */
package org.bukkit.craftbukkit.v1_19_R3.block.impl;

import org.bukkit.craftbukkit.v1_19_R3.block.data.CraftBlockData;

public final class CraftRepeater extends CraftBlockData
    implements org.bukkit.block.data.type.Repeater, org.bukkit.block.data.Directional, org.bukkit.block.data.Powerable {

    public CraftRepeater() {
        super();
    }

    public CraftRepeater(net.minecraft.world.level.block.state.BlockState state) {
        super(state);
    }

    // type.data.block.org.bukkit.craftbukkit.v1_19_R3.CraftRepeater

    private static final net.minecraft.world.level.block.state.properties.IntegerProperty DELAY = getInteger(net.minecraft.world.level.block.RepeaterBlock.class, "delay");
    private static final net.minecraft.world.level.block.state.properties.BooleanProperty LOCKED = getBoolean(net.minecraft.world.level.block.RepeaterBlock.class, "locked");

    @Override
    public int getDelay() {
        return get(DELAY);
    }

    @Override
    public void setDelay(int delay) {
        set(DELAY, delay);
    }

    @Override
    public int getMinimumDelay() {
        return getMin(DELAY);
    }

    @Override
    public int getMaximumDelay() {
        return getMax(DELAY);
    }

    @Override
    public boolean isLocked() {
        return get(LOCKED);
    }

    @Override
    public void setLocked(boolean locked) {
        set(LOCKED, locked);
    }

    // data.block.org.bukkit.craftbukkit.v1_19_R3.CraftDirectional

    private static final net.minecraft.world.level.block.state.properties.EnumProperty<?> FACING = getEnum(net.minecraft.world.level.block.RepeaterBlock.class, "facing");

    @Override
    public org.bukkit.block.BlockFace getFacing() {
        return get(FACING, org.bukkit.block.BlockFace.class);
    }

    @Override
    public void setFacing(org.bukkit.block.BlockFace facing) {
        set(FACING, facing);
    }

    @Override
    public java.util.Set<org.bukkit.block.BlockFace> getFaces() {
        return getValues(FACING, org.bukkit.block.BlockFace.class);
    }

    // data.block.org.bukkit.craftbukkit.v1_19_R3.CraftPowerable

    private static final net.minecraft.world.level.block.state.properties.BooleanProperty POWERED = getBoolean(net.minecraft.world.level.block.RepeaterBlock.class, "powered");

    @Override
    public boolean isPowered() {
        return get(POWERED);
    }

    @Override
    public void setPowered(boolean powered) {
        set(POWERED, powered);
    }
}
