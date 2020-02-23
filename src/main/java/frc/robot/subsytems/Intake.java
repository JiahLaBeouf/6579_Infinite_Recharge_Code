/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsytems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Robot;

/**
 * Add your docs here.
 */
public class Intake implements Subsystem{

    private final VictorSP intakeFlywheel;

    private final VictorSP intakeArm;

    private boolean isDown;

    public Intake(){

        intakeFlywheel = new VictorSP(Robot.INTAKE_FLYWHEEL);
        intakeArm = new VictorSP(Robot.INTAKE_ARM);

        isDown = false;
    }

    //To bring a ball in
    public void takeIn(double speed){
        intakeFlywheel.set(speed);
    }

    //In case we ever need to shoot a ball through the intake
    public void intakeOut(double speed){
        intakeFlywheel.set(speed);
    }
    
    //To bring the intake arm up
    public void intakeArmDown(double speed){
        intakeArm.set(speed);
        isDown = true;
    }

    public void intakeArmUp(double speed){
        intakeArm.set(speed);
        isDown = false;
    }

    @Override
    public void test() {
        //This exists as a just in case

    }

    @Override
    public void publishStats() {
        SmartDashboard.putBoolean("Intake Arm Is Down?", isDown);
    }

}
