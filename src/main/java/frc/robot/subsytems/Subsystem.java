/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsytems;

/**
 * Add your docs here.
 */
public interface Subsystem {

    //Used while testing different mechanisms
    public void test();


    //Where we can put shuffleboard commands for the drivers
    public void publishStats();
}
