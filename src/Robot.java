import Builders.RobotProduct;

public class Robot implements RobotProduct {
    private final String name;
    private final int id;
    private final String material;
    private final Boolean Is_On_Market;
    private final Boolean Is_It_Mobile;
    private final String type;
    Robot(String name,int id,String material,Boolean Is_On_Market,Boolean Is_It_Mobile,String type) {
        this.name=name;
        this.id=id;
        this.material=material;
        this.Is_On_Market=Is_On_Market;
        this.Is_It_Mobile=Is_It_Mobile;
        this.type=type;
    }
    public String  getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public String getMaterial(){
        return material;
    }
    public Boolean getIs_on_Market(){
        return Is_On_Market;
    }
    public Boolean getIs_It_Mobile(){
        return Is_It_Mobile;
    }
    public String gettype(){
        return type;
    }



    public String toString(){
        return "Robot{name='" + name + "', id=" + id + ", material='" + material + "', isOnMarket=" + Is_On_Market + ", isItMobile=" + Is_It_Mobile + ", type='" + type ;
    }

    @Override
    public void printRobot() {
        System.out.println(toString());
    }
}
