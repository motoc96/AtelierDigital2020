package project.builder;

//Character Creation - Using Builder Design Pattern
//We want to build {Hero} objects, but its construction is complex because of the many
//parameters needed. To aid the user we introduce {Builder} class. {Hero.Builder} takes
//the minimum parameters to build {Hero} object in its constructor. After that additional
//configuration for the {Hero} object can be done using the fluent {Builder} interface.

public class Main {
    public static void main(String[] args) {
        var mage = new Hero.Builder(Class.MAGE,"Dumbledore")
                .withHairColor(HairColor.WHITE)
                .withWeapon(Weapon.SWORD).build();
        System.out.println(mage.toString());

        var warrior= new Hero.Builder(Class.WARRIOR,"Arthas")
                .withHairColor(HairColor.BLACK)
                .withHairType(HairType.LONG_STRAIGHT)
                .withArmor(Armor.PLATE_MAIL).withWeapon(Weapon.WARHAMMER)
                .build();
        System.out.println(warrior.toString());

        var thief = new Hero.Builder(Class.THIEF,"Legolas")
                .withHairType(HairType.BALD)
                .withWeapon(Weapon.BOW)
                .build();
        System.out.println(thief.toString());
    }
}
