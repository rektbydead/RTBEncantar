package pt.rektbydead.itemevent;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

public class ItemEvent implements Listener {

	private static final ImmutableSet<Material> machados = Sets.immutableEnumSet(Material.DIAMOND_AXE,
			Material.GOLD_AXE, Material.IRON_AXE, Material.WOOD_AXE, Material.STONE_AXE);
	private static final ImmutableSet<Material> espadas = Sets.immutableEnumSet(Material.DIAMOND_SWORD,
			Material.GOLD_SWORD, Material.IRON_SWORD, Material.WOOD_SWORD, Material.STONE_SWORD);
	private static final ImmutableSet<Material> minerios = Sets.immutableEnumSet(Material.STONE, Material.COBBLESTONE,
			Material.IRON_ORE, Material.GOLD_ORE, Material.DIAMOND_ORE, Material.COAL_ORE, Material.LAPIS_ORE,
			Material.REDSTONE_ORE, Material.EMERALD_ORE);
	private static final ImmutableSet<Material> picareta = Sets.immutableEnumSet(Material.DIAMOND_PICKAXE,
			Material.GOLD_PICKAXE, Material.IRON_PICKAXE, Material.WOOD_PICKAXE, Material.STONE_PICKAXE);
	private static final ImmutableSet<Material> pas = Sets.immutableEnumSet(Material.DIAMOND_SPADE, Material.GOLD_SPADE,
			Material.IRON_SPADE, Material.WOOD_SPADE, Material.STONE_SPADE);
	private static final ImmutableSet<Material> botas = Sets.immutableEnumSet(Material.DIAMOND_BOOTS,
			Material.GOLD_BOOTS, Material.IRON_BOOTS, Material.LEATHER_BOOTS, Material.CHAINMAIL_BOOTS);
	private static final ImmutableSet<Material> chestplate = Sets.immutableEnumSet(Material.DIAMOND_CHESTPLATE,
			Material.GOLD_CHESTPLATE, Material.IRON_CHESTPLATE, Material.LEATHER_CHESTPLATE,
			Material.CHAINMAIL_CHESTPLATE);
	private static final ImmutableSet<Material> leggins = Sets.immutableEnumSet(Material.DIAMOND_LEGGINGS,
			Material.GOLD_LEGGINGS, Material.IRON_LEGGINGS, Material.LEATHER_LEGGINGS, Material.CHAINMAIL_LEGGINGS);
	private static final ImmutableSet<Material> helmet = Sets.immutableEnumSet(Material.DIAMOND_HELMET,
			Material.GOLD_HELMET, Material.IRON_HELMET, Material.LEATHER_HELMET, Material.CHAINMAIL_HELMET);

	// Antigravidade
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onClick6(final InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();
		if ((event.getAction() == InventoryAction.SWAP_WITH_CURSOR) && (event.getCursor().getType().equals(Material.BOOK))) {
			if (event.getCursor().getItemMeta().getDisplayName().equalsIgnoreCase("§eLivro de Anti Gravidade I")) {
				if (botas.contains(event.getCurrentItem().getType())) {
					ItemStack item = event.getCurrentItem();
					ItemMeta lore = item.getItemMeta();
					ArrayList<String> itemLore = new ArrayList<String>();
					if (event.getCurrentItem().getItemMeta().getLore() != null) {
						itemLore.addAll(event.getCurrentItem().getItemMeta().getLore());
					}
					itemLore.add("§7Anti Gravidade I");
					lore.setLore(itemLore);
					item.getItemMeta();
					event.getCurrentItem().setItemMeta(lore);
				} else {
					player.sendMessage("§cEste encantamento serve apenas para botas");
					return;
				}
				if (event.getCursor().getAmount() > 1) {
					event.getCursor().setAmount(event.getCursor().getAmount() - 1);
				} else {
					event.setCursor(new ItemStack(Material.AIR));
				}
				event.setCancelled(true);
			}
		}
	}

	// Bloqueador de Dano
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onClick5(final InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();
		if ((event.getAction() == InventoryAction.SWAP_WITH_CURSOR) && (event.getCursor().getType().equals(Material.BOOK))) {
			if (event.getCursor().getItemMeta().getDisplayName().equalsIgnoreCase("§eLivro de Bloqueador de dano I")) {
				if (espadas.contains(event.getCurrentItem().getType())) {
					ItemStack item = event.getCurrentItem();
					ItemMeta lore = item.getItemMeta();
					ArrayList<String> itemLore = new ArrayList<String>();
					if (event.getCurrentItem().getItemMeta().getLore() != null) {
						itemLore.addAll(event.getCurrentItem().getItemMeta().getLore());
					}
					itemLore.add("§7Bloqueador de dano I");
					lore.setLore(itemLore);
					item.getItemMeta();
					event.getCurrentItem().setItemMeta(lore);
				} else {
					player.sendMessage("§cEste encantamento serve apenas para espadas");
					return;
				}
				if (event.getCursor().getAmount() > 1) {
					event.getCursor().setAmount(event.getCursor().getAmount() - 1);
				} else {
					event.setCursor(new ItemStack(Material.AIR));
				}
				event.setCancelled(true);
			}
		}
	}

