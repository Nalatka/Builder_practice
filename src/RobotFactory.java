public class RobotFactory {
    public RobotProduct createRobot(String robotName) {
        if (robotName.equals("Dipod Robot")) {
            return new DipodRobot("Dvunog",1,"Metal", false, true, "Universal" );

        }
        else if (robotName.equals("Crawler")) {
            return new Crawler("Crawler",2,"Plastic", true, true, "Transport" );
        }
        throw new IllegalArgumentException("Invalid robot name.");
    }
}
