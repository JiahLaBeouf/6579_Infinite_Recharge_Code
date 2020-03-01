/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.auto;

import java.util.logging.Logger;

import frc.robot.Robot;

/**
 * Add your docs here.
 */
public abstract class AutoStrategy {

    protected Logger logger = Logger.getLogger( this.getClass().getName());

    protected long msFromLineToPos(){
        return 1500;
    }

    public void start(Robot robot){
        logger.info("Starting Auto!");
        doStrategy(robot);
    }

    public AutoStrategy(){
        
    }

    public abstract void doStrategy(Robot robot);

    public void sleep(long time){
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            e.printStackTrace();    
        }
    }
}
