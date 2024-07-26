package lol.sander.randomMOTD.util

import lol.sander.randomMOTD.RandomMOTD
import java.util.Random

class GetRandomMotd(private val plugin: RandomMOTD) {

    fun getRandomMotd(): String {
        val motd = plugin.config.getString("motd") ?: ""
        val lines = motd.lines().filter { it.isNotBlank() }
        val random = Random().nextInt(lines.size)

        if (lines.isEmpty()) {
            return "No MOTD given"
        }

        return lines[random]
    }
}