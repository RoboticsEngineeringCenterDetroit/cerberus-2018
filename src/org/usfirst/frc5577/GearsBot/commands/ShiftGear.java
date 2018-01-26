package org.usfirst.frc5577.GearsBot.commands;

import org.usfirst.frc5577.GearsBot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ShiftGear extends Command {
	
	double time = 0.5;
	private boolean isHighGear = false;
	
	public ShiftGear() {
		requires(Robot.pneumatics);
		
	}
	protected void initialize() {
	  	setTimeout(time); 
	  }

	@Override
	protected boolean isFinished() {
		return isTimedOut();
	}
	 // Called once after isFinished returns true
	  protected void end() {
	  	//Robot.climbingArm.disable();
	  	
	  	Robot.pneumatics.shiftToLowGear(); 
	  }
	protected void execute() {
		if (isHighGear) {
			Robot.pneumatics.shiftToLowGear();
		} else {
			Robot.pneumatics.shiftToHighGear();
		}
	}
}
