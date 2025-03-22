package me.kaktus;

import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class EntityHitListener implements Listener {

    @EventHandler
    public void onHit(EntityDamageEvent e) {
        Player player = (Player) e.getDamageSource().getCausingEntity();
        String name = e.getEntity().getName();
        Entity entity = e.getEntity();
        if (entity instanceof Monster) {
            Monster monster = (Monster) entity;
            double health = monster.getHealth();
            double maxHealth = monster.getMaxHealth();
            player.sendActionBar(name + ": " + health + " / " + maxHealth);
        } else if (entity instanceof  Mob) {
            Mob mob = (Mob) entity;
            double health = mob.getHealth();
            double maxHealth = mob.getMaxHealth();
            player.sendActionBar(name + ": " + health + " / " + maxHealth);
        }
    }
}
