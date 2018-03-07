package org.usfirst.frc5577.GearsBot.commands;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonDriveFromRight extends CommandGroup {
	
	private String gameData;
	
	public AutonDriveFromRight() {
		gameData = DriverStation.getInstance().getGameSpecificMessage();
		if (gameData.charAt(0) == 'R') { // The switch is on the right
			addSequential(new DriveForward(10));
			addSequential(new Turn(-90));
			addSequential(new DriveForward(.5));
			//TODo Drop Cube in switch
			} else if (gameData.charAt(1) == 'R') { // The scale is on the right
				addSequential(new DriveForward(15));
				addSequential(new Turn(-90));
				addSequential(new DriveForward(.5));
				// TODO Drop Cube in scale
				} else {
					addSequential(new DriveForward(10));
				}
		}
}
