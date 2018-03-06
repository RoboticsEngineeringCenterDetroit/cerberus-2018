package org.usfirst.frc5577.GearsBot.commands;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonDriveFromRight extends CommandGroup {
	
	private String gameData;
	
	public AutonDriveFromRight() {
		gameData = DriverStation.getInstance().getGameSpecificMessage();
		if(gameData.charAt(0) == 'R'){ 
	addSequential(new DriveForward(10));
 	addSequential(new Turn(-90));
 	addSequential(new DriveForward(.5));
 	//TODo Drop Cube
		}else {
	addSequential(new DriveForward(10)); 		
		}
 }

}
