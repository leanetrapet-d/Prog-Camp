package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.ResetMode;
import com.revrobotics.PersistMode;
// import com.revrobotics.spark.ClosedLoopSlot;
// import com.revrobotics.spark.SparkBase.ControlType;
// import com.revrobotics.REVLibError;
// import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkClosedLoopController;
import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.SparkBase.ControlType;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import frc.robot.Constants.PushOutConstants;
import frc.robot.Configs;
import org.littletonrobotics.junction.Logger;

public class Pushout extends SubsystemBase {

    // AdvantageKit logging
    private double desiredPercent = 0.0;

    private SparkFlex PushOutMotor = new SparkFlex(PushOutConstants.PUSHOUT_LEFT_ID, MotorType.kBrushless);
    private SparkClosedLoopController PushOutController = PushOutMotor.getClosedLoopController();

  

    public Pushout() {
        PushOutMotor.configure(Configs.PushOutSubsystem.PushOutMotorConfig, ResetMode.kResetSafeParameters,
                PersistMode.kPersistParameters);

    }


    public void runPushOut() {
        PushOutController.setSetpoint(PushOutConstants.Extended_Position,
                ControlType.kMAXMotionPositionControl);
        PushOutController.setSetpoint(PushOutConstants.Extended_Position,
                ControlType.kMAXMotionPositionControl);

    }

    public void runPushOutReverse() {
        PushOutController.setSetpoint(PushOutConstants.Retracted_Position,
                ControlType.kMAXMotionPositionControl);
        PushOutController.setSetpoint(PushOutConstants.Retracted_Position,
                ControlType.kMAXMotionPositionControl);

    }


    public void stopPushOut() {
        desiredPercent = 0.0;
        PushOutMotor.set(0);
   
    }

    public Command runPushOutCommand() {
        return new RunCommand(() -> runPushOut(), this)
                .finallyDo(interrupted -> stopPushOut());
    }

    public Command runReversePushOutCommand() {
        return new RunCommand(() -> runPushOutReverse(), this)
                .finallyDo(interrupted -> stopPushOut());
    }

    public Command stopPushOutCommand() {
        return new RunCommand(() -> stopPushOut(), this);
    }

    public Command runDefaultCommand()
    {
        return stopPushOutCommand();
    }

    public Command runAgitationCommand()
    {
        //list
        double[] pull_position = {11,9,7,5};
        return Commands.sequence(Commands.run(()-> {for (int i = 0;i<4;i++)
        {
                PushOutController.setSetpoint(pull_position[i],
                ControlType.kMAXMotionPositionControl);
        PushOutController.setSetpoint(PushOutConstants.Extended_Position,
                ControlType.kMAXMotionPositionControl); 
        }}));



    }

    @Override
    public void periodic() {
        // AdvantageKit Logging
        // Commanded PushOut motor percent output.
        double RightRPM = PushOutMotor.getEncoder().getVelocity();
        double LeftRPM = PushOutMotor.getEncoder().getVelocity();

        Logger.recordOutput("PushOut/DesiredPercent", desiredPercent);
        // Applied voltage to PushOut motor.
        Logger.recordOutput("PushOut/AppliedVolts", PushOutMotor.getAppliedOutput() * PushOutMotor.getBusVoltage());
        Logger.recordOutput("PushOutRightRPM", RightRPM);
        Logger.recordOutput("PushOutLeftRPM", LeftRPM);




    }
}