	// Aranhento
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onClick4(final InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();
		if ((event.getAction() == InventoryAction.SWAP_WITH_CURSOR) && (event.getCursor().getType().equals(Material.BOOK))) {
			if (event.getCursor().getItemMeta().getDisplayName().equalsIgnoreCase("§eLivro de Aranhento I")) {
				if (espadas.contains(event.getCurrentItem().getType()) || machados.contains(event.getCurrentItem().getType())) {
					ItemStack item = event.getCurrentItem();
					ItemMeta lore = item.getItemMeta();
					ArrayList<String> itemLore = new ArrayList<String>();
					if (event.getCurrentItem().getItemMeta().getLore() != null) {
						itemLore.addAll(event.getCurrentItem().getItemMeta().getLore());
					}
					itemLore.add("§7Aranhento I");
					lore.setLore(itemLore);
					item.getItemMeta();
					event.getCurrentItem().setItemMeta(lore);
				} else {
					player.sendMessage("§cEste encantamento serve apenas para espadas event machados");
					return;
				}
				if (event.getCursor().getAmount() > 1) {
					event.getCursor().setAmount(event.getCursor().getAmount() - 1);
				} else {
					event.setCursor(new ItemStack(Material.AIR));
				}
				event.setCancelled(true);
			}
		}
	}

	// Veneno
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onClick3(final InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();
		if ((event.getAction() == InventoryAction.SWAP_WITH_CURSOR) && (event.getCursor().getType().equals(Material.BOOK))) {
			if (event.getCursor().getItemMeta().getDisplayName().equalsIgnoreCase("§eLivro de Veneno I")) {
				if (espadas.contains(event.getCurrentItem().getType()) || machados.contains(event.getCurrentItem().getType())) {
					ItemStack item = event.getCurrentItem();
					ItemMeta lore = item.getItemMeta();
					ArrayList<String> itemLore = new ArrayList<String>();
					if (event.getCurrentItem().getItemMeta().getLore() != null) {
						itemLore.addAll(event.getCurrentItem().getItemMeta().getLore());
					}
					itemLore.add("§7Veneno I");
					lore.setLore(itemLore);
					item.getItemMeta();
					event.getCurrentItem().setItemMeta(lore);
				} else {
					player.sendMessage("§cEste encantamento serve apenas para espadas event machados");
					return;
				}
				if (event.getCursor().getAmount() > 1) {
					event.getCursor().setAmount(event.getCursor().getAmount() - 1);
				} else {
					event.setCursor(new ItemStack(Material.AIR));
				}
				event.setCancelled(true);
			}
		}
	}

	// Fuga
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onClick2(final InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();
		if ((event.getAction() == InventoryAction.SWAP_WITH_CURSOR) && (event.getCursor().getType().equals(Material.BOOK))) {
			if (event.getCursor().getItemMeta().getDisplayName().equalsIgnoreCase("§eLivro de Fuga I")) {
				if (botas.contains(event.getCurrentItem().getType())) {
					ItemStack item = event.getCurrentItem();
					ItemMeta lore = item.getItemMeta();
					ArrayList<String> itemLore = new ArrayList<String>();
					if (event.getCurrentItem().getItemMeta().getLore() != null) {
						itemLore.addAll(event.getCurrentItem().getItemMeta().getLore());
					}
					itemLore.add("§7Fuga I");
					lore.setLore(itemLore);
					item.getItemMeta();
					event.getCurrentItem().setItemMeta(lore);
				} else {
					player.sendMessage("§cEste encantamento serve apenas para botas");
					return;
				}
				if (event.getCursor().getAmount() > 1) {
					event.getCursor().setAmount(event.getCursor().getAmount() - 1);
				} else {
					event.setCursor(new ItemStack(Material.AIR));
				}
				event.setCancelled(true);
			}
		}
	}

