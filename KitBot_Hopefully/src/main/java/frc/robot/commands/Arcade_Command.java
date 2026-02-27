package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.CANDriveSubsystem;

public class Arcade_Command extends Command {

    private CANDriveSubsystem drive;
    private DoubleSupplier forward;
    private DoubleSupplier rotation;

    public Arcade_Command(CANDriveSubsystem drive, DoubleSupplier forward, DoubleSupplier rotation)
    {
        this.drive = drive;
        this.forward = forward;
        this.rotation = rotation;
        addRequirements(this.drive);
    }

    @Override
    public void initialize() {}

    @Override
    public void execute()
    {
        double forward = 1;
        double rotate = 1;
        drive.driveArcade(forward, rotate);
    }

}
