public class Mammal {
    protected int energyLevel = 100;

    public Mammal(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int displayEnergyLevel(){
        System.out.println("Energy Level is:" + getEnergyLevel());
        return getEnergyLevel();

    }
}
