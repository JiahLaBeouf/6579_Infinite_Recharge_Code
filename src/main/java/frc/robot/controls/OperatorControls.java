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
    public void pressR1(Robot robot) {
      //Loading shooter
      robot.getShooter().takeBall(-.8);
    }

    @Override
    public void pressR2(Robot robot) {
      //Shoot ball
      robot.getShooter().shootBall(1);
    }

    //resets shooter
    @Override 
    public void r1Released(Robot robot){
        robot.getShooter().takeBall(0);
        robot.getShooter().reset();
       // SmartDashboard.get(key, value)
    }
        

    @Override
    public void pressCircle(Robot robot){
      //Pulls the climber up
      robot.getClimber().climberMove(.6);
    }

    @Override
    public void pressTriangle(Robot robot) {
      //Pulls the climber down
      robot.getClimber().climberMove(-.3);
    }

    @Override 
    public void pressCross(Robot robot){
      //Pulls the robot up
      robot.getClimber().winch(1);
    }

    @Override
    public void pressShare(Robot robot){
      //Reverses the winch
      robot.getClimber().winch(-.3);
    }

    @Override
    public void nothingPressed(Robot robot){
        robot.getShooter().shootBall(0);
        robot.getShooter().takeBall(0);
        robot.getShooter().reset();
        robot.getClimber().climberMove(0);
        robot.getClimber().winch(0);
    }
}
