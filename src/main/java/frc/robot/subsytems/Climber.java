/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsytems;

import edu.wpi.first.wpilibj.VictorSP;
import frc.robot.Robot;

/**
 * Add your docs here.
 */
public class Climber implements Subsystem{

    private VictorSP climber;

    public Climber(){
        climber = new VictorSP(Robot.CLIMBER);
    }

    public void climberMove(double speed){
        climber.set(speed);
    }

    @Override
    public void test() {
        
    }

    @Override
    public void publishStats() {

    }

    
}
