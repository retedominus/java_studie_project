package OOP_HomeProject_03;

public class MachineGunWeapon extends Weapon{

    @Override
    public String getName() {
        return "MachineGun";
    }

    @Override
    public int getDamage() {
        return 5;
    }

    @Override
    public int getFireRate() {
        return 100;
    }

//    @Override
//    public int getCapacity() {
//        return 50;
//    }

    @Override
    public String getSound() {
        return "Zh-zh-zh-zh-zh";
    }

    @Override
    public String toString() {
        return "MachineGunWeapon{}";
    }
}
