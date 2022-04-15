import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class Robot extends IterativeRobot {

     RobotDrive myRobot;
     Joystick stick;
     Timer timer;

     public void robotInit() {
          myRobot = new RobotDrive(0,1);
          stick = new Joystick(1);
          timer = new Timer(); 
     }
}
public void autonomousInit() { 
     timer.reset(); 
     timer.start(); 
}

public void autonomousPeriodic() { 
     // 2 saniye boyunca robotu sur
     if (timer.get() < 2.0) {
          myRobot.drive(0.5, 0.0); // robotu yarim hizda ileri sur
     } else {
          myRobot.drive(0.0, 0.0); // Robotu durdur
     }
}