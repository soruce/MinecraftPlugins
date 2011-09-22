package com.soruce.minecraft.superseriousbank;

import java.util.logging.Logger;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Event;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerInventoryEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
	private static final Logger logger = Logger.getLogger("SuperSeriousBank");
	
	public Main() {
		super();
	}
	
	@Override
	public void onDisable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onEnable() {
		PluginManager pluginManager = this.getServer().getPluginManager();
		
		Listener eventListener = new MyEventListener();
		pluginManager.registerEvent(Event.Type.INVENTORY_OPEN, eventListener, Event.Priority.Normal, this);
		pluginManager.registerEvent(Event.Type.PLAYER_INTERACT, eventListener, Event.Priority.Normal, this);		
		pluginManager.registerEvent(Event.Type.PLAYER_INTERACT_ENTITY, eventListener, Event.Priority.Normal, this);		
		
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (command.getName().equalsIgnoreCase("ssb_balance")) {
			logger.info("TODO handle onCommand " + command.getName());
			return true;
		}
		return false;
	}


	private class MyEventListener extends PlayerListener {

		public MyEventListener() {
			super();
		}
		
		@Override
		public void onInventoryOpen(PlayerInventoryEvent event) {			
			logger.info("TODO handle event: " + event);
		}

		@Override
		public void onPlayerInteract(PlayerInteractEvent event) {
			logger.info("TODO handle event: " + event);
			
			if (event.getAction() == Action.RIGHT_CLICK_BLOCK &&
				event.getClickedBlock().getType() == Material.CHEST)
			{
				
			}

		}

		@Override
		public void onPlayerInteractEntity(PlayerInteractEntityEvent event) {
			logger.info("TODO handle event: " + event);
		}		
	}
}
