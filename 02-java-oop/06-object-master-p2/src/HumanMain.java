public class HumanMain {
    public static void main(String[] args) {

        /*  This Section tests the Human Class  Object**/
        Human human = new Human();
        System.out.println(human.getHealth());
        human.showAttack();


        Human human2 = new Human(3, 3, 3, 100);
        System.out.println(human2.getHealth());
        human2.showAttack();


        /*  This Section tests the Wizard Class  Object**/

        Human anotherHuman = new Human();

        Wizard wizard = new Wizard();
        wizard.getHealHuman(anotherHuman);


        /*  This Section tests the Ninja Object**/

        Ninja ninja = new Ninja();
        ninja.steal(anotherHuman);


        /*  This Section tests the Samurai Class  Object**/

        Samurai samurai = new Samurai();
        samurai.printOutput(anotherHuman);


        Samurai samurai2 = new Samurai();
        samurai.printOutput(anotherHuman);

        Samurai samurai3 = new Samurai();
        samurai.printOutput(anotherHuman);

    }
}
