public class Samurai extends Human {
    private static int totalNumberOfSamurais = 0;

    public Samurai() {
        this.setHealth(200);
        totalNumberOfSamurais++;
    }

    private void deathBlow(Human human) {
        human.setHealth(0);
        int deathBlow = this.getHealth() / 2;
        System.out.println(deathBlow);

    }

    private void meditate() {
        int fullHealth = this.getHealth();
        System.out.println(fullHealth);
    }

    private static int howMany() {
        return totalNumberOfSamurais;
    }

    public void printOutput(Human human) {
        deathBlow(human);
        meditate();
        System.out.println(howMany());
    }

}
