package lol.sander.randomMOTD.events

import lol.sander.randomMOTD.RandomMOTD
import lol.sander.randomMOTD.util.Format
import lol.sander.randomMOTD.util.GetRandomMotd
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.server.ServerListPingEvent

class SetMotd(private val plugin: RandomMOTD) : Listener {

    private val getRandomMotd = GetRandomMotd(plugin)
    private val formatter = Format()

    @EventHandler
    fun setMotd(e: ServerListPingEvent) {
        e.motd = formatter.format(getRandomMotd.getRandomMotd())
    }
}