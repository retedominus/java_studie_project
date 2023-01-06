package OOP_HomeProject_03;

public class PistolWeapon extends Weapon{
    @Override
    public String getName() {
        return "DesertEagle";
    }

    @Override
    public int getDamage() {
        return 10;
    }

    @Override
    public int getFireRate() {
        return 10;
    }

//    @Override
//    public int getCapacity() {
//        return 7;
//    }

    @Override
    public String getSound() {
        return "Bang-Bang";
    }

    @Override
    public String toString() {
        return "PistolWeapon{}";
    }
}
