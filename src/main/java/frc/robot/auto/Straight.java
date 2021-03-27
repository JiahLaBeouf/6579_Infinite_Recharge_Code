/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.auto;

import frc.robot.Robot;
import frc.robot.subsytems.Drivetrain;
import frc.robot.subsytems.Shooter;

/**
 * Add your docs here.
 */
public class Straight extends AutoStrategy {

    private long startTimeToDriveToWall = 0;

    @Override
    public void doStrategy(Robot robot) {

        Drivetrain drivetrain = robot.getDrivetrain();
        //Shooter shooter = robot.getShooter();

        System.out.println("doStrategy");
        // start driving to the wall (for Xms)
        startTimeToDriveToWall = System.currentTimeMillis();

        System.out.println("startTimeToDriveToWall:" + startTimeToDriveToWall);

  

        while(timeTaken() < 2000){
            drivetrain.driveStraight(.5);
            System.out.println("sleeping");
            sleep(10);
        }
        drivetrain.stop();
    }

    private long timeTaken() {
        long timeTakenMs = System.currentTimeMillis() - startTimeToDriveToWall;
        System.out.println("timeTakenMs:" + timeTakenMs);
        return timeTakenMs;
    }
}
