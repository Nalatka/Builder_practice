public class Main {
    public static void main(String[] args) {
        RobotFactory factory = new RobotFactory();
        RobotProduct robot = factory.createRobot("Crawler");
        robot.printRobot();
    }
}