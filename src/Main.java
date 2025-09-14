public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Dipod_Robot_Builder dip = new Dipod_Robot_Builder();
        Robot robot = director.construct(dip);
        System.out.println(robot);
    }
}