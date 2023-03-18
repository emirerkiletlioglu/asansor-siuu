// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.PS4Controller;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.CANSparkMax;




public class Robot extends TimedRobot {
 

  
  CANSparkMax sik = new CANSparkMax(05, MotorType.kBrushless);
  CANSparkMax am = new CANSparkMax(06, MotorType.kBrushless);
  PS4Controller m_joystick = new PS4Controller(0);


  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  @Override
  public void robotInit() {
  

  }


  @Override
  public void robotPeriodic() {}

  
  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic(){}

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {
  
    sik.set(0.5);
    am.set(0.5);
    sik.set(m_joystick.getLeftY());
    am.set(m_joystick.getLeftY());
  }


  

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}
}
