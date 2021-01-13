public class Wizard extends Human {

    public Wizard() {
        this.setIntelligence(8);
        this.setHealth(50);
    }


    private void healHuman(Human human) {
        int healingHuman = human.getHealth() + this.getIntelligence();
        System.out.println(healingHuman);
    }


    private void fireBall(Human human) {
        int healthDecrease = human.getHealth() - this.getIntelligence() * 3;
        System.out.println(healthDecrease);
    }

    public void getHealHuman(Human humans) {
        healHuman(humans);
        fireBall(humans);
    }
}
