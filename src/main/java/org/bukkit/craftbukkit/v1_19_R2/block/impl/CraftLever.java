/**
 * Automatically generated file, changes will be lost.
 */
package org.bukkit.craftbukkit.v1_19_R2.block.impl;

import org.bukkit.craftbukkit.v1_19_R2.block.data.CraftBlockData;

public final class CraftLever extends CraftBlockData
    implements org.bukkit.block.data.type.Switch, org.bukkit.block.data.Directional, org.bukkit.block.data.FaceAttachable, org.bukkit.block.data.Powerable {

    public CraftLever() {
        super();
    }

    public CraftLever(net.minecraft.world.level.block.state.BlockState state) {
        super(state);
    }

    // type.data.block.org.bukkit.craftbukkit.v1_19_R2.CraftSwitch

    private static final net.minecraft.world.level.block.state.properties.EnumProperty<?> FACE = getEnum(net.minecraft.world.level.block.LeverBlock.class, "face");

    @Override
    public org.bukkit.block.data.type.Switch.Face getFace() {
        return get(FACE, org.bukkit.block.data.type.Switch.Face.class);
    }

    @Override
    public void setFace(org.bukkit.block.data.type.Switch.Face face) {
        set(FACE, face);
    }

    // data.block.org.bukkit.craftbukkit.v1_19_R2.CraftDirectional

    private static final net.minecraft.world.level.block.state.properties.EnumProperty<?> FACING = getEnum(net.minecraft.world.level.block.LeverBlock.class, "facing");

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

    // data.block.org.bukkit.craftbukkit.v1_19_R2.CraftFaceAttachable

    private static final net.minecraft.world.level.block.state.properties.EnumProperty<?> ATTACH_FACE = getEnum(net.minecraft.world.level.block.LeverBlock.class, "face");

    @Override
    public org.bukkit.block.data.FaceAttachable.AttachedFace getAttachedFace() {
        return get(ATTACH_FACE, org.bukkit.block.data.FaceAttachable.AttachedFace.class);
    }

    @Override
    public void setAttachedFace(org.bukkit.block.data.FaceAttachable.AttachedFace face) {
        set(ATTACH_FACE, face);
    }

    // data.block.org.bukkit.craftbukkit.v1_19_R2.CraftPowerable

    private static final net.minecraft.world.level.block.state.properties.BooleanProperty POWERED = getBoolean(net.minecraft.world.level.block.LeverBlock.class, "powered");

    @Override
    public boolean isPowered() {
        return get(POWERED);
    }

    @Override
    public void setPowered(boolean powered) {
        set(POWERED, powered);
    }
}
