package org.usfirst.frc5577.GearsBot.subsystems;

import org.usfirst.frc5577.GearsBot.Robot;
import org.usfirst.frc5577.GearsBot.RobotMap;
import org.usfirst.frc5577.GearsBot.commands.Blend;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.phoenix.motorcontrol.*;

public class Intake extends Subsystem {
	
	private final double scaleFactor = 0.85;
	
	public void intakeCube(double speed) {
//		Joystick controller = Robot.oi.getJoystick();
		
//		double leftTrigger = controller.getRawAxis(Robot.oi.LEFT_TRIGGER_AXIS);
//		double leftAxisX = controller.getRawAxis(Robot.oi.LEFT_AXIS_X);
//		controller.getButton()

		RobotMap.talonSRX5.set(ControlMode.PercentOutput, speed);
//    	Timer.delay(0.005);
		RobotMap.talonSRX6.set(ControlMode.PercentOutput, -speed);
	}
	
	public void pushOutCube(double speed) {
		RobotMap.talonSRX5.set(ControlMode.PercentOutput, -speed);
//    	Timer.delay(0.005);
		RobotMap.talonSRX6.set(ControlMode.PercentOutput, speed);
	}
	
	public void stop() {
		RobotMap.talonSRX5.set(ControlMode.PercentOutput, 0);
//		RobotMap.blenderMotor.set(0);
//    	Timer.delay(0.005);
		RobotMap.talonSRX6.set(ControlMode.PercentOutput, 0);
	}

	@Override
	protected void initDefaultCommand() {
//		setDefaultCommand(new ShooterArmIntake(0));
	}

}
