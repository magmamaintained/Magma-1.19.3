/**
 * Automatically generated file, changes will be lost.
 */
package org.bukkit.craftbukkit.v1_19_R2.block.impl;

import org.bukkit.craftbukkit.v1_19_R2.block.data.CraftBlockData;

public final class CraftEnderPortalFrame extends CraftBlockData
    implements org.bukkit.block.data.type.EndPortalFrame, org.bukkit.block.data.Directional {

    public CraftEnderPortalFrame() {
        super();
    }

    public CraftEnderPortalFrame(net.minecraft.world.level.block.state.BlockState state) {
        super(state);
    }

    // type.data.block.org.bukkit.craftbukkit.v1_19_R2.CraftEndPortalFrame

    private static final net.minecraft.world.level.block.state.properties.BooleanProperty EYE = getBoolean(net.minecraft.world.level.block.EndPortalFrameBlock.class, "eye");

    @Override
    public boolean hasEye() {
        return get(EYE);
    }

    @Override
    public void setEye(boolean eye) {
        set(EYE, eye);
    }

    // data.block.org.bukkit.craftbukkit.v1_19_R2.CraftDirectional

    private static final net.minecraft.world.level.block.state.properties.EnumProperty<?> FACING = getEnum(net.minecraft.world.level.block.EndPortalFrameBlock.class, "facing");

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
}
