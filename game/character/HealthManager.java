package game.character;

public class HealthManager implements IHealthManager {
    private int health;

    public HealthManager(int initialHealth) {
        this.health = initialHealth;
    }

    @Override
    public void takeDamage(int amount) {
        health = Math.max(health - amount, 0);
        updateHealthDisplay();
    }

    @Override
    public void heal(int amount) {
        health = Math.min(health + amount, 100);
        updateHealthDisplay();
    }

    @Override
    public int getHealth() {
        return health;
    }

    private void updateHealthDisplay() {
        System.out.println("Salud actual: " + health);
    }
}
