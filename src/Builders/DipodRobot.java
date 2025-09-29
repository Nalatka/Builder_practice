package Builders;

public class DipodRobot implements RobotProduct {
    private final String name;
    private final int id;
    private final String material;
    private final Boolean Is_On_Market;
    private final Boolean Is_It_Mobile;
    private final String type;
    DipodRobot(String name,int id,String material,Boolean Is_On_Market,Boolean Is_It_Mobile,String type) {
        this.name=name;
        this.id=id;
        this.material=material;
        this.Is_On_Market=Is_On_Market;
        this.Is_It_Mobile=Is_It_Mobile;
        this.type=type;
    }
    @Override
    public void printRobot(){
        System.out.println("Dipod Robot");
    }
}
