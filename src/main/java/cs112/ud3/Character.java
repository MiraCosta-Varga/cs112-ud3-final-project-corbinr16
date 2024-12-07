package cs112.ud3;

public abstract class Character {
    //CONSTANT VARIABLES
    public static final String DEFAULT_NAME = "Name not set";
    public static final int DEFAULT_SILVER = 1, DEFAULT_ITEM_LEVEL = 1;


    //INSTANCE VARIABLES
    private String name;
    private int itemLevel, silver;

    //CONSTRUCTORS
    public Character(String name, int itemLevel, int silver) {
        if (!this.setAll(name, itemLevel, silver)) {
            System.out.println("ERROR: invalid data given to full Character constructor. Shutting down.");
            System.exit(0);
        }
    }

    public Character() {
        this(DEFAULT_NAME, DEFAULT_ITEM_LEVEL, DEFAULT_SILVER);
    }

    public Character(Character original) {
        if (original == null) {
            System.out.println("ERROR: null data given to copy Character constructor. Shutting down.");
            System.exit(0);
        } else {
            this.setAll(original.name, original.itemLevel, original.silver);
        }
    }


    //SETTERS
    public boolean setName(String name) {
        if (name != null && name.length() != 0) {
            this.name = name;
            return true;
        } else {
            return false;
        }
    }

    public boolean setSilver(int silver) {
        if (silver >= 0) {
            this.silver = silver;
            return true;
        } else {
            return false;
        }
    }

    public boolean setItemLevel(int itemLevel) {
        if (itemLevel >= 0) {
            this.itemLevel = itemLevel;
            return true;
        } else {
            return false;
        }
    }

    public boolean setAll(String name, int itemLevel, int silver) {
        return this.setName(name) && this.setItemLevel(itemLevel) && this.setSilver(silver);
    }


    //GETTERS
    public String getName() {
        return this.name;
    }

    public int getSilver() {
        return this.silver;
    }

    public int getItemLevel() {
        return this.itemLevel;
    }


    //OTHER METHODS
    @Override
    public String toString() {
        return String.format("Character's name: %s%nItem Level: %d%nSilver: %d%n", this.name, this.itemLevel,
                this.silver);
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || other instanceof Character) { //only need to check character name, can have multiple characters with the same subclass and silver amount
            return false;
        }
        Character otherCharacter = (Character)other;
        return this.name.equals(otherCharacter.name) && this.itemLevel == otherCharacter.itemLevel && this.silver == otherCharacter.silver;
    }


    //ABSTRACT METHODS
    public abstract void warCry();

    public abstract void featuredAbility();

    public abstract void catchPhrase();

}
