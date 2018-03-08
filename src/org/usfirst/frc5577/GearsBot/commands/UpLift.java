package org.usfirst.frc5577.GearsBot.commands;

import org.usfirst.frc5577.GearsBot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class UpLift extends Command {
	
	private double speed = 0;
	private double time = 0;
	
	public UpLift(double speed) {
		requires(Robot.lift);
		this.speed = speed;
	}
	
	public UpLift(double speed, double time) {
		this(speed);
		this.time = time;
	}

	@Override
	protected void initialize() {
		if (time > 0) {
			setTimeout(time);
		}
	}

	@Override
	protected void execute() {
		Robot.lift.MoveLift(speed);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return isTimedOut();
	}

}
