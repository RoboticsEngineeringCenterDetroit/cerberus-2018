package org.usfirst.frc5577.GearsBot.subsystems;

import org.usfirst.frc5577.GearsBot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Pneumatics extends Subsystem {
	
	private boolean isHighGear = false;

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
	}
	
	public void shiftGear() {
		if (isHighGear) {
			shiftToLowGear();
			isHighGear = false;
		} else {
			shiftToHighGear();
			isHighGear = true;
		}
	}
	
	public boolean isHighGear() {
		return isHighGear;
	}
	
	private void shiftToHighGear() {
		RobotMap.gas_system.set(DoubleSolenoid.Value.kForward);       
	
	}
	
	private void shiftToLowGear() {
		RobotMap.gas_system.set(DoubleSolenoid.Value.kReverse);
	}
	
	public void stop() {
		RobotMap.gas_system.set(DoubleSolenoid.Value.kOff); 
	}
	
}
