package net.maenr.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.maenr.tutorialmod.TutorialMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup TANZANITE = FabricItemGroup.builder(new Identifier(TutorialMod.MOD_ID, "tanzanite"))
            .displayName(Text.literal("Tutorial Mod"))
            .icon(() -> new ItemStack(ModItems.TANZANITE))
            .entries((enabledFeatures, entries, operatorEnabled) -> {
            })
            .build();
}
