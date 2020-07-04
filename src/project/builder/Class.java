package project.builder;

//Class (Profession) enumeration
public enum Class {
    MAGE,PRIEST,THIEF,WARRIOR,RANGER;


    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
