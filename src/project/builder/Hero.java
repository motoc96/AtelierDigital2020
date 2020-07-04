package project.builder;

public class Hero {
    //Variables
    private final Class aClass;
    private final String name;
    private final HairType hairType;
    private final HairColor hairColor;
    private final Armor armor;
    private final Weapon weapon;

    //Constructor
    public Hero(Builder builder) {
        this.aClass = builder.aClass;
        this.name = builder.name;
        this.hairType = builder.hairType;
        this.hairColor = builder.hairColor;
        this.armor = builder.armor;
        this.weapon = builder.weapon;
    }

    //Getters
    public Class getaClass() {
        return aClass;
    }

    public String getName() {
        return name;
    }

    public HairType getHairType() {
        return hairType;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public Armor getArmor() {
        return armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {
        var sb= new StringBuilder();
        sb.append("This is a ")
                .append(aClass)
                .append(" named ")
                .append(name);
        if(hairColor != null || hairType != null){
            sb.append(" with ");
            if(hairColor != null){
                sb.append(hairColor).append(' ');
            }
            if(hairType != null){
                sb.append(hairType).append(' ');
            }
            sb.append(hairType !=HairType.BALD ? "hair" : "head");
        }
        if(armor != null){
            sb.append("wearing").append(armor);
        }
        if(weapon != null){
            sb.append(" and wielding a ").append(weapon);
        }
        sb.append('.');
        return sb.toString();
    }

    //Builder class
    public static class Builder {
        private final Class aClass;
        private final String name;
        private HairType hairType;
        private HairColor hairColor;
        private Armor armor;
        private Weapon weapon;
    //Constructor
    public Builder(Class aClass,String name){
        if(aClass==null|| name==null){
            throw new IllegalArgumentException("Class and name cannot be null");
        }
            this.aClass=aClass;
            this.name=name;
        }
    public Builder withHairType(HairType hairType){
        this.hairType=hairType;
        return this;
    }

    public Builder withHairColor(HairColor hairColor){
        this.hairColor=hairColor;
        return this;
    }

    public Builder withArmor(Armor armor){
        this.armor = armor;
        return this;
    }

    public Builder withWeapon(Weapon weapon){
        this.weapon = weapon;
        return this;
    }

    public Hero build(){
        return new Hero(this);
    }
    }
}