	// Haste
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onClick1(final InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();
		if ((event.getAction() == InventoryAction.SWAP_WITH_CURSOR) && (event.getCursor().getType().equals(Material.BOOK))) {
			if (event.getCursor().getItemMeta().getDisplayName().equalsIgnoreCase("§eLivro de Haste I")) {
				if (machados.contains(event.getCurrentItem().getType()) || espadas.contains(event.getCurrentItem().getType())
						|| picareta.contains(event.getCurrentItem().getType())
						|| pas.contains(event.getCurrentItem().getType())) {
					ItemStack item = event.getCurrentItem();
					ItemMeta lore = item.getItemMeta();
					ArrayList<String> itemLore = new ArrayList<String>();
					if (event.getCurrentItem().getItemMeta().getLore() != null) {
						itemLore.addAll(event.getCurrentItem().getItemMeta().getLore());
					}
					itemLore.add("§7Haste I");
					lore.setLore(itemLore);
					item.getItemMeta();
					event.getCurrentItem().setItemMeta(lore);
				} else {
					player.sendMessage("§cEste encantamento serve apenas para ferramentas");
					return;
				}
				if (event.getCursor().getAmount() > 1) {
					event.getCursor().setAmount(event.getCursor().getAmount() - 1);
				} else {
					event.setCursor(new ItemStack(Material.AIR));
				}
				event.setCancelled(true);
			}
		}
	}

	// Sobrecarga
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onClick0(final InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();
		if ((event.getAction() == InventoryAction.SWAP_WITH_CURSOR) && (event.getCursor().getType().equals(Material.BOOK))) {
			if (event.getCursor().getItemMeta().getDisplayName().equalsIgnoreCase("§eLivro de Sobrecarga I")) {
				if (espadas.contains(event.getCurrentItem().getType()) || machados.contains(event.getCurrentItem().getType())) {
					ItemStack item = event.getCurrentItem();
					ItemMeta lore = item.getItemMeta();
					ArrayList<String> itemLore = new ArrayList<String>();
					if (event.getCurrentItem().getItemMeta().getLore() != null) {
						itemLore.addAll(event.getCurrentItem().getItemMeta().getLore());
					}
					itemLore.add("§7Sobrecarga I");
					lore.setLore(itemLore);
					item.getItemMeta();
					event.getCurrentItem().setItemMeta(lore);
				} else {
					player.sendMessage("§cEste encantamento serve apenas para espadas event machados");
					return;
				}
				if (event.getCursor().getAmount() > 1) {
					event.getCursor().setAmount(event.getCursor().getAmount() - 1);
				} else {
					event.setCursor(new ItemStack(Material.AIR));
				}
				event.setCancelled(true);
			}
		}
	}

	// Tanker
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onClick10(final InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();
		if ((event.getAction() == InventoryAction.SWAP_WITH_CURSOR) && (event.getCursor().getType().equals(Material.BOOK))) {
			if (event.getCursor().getItemMeta().getDisplayName().equalsIgnoreCase("§eLivro de Tanker I")) {
				if (chestplate.contains(event.getCurrentItem().getType())) {
					ItemStack item = event.getCurrentItem();
					ItemMeta lore = item.getItemMeta();
					ArrayList<String> itemLore = new ArrayList<String>();
					if (event.getCurrentItem().getItemMeta().getLore() != null) {
						itemLore.addAll(event.getCurrentItem().getItemMeta().getLore());
					}
					itemLore.add("§7Tanker I");
					lore.setLore(itemLore);
					item.getItemMeta();
					event.getCurrentItem().setItemMeta(lore);
				} else {
					player.sendMessage("§cEste encantamento serve apenas peitoral");
					return;
				}
				if (event.getCursor().getAmount() > 1) {
					event.getCursor().setAmount(event.getCursor().getAmount() - 1);
				} else {
					event.setCursor(new ItemStack(Material.AIR));
				}
				event.setCancelled(true);
			}
		}
	}

	// Executor
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onClick11(final InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();
		if ((event.getAction() == InventoryAction.SWAP_WITH_CURSOR) && (event.getCursor().getType().equals(Material.BOOK))) {
			if (event.getCursor().getItemMeta().getDisplayName().equalsIgnoreCase("§eLivro de Executor I")) {
				if (espadas.contains(event.getCurrentItem().getType()) || machados.contains(event.getCurrentItem().getType())) {
					ItemStack item = event.getCurrentItem();
					ItemMeta lore = item.getItemMeta();
					ArrayList<String> itemLore = new ArrayList<String>();
					if (event.getCurrentItem().getItemMeta().getLore() != null) {
						itemLore.addAll(event.getCurrentItem().getItemMeta().getLore());
					}
					itemLore.add("§7Executor I");
					lore.setLore(itemLore);
					item.getItemMeta();
					event.getCurrentItem().setItemMeta(lore);
				} else {
					player.sendMessage("§cEste encantamento serve apenas para espadas event machados");
					return;
				}
				if (event.getCursor().getAmount() > 1) {
					event.getCursor().setAmount(event.getCursor().getAmount() - 1);
				} else {
					event.setCursor(new ItemStack(Material.AIR));
				}
				event.setCancelled(true);
			}
		}
	}

