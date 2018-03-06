package org.usfirst.frc5577.GearsBot.subsystems;

import org.usfirst.frc5577.GearsBot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Hook extends Subsystem {
	
	public void drop() {
		
		RobotMap.talonSRX9.set(ControlMode.PercentOutput, .25);
	}
	public void stop() {
		RobotMap.talonSRX9.set(ControlMode.PercentOutput, 0);
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
