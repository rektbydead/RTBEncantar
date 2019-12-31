package pt.rektbydead.itemevent;

import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import pt.rektbydead.encantar.Main;

public class EnchantEvent implements Listener {

	private static final ImmutableSet<Material> machados = Sets.immutableEnumSet(Material.DIAMOND_AXE,
			Material.GOLD_AXE, Material.IRON_AXE, Material.WOOD_AXE, Material.STONE_AXE);
	private static final ImmutableSet<Material> minerios = Sets.immutableEnumSet(Material.STONE, Material.COBBLESTONE,
			Material.IRON_ORE, Material.GOLD_ORE, Material.DIAMOND_ORE, Material.COAL_ORE, Material.LAPIS_ORE,
			Material.REDSTONE_ORE, Material.EMERALD_ORE);
	private static final ImmutableSet<Material> picareta = Sets.immutableEnumSet(Material.DIAMOND_PICKAXE,
			Material.GOLD_PICKAXE, Material.IRON_PICKAXE, Material.WOOD_PICKAXE, Material.STONE_PICKAXE);

	@EventHandler
	public void onFallDamage(EntityDamageEvent event) {
		// Anti Gravidade
		if (event.getEntity() instanceof Player) {
			Random random = new Random();
			Player player = (Player) event.getEntity();

			if (event.getCause() == DamageCause.FALL) {
				if (player.getInventory().getBoots() != null) {
					if (player.getInventory().getBoots().hasItemMeta()) {
						if (player.getInventory().getBoots().getItemMeta().getLore().contains("§7Anti Gravidade I")) {
							event.setCancelled(true);
						}
					}
				}
			}
			// Bloqueador de dano
			if (event.getDamage() >= 0) {
				if (player.isBlocking()) {
					if (player.getItemInHand().hasItemMeta()) {
						if (player.getItemInHand().getItemMeta().getLore().contains("§7Bloqueador de dano I")) {
							if (15  > random.nextInt(100))
								event.setDamage(0);
						}
					}
				}
			}
		}
	}

