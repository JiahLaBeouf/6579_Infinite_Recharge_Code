/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsytems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.VictorSP;
import frc.robot.Robot;

/**
 * Add your docs here.
 */
public class Climber implements Subsystem{

    private VictorSP climber;

    private CANSparkMax winchMain;
    private CANSparkMax winchFollow;

    public Climber(){
        //Setting port numbers
        climber = new VictorSP(Robot.CLIMBER);

        //Setting CAN ids
        winchMain = new CANSparkMax(7, MotorType.kBrushless);
        winchFollow = new CANSparkMax(8, MotorType.kBrushless);

        //Allows both neos to go the same speed without many lines of code
        winchFollow.follow(winchMain);
    }

    public void climberMove(double speed){
        //Pull the climber arm up/down
        climber.set(speed);
    }   

    public void winch(double speed){
        //use the winch on the robot
        winchMain.set(speed);
    }

    @Override
    public void test() {
        
    }

    @Override
    public void publishStats() {

    }

    
}
