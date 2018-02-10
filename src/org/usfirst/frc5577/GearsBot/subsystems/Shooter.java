package org.usfirst.frc5577.GearsBot.subsystems;

import org.usfirst.frc5577.GearsBot.Robot;
import org.usfirst.frc5577.GearsBot.RobotMap;
import org.usfirst.frc5577.GearsBot.commands.Shoot;

import com.ctre.phoenix.motorcontrol.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {
	
	private final double scaleFactor = 0.8;
	private StringBuilder sb = new StringBuilder();
	int loops = 0;
	
	public Shooter() {
		RobotMap.talonSRX2.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0);
		RobotMap.talonSRX2.configNominalOutputForward(+0.0, -0);
		RobotMap.talonSRX2.configPeakOutputForward(+12.0, -12);
		RobotMap.talonSRX2.selectProfileSlot(0, 0);
		RobotMap.talonSRX2.config_kF(0, 0.01, 0);
		RobotMap.talonSRX2.config_kP(0, 0.0, 0);
		RobotMap.talonSRX2.config_kI(0, 0.0, 0);
		RobotMap.talonSRX2.config_kD(0, 0.0, 0);
		RobotMap.talonSRX2.set(ControlMode.PercentOutput, 0);
	}
	
	public void shootOutBall(double speed) {
		Joystick controller = Robot.oi.getJoystick();
		
		double motorOutput = RobotMap.talonSRX2.getMotorOutputVoltage() / RobotMap.talonSRX2.getBusVoltage();
		sb.append("\tout:");
		sb.append(motorOutput);
		sb.append("\tspeed");
		sb.append(RobotMap.talonSRX2.getSelectedSensorVelocity(0));
		
//		double rightTrigger = controller.getRawAxis(Robot.oi.RIGHT_TRIGGER_AXIS);
//		RobotMap.shooterLeftMotor.setInverted(false);
//		RobotMap.shooterRightMotor.setInverted(false);
		
		double targetSpeed = speed; // 6000 RPM target
		RobotMap.talonSRX2.set(ControlMode.PercentOutput, targetSpeed);
		
		sb.append("/terr"); 
		sb.append(RobotMap.talonSRX2.getClosedLoopError(0)); 
		sb.append("/ttrg:");  
		sb.append(targetSpeed); 
	
		
		if(++loops >= 10) { 
			loops = 0; 
			System.out.println(sb.toString()); 
		} 
		
		sb.setLength(0);
		
		
	}
	
	public void stop() {
		RobotMap.talonSRX2.set(ControlMode.PercentOutput, 0);
//		RobotMap.blenderMotor.set(0);
//    	Timer.delay(0.005);
	}

	@Override
	protected void initDefaultCommand() {
//		setDefaultCommand(new ShooterArmShootOut(0));
	}

}
