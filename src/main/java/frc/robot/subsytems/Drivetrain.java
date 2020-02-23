/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsytems;

//import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.Robot;

/**
 * Add your docs here.
 */
public class Drivetrain implements Subsystem{

    //Left Toughbox Controllers
    VictorSP leftController1 = new VictorSP(Robot.LEFT_DRIVE_MOTOR_1);
    VictorSP leftController2 = new VictorSP(Robot.LEFT_DRIVE_MOTOR_2);
    SpeedControllerGroup leftToughBox = new SpeedControllerGroup(leftController1, leftController2);
//    Encoder leftEncoder;

    //Right Toughbox Controllers
    VictorSP rightController1 = new VictorSP(Robot.RIGHT_DRIVE_MOTOR_1);
    VictorSP rightController2 = new VictorSP(Robot.RIGHT_DRIVE_MOTOR_2);
    SpeedControllerGroup rightToughBox = new SpeedControllerGroup(rightController1, rightController2);

    //Initialise robot driving
    DifferentialDrive drive = new DifferentialDrive(leftToughBox, rightToughBox);

    public void setPower(double leftPower, double rightPower){
        //Telling the left TB its power
        leftToughBox.set(-leftPower);
        //Telling the right TB its power
        rightToughBox.set(rightPower); 
    }

    public void arcadeDiffDrive(double stickX, double stickY){
        drive.arcadeDrive(stickY, stickX);
    }

    @Override
    public void test() {

    }

    @Override
    public void publishStats() {
        
    }

}
