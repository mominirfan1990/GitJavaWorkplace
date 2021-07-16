package com.overloading;

public class LapTop
{
	private int noOfUSBPort;
	private float processorSpeed;
	
	public void setnoOfUSBPort(int pr)   // set value of private int type veriable
	{
		noOfUSBPort = pr;
	}
	public int getnoOfUSBPort()  // access value of private int veriable
	{
		return noOfUSBPort;
	}
	
	public void setprocessorSpeed(float ps) // set value of private float type veriable
	{
		processorSpeed = ps;
	}
	public float getprocessorSpeed()  // access value of private float type veriable
	{
		return processorSpeed;
	}

	public static void main(String[] args)
		{
			LapTop lp = new LapTop();
			lp.setnoOfUSBPort(3);
			System.out.println("Laptop Have  "+lp.getnoOfUSBPort()+ "   Numbers of Ports");
			lp.setprocessorSpeed(3.8f);
			System.out.println("Laptop Processor Speed is   " +lp.getprocessorSpeed());
						
		}
	}









