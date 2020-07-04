package project.builder;


//Hair color enumeration
public enum HairColor {
    BLACK,BLOND,BROWN,RED,WHITE;


    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
