public interface SpaceShip {
    boolean hasLaunched();
    boolean hasLanded();
    boolean canCarry(Item item);
    void carry(Item item);
}
