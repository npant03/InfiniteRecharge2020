package frc.robot.subsystems.intake;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.team7419.Initers;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.CanIds;

/**
 * wheel that pulls balls out of the lazy susan into the shooter
 */
public class LoaderSub extends SubsystemBase{
    
    private VictorSPX victor;

    public LoaderSub(){
        victor = new VictorSPX(CanIds.loaderVictor.id);
        Initers.initVictors(victor);
    }

    @Override
    public void periodic(){}

    public void setPower(double power){victor.set(ControlMode.PercentOutput, power);}
}