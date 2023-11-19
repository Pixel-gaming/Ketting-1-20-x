package org.bukkit.craftbukkit.v1_20_R2;

import java.util.HashMap;
import net.minecraft.world.level.block.SoundType;
import org.bukkit.Sound;
import org.bukkit.SoundGroup;

public class CraftSoundGroup implements SoundGroup {

    private final net.minecraft.world.level.block.SoundType handle;
    private static final HashMap<SoundType, CraftSoundGroup> SOUND_GROUPS = new HashMap<>();

    public static SoundGroup getSoundGroup(SoundType soundEffectType) {
        return SOUND_GROUPS.computeIfAbsent(soundEffectType, CraftSoundGroup::new);
    }

    private CraftSoundGroup(net.minecraft.world.level.block.SoundType soundEffectType) {
        this.handle = soundEffectType;
    }

    public net.minecraft.world.level.block.SoundType getHandle() {
        return handle;
    }

    @Override
    public float getVolume() {
        return getHandle().getVolume();
    }

    @Override
    public float getPitch() {
        return getHandle().getPitch();
    }

    @Override
    public Sound getBreakSound() {
        return CraftSound.minecraftToBukkit(getHandle().breakSound);
    }

    @Override
    public Sound getStepSound() {
        return CraftSound.minecraftToBukkit(getHandle().getStepSound());
    }

    @Override
    public Sound getPlaceSound() {
        return CraftSound.minecraftToBukkit(getHandle().getPlaceSound());
    }

    @Override
    public Sound getHitSound() {
        return CraftSound.minecraftToBukkit(getHandle().hitSound);
    }

    @Override
    public Sound getFallSound() {
        return CraftSound.minecraftToBukkit(getHandle().getFallSound());
    }
}
