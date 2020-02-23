/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsytems;



import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Robot;

/**
 * Add your docs here.
 */
public class Shooter implements Subsystem{

    private final PWMVictorSPX shooterFlywheel;
    private final PWMVictorSPX shooterEntryWheel;

    private boolean shootingBall = false;

    public Shooter(){
        shooterFlywheel = new PWMVictorSPX(Robot.SHOOTER_FLYWHEEL);
        shooterEntryWheel = new PWMVictorSPX(Robot.SHOOTER_ENTRY_WHEELS);
    }

    public void takeBall(double speed){
        if(shootingBall){
            shooterEntryWheel.set(speed);
        } else {
            shooterEntryWheel.set(0);
        }
    }

    public void shootBall(double speed){
         shooterFlywheel.set(speed);
         shootingBall = true;
    }
    
    public void reset(){
        shootingBall = false;
    }

    @Override
    public void test() {

    }

    @Override
    public void publishStats() {
        SmartDashboard.putBoolean("Is Shooter Being Basketball God?", shootingBall);

    }


}
