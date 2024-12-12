package Caserne;

public class Archer extends Warrior {
    public void fight () {
        System.out.println("I'm a "+this.getClass().getSimpleName());
    }
}
