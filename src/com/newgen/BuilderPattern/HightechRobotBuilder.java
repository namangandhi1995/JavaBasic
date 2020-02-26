package com.newgen.BuilderPattern;

public class HightechRobotBuilder implements RobotBuilder {
	private RobotPlan robot;

	public HightechRobotBuilder() {
		// TODO Auto-generated constructor stub
		this.robot = new RobotPlan();
	}

	@Override
	public void Buildhead() {
		// TODO Auto-generated method stub
		this.robot.setHead("Tin head");

	}

	@Override
	public void Buildarms() {
		// TODO Auto-generated method stub
		this.robot.setArms("Metal Arms");
	}

	public RobotPlan getRobot() {

		return this.robot;

	}

}
