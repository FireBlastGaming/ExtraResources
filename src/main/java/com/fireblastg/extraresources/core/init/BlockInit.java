package com.fireblastg.extraresources.core.init;

import com.fireblastg.extraresources.ExtraResources;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			ExtraResources.MOD_ID);
	

	public static final RegistryObject<Block> COPPER_ORE = BLOCKS
			.register("copper_ore",
					() -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.BROWN)
							.hardnessAndResistance(3f, 3f)
							.harvestTool(ToolType.PICKAXE)
							.harvestLevel(1).sound(SoundType.METAL)
							.setRequiresTool())); 
}	