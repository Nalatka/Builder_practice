public interface Builder {
    Builder setName(String name);
    Builder setId(int id);
    Builder setMaterial(String material);
    Builder setIs_On_Market(boolean is_On_Market);
    Builder setIs_It_Mobile(boolean is_It_Mobile);
    Builder setType(String type);
    Robot buildRobot();
}
