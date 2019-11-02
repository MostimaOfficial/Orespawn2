package com.nepjr.orespawn.proxy;

import com.nepjr.orespawn.ModMain;
import com.nepjr.orespawn.block.BlockDebug;
import com.nepjr.orespawn.block.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

@Mod.EventBusSubscriber
public class Common {
	
	public void registerItemRenderer(Item item, int meta, String id) {
		
	}
	
    public static void preInit(FMLPreInitializationEvent e) {
    	
    }

    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {
    }
   
}