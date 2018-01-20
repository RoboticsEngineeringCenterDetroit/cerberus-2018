package org.usfirst.frc5577.GearsBot.subsystems;

import org.usfirst.frc5577.GearsBot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Pneumatics extends Subsystem {

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
	}
	public void shiftToHighGear() {
		RobotMap.solenoid1.set(true);
		RobotMap.solenoid2.set(true);        

	}
	public void shiftToLowGear() {
		RobotMap.solenoid1.set(false);
		RobotMap.solenoid2.set(false);

	}
	
}
