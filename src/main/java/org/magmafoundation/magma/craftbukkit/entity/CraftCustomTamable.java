package org.magmafoundation.magma.craftbukkit.entity;

import net.minecraft.world.entity.TamableAnimal;
import org.bukkit.craftbukkit.v1_19_R3.CraftServer;
import org.bukkit.craftbukkit.v1_19_R3.entity.CraftTameableAnimal;

public class CraftCustomTamable extends CraftTameableAnimal {

    public CraftCustomTamable(CraftServer server, TamableAnimal entity) {
        super(server, entity);
    }
}
