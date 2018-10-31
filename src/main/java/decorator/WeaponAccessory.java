package decorator;

public class WeaponAccessory implements Weapon {

    Weapon weapon;

    public WeaponAccessory(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void aimAndFire() {

    }
}
