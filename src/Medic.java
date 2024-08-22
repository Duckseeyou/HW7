public class Medic extends Hero {
    int healPoints = 10;

    public void increaseExperience() {
        healPoints *= 1.1 ;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic used super ability HEAL");
    }
}
