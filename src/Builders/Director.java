package Builders;

public class Director {
    public Robot construct(Builder builder) {
        if (builder == null) {
            throw new NullPointerException("builder is null");
        }
        builder.setName("Dvunog");
        builder.setId(1);
        builder.setIs_It_Mobile(true);
        builder.setIs_It_Mobile(false);
        builder.setMaterial("Steel");
        builder.setType("Universal");
        return builder.buildRobot();
    }
}