	// Metralhadora
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onClick12(final InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();
		if ((event.getAction() == InventoryAction.SWAP_WITH_CURSOR) && (event.getCursor().getType().equals(Material.BOOK))) {
			if (event.getCursor().getItemMeta().getDisplayName().equalsIgnoreCase("§eLivro de Metralhadora I")) {
				if (event.getCurrentItem().getType() == Material.BOW) {
					ItemStack item = event.getCurrentItem();
					ItemMeta lore = item.getItemMeta();
					ArrayList<String> itemLore = new ArrayList<String>();
					if (event.getCurrentItem().getItemMeta().getLore() != null) {
						itemLore.addAll(event.getCurrentItem().getItemMeta().getLore());
					}
					itemLore.add("§7Metralhadora I");
					lore.setLore(itemLore);
					item.getItemMeta();
					event.getCurrentItem().setItemMeta(lore);
				} else {
					player.sendMessage("§cEste encantamento serve apenas arcos");
					return;
				}
				if (event.getCursor().getAmount() > 1) {
					event.getCursor().setAmount(event.getCursor().getAmount() - 1);
				} else {
					event.setCursor(new ItemStack(Material.AIR));
				}
				event.setCancelled(true);
			}
		}
	}

	// Velocidade
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onClick13(final InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();
		if ((event.getAction() == InventoryAction.SWAP_WITH_CURSOR) && (event.getCursor().getType().equals(Material.BOOK))) {
			if (event.getCursor().getItemMeta().getDisplayName().equalsIgnoreCase("§eLivro de Velocidade I")) {
				if (botas.contains(event.getCurrentItem().getType())) {
					ItemStack item = event.getCurrentItem();
					ItemMeta lore = item.getItemMeta();
					ArrayList<String> itemLore = new ArrayList<String>();
					if (event.getCurrentItem().getItemMeta().getLore() != null) {
						itemLore.addAll(event.getCurrentItem().getItemMeta().getLore());
					}
					itemLore.add("§7Velocidade I");
					lore.setLore(itemLore);
					item.getItemMeta();
					event.getCurrentItem().setItemMeta(lore);
				} else {
					player.sendMessage("§cEste encantamento serve apenas botas");
					return;
				}
				if (event.getCursor().getAmount() > 1) {
					event.getCursor().setAmount(event.getCursor().getAmount() - 1);
				} else {
					event.setCursor(new ItemStack(Material.AIR));
				}
				event.setCancelled(true);
			}
		}
	}

	// SuperPicareta
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onClick14(final InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();
		if ((event.getAction() == InventoryAction.SWAP_WITH_CURSOR) && (event.getCursor().getType().equals(Material.BOOK))) {
			if (event.getCursor().getItemMeta().getDisplayName().equalsIgnoreCase("§eLivro de Explosiva I")) {
				if (picareta.contains(event.getCurrentItem().getType())) {
					ItemStack item = event.getCurrentItem();
					ItemMeta lore = item.getItemMeta();
					ArrayList<String> itemLore = new ArrayList<String>();
					if (event.getCurrentItem().getItemMeta().getLore() != null) {
						itemLore.addAll(event.getCurrentItem().getItemMeta().getLore());
					}
					itemLore.add("§7Explosiva I");
					lore.setLore(itemLore);
					item.getItemMeta();
					event.getCurrentItem().setItemMeta(lore);
				} else {
					player.sendMessage("§cEste encantamento serve apenas para picaretas");
					return;
				}
				if (event.getCursor().getAmount() > 1) {
					event.getCursor().setAmount(event.getCursor().getAmount() - 1);
				} else {
					event.setCursor(new ItemStack(Material.AIR));
				}
				event.setCancelled(true);
			}
		}
	}

