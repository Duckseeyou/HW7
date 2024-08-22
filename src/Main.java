public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {new Magic(), new Medic(), new Warrior()};
        for (Hero i : heroes){
            i.applySuperAbility();
            if (i instanceof Medic){
                Medic john = (Medic) i;
                john.increaseExperience();
                System.out.println(john.healPoints);
            }
        }
    }
}