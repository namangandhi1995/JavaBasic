package com.newgen.BuilderPattern;

public class RobotPlan implements Robot {

	private String head;
	private String arms;

	@Override
	public void setHead(String head) {
		// TODO Auto-generated method stub
		this.head = head;
	}

	@Override
	public void setArms(String arms) {
		// TODO Auto-generated method stub
		this.arms = arms;
	}

	public String getHead()

	{
		return this.head;
	}

	public String getArms()

	{
		return this.arms;
	}

}
