/**
 * Gun - A weapon that can fire bullets
 */
public class Gun {
    private String name;
    private int ammo;
    
    public Gun(String name, int ammo) {
        this.name = name;
        this.ammo = ammo;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAmmo() {
        return ammo;
    }
    
    public void fire() {
        if (ammo > 0) {
            ammo--;
            System.out.println(name + " fired! Ammo left: " + ammo);
        } else {
            System.out.println(name + " is out of ammo!");
        }
    }
}
