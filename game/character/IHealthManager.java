package game.character;

public interface IHealthManager {
    void takeDamage(int amount);
    void heal(int amount);
    int getHealth();
}
