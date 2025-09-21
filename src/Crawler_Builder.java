public class Crawler_Builder implements Builder, RobotProduct{
    private String Name;
    private String Type;
    private String Material;
    private int id;
    private Boolean Is_On_Market;
    private Boolean Is_It_Mobile;
    public Crawler_Builder(String name, String type, String material, int id, Boolean on_Market, Boolean it_Mobile) {
        super();
    }

    @Override
    public Builder setName(String name) {
        this.Name = name;
        return this;
    }

    @Override
    public Builder setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public Builder setMaterial(String material) {
        this.Material = material;
        return this;
    }

    @Override
    public Builder setIs_On_Market(boolean is_On_Market) {
        this.Is_On_Market = is_On_Market;
        return this;
    }

    @Override
    public Builder setIs_It_Mobile(boolean is_It_Mobile) {
        this.Is_It_Mobile = is_It_Mobile;
        return this;
    }

    @Override
    public Builder setType(String type) {
       this.Type = type;
       return this;
    }

    @Override
    public Robot buildRobot() {
        if(Name == null || Name == ""){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        Robot robot;
        robot = new Robot(Name, id, Material, Is_On_Market, Is_It_Mobile, Type);
        return robot;
    }

    @Override
    public void printRobot() {
        System.out.println(buildRobot());
    }
}
