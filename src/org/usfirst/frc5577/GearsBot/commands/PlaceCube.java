package org.usfirst.frc5577.GearsBot.commands;

import org.usfirst.frc5577.GearsBot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class PlaceCube extends Command {
	
	private double speed = 0.8;

	public PlaceCube() {
		this(0.8);
	}
	
	public PlaceCube(double speed) {
		requires(Robot.intake);
		this.speed = speed;
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		Robot.intake.pushOutCube(speed);
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

}
