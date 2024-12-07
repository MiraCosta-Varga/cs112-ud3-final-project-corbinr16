package cs112.ud3;

public class Warrior extends Character {

    public Warrior(String name, int itemLevel, int silver) {
        super(name, itemLevel, silver);
    }


    //OTHER METHODS
    @Override
    public void warCry() {
        System.out.println("HMMRAH");
    }

    @Override
    public void featuredAbility() {
        System.out.println("The warrior's featured ability is Sword Rage");
    }

    @Override
    public void catchPhrase() {
        System.out.println("Oi, when can I hit stuffs!");
    }
}
