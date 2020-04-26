package ru.logicworld.logicresources;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = LogicResources.MODID, name = LogicResources.NAME, version = LogicResources.VERSION)
public class LogicResources
{
    public static final String MODID = "logicresources";
    public static final String NAME = "LogicResources";
    public static final String VERSION = "1.1";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("[Logic resources] Loaded");
    }
}
