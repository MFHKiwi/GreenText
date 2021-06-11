package me.MFHKiwi.GreenText;

import org.bukkit.ChatColor;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerListener;

public class GreenTextListener extends PlayerListener {
	public void onPlayerChat(PlayerChatEvent event) {
		String message = event.getMessage();
		if (message.startsWith(">")) {
			event.setMessage(ChatColor.GREEN + message);
		} else {}
	}
}
