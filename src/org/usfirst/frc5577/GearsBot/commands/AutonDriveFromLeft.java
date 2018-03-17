package org.usfirst.frc5577.GearsBot.commands;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonDriveFromLeft extends CommandGroup {
	
	private String gameData;
	
	public AutonDriveFromLeft() {
		gameData = DriverStation.getInstance().getGameSpecificMessage();
		if (gameData != null && gameData.length() > 0) {
			if (gameData.charAt(0) == 'L'){ // The switch is on the left side
				addSequential(new DriveForward(10));
				addSequential(new UpLift(0.2, 4));
				addSequential(new UpLift(0, 1));
				addSequential(new Turn(90));
				addSequential(new PlaceCube());
//				addSequential(new ShiftClaw());
//				addSequential(new ShiftClaw());
			} //else if (gameData.charAt(1) == 'L') { // The scale is on the left side
//				addSequential(new DriveForward(15));
//				addSequential(new Turn(-90));
//				addSequential(new DriveForward(.5));
//				// TODO Drop Cube in scale
//			} 
			else {
			addSequential(new DriveForward(10));
			}
		}
	}
}
