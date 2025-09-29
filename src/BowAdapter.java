
public class BowAdapter extends Gun {
    private Bow bow;
    
    public BowAdapter(Bow bow) {
        super(bow.getName(), bow.getArrows());
        this.bow = bow;
    }
    
    @Override
    public void fire() {
        bow.shoot();
    }
    
    @Override
    public int getAmmo() {
        return bow.getArrows();
    }
}
