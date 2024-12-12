package Caserne;

public class ArmyTraining extends Caserne {
       @Override
       public Warrior createWarrior (WarriorType type) {
           Warrior war = null;
           switch (type) {
               case archer -> war = new Archer();
               case knight -> war = new Knight();
               case falconer -> war = new Falconer();
               case infantryman -> war = new Infantryman();
           }
           return war;
       }
}
