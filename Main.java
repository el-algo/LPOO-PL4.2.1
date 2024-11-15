import game.character.*;

public class Main {
    public static void main(String[] args) {
        IHealthManager healthManager = new HealthManager(100);
        IInventory inventory = new Inventory();
        
        Player player = new Player(healthManager, inventory);
        
        player.move();
        player.jump();
        
        player.takeDamage(20);
        player.heal(10);
        
        player.addItemToInventory("Espada");
        player.addItemToInventory("Escudo");
        player.listInventoryItems();
    }
}
