package org.usfirst.frc5577.GearsBot.commands;

import org.usfirst.frc5577.GearsBot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Turn extends Command {
	
	double turnValue = 0.5;
	int degrees = 0;
	
	public Turn(double turnValue) {
      requires(Robot.driveTrain);
      
      this.turnValue = turnValue;

      setTimeout(1); //Or change back to 5 if something goes wrong       
      }
	
	public Turn(int degrees) {
		this.degrees = degrees;
		if (degrees < 0) {
			turnValue = turnValue * -1;
		}
	}

	protected void execute() {
    	Robot.driveTrain.turn(turnValue);
    }

    protected boolean isFinished() {
    	System.out.println(Robot.imu.getAngleY());
    	System.out.println(isTimedOut());
        return Math.abs(Robot.imu.getAngleY()) >= Math.abs(degrees); 
    }

    protected void end() {
    	Robot.imu.reset();
    	Robot.driveTrain.stop(); 
    }
	
}
