package org.usfirst.frc5577.GearsBot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;

public class WheelEncoder extends Subsystem {
	Encoder wheelEncoder;
	
	public WheelEncoder(int A, int B) {
		wheelEncoder= new Encoder(A,B, false, Encoder.EncodingType.k4X);
		wheelEncoder.setDistancePerPulse(.147);
		wheelEncoder.setSamplesToAverage(10);
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub 
		
	}
	
	public double getDistance() {
		return wheelEncoder.getDistance();
	}
	
	public void reset () {
		wheelEncoder.reset();
	}

}
