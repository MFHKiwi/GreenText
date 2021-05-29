package me.MFHKiwi.GreenText;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Event;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import java.util.logging.Logger;

public class Main extends JavaPlugin {
	private final Listeners listener = new Listeners(this);
	public static final Logger log = Logger.getLogger("GreenText");
    public void onEnable(){ 
    	getServer().getPluginManager().registerEvent(Event.Type.PLAYER_CHAT, (Listener)this.listener, Event.Priority.Monitor, (Plugin)this);
    	log.info("GreenText v1.0 loaded.");
    }
    public void onDisable() {
    	log.info("GreenText v1.0 unloaded.");
    }
}
