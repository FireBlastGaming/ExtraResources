package com.fireblastg.extraresources;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fireblastg.extraresources.core.init.BlockInit;
import com.fireblastg.extraresources.core.init.ItemInit;
import com.fireblastg.extraresources.world.OreGeneration;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

@SuppressWarnings("unused")
@Mod(ExtraResources.MOD_ID)
public class ExtraResources
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "extraresources";
    public static final ItemGroup EXTRA_RESOURCES_GROUP = new ExtraResourcesGroup("extraresources");

    public ExtraResources() {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
        
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    	
    }
    
    public static class ExtraResourcesGroup extends ItemGroup {

		public ExtraResourcesGroup(String label) {
			super(label);
		}

		@Override
		public ItemStack createIcon() {
			return ItemInit.COPPER_INGOT.get().getDefaultInstance();
		}
    	
    }
}
