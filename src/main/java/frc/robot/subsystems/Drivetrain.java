/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {
  /**
   * Creates a new Drivetrain.
   */
  private final SpeedControllerGroup left =
    new SpeedControllerGroup(new Spark(Constants.FRONTL),
                            new Spark(Constants.BACKL));

  private final SpeedControllerGroup right =
    new SpeedControllerGroup(new Spark(Constants.FRONTR),
                             new Spark(Constants.BACKR));

  private final DifferentialDrive drive = new DifferentialDrive(left, right);  

  public Drivetrain() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void tankDrive(double left, double right){
    drive.tankDrive(left, right);
  }
}
