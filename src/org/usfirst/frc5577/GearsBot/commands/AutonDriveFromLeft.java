package org.usfirst.frc5577.GearsBot.commands;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonDriveFromLeft extends CommandGroup {
	private String gameData;
	
	public AutonDriveFromLeft() {
		gameData = DriverStation.getInstance().getGameSpecificMessage();
		if(gameData.charAt(0) == 'L'){
			addSequential(new DriveForward(10));
			addSequential(new Turn(90));
			addSequential(new DriveForward(.5));
			//TODO Drop Cube
		} else {
			addSequential(new DriveForward(10));
			}
		}
}