	// SuperPicareta
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onClick15(final InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();
		if ((event.getAction() == InventoryAction.SWAP_WITH_CURSOR) && (event.getCursor().getType().equals(Material.BOOK))) {
			if (event.getCursor().getItemMeta().getDisplayName().equalsIgnoreCase("§eLivro de Viking I")) {
				if (machados.contains(event.getCurrentItem().getType())) {
					ItemStack item = event.getCurrentItem();
					ItemMeta lore = item.getItemMeta();
					ArrayList<String> itemLore = new ArrayList<String>();
					if (event.getCurrentItem().getItemMeta().getLore() != null) {
						itemLore.addAll(event.getCurrentItem().getItemMeta().getLore());
					}
					itemLore.add("§7Viking I");
					lore.setLore(itemLore);
					item.getItemMeta();
					event.getCurrentItem().setItemMeta(lore);
				} else {
					player.sendMessage("§cEste encantamento serve apenas para machados");
					return;
				}
				if (event.getCursor().getAmount() > 1) {
					event.getCursor().setAmount(event.getCursor().getAmount() - 1);
				} else {
					event.setCursor(new ItemStack(Material.AIR));
				}
				event.setCancelled(true);
			}
		}
	}

	// Auto Reparar
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onClick16(final InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();
		if ((event.getAction() == InventoryAction.SWAP_WITH_CURSOR) && (event.getCursor().getType().equals(Material.BOOK))) {
			if (event.getCursor().getItemMeta().getDisplayName().equalsIgnoreCase("§eLivro de Auto reparar I")) {
				if (helmet.contains(event.getCurrentItem().getType()) || chestplate.contains(event.getCurrentItem().getType())
						|| botas.contains(event.getCurrentItem().getType())
						|| leggins.contains(event.getCurrentItem().getType())) {
					ItemStack item = event.getCurrentItem();
					ItemMeta lore = item.getItemMeta();
					ArrayList<String> itemLore = new ArrayList<String>();
					if (event.getCurrentItem().getItemMeta().getLore() != null) {
						itemLore.addAll(event.getCurrentItem().getItemMeta().getLore());
					}
					itemLore.add("§7Auto reparar I");
					lore.setLore(itemLore);
					item.getItemMeta();
					event.getCurrentItem().setItemMeta(lore);
				} else {
					player.sendMessage("§cEste encantamento serve apenas para armaduras");
					return;
				}
				if (event.getCursor().getAmount() > 1) {
					event.getCursor().setAmount(event.getCursor().getAmount() - 1);
				} else {
					event.setCursor(new ItemStack(Material.AIR));
				}
				event.setCancelled(true);
			}
		}
	}

	// Furia
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onClick17(final InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();
		if ((event.getAction() == InventoryAction.SWAP_WITH_CURSOR) && (event.getCursor().getType().equals(Material.BOOK))) {
			if (event.getCursor().getItemMeta().getDisplayName().equalsIgnoreCase("§eLivro de Furia I")) {
				if (espadas.contains(event.getCurrentItem().getType()) || machados.contains(event.getCurrentItem().getType())) {
					ItemStack item = event.getCurrentItem();
					ItemMeta lore = item.getItemMeta();
					ArrayList<String> itemLore = new ArrayList<String>();
					if (event.getCurrentItem().getItemMeta().getLore() != null) {
						itemLore.addAll(event.getCurrentItem().getItemMeta().getLore());
					}
					itemLore.add("§7Furia I");
					lore.setLore(itemLore);
					item.getItemMeta();
					event.getCurrentItem().setItemMeta(lore);
				} else {
					player.sendMessage("§cEste encantamento serve apenas para espadas event machados");
					return;
				}
				if (event.getCursor().getAmount() > 1) {
					event.getCursor().setAmount(event.getCursor().getAmount() - 1);
				} else {
					event.setCursor(new ItemStack(Material.AIR));
				}
				event.setCancelled(true);
			}
		}
	}

	// Furia
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onClick18(final InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();
		if ((event.getAction() == InventoryAction.SWAP_WITH_CURSOR) && (event.getCursor().getType().equals(Material.BOOK))) {
			if (event.getCursor().getItemMeta().getDisplayName().equalsIgnoreCase("§eLivro de Matador I")) {
				if (espadas.contains(event.getCurrentItem().getType()) || machados.contains(event.getCurrentItem().getType())) {
					ItemStack item = event.getCurrentItem();
					ItemMeta lore = item.getItemMeta();
					ArrayList<String> itemLore = new ArrayList<String>();
					if (event.getCurrentItem().getItemMeta().getLore() != null) {
						itemLore.addAll(event.getCurrentItem().getItemMeta().getLore());
					}
					itemLore.add("§7Matador I");
					lore.setLore(itemLore);
					item.getItemMeta();
					event.getCurrentItem().setItemMeta(lore);
				} else {
					player.sendMessage("§cEste encantamento serve apenas para espadas event machados");
					return;
				}
				if (event.getCursor().getAmount() > 1) {
					event.getCursor().setAmount(event.getCursor().getAmount() - 1);
				} else {
					event.setCursor(new ItemStack(Material.AIR));
				}
				event.setCancelled(true);
			}
		}
	}

}
