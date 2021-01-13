public class Ninja extends Human {
    public Ninja() {
        this.setStealth(10);
    }

  public void steal(Human human){
        int stealthHealth=human.getHealth()-human.getStealth();
        int higherHealth = this.getHealth() + stealthHealth;
      System.out.println(stealthHealth);
      System.out.println(higherHealth);
  }

  public int runAway(){
        return this.getHealth()-10;
  }
}
