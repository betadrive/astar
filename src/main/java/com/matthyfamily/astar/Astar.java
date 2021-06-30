package com.matthyfamily.astar;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Astar implements ModInitializer {
    Logger logger = LogManager.getLogger("A*API");
    Logger bdlogger = LogManager.getLogger("betadrive");
    @Override
    public void onInitialize() {
        if(FabricLoader.getInstance().isModLoaded("betadrive")) {
            logger.log(Level.INFO, "hey betadrive u up?");
            bdlogger.log(Level.INFO, "sure am! wanna go load up this player's game?");
            logger.log(Level.INFO, "will do! lets go mess some puny human's lives up!");
            bdlogger.log(Level.INFO, "aight, let's get to it!");
        } else {
            logger.log(Level.INFO, "hey betadrive u up?");
            logger.log(Level.INFO, "guess i'll wait for betadrive to get on :(");
        }
    }
}
