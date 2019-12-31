package pt.rektbydead.encantar;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import pt.rektbydead.encantar.cmd.darlivro;
import pt.rektbydead.itemevent.EnchantEvent;
import pt.rektbydead.itemevent.ItemEvent;

public class Main extends JavaPlugin{

	public static Plugin instance;
	public void onEnable() {
		instance = this;
		Bukkit.getConsoleSender().sendMessage("§eEncantar Ativado");
		Bukkit.getPluginManager().registerEvents(new ItemEvent(), this);
		Bukkit.getPluginManager().registerEvents(new EnchantEvent(),this);
		Bukkit.getPluginManager().registerEvents(new darlivro(), this);
		getCommand("givelivros").setExecutor(new darlivro());
	}
	
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage("§cEncantar desativado");
	}
	
	public static void main() {
		
	}
}
