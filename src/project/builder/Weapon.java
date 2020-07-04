package project.builder;

public enum Weapon {
    AXE,BOW,DAGGER,SWORD,WARHAMMER;


    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
