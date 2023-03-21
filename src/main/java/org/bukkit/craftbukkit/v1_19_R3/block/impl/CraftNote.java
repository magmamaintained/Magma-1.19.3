/**
 * Automatically generated file, changes will be lost.
 */
package org.bukkit.craftbukkit.v1_19_R3.block.impl;

import org.bukkit.craftbukkit.v1_19_R3.block.data.CraftBlockData;

public final class CraftNote extends CraftBlockData implements org.bukkit.block.data.type.NoteBlock, org.bukkit.block.data.Powerable {

    public CraftNote() {
        super();
    }

    public CraftNote(net.minecraft.world.level.block.state.BlockState state) {
        super(state);
    }

    // type.data.block.org.bukkit.craftbukkit.v1_19_R3.CraftNoteBlock

    private static final net.minecraft.world.level.block.state.properties.EnumProperty<?> INSTRUMENT = getEnum(net.minecraft.world.level.block.NoteBlock.class, "instrument");
    private static final net.minecraft.world.level.block.state.properties.IntegerProperty NOTE = getInteger(net.minecraft.world.level.block.NoteBlock.class, "note");

    @Override
    public org.bukkit.Instrument getInstrument() {
        return get(INSTRUMENT, org.bukkit.Instrument.class);
    }

    @Override
    public void setInstrument(org.bukkit.Instrument instrument) {
        set(INSTRUMENT, instrument);
    }

    @Override
    public org.bukkit.Note getNote() {
       return new org.bukkit.Note(get(NOTE));
    }

    @Override
    public void setNote(org.bukkit.Note note) {
        set(NOTE, (int) note.getId());
    }

    // data.block.org.bukkit.craftbukkit.v1_19_R3.CraftPowerable

    private static final net.minecraft.world.level.block.state.properties.BooleanProperty POWERED = getBoolean(net.minecraft.world.level.block.NoteBlock.class, "powered");

    @Override
    public boolean isPowered() {
        return get(POWERED);
    }

    @Override
    public void setPowered(boolean powered) {
        set(POWERED, powered);
    }
}
