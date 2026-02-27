// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.subsystems.CANDriveSubsystem;
import frc.robot.subsystems.CANFuelSubsystem;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
/* 
import frc.robot.subsystems.ExampleSubsystem;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

*/
public final class Autos  {
 // created all these variables for the switch including timer up to line 31
public final static String kCenterAuto = "Center Auto";
public final static String kLeftAuto = "Left Side Auto";
public final static String kRightAuto = "Right Side Auto";
public final static String kDefaultAuto = "Drive Forward";
final Timer timer1 = new Timer();

 private  DifferentialDrive drive2;
private String m_autoSelected;
 
private final SendableChooser<String> autoChooser = new SendableChooser<>();

// /** Example static factory for an autonomous command. */
//

 

 public static Command exampleAuto(CANDriveSubsystem driveSubsystem, CANFuelSubsystem ballSubsystem) {
  return Commands.sequence(
    //Commands.run(() -> driveSubsystem.tankDrive(0.35, 0.35), driveSubsystem).withTimeout(3.0),
    //Commands.runOnce(() -> driveSubsystem.tankDrive(0, 0), driveSubsystem)
  );
 }
  public static Command centerAuto(CANDriveSubsystem driveSubsystem, CANFuelSubsystem ballSubsystem) {
  return Commands.sequence(
    //Commands.run(() -> driveSubsystem.tankDrive(0.35, 0.35), driveSubsystem).withTimeout(3.0),
    //Commands.runOnce(() -> driveSubsystem.tankDrive(0, 0), driveSubsystem)
  );
 
 }
 public static Command sideAutoLeft(CANDriveSubsystem driveSubsystem, CANFuelSubsystem ballSubsystem) {
   return Commands.sequence(
    //Commands.run(() -> driveSubsystem.tankDrive(0.35, 0.35), driveSubsystem).withTimeout(3.0),
    //Commands.runOnce(() -> driveSubsystem.tankDrive(0, 0), driveSubsystem)
  );
}
 public static Command sideAutoRight(CANDriveSubsystem driveSubsystem, CANFuelSubsystem ballSubsystem) {
  return Commands.sequence(
    //Commands.run(() -> driveSubsystem.tankDrive(0.35, 0.35), driveSubsystem).withTimeout(3.0),
    //Commands.runOnce(() -> driveSubsystem.tankDrive(0, 0), driveSubsystem)
  );
}
//
/*
 private Autos() {
     throw new UnsupportedOperationException("This is a utility class!");
       try  
      { // is in robot container
         m_autoSelected = autoChooser.getSelected();
       switch (m_autoSelected)
       {
         case kCenterAuto:
          {// puts custom auto code here 
            if(timer1.get()<3)
             drive2.tankDrive(.35, .35);
            else if (timer1.get()<5) 
            { 
            drive2.tankDrive(0,0);
             //spinUp();
             //Launch();
            }
           else 
          
           drive2.tankDrive(0,0);
        // end custom auto code here
        break;
        }
       case kLeftAuto:
       { // puts custom auto code here
          if(timer1.get()<3)
            drive2.tankDrive(.35, .35);
          else if (timer1.get()<5) 
        { 
         drive2.tankDrive(0,0);
          //spinUp();
          //Launch();
        }
         else 
         
         drive2.tankDrive(0,0);
        // end custom auto code here
        break;
        }
       case kRightAuto:
        { // puts custom auto code here
          if(timer1.get()<3)
            drive2.tankDrive(.35, .35);
          else if (timer1.get()<5) 
           { 
             drive2.tankDrive(0,0);
            //spinUp();
           //Launch();
           }
         else 
          
            drive2.tankDrive(0,0);
           // end custom auto code here
       
           break;
        }
       case kDefaultAuto:
        default:
        {// put default auto code here 
         if(timer1.get()<3)
          drive2.tankDrive(.35, .35);
         else if (timer1.get()<5) 
         { 
          drive2.tankDrive(0,0);
          //spinUp();
          //Launch();
         }
        else 
         
        drive2.tankDrive(0,0);
        // turn off feeder 

       
          break;
        }
       }
//      case kClimbAuto:
//       // here is where the climb auto code goes
//
//       break;
        */
      }
  