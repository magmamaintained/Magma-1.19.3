/**
 * Automatically generated file, changes will be lost.
 */
package org.bukkit.craftbukkit.v1_19_R3.block.impl;

import org.bukkit.craftbukkit.v1_19_R3.block.data.CraftBlockData;

public final class CraftChain extends CraftBlockData
    implements org.bukkit.block.data.type.Chain, org.bukkit.block.data.Orientable, org.bukkit.block.data.Waterlogged {

    public CraftChain() {
        super();
    }

    public CraftChain(net.minecraft.world.level.block.state.BlockState state) {
        super(state);
    }

    // data.block.org.bukkit.craftbukkit.v1_19_R3.CraftOrientable

    private static final net.minecraft.world.level.block.state.properties.EnumProperty<?> AXIS = getEnum(net.minecraft.world.level.block.ChainBlock.class, "axis");

    @Override
    public org.bukkit.Axis getAxis() {
        return get(AXIS, org.bukkit.Axis.class);
    }

    @Override
    public void setAxis(org.bukkit.Axis axis) {
        set(AXIS, axis);
    }

    @Override
    public java.util.Set<org.bukkit.Axis> getAxes() {
        return getValues(AXIS, org.bukkit.Axis.class);
    }

    // data.block.org.bukkit.craftbukkit.v1_19_R3.CraftWaterlogged

    private static final net.minecraft.world.level.block.state.properties.BooleanProperty WATERLOGGED = getBoolean(net.minecraft.world.level.block.ChainBlock.class, "waterlogged");

    @Override
    public boolean isWaterlogged() {
        return get(WATERLOGGED);
    }

    @Override
    public void setWaterlogged(boolean waterlogged) {
        set(WATERLOGGED, waterlogged);
    }
}