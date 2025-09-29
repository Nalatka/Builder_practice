public class Main {
    public static void main(String[] args) {
        WeaponSystem system = new WeaponSystem("Gungeon");
        Gun AK = new Gun("AK-74M",30);
        system.useWeapon(AK);
        Bow Bow = new Bow("Bow-74M",30);
        BowAdapter bowAdapter = new BowAdapter(Bow);
        system.useWeapon(bowAdapter);
    }
}