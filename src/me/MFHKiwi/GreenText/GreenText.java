package me.MFHKiwi.GreenText;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Event;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class GreenText extends JavaPlugin {
	public final Logger log = Logger.getLogger("Minecraft");
	public final ChatColor colour1 = ChatColor.RED;
	public final ChatColor colour2 = ChatColor.DARK_AQUA;
	
	public void onEnable() {
		this.getServer().getPluginManager().registerEvent(Event.Type.PLAYER_CHAT, (Listener) new GreenTextListener(), Event.Priority.Monitor, this);
		log.info("[" + this.getDescription().getFullName() + "] enabled.");
	}
	
	public void onDisable() {
		log.info("[" + this.getDescription().getFullName() + "] disabled.");
	}
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (command.getName().equalsIgnoreCase("gt")) {
			sender.sendMessage(colour1 + this.getDescription().getFullName() + colour2 + " by MFHKiwi");
		} else {}
		return true;
	}	
}
