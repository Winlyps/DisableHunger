package winlyps.disableHunger

import org.bukkit.plugin.java.JavaPlugin

class DisableHunger : JavaPlugin() {

    override fun onEnable() {
        // Register the event listener
        server.pluginManager.registerEvents(DisableHungerListener(this), this)

        logger.info("DisableHunger plugin has been enabled.")
    }

    override fun onDisable() {
        logger.info("DisableHunger plugin has been disabled.")
    }
}