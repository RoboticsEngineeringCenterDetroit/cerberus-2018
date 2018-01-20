package org.usfirst.frc5577.GearsBot.commands;

import org.usfirst.frc5577.GearsBot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ShiftGear extends Command {
	private boolean isHighGear = false; 

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	protected void execute() {
		if (isHighGear) {
			Robot.pneumatics.shiftToLowGear();
		} else {
			Robot.pneumatics.shiftToHighGear();
		}
	}
}
