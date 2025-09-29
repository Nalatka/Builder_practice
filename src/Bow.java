
public class Bow {
    private String name;
    private int arrows;
    
    public Bow(String name, int arrows) {
        this.name = name;
        this.arrows = arrows;
    }
    
    public String getName() {
        return name;
    }
    
    public int getArrows() {
        return arrows;
    }
    
    public void shoot() {
        if (arrows > 0) {
            arrows--;
            System.out.println(name + " shot an arrow! Arrows left: " + arrows);
        } else {
            System.out.println(name + " is out of arrows!");
        }
    }
}
