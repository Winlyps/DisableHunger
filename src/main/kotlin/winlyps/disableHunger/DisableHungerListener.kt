package winlyps.disableHunger

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.FoodLevelChangeEvent

class DisableHungerListener(private val plugin: DisableHunger) : Listener {

    @EventHandler
    fun onFoodLevelChange(event: FoodLevelChangeEvent) {
        // Cancel the event to prevent hunger changes
        event.isCancelled = true
    }
}