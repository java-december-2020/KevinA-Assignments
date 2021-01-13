public class GorillaMain {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla(100);
        gorilla.displayEnergyLevel();
        gorilla.throwThings();

        gorilla.displayEnergyLevel();
        gorilla.eatBananas();
        gorilla.displayEnergyLevel();
        gorilla.climb();
        gorilla.displayEnergyLevel();

        Bat bat = new Bat(300);
        bat.getFly();
        bat.displayEnergyLevel();

        bat.getEatHumans();
        bat.displayEnergyLevel();

        bat.getAttackTown();
        bat.displayEnergyLevel();

    }
}
