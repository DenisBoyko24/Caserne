package Caserne;

public class Main {
    public static void main(String[] args) {
        Caserne warriorA = new ArmyTraining();
        warriorA.createWarrior(WarriorType.archer).fight();
        Caserne warriorK = new ArmyTraining();
        warriorK.createWarrior(WarriorType.knight).fight();
        Caserne warriorF = new ArmyTraining();
        warriorF.createWarrior(WarriorType.falconer).fight();
        Caserne warriorI = new ArmyTraining();
        warriorI.createWarrior(WarriorType.infantryman).fight();
    }
}
