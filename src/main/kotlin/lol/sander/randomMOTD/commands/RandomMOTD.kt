package lol.sander.randomMOTD.commands

import lol.sander.randomMOTD.util.Format
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

class RandomMOTD : CommandExecutor {

    private val formatter = Format()

    override fun onCommand(
        sender: CommandSender,
        cmd: Command,
        label: String,
        args: Array<out String>
    ): Boolean {

        sender.sendMessage(formatter.format("&ehttps://github.com/voltration/randomMOTD"))
        return true
    }
}