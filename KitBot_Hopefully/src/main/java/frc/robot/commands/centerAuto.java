// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.CANDriveSubsystem;
import frc.robot.subsystems.CANFuelSubsystem;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class centerAuto extends Command{
  /** Creates a new ExampleAuto. */
  private CANDriveSubsystem driveSubsystem;
  private CANFuelSubsystem ballSubsystem;

  public centerAuto(CANDriveSubsystem driveSubsystem, CANFuelSubsystem ballSubsystem) {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());

    this.driveSubsystem = driveSubsystem;
    this.ballSubsystem = ballSubsystem;
    addRequirements(driveSubsystem);
    // Drive backwards for .25 seconds. The driveArcadeAuto command factory
    // intentionally creates a command which does not end which allows us to control
    // the timing using the withTimeout decorator
   // new AutoDrive(driveSubsystem,0.5,  0.0).withTimeout(.25),
    // Spin up the launcher for 1 second and then launch balls for 9 seconds, for a
    // total of 10 seconds
    //new Launch(ballSubsystem).withTimeout(10));
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {

    driveSubsystem.driveArcade(0.35, 0.35);
    //delay(1000);

    end(true);
  }

  @Override
  public void end(boolean interrupted){

    driveSubsystem.driveArcade(0, 0);
  }




}
