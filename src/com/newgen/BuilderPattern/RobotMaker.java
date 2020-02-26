package com.newgen.BuilderPattern;

public class RobotMaker {

	RobotBuilder robotBuilder;

	public RobotMaker(RobotBuilder robotBuilder) {
		// TODO Auto-generated constructor stub
		this.robotBuilder = robotBuilder;
	}

	public RobotPlan getRobot() {
		return this.robotBuilder.getRobot();

	}

	public void makeRobot() {
		this.robotBuilder.Buildarms();
		this.robotBuilder.Buildhead();

	}

}
