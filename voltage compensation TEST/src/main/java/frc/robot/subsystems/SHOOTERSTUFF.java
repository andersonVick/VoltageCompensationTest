/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.InvertType;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class SHOOTERSTUFF extends SubsystemBase {
  /**
   * Creates a new SHOOTERSTUFF.
   */
  public SHOOTERSTUFF() {
    OverlordJORDAN.follow(OverlordKOBE);
    OverlordJORDAN.setInverted(InvertType.OpposeMaster);
  }
  // GREAT FALCON OVERLORDS
  WPI_TalonFX OverlordKOBE = new WPI_TalonFX(Constants.falcon1);
  WPI_TalonFX OverlordJORDAN = new WPI_TalonFX(Constants.falcon2);

  TalonFX talon = new TalonFX(95)
  TalonFX.configVoltCompSaturation(11);


  // THE OVERLORD CMDs
  public void THEOVERLORDCMDSTART(){
    OverlordKOBE.set(Constants.OVERLORDSPD);
    OverlordJORDAN.set(Constants.OVERLORDSPD);
  }

  public void THEOVERLORDCMDSTOP(){
    OverlordKOBE.set(0);
    OverlordJORDAN.set(0);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
