package cs112.ud3;

public class Assassin extends Character {

    //CONSTANT VARIABLES
    public static final String DEFAULT_NAME = "DEFAULT_ASSASSIN";
    public static final int DEFAULT_SILVER = 1, DEFAULT_ITEM_LEVEL = 1;

    //CONSTRUCTORS
    public Assassin(String name, int itemLevel, int silver) {
        super(name, itemLevel, silver);
    }

    public Assassin() {
        this(Assassin.DEFAULT_NAME, Assassin.DEFAULT_ITEM_LEVEL, Assassin.DEFAULT_SILVER);
    }

    public Assassin(Assassin original) {
        super(original);
    }


    //OTHER METHODS
    @Override
    public void warCry() {
        System.out.println("Hussshhh");
    }

    @Override
    public void featuredAbility() {
        System.out.println("The assassin's featured ability is Blade Storm");
    }

    @Override
    public String catchPhrase() {
        return "Always sneaking and stabbing";
    }
}
