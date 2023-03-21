package org.magmafoundation.magma.craftbukkit.entity;

import net.minecraft.world.entity.animal.horse.AbstractChestedHorse;
import org.bukkit.craftbukkit.v1_19_R3.CraftServer;
import org.bukkit.craftbukkit.v1_19_R3.entity.CraftChestedHorse;
import org.bukkit.entity.Horse;

public class CraftCustomChestedHorse extends CraftChestedHorse {

    public CraftCustomChestedHorse(CraftServer server, AbstractChestedHorse entity) {
        super(server, entity);
    }

    @Override
    public Horse.Variant getVariant() {
        return Horse.Variant.MODDED;
    }
}
