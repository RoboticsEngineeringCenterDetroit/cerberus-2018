package org.usfirst.frc5577.GearsBot.commands;

import org.usfirst.frc5577.GearsBot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DropClaw extends Command {
	double time = 0.5;
	
	@Override
	protected void initialize() {
		setTimeout(time);  
	}	

	@Override
	protected boolean isFinished() {
		return isTimedOut();
	}
	
	@Override
	protected void execute() {
		Robot.hook.drop();
	}
	
	@Override
	protected void end() {
		Robot.hook.stop();
	} 

}
