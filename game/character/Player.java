package game.character;

public class Player {
    private IHealthManager healthManager;
    private IInventory inventory;

    public Player(IHealthManager healthManager, IInventory inventory) {
        this.healthManager = healthManager;
        this.inventory = inventory;
    }

    public void move() {
        System.out.println("El jugador se mueve.");
    }

    public void jump() {
        System.out.println("El jugador salta.");
    }

    public void takeDamage(int damage) {
        healthManager.takeDamage(damage);
    }

    public void heal(int amount) {
        healthManager.heal(amount);
    }

    public void addItemToInventory(String item) {
        inventory.addItem(item);
    }

    public void listInventoryItems() {
        inventory.listItems();
    }
}
