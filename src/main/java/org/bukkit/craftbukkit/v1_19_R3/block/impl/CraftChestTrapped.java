/**
 * Automatically generated file, changes will be lost.
 */
package org.bukkit.craftbukkit.v1_19_R3.block.impl;

import org.bukkit.craftbukkit.v1_19_R3.block.data.CraftBlockData;

public final class CraftChestTrapped extends CraftBlockData
    implements org.bukkit.block.data.type.Chest, org.bukkit.block.data.Directional, org.bukkit.block.data.Waterlogged {

    public CraftChestTrapped() {
        super();
    }

    public CraftChestTrapped(net.minecraft.world.level.block.state.BlockState state) {
        super(state);
    }

    // type.data.block.org.bukkit.craftbukkit.v1_19_R3.CraftChest

    private static final net.minecraft.world.level.block.state.properties.EnumProperty<?> TYPE = getEnum(net.minecraft.world.level.block.TrappedChestBlock.class, "type");

    @Override
    public org.bukkit.block.data.type.Chest.Type getType() {
        return get(TYPE, org.bukkit.block.data.type.Chest.Type.class);
    }

    @Override
    public void setType(org.bukkit.block.data.type.Chest.Type type) {
        set(TYPE, type);
    }

    // data.block.org.bukkit.craftbukkit.v1_19_R3.CraftDirectional

    private static final net.minecraft.world.level.block.state.properties.EnumProperty<?> FACING = getEnum(net.minecraft.world.level.block.TrappedChestBlock.class, "facing");

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

    // data.block.org.bukkit.craftbukkit.v1_19_R3.CraftWaterlogged

    private static final net.minecraft.world.level.block.state.properties.BooleanProperty WATERLOGGED = getBoolean(net.minecraft.world.level.block.TrappedChestBlock.class, "waterlogged");

    @Override
    public boolean isWaterlogged() {
        return get(WATERLOGGED);
    }

    @Override
    public void setWaterlogged(boolean waterlogged) {
        set(WATERLOGGED, waterlogged);
    }
}
