package OOP_HomeProject_03;

public class FlameThrowerWeapon extends Weapon{
    @Override
    public String getName() {
        return "FlameThrower";
    }

    @Override
    public int getDamage() {
        return 20;
    }

    @Override
    public int getFireRate() {
        return 15;
    }

//    @Override
//    public int getCapacity() {
//        return 30;
//    }

    @Override
    public String getSound() {
        return "Fuuuhh";
    }

    @Override
    public String toString() {
        return "FlameThrowerWeapon{}";
    }
}
