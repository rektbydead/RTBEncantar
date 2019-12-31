package pt.rektbydead.encantar.cmd;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class darlivro implements CommandExecutor, Listener {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		CommandSender p = (sender);
		if (cmd.getName().equalsIgnoreCase("givelivros")) {
			if (args.length != 3) {
				p.sendMessage("§cUse: /givelivros (livro) (Player) (quantidade)" + "\n"
						+ "§cEncantamentos: Aranhento,Fuga,Haste,Veneno,Bloqueadordedano,Antigravidade,Sobrecarga,Tanker,Executor,Velocidade,Explosiva,Viking,Autoreparar");
				return true;
			}
			if (args[0].equalsIgnoreCase("antigravidade")) {
				Player jogador = Bukkit.getPlayer(args[1]);
				int quantidade = Integer.valueOf(args[2]);
				ItemStack livro = new ItemStack(Material.BOOK, quantidade);
				ItemMeta livrometa = livro.getItemMeta();
				livrometa.setDisplayName("§eLivro de Anti Gravidade I");
				ArrayList<String> lore = new ArrayList<String>();
				lore.add("§7Anti Gravidade I");
				List<String> livrolore = new ArrayList<String>();
				for (String string : lore) {
					livrolore.add(string.replace("&", "§"));
					livrometa.setLore(livrolore);
				}
				livro.getItemMeta();
				livro.setItemMeta(livrometa);
				jogador.getInventory().addItem(livro);
				return true;
			} else if (args[0].equalsIgnoreCase("Bloqueadordedano")) {
				Player jogador = Bukkit.getPlayer(args[1]);
				int quantidade = Integer.valueOf(args[2]);
				ItemStack livro = new ItemStack(Material.BOOK, quantidade);
				ItemMeta livrometa = livro.getItemMeta();
				livrometa.setDisplayName("§eLivro de Bloqueador de dano I");
				ArrayList<String> lore = new ArrayList<String>();
				lore.add("§7Bloqueador de dano I");
				List<String> livrolore = new ArrayList<String>();
				for (String string : lore) {
					livrolore.add(string.replace("&", "§"));
					livrometa.setLore(livrolore);
				}
				livro.getItemMeta();
				livro.setItemMeta(livrometa);
				jogador.getInventory().addItem(livro);
				return true;
			} else if (args[0].equalsIgnoreCase("Aranhento")) {
				Player jogador = Bukkit.getPlayer(args[1]);
				int quantidade = Integer.valueOf(args[2]);
				ItemStack livro = new ItemStack(Material.BOOK, quantidade);
				ItemMeta livrometa = livro.getItemMeta();
				livrometa.setDisplayName("§eLivro de Aranhento I");
				ArrayList<String> lore = new ArrayList<String>();
				lore.add("§7Aranhento I");
				List<String> livrolore = new ArrayList<String>();
				for (String string : lore) {
					livrolore.add(string.replace("&", "§"));
					livrometa.setLore(livrolore);
				}
				livro.getItemMeta();
				livro.setItemMeta(livrometa);
				jogador.getInventory().addItem(livro);
				return true;
			} else if (args[0].equalsIgnoreCase("Veneno")) {
				Player jogador = Bukkit.getPlayer(args[1]);
				int quantidade = Integer.valueOf(args[2]);
				ItemStack livro = new ItemStack(Material.BOOK, quantidade);
				ItemMeta livrometa = livro.getItemMeta();
				livrometa.setDisplayName("§eLivro de Veneno I");
				ArrayList<String> lore = new ArrayList<String>();
				lore.add("§7Veneno I");
				List<String> livrolore = new ArrayList<String>();
				for (String string : lore) {
					livrolore.add(string.replace("&", "§"));
					livrometa.setLore(livrolore);
				}
				livro.getItemMeta();
				livro.setItemMeta(livrometa);
				jogador.getInventory().addItem(livro);
				return true;
			} else if (args[0].equalsIgnoreCase("Fuga")) {
				Player jogador = Bukkit.getPlayer(args[1]);
				int quantidade = Integer.valueOf(args[2]);
				ItemStack livro = new ItemStack(Material.BOOK, quantidade);
				ItemMeta livrometa = livro.getItemMeta();
				livrometa.setDisplayName("§eLivro de Fuga I");
				ArrayList<String> lore = new ArrayList<String>();
				lore.add("§7Fuga I");
				List<String> livrolore = new ArrayList<String>();
				for (String string : lore) {
					livrolore.add(string.replace("&", "§"));
					livrometa.setLore(livrolore);
				}
				livro.getItemMeta();
				livro.setItemMeta(livrometa);
				jogador.getInventory().addItem(livro);
				return true;
			} else if (args[0].equalsIgnoreCase("Haste")) {
				Player jogador = Bukkit.getPlayer(args[1]);
				int quantidade = Integer.valueOf(args[2]);
				ItemStack livro = new ItemStack(Material.BOOK, quantidade);
				ItemMeta livrometa = livro.getItemMeta();
				livrometa.setDisplayName("§eLivro de Haste I");
				ArrayList<String> lore = new ArrayList<String>();
				lore.add("§7Haste I");
				List<String> livrolore = new ArrayList<String>();
				for (String string : lore) {
					livrolore.add(string.replace("&", "§"));
					livrometa.setLore(livrolore);
				}
				livro.getItemMeta();
				livro.setItemMeta(livrometa);
				jogador.getInventory().addItem(livro);
				return true;
			} else if (args[0].equalsIgnoreCase("Tanker")) {
				Player jogador = Bukkit.getPlayer(args[1]);
				int quantidade = Integer.valueOf(args[2]);
				ItemStack livro = new ItemStack(Material.BOOK, quantidade);
				ItemMeta livrometa = livro.getItemMeta();
				livrometa.setDisplayName("§eLivro de Tanker I");
				ArrayList<String> lore = new ArrayList<String>();
				lore.add("§7Tanker I");
				List<String> livrolore = new ArrayList<String>();
				for (String string : lore) {
					livrolore.add(string.replace("&", "§"));
					livrometa.setLore(livrolore);
				}
				livro.getItemMeta();
				livro.setItemMeta(livrometa);
				jogador.getInventory().addItem(livro);
				return true;
			} else if (args[0].equalsIgnoreCase("Sobrecarga")) {
				Player jogador = Bukkit.getPlayer(args[1]);
				int quantidade = Integer.valueOf(args[2]);
				ItemStack livro = new ItemStack(Material.BOOK, quantidade);
				ItemMeta livrometa = livro.getItemMeta();
				livrometa.setDisplayName("§eLivro de Sobrecarga I");
				ArrayList<String> lore = new ArrayList<String>();
				lore.add("§7Sobrecarga I");
				List<String> livrolore = new ArrayList<String>();
				for (String string : lore) {
					livrolore.add(string.replace("&", "§"));
					livrometa.setLore(livrolore);
				}
				livro.getItemMeta();
				livro.setItemMeta(livrometa);
				jogador.getInventory().addItem(livro);
				return true;
			} else if (args[0].equalsIgnoreCase("Metralhadora")) {
				Player jogador = Bukkit.getPlayer(args[1]);
				int quantidade = Integer.valueOf(args[2]);
				ItemStack livro = new ItemStack(Material.BOOK, quantidade);
				ItemMeta livrometa = livro.getItemMeta();
				livrometa.setDisplayName("§eLivro de Metralhadora I");
				ArrayList<String> lore = new ArrayList<String>();
				lore.add("§7Metralhadora I");
				List<String> livrolore = new ArrayList<String>();
				for (String string : lore) {
					livrolore.add(string.replace("&", "§"));
					livrometa.setLore(livrolore);
				}
				livro.getItemMeta();
				livro.setItemMeta(livrometa);
				jogador.getInventory().addItem(livro);
				return true;
			} else if (args[0].equalsIgnoreCase("Executor")) {
				Player jogador = Bukkit.getPlayer(args[1]);
				int quantidade = Integer.valueOf(args[2]);
				ItemStack livro = new ItemStack(Material.BOOK, quantidade);
				ItemMeta livrometa = livro.getItemMeta();
				livrometa.setDisplayName("§eLivro de Executor I");
				ArrayList<String> lore = new ArrayList<String>();
				lore.add("§7Executor I");
				List<String> livrolore = new ArrayList<String>();
				for (String string : lore) {
					livrolore.add(string.replace("&", "§"));
					livrometa.setLore(livrolore);
				}
				livro.getItemMeta();
				livro.setItemMeta(livrometa);
				jogador.getInventory().addItem(livro);
				return true;
			} else if (args[0].equalsIgnoreCase("Velocidade")) {
				Player jogador = Bukkit.getPlayer(args[1]);
				int quantidade = Integer.valueOf(args[2]);
				ItemStack livro = new ItemStack(Material.BOOK, quantidade);
				ItemMeta livrometa = livro.getItemMeta();
				livrometa.setDisplayName("§eLivro de Velocidade I");
				ArrayList<String> lore = new ArrayList<String>();
				lore.add("§7Velocidade I");
				List<String> livrolore = new ArrayList<String>();
				for (String string : lore) {
					livrolore.add(string.replace("&", "§"));
					livrometa.setLore(livrolore);
				}
				livro.getItemMeta();
				livro.setItemMeta(livrometa);
				jogador.getInventory().addItem(livro);
				return true;
			} else if (args[0].equalsIgnoreCase("Explosiva")) {
				Player jogador = Bukkit.getPlayer(args[1]);
				int quantidade = Integer.valueOf(args[2]);
				ItemStack livro = new ItemStack(Material.BOOK, quantidade);
				ItemMeta livrometa = livro.getItemMeta();
				livrometa.setDisplayName("§eLivro de Explosiva I");
				ArrayList<String> lore = new ArrayList<String>();
				lore.add("§7Explosiva I");
				List<String> livrolore = new ArrayList<String>();
				for (String string : lore) {
					livrolore.add(string.replace("&", "§"));
					livrometa.setLore(livrolore);
				}
				livro.getItemMeta();
				livro.setItemMeta(livrometa);
				jogador.getInventory().addItem(livro);
				return true;
			} else if (args[0].equalsIgnoreCase("Viking")) {
				Player jogador = Bukkit.getPlayer(args[1]);
				int quantidade = Integer.valueOf(args[2]);
				ItemStack livro = new ItemStack(Material.BOOK, quantidade);
				ItemMeta livrometa = livro.getItemMeta();
				livrometa.setDisplayName("§eLivro de Viking I");
				ArrayList<String> lore = new ArrayList<String>();
				lore.add("§7Viking I");
				List<String> livrolore = new ArrayList<String>();
				for (String string : lore) {
					livrolore.add(string.replace("&", "§"));
					livrometa.setLore(livrolore);
				}
				livro.getItemMeta();
				livro.setItemMeta(livrometa);
				jogador.getInventory().addItem(livro);
				return true;
			} else  if (args[0].equalsIgnoreCase("Autoreparar")) {
				Player jogador = Bukkit.getPlayer(args[1]);
				int quantidade = Integer.valueOf(args[2]);
				ItemStack livro = new ItemStack(Material.BOOK, quantidade);
				ItemMeta livrometa = livro.getItemMeta();
				livrometa.setDisplayName("§eLivro de Auto reparar I");
				ArrayList<String> lore = new ArrayList<String>();
				lore.add("§7Auto reparar I");
				List<String> livrolore = new ArrayList<String>();
				for (String string : lore) {
					livrolore.add(string.replace("&", "§"));
					livrometa.setLore(livrolore);
				}
				livro.getItemMeta();
				livro.setItemMeta(livrometa);
				jogador.getInventory().addItem(livro);
				return true;
			} else if (args[0].equalsIgnoreCase("matador")) {
				Player jogador = Bukkit.getPlayer(args[1]);
				int quantidade = Integer.valueOf(args[2]);
				ItemStack livro = new ItemStack(Material.BOOK, quantidade);
				ItemMeta livrometa = livro.getItemMeta();
				livrometa.setDisplayName("§eLivro de Matador I");
				ArrayList<String> lore = new ArrayList<String>();
				lore.add("§7Matador I");
				List<String> livrolore = new ArrayList<String>();
				for (String string : lore) {
					livrolore.add(string.replace("&", "§"));
					livrometa.setLore(livrolore);
				}
				livro.getItemMeta();
				livro.setItemMeta(livrometa);
				jogador.getInventory().addItem(livro);
				return true;
			} else if (args[0].equalsIgnoreCase("Furia")) {
				Player jogador = Bukkit.getPlayer(args[1]);
				int quantidade = Integer.valueOf(args[2]);
				ItemStack livro = new ItemStack(Material.BOOK, quantidade);
				ItemMeta livrometa = livro.getItemMeta();
				livrometa.setDisplayName("§eLivro de Furia I");
				ArrayList<String> lore = new ArrayList<String>();
				lore.add("§7Furia I");
				List<String> livrolore = new ArrayList<String>();
				for (String string : lore) {
					livrolore.add(string.replace("&", "§"));
					livrometa.setLore(livrolore);
				}
				livro.getItemMeta();
				livro.setItemMeta(livrometa);
				jogador.getInventory().addItem(livro);
				return true;
			} else{
				p.sendMessage("§cUse: /givelivros (livro) (Player) (quantidade)" + "\n"
						+ "§cEncantamentos: Aranhento,Fuga,Haste,Veneno,Bloqueadordedano,Antigravidade,Sobrecarga,Tanker,Executor,Velocidade,Explosiva,Viking,Autoreparar,Matador,Furia");
			}

		}
		return false;
	}
}