	@EventHandler
	public void Aranhento(EntityDamageByEntityEvent event) {
		// aranhamento
		if (event.getEntity() instanceof Player && event.getDamager() instanceof Player) {

			Random random = new Random();
			HumanEntity player2 = (HumanEntity) event.getEntity();
			ItemStack playermao = ((HumanEntity) event.getDamager()).getItemInHand();
			EntityEquipment player2armadura = player2.getEquipment();

			boolean playermaometa = playermao.hasItemMeta();

			if (playermaometa) {
				if (playermao.getItemMeta().getLore().contains("§7Aranhento I")) {
					if (5 > random.nextInt(100)) {
						Location position = event.getEntity().getLocation().add(0, 1, 0);
						position.getBlock().setType(Material.WEB);

						Bukkit.getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable() {
							public void run() {
								position.getBlock().setType(Material.AIR);
							}
						}, 5 * 20);
					}
				}
			}

			// Auto reparar
			ItemStack botas = player2armadura.getBoots();
			if (botas != null && botas.getType() != Material.AIR) {
				if (botas.hasItemMeta() && botas.getItemMeta().getLore().contains("§7Auto reparar I"))
					if (5 > random.nextInt(100)) {
						if (!(botas.getDurability() < 10))
						
						botas.setDurability((short) (botas.getDurability() - 10));
					}
			}

			// Auto reparar
			ItemStack Chestplate = player2armadura.getChestplate();
			if (Chestplate != null && Chestplate.getType() != Material.AIR) {
				if (Chestplate.hasItemMeta() && Chestplate.getItemMeta().getLore().contains("§7Auto reparar I")) {
					if (5 > random.nextInt(100)) {
						if (!(Chestplate.getDurability() < 10))
						Chestplate.setDurability((short) (Chestplate.getDurability() - 10));
					}
				}
			}

			// Auto reparar
			ItemStack legggins = player2armadura.getLeggings();
			if (legggins != null && legggins.getType() != Material.AIR) {
				if (legggins.hasItemMeta() && legggins.getItemMeta().getLore().contains("§7Auto reparar I"))
					if (5 > random.nextInt(100)) {
						if (!(legggins.getDurability() < 10))
						legggins.setDurability((short) (legggins.getDurability() - 10));
					}
			}

			// Auto reparar
			ItemStack capacete = player2armadura.getHelmet();
			if (capacete != null && capacete.getType() != Material.AIR) {
				if (capacete.hasItemMeta() && capacete.getItemMeta().getLore().contains("§7Auto reparar I"))
					if (5 > random.nextInt(100)) {
					if (!(capacete.getDurability() < 10))
						capacete.setDurability((short) (capacete.getDurability() - 10));
					}
			}

			if (playermao != null) {
				if (playermaometa && (machados.contains(playermao.getType()))
						&& playermao.getItemMeta().getLore().contains("§7Viking I")) {

					if (botas != null && botas.getType() != Material.AIR)
						if (botas.getDurability() > 389) {
							if (15 > random.nextInt(100)) {
								botas.setDurability((short) 429);
							}
						}

					if (Chestplate != null && Chestplate.getType() != Material.AIR)
						if (Chestplate.getDurability() > 488) {
							if (15 > random.nextInt(100)) {
								Chestplate.setDurability((short) 528);
							}
						}

					if (legggins != null && legggins.getType() != Material.AIR)
						if (legggins.getDurability() > 424) {
							if (15 > random.nextInt(100)) {
								legggins.setDurability((short) 495);
							}
						}
					if (capacete != null && capacete.getType() != Material.AIR)
						if (capacete.getDurability() > 323) {
							if (15 > random.nextInt(100)) {
								capacete.setDurability((short) 363);
							}
						}
				}
			}

			// executor
			if (playermao != null)
				if (playermaometa) {
					if (playermao.getItemMeta().getLore().contains("§7Executor I")) {
						if (player2.getHealth() <= 3) {
							player2.setHealth(0);
						}
					}
				}

			// veneno
			if (playermao != null)
				if (playermaometa) {
					if (playermao.getItemMeta().getLore().contains("§7Veneno I")) {
						if (10 > random.nextInt(100)) {
							player2.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 5 * 20, 2));

						}
					}
				}
			// fuga
			if (botas != null && botas.getType() == Material.AIR) {
				if (botas.getItemMeta().getLore().contains("§7Fuga I")) {
					if (5 > random.nextInt(100)) {
						player2.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 10 * 20, 3));
					}
				}
			}
			// sobrecarga
			if (playermao != null)
				if (playermaometa) {
					if (playermao.getItemMeta().getLore().contains("§7Sobrecarga I")) {
						if (5 > random.nextInt(100)) {
							Bukkit.getWorld(player2.getWorld().getName()).strikeLightning(player2.getLocation());
						}
					}
				}

			// tanker
			if (Chestplate != null && Chestplate.getType() == Material.AIR) {
				if (Chestplate.getItemMeta().getLore().contains("§7Tanker I")) {
					if ((player2.getHealth() - event.getFinalDamage()) < 10) {
						player2.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 5 * 20, 2));
					}
				}
			}

			// Furia
			if (playermao != null)
				if (playermaometa)
					if (playermao.getItemMeta().getLore().contains("§7Furia I"))
						if (10 > random.nextInt(100))
							event.setDamage(event.getDamage() * 2);

			// Matador
			if (playermao != null)
				if (playermaometa)
					if (playermao.getItemMeta().getLore().contains("§7Matador I"))
						if ((player2.getHealth() - event.getFinalDamage()) < 10)
							event.setDamage(event.getDamage() * 1.5);
		}
	}

	@EventHandler
	public void Haste(PlayerItemHeldEvent event) {
		Player player = (Player) event.getPlayer();
		Inventory inv = player.getInventory();
		if (inv.getItem(event.getNewSlot()) != null && inv.getItem(event.getNewSlot()).hasItemMeta()) {
			if (inv.getItem(event.getNewSlot()).getItemMeta().getLore().contains("§7Haste I")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 50000, 1));
			} else
				player.removePotionEffect(PotionEffectType.FAST_DIGGING);
		} else
			player.removePotionEffect(PotionEffectType.FAST_DIGGING);
	}

	@EventHandler
	public void HasteFIX(InventoryCloseEvent event) {
		HumanEntity player = event.getPlayer();

		if (player.getItemInHand() != null)
			if (player.getItemInHand().hasItemMeta()) {
				if (player.getItemInHand().getItemMeta().getLore().contains("§7Haste I")) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 50000, 1));
				} else
					player.removePotionEffect(PotionEffectType.FAST_DIGGING);
			} else
				player.removePotionEffect(PotionEffectType.FAST_DIGGING);

		ItemStack player2 = event.getPlayer().getEquipment().getBoots();
		;
		if ((player2 != null) && player2.hasItemMeta() && player2.getItemMeta().getLore().contains("§7Velocidade I")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 50000, 1));
		} else
			player.removePotionEffect(PotionEffectType.SPEED);

		if (player2 != null && player2.hasItemMeta() && player2.getItemMeta().getLore().contains("§7Super Pulo I")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 50000, 2));
		} else
			player.removePotionEffect(PotionEffectType.JUMP);
	}

	@EventHandler
	public void Velocidade(PlayerInteractEvent event) {
		ItemStack player = event.getPlayer().getEquipment().getBoots();
		Player jogador = event.getPlayer();

		if (player != null && player.getType() != Material.AIR)
			if (player.hasItemMeta() && player.getItemMeta().getLore().contains("§7Velocidade I")) {
				jogador.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 50000, 1));
			} else
				jogador.removePotionEffect(PotionEffectType.SPEED);

		if ((player != null && player.getType() != Material.AIR) && player.hasItemMeta()
				&& player.getItemMeta().getLore().contains("§7Super Pulo I")) {
			jogador.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 50000, 2));
		} else
			jogador.removePotionEffect(PotionEffectType.JUMP);
	}

	/*
	 * @EventHandler public void OnBlockDmg(EntityDamageEvent event) { if
	 * (event.getEntity() instanceof Player) { Player player = (Player)
	 * event.getEntity(); if (event.getDamage() >= 0) { if (player.isBlocking()) {
	 * if (player.getItemInHand().hasItemMeta()) { if
	 * (player.getItemInHand().getItemMeta().getLore().
	 * contains("§7Bloqueador de dano I")) { Random random = new Random(); int
	 * chance = 100; if (chance > random.nextInt(100)) event.setDamage(0); } } } } }
	 * }
	 */

	/*
	 * @EventHandler public void OnBlockDmg(EntityDamageEvent event) { if
	 * (event.getEntity() instanceof Player) { Player player = (Player)
	 * event.getEntity(); if (event.getDamage() >= 0) { if (player.isBlocking()) {
	 * if (player.getItemInHand().hasItemMeta()) { if
z	 * (player.getItemInHand().getItemMeta().getLore().
	 * contains("§7Bloqueador de dano I")) { Random random = new Random(); int
	 * chance = 100; if (chance > random.nextInt(100)) event.setDamage(0); } } } } }
	 * }
	 */

	/*
	 * @EventHandler public void Veneno(EntityDamageByEntityEvent event) { if
	 * (event.getEntity() instanceof Player && event.getDamager() instanceof Player)
	 * { Player player = (Player) event.getDamager(); Player player2 = (Player)
	 * event.getEntity(); if (player.getItemInHand().hasItemMeta()) { if
	 * (player.getItemInHand().getItemMeta().getLore().contains("§7Veneno I")) {
	 * Random random = new Random(); if (100 > random.nextInt(100)) {
	 * player2.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 5 * 20,
	 * 2));
	 * 
	 * } } } } }
	 */

	/*
	 * @EventHandler public void Fuga(EntityDamageByEntityEvent event) { if
	 * (event.getEntity() instanceof Player && event.getDamager() instanceof Player)
	 * { Player player = (Player) event.getEntity(); if
	 * (player.getEquipment().getBoots() != null) { if
	 * (player.getEquipment().getBoots().getItemMeta().getLore().contains("§7Fuga I"
	 * )) { Random random = new Random(); if (100 > random.nextInt(100)) {
	 * player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 10 * 20, 3));
	 * } } } } }
	 */

	/*
	 * @EventHandler public void Sobrecarga(EntityDamageByEntityEvent event) { if
	 * (event.getEntity() instanceof Player && event.getDamager() instanceof Player)
	 * { Player player = (Player) event.getDamager(); Player player2 = (Player)
	 * event.getEntity(); if (player.getItemInHand().hasItemMeta()) { if
	 * (player.getItemInHand().getItemMeta().getLore().contains("§7Sobrecarga I")) {
	 * Random random = new Random(); if (100 > random.nextInt(100)) {
	 * Bukkit.getWorld(player2.getWorld().getName()).strikeLightning(player2.
	 * getLocation()); } } } } }
	 */

	/*
	 * @EventHandler public void Tanker(EntityDamageByEntityEvent event) { if
	 * (event.getEntity() instanceof Player && event.getDamager() instanceof Player)
	 * { Player player = (Player) event.getEntity(); if
	 * (player.getEquipment().getChestplate() != null) { if
	 * (player.getEquipment().getChestplate().getItemMeta().getLore().
	 * contains("§7Tanker I")) { if ((player.getHealth() - event.getFinalDamage()) <
	 * 8) { player.addPotionEffect(new
	 * PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 5 * 20, 2)); } } } } }
	 */

	/*
	 * boolean ret = false;
	 * 
	 * @EventHandler public void Metralhadora(ProjectileLaunchEvent e) { if
	 * (e.getEntity() instanceof Arrow) { if (e.getEntity().getShooter() instanceof
	 * Player) { Arrow teste = (Arrow) e.getEntity(); Player player2 = (Player)
	 * teste.getShooter(); if
	 * (player2.getItemInHand().getType().equals(Material.BOW)) { if
	 * (player2.getItemInHand().getItemMeta().getLore().contains("§7Metralhadora I"
	 * )) { if (ret) return; Arrow arrow = (Arrow) e.getEntity(); Player player =
	 * (Player) arrow.getShooter(); ret = true; Arrow arrow1 =
	 * player.launchProjectile(Arrow.class); Arrow arrow2 =
	 * player.launchProjectile(Arrow.class); Arrow arrow3 =
	 * player.launchProjectile(Arrow.class); ret = false;
	 * arrow1.getLocation().setDirection(player.getLocation().getDirection());
	 * arrow2.getLocation().setDirection(player.getLocation().getDirection());
	 * arrow3.getLocation().setDirection(player.getLocation().getDirection());
	 * arrow1.setVelocity(e.getEntity().getVelocity());
	 * arrow2.setVelocity(e.getEntity().getVelocity());
	 * arrow3.setVelocity(e.getEntity().getVelocity()); } } } } }
	 */

	/*
	 * @EventHandler public void Executor(EntityDamageByEntityEvent event) { if
	 * (event.getEntity() instanceof Player && event.getDamager() instanceof Player)
	 * { Player player = (Player) event.getDamager(); Player player2 = (Player)
	 * event.getEntity(); if (player.getItemInHand().hasItemMeta()) { if
	 * (player.getItemInHand().getItemMeta().getLore().contains("§7Executor I")) {
	 * if (player2.getHealth() <= 3) { player2.setHealth(0); } } } } }
	 */

	/*
	 * @EventHandler public void Velocidadefix(InventoryCloseEvent event) {
	 * ItemStack player = event.getPlayer().getEquipment().getBoots(); if ((player
	 * != null && player.getType() != Material.AIR) &&
	 * (botas.contains(player.getType())) &&
	 * player.getItemMeta().getLore().contains("§7Velocidade I")) { ((LivingEntity)
	 * player).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 50000, 1));
	 * } else ((LivingEntity) player).removePotionEffect(PotionEffectType.SPEED); }
	 */

	@EventHandler
	public void Explosiva(BlockBreakEvent event) {
		ItemStack player = event.getPlayer().getItemInHand();
		// if (event.getPlayer().getItemInHand() != null)
		// player = (ItemStack) event.getPlayer().getItemInHand();
		// else
		// return;

		if (player != null && picareta.contains(player.getType()) && player.hasItemMeta()
				&& player.getItemMeta().getLore().contains("§7Explosiva I")) {
			Block bloco = event.getBlock();
			if (minerios.contains(bloco.getType())) {
				Location loc = bloco.getLocation();
				for (int x = -1; x <= 1; x++) {
					for (int y = -1; y <= 1; y++) {
						for (int z = -1; z <= 1; z++) {
							loc.getWorld().getBlockAt((int) loc.getX() + x, (int) loc.getY() + y, (int) loc.getZ() + z)
									.breakNaturally();
						}
					}
				}
			}

		}
	}

	/*
	 * @EventHandler public void Viking(EntityDamageEvent event) { ItemStack player
	 * = ((Player) event).getPlayer().getItemInHand(); if ((player != null &&
	 * player.getType() != Material.AIR) && (machados.contains(player.getType())) &&
	 * player.hasItemMeta() &&
	 * player.getItemMeta().getLore().contains("§7Viking I")) { EntityEquipment
	 * player2armadura = ((LivingEntity) event.getEntity()).getEquipment();
	 * 
	 * if (player2armadura.getBoots() != null) if
	 * (player2armadura.getBoots().getDurability() < 30) { Random random = new
	 * Random(); if (20 > random.nextInt(100)) {
	 * player2armadura.getBoots().setDurability((short) 0); } } if
	 * (player2armadura.getChestplate() != null) if
	 * (player2armadura.getChestplate().getDurability() < 30) { Random random = new
	 * Random(); if (20 > random.nextInt(100)) {
	 * player2armadura.getChestplate().setDurability((short) 0); } } if
	 * (player2armadura.getLeggings() != null) if
	 * (player2armadura.getLeggings().getDurability() < 30) { Random random = new
	 * Random(); if (20 > random.nextInt(100)) {
	 * player2armadura.getLeggings().setDurability((short) 0); } } if
	 * (player2armadura.getHelmet() != null) if
	 * (player2armadura.getHelmet().getDurability() < 30) { Random random = new
	 * Random(); if (20 > random.nextInt(100)) {
	 * player2armadura.getHelmet().setDurability((short) 0); } } } }
	 */

	/*
	 * @EventHandler public void autoreparacao(EntityDamageByEntityEvent event) { if
	 * (event.getEntity() instanceof Player && event.getDamager() instanceof Player)
	 * { EntityEquipment player2armadura = ((LivingEntity)
	 * event.getEntity()).getEquipment(); Random random = new Random();
	 * 
	 * ItemStack botas = player2armadura.getBoots(); if (botas != null &&
	 * botas.hasItemMeta() &&
	 * botas.getItemMeta().getLore().contains("§7auto reparar I")) if (20 >
	 * random.nextInt(100)) { botas.setDurability((short) (botas.getDurability() +
	 * 10)); }
	 * 
	 * ItemStack Chestplate = player2armadura.getChestplate(); if (Chestplate !=
	 * null && Chestplate.hasItemMeta() &&
	 * Chestplate.getItemMeta().getLore().contains("§7auto reparar I")) if
	 * (Chestplate.getDurability() < 30) { Chestplate.setDurability((short)
	 * (Chestplate.getDurability() + 10)); }
	 * 
	 * ItemStack legggins = player2armadura.getLeggings(); if (legggins != null &&
	 * legggins.hasItemMeta() &&
	 * legggins.getItemMeta().getLore().contains("§7auto reparar I")) if (20 >
	 * random.nextInt(100)) { legggins.setDurability((short)
	 * (legggins.getDurability() + 10)); }
	 * 
	 * ItemStack capacete = player2armadura.getHelmet(); if (capacete != null &&
	 * capacete.hasItemMeta() &&
	 * capacete.getItemMeta().getLore().contains("§7auto reparar I")) if (20 >
	 * random.nextInt(100)) { capacete.setDurability((short)
	 * (capacete.getDurability() + 10)); }
	 * 
	 * } }
	 */

}
