/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.controls;

import frc.robot.Robot;

/**
 * Add your docs here.
 */
public class OperatorControls extends PlaystationController{

    public OperatorControls(int port) {
        super(1);
    }

    @Override
    public void giveCommands(Robot robot){
        super.giveCommands(robot);
    }

    //Add all controls that the operator will be doing here

    @Override
    public void nothingPressed(Robot robot){
        //Make everything 0
    }
}
