package org.usfirst.frc5577.GearsBot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonUpLift extends CommandGroup {
	public AutonUpLift () {
		addSequential (new UpLift(0.3, 0.5));
	}
}
