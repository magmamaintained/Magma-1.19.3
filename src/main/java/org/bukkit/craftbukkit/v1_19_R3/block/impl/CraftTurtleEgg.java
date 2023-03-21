/**
 * Automatically generated file, changes will be lost.
 */
package org.bukkit.craftbukkit.v1_19_R3.block.impl;

import org.bukkit.craftbukkit.v1_19_R3.block.data.CraftBlockData;

public final class CraftTurtleEgg extends CraftBlockData implements org.bukkit.block.data.type.TurtleEgg {

    public CraftTurtleEgg() {
        super();
    }

    public CraftTurtleEgg(net.minecraft.world.level.block.state.BlockState state) {
        super(state);
    }

    // type.data.block.org.bukkit.craftbukkit.v1_19_R3.CraftTurtleEgg

    private static final net.minecraft.world.level.block.state.properties.IntegerProperty EGGS = getInteger(net.minecraft.world.level.block.TurtleEggBlock.class, "eggs");
    private static final net.minecraft.world.level.block.state.properties.IntegerProperty HATCH = getInteger(net.minecraft.world.level.block.TurtleEggBlock.class, "hatch");

    @Override
    public int getEggs() {
        return get(EGGS);
    }

    @Override
    public void setEggs(int eggs) {
        set(EGGS, eggs);
    }

    @Override
    public int getMinimumEggs() {
        return getMin(EGGS);
    }

    @Override
    public int getMaximumEggs() {
        return getMax(EGGS);
    }

    @Override
    public int getHatch() {
        return get(HATCH);
    }

    @Override
    public void setHatch(int hatch) {
        set(HATCH, hatch);
    }

    @Override
    public int getMaximumHatch() {
        return getMax(HATCH);
    }
}
