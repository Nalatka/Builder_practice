public class Dipod_Robot_Builder implements Builder {
    private String Name;
    private String Type;
    private int id;
    private Boolean Is_On_Market;
    private Boolean Is_It_Mobile;
    public Dipod_Robot_Builder() {
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
        this.Type = material;
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
        Robot robot = new Robot()
    }
}
