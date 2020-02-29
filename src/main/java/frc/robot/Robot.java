/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.controls.DriverControls;
import frc.robot.controls.OperatorControls;
import frc.robot.controls.RobotControls;
import frc.robot.subsytems.Camera;
import frc.robot.subsytems.Climber;
import frc.robot.subsytems.Drivetrain;
import frc.robot.subsytems.Intake;
import frc.robot.subsytems.Shooter;
import frc.robot.subsytems.Subsystem;

//Brandon is good with playstation controllers!
//Sam is good with playstation controllers!

/**
 * This is no longer a demo program showing the use of the DifferentialDrive class.
 * Runs the motors with arcade steering.
 * It now is 6579s main robot class
 */
public class Robot extends TimedRobot {

  //subsystems ports, final number is port
  public static final int LEFT_DRIVE_MOTOR_1 = 0;
  public static final int LEFT_DRIVE_MOTOR_2 = 1;
  public static final int RIGHT_DRIVE_MOTOR_1 = 2;
  public static final int RIGHT_DRIVE_MOTOR_2 = 3;
  public static final int CLIMBER = 4;
  public static final int INTAKE_FLYWHEEL = 5;
  public static final int INTAKE_ARM = 6;
  public static final int SHOOTER_FLYWHEEL = 7;
  public static final int SHOOTER_ENTRY_WHEELS = 8;


  //Getting the subsystems into the code
  private Intake Intake;
  private Shooter Shooter;
  private Drivetrain Drivetrain;
  private Climber Climber;
  private Camera Camera;

  //Create new controls
  private RobotControls driverControls;
  private RobotControls operatorControls;

  //Creating the list object
  private List subsystems = new ArrayList<>();

  public void robotInit(){
    
    try {
      Intake = new Intake();
      Drivetrain = new Drivetrain();
      Shooter = new Shooter();
      driverControls = new DriverControls(0);
      Climber = new Climber();
      operatorControls = new OperatorControls(1);
      Camera = new Camera();

      subsystems.add(Camera);
      subsystems.add(Intake);
      subsystems.add(Shooter);
      subsystems.add(Climber);
      subsystems.add(Drivetrain);
    } catch (Exception e) {
      e.printStackTrace();
      throw e;
    }

  }

  //Initialises auto
  @Override
  public void autonomousInit() {

  }

  //What we do during auto
  @Override
  public void autonomousPeriodic() {

  }

  //Initialises teleop
  @Override
  public void teleopInit() {

  }

  //What we do during teleop
  @Override
  public void teleopPeriodic(){
    try{
      driverControls.giveCommands(this);
      operatorControls.giveCommands(this);
      SmartDashboard.putBoolean("Controls Working", true);
      //Call the giveCommands method to allow the driver to control the robot
    } catch(Exception e){
      //To print anything that goes wrong
      SmartDashboard.putBoolean("Controls Working", false);
      e.printStackTrace();
      throw e;
    }
    publishSubsystems();
  }

  public Intake getIntake() {
    return Intake;
  }

  public Drivetrain getDrivetrain(){
    return Drivetrain;
  }

  public Shooter getShooter(){
    return Shooter;
  }

  public Climber getClimber(){
    return Climber;
  }

  private void publishSubsystems(){
    //To get the names of the subsystems
    Iterator i = subsystems.iterator();
    //To call the publishStats method of each subsystem
    while(i.hasNext()){

      Subsystem nextSubsystem = (Subsystem) i.next();
      nextSubsystem.publishStats();
    }
  }
}
