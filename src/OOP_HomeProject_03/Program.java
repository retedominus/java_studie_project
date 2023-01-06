package OOP_HomeProject_03;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Weapon> weapons = new ArrayList<>();
        weapons.add(new PistolWeapon());
        weapons.add(new FlameThrowerWeapon());
        weapons.add(new MachineGunWeapon());

        for (Weapon weapon : weapons) {
            defeatTarget(weapon);
        }
    }
    private static void defeatTarget(Weapon weapon) {
        float health = 100;
        int shot = 0;
        while (health > 0) {
            health -= weapon.getDamage();
            System.out.println(weapon.getName() + " выстрелил: " + weapon.getSound() + "\n");
            System.out.println("Здоровье мишени уменьшено до: " + health);
            try {
                Thread.sleep(weapon.getFireRate());
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }

            shot++;
        }
        System.out.println(weapon.getName() + " уничтожил мишень за " + shot + " выстрелов!");
        System.out.println("-----------");
    }
}
