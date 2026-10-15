package com.example.luckbucket;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Items;

public class LuckBucketMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        UseItemCallback.EVENT.register((player, level, hand) -> {
            var stack = player.getItemInHand(hand);
            if (level.isClientSide() && stack.is(Items.BUCKET)) {
                Minecraft mc = Minecraft.getInstance();
                if (mc.player != null) {
                    mc.player.connection.sendCommand(
                        "give @s potion[potion_contents={potion:\"minecraft:luck\"}]");
                }
            }
            return InteractionResult.PASS;
        });
    }
}
