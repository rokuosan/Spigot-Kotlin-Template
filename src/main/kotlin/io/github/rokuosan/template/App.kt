package io.github.rokuosan.template

import org.bukkit.plugin.java.JavaPlugin

class App: JavaPlugin() {
    override fun onEnable() {
        logger.info("Plugin enabled!")
    }

    override fun onDisable() {
        logger.info("Plugin disabled!")
    }
}