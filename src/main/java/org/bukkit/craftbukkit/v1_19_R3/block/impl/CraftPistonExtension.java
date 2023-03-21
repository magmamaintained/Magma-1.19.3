/**
 * Automatically generated file, changes will be lost.
 */
package org.bukkit.craftbukkit.v1_19_R3.block.impl;

import org.bukkit.craftbukkit.v1_19_R3.block.data.CraftBlockData;

public final class CraftPistonExtension extends CraftBlockData
    implements org.bukkit.block.data.type.PistonHead, org.bukkit.block.data.type.TechnicalPiston, org.bukkit.block.data.Directional {

    public CraftPistonExtension() {
        super();
    }

    public CraftPistonExtension(net.minecraft.world.level.block.state.BlockState state) {
        super(state);
    }

    // type.data.block.org.bukkit.craftbukkit.v1_19_R3.CraftPistonHead

    private static final net.minecraft.world.level.block.state.properties.BooleanProperty SHORT = getBoolean(net.minecraft.world.level.block.piston.PistonHeadBlock.class, "short");

    @Override
    public boolean isShort() {
        return get(SHORT);
    }

    @Override
    public void setShort(boolean _short) {
        set(SHORT, _short);
    }

    // type.data.block.org.bukkit.craftbukkit.v1_19_R3.CraftTechnicalPiston

    private static final net.minecraft.world.level.block.state.properties.EnumProperty<?> TYPE = getEnum(net.minecraft.world.level.block.piston.PistonHeadBlock.class, "type");

    @Override
    public org.bukkit.block.data.type.TechnicalPiston.Type getType() {
        return get(TYPE, org.bukkit.block.data.type.TechnicalPiston.Type.class);
    }

    @Override
    public void setType(org.bukkit.block.data.type.TechnicalPiston.Type type) {
        set(TYPE, type);
    }

    // data.block.org.bukkit.craftbukkit.v1_19_R3.CraftDirectional

    private static final net.minecraft.world.level.block.state.properties.EnumProperty<?> FACING = getEnum(net.minecraft.world.level.block.piston.PistonHeadBlock.class, "facing");

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
