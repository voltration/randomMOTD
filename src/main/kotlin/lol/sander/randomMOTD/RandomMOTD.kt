package lol.sander.randomMOTD

import lol.sander.randomMOTD.commands.RandomMOTD
import lol.sander.randomMOTD.events.SetMotd
import org.bukkit.plugin.java.JavaPlugin

class RandomMOTD : JavaPlugin() {

    override fun onEnable() {
        saveDefaultConfig()

        this.getCommand("randommotd")?.setExecutor(RandomMOTD())
        server.pluginManager.registerEvents(SetMotd(this), this)
    }

    override fun onDisable() {

    }
}
