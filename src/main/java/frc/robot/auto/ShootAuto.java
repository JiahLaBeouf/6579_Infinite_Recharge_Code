package frc.robot.auto;

import frc.robot.Robot;
import frc.robot.subsytems.Drivetrain;
import frc.robot.subsytems.Intake;
import frc.robot.subsytems.Shooter;

public class ShootAuto extends AutoStrategy {

    private long timeTakenToLocations = 0;

    @Override
    public void doStrategy(Robot robot) {

        //Move to the wall
        Drivetrain drivetrain = robot.getDrivetrain();
        Intake intake = robot.getIntake();

        System.out.println("doStrategy");

        timeTakenToLocations = System.currentTimeMillis();


        while(timeTaken() < 1000){
            intake.intakeArmDown(0.6);
        }

        intake.intakeArmDown(0);


        //Compounded Time
        while(timeTaken() < 3000){
            drivetrain.driveStraight(.4);
           System.out.println("auto: sleeping");
            sleep(10);
        }

        System.out.println("Out of drivetrain");
        drivetrain.stop();

        Shooter shooter = robot.getShooter();

        shooter.shootBall(1);
        //Compounded Time
        while(timeTaken() < 15000){
            System.out.println("Inside shooter");
            
            sleep(200);
            shooter.takeBall(-0.8);
            sleep(200);
            shooter.takeBall(0);
        }

        shooter.shootBall(0);
        shooter.takeBall(0);

    }
    
    private long timeTaken() {
        long timeTakenMs = System.currentTimeMillis() - timeTakenToLocations;
        System.out.println("timeTakenMs:" + timeTakenMs);
        return timeTakenMs;
    }
}
