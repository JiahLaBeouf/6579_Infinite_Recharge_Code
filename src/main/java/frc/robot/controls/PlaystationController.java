/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.controls;

import edu.wpi.first.wpilibj.Joystick;
import frc.robot.Robot;

/**
 * Add your docs here.
 */
public class PlaystationController implements RobotControls {

    //We are using a playstation controller
    protected Joystick playstation;

    public PlaystationController(int port){
        playstation = new Joystick(port);

    }

    @Override
    public void giveCommands(Robot robot) {
        processControllerButtons(robot);

    }

    private void processControllerButtons(Robot robot){
        if(playstation.getRawButton(1)){
            pressSquare(robot);
        } else if(playstation.getRawButton(2)){
            pressCross(robot);   
        } else if(playstation.getRawButton(3)){
            pressCircle(robot);
        } else if(playstation.getRawButton(4)){
            pressTriangle(robot);
        } else if(playstation.getRawButton(5)){
            pressL1(robot);
        } else if(playstation.getRawButton(6)){
            pressR1(robot);
        } else if(playstation.getRawButton(7)){
            pressL2(robot);
        } else if(playstation.getRawButton(8)){
            pressR2(robot);
        } else if(playstation.getRawButton(9)){
            pressShare(robot);
        } else if(playstation.getRawButton(10)){
            pressOptions(robot);
        } else if(playstation.getRawButton(11)){
            pressL3(robot);
        } else if(playstation.getRawButton(12)){
            pressR3(robot);
        } else if(playstation.getRawButton(13)){
            pressPSButton(robot);
        } else if(playstation.getRawButton(14)){
            pressTouchPad(robot);
        } else {
            nothingPressed(robot);
        }
    }

    //For when no buttons are being pressed
    protected void nothingPressed(Robot robot) {
        //powers to 0/hold numbers
    }

    //If a subteam wants to use the touchpad for controls
    protected void pressTouchPad(Robot robot) {
        //Set powers as needed
    }

    //If a subteam wants to use the psbutton for controls
    protected void pressPSButton(Robot robot) {
        //Set powers as needed
    }

    //If a subteam wants to use R3 for controls
    protected void pressR3(Robot robot) {
    }

    //If a subteam wants to use L3 for controls
    protected void pressL3(Robot robot) {
    }
    
    //If a subteam wants to use the options button for controls
    protected void pressOptions(Robot robot) {
    }

    //If a subteam wants to use the share button for controls
    protected void pressShare(Robot robot) {
    }

    //If a subteam wants to use R2 for controls
    protected void pressR2(Robot robot) {
    }

    //If a subteam wants to use L2 for controls
    protected void pressL2(Robot robot) {
    }

    //If a subteam wants to use R1 for controls
    protected void pressR1(Robot robot) {
    }

    //If a subteam wants to use L1 for controls
    protected void pressL1(Robot robot) {
    }

    //If a subteam wants to use the triangle button for controls
    protected void pressTriangle(Robot robot) {
    }

    //If a subteam wants to use the circle button for controls
    protected void pressCircle(Robot robot) {
    }

    //If a subteam wants to use the cross button for controls
    protected void pressCross(Robot robot) {
    }

    //If a subteam wants to use the square button for controls
    protected void pressSquare(Robot robot) {
    }

}
