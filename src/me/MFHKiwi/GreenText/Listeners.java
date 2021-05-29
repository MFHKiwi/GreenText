package me.MFHKiwi.GreenText;

import org.bukkit.ChatColor;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerChatEvent;

public class Listeners extends PlayerListener{
	public Listeners(Main main) {}
	public void onPlayerChat(PlayerChatEvent event) {
		String message = event.getMessage();
		if (message.startsWith(">")) {
			event.setMessage(ChatColor.GREEN + message);
		} else;
	}
}
