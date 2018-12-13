package org.usfirst.frc.team2374.robot.commands;

import org.usfirst.frc.team2374.robot.Robot;
import org.usfirst.frc.team2374.robot.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.command.Command;

public class BeltTeleop extends Command {

	public BeltTeleop() { requires(Robot.belt); }
	
	@Override
	protected void initialize() {  }
	
	@Override
	protected void execute() {
		
//		System.out.println("Debug teleop");
		if (Robot.oi.getLeftTrigger() > 0) {
			Robot.belt.move(Robot.oi.getLeftTrigger(), 1);
		} else if (Robot.oi.getRightTrigger() > 0) {
			Robot.belt.move(Robot.oi.getRightTrigger(), -1);
		} else {
			Robot.belt.move(0, 0);
		}
//		System.out.println("Output of L-triggers: " + Robot.oi.getLeftTrigger());
		
	}
	
	@Override
	protected void end() {
		
		Robot.belt.move(0, 0);
		
	}
	
	@Override
	protected boolean isFinished() { return false; }
	
	@Override
	protected void interrupted() { end(); }
	
}
