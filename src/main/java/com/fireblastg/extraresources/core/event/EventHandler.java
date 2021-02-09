package com.fireblastg.extraresources.core.event;

import com.fireblastg.extraresources.ExtraResources;

import net.minecraft.block.SpawnerBlock;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;;

@EventBusSubscriber(modid = ExtraResources.MOD_ID, bus = Bus.FORGE)
public class EventHandler {
	
	@SubscribeEvent
	public static void onBlockBreak(final BlockEvent.BreakEvent event) {
		IWorld world = event.getWorld();
		BlockPos pos = event.getPos();
		if (event.getState().getBlock() instanceof SpawnerBlock && world instanceof World) {
			EndermanEntity enderman = new EndermanEntity(EntityType.ENDERMAN, (World) world);
			enderman.setPosition(pos.getX(), pos.getY(), pos.getZ());
			world.addEntity(enderman);
		}
	}
}
