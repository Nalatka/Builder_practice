
public class WeaponSystem {
    private String systemName;
    
    public WeaponSystem(String systemName) {
        this.systemName = systemName;
    }
    
    public String getSystemName() {
        return systemName;
    }
    

    public void useWeapon(Gun gun) {
        System.out.println(systemName + " is using " + gun.getName());
        gun.fire();
    }
}
