package com.nepjr.orespawn;

import org.apache.logging.log4j.Logger;

import com.nepjr.orespawn.block.ModBlocks;
import com.nepjr.orespawn.proxy.Common;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModMain.MODID, name = ModMain.NAME, version = ModMain.VERSION)
public class ModMain
{
    public static final String MODID = "orespawn";
    public static final String NAME = "Orespawn 2";
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide = "com.nepjr.orespawn.proxy.Client", serverSide = "com.nepjr.orespawn.proxy.Server")
    public static Common proxy;
    
    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	logger = event.getModLog();
    	proxy.preInit(event);
    	ModBlocks.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	proxy.init(event);
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) 
    {
    	proxy.postInit(event);
    }
}
