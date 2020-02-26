package com.newgen.BuilderPattern;

public class TestRobot {

	public static void main(String[] args) {
		HightechRobotBuilder robot1 = new HightechRobotBuilder();
		RobotMaker robmaker1 = new RobotMaker(robot1);
		robmaker1.makeRobot();
		RobotPlan rob = robmaker1.getRobot();
		System.out.println(rob.getHead());
		System.out.println(rob.getArms());

	}

}
