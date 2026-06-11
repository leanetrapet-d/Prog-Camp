package frc.robot;

import com.revrobotics.spark.config.SparkFlexConfig;

import com.revrobotics.spark.config.SparkBaseConfig.*;

import frc.robot.Constants.IntakeConstants;
import frc.robot.Constants.HopperConstants;
import frc.robot.Constants.KickerConstants;
import frc.robot.Constants.ShooterConstants;
import frc.robot.Constants.PushOutConstants;

// import com.revrobotics.spark.ClosedLoopSlot;
import com.revrobotics.spark.FeedbackSensor;

public final class Configs 
{

        public static final class IntakeSubsystem {
                
            public static final SparkFlexConfig IntakeMotorLeftConfig = new SparkFlexConfig();
            public static final SparkFlexConfig IntakeMotorRightConfig = new SparkFlexConfig();
            // public static final SparkFlexConfig IntakeRightMotorConfig = new SparkFlexConfig();

                static {

                        IntakeMotorLeftConfig.idleMode(IdleMode.kBrake).smartCurrentLimit(40).voltageCompensation(12);
                        IntakeMotorRightConfig.idleMode(IdleMode.kBrake).smartCurrentLimit(40).voltageCompensation(12).inverted(true);



                        IntakeMotorLeftConfig.closedLoop.feedbackSensor(FeedbackSensor.kPrimaryEncoder)
                            // Set PID values for position control. We don't need to pass a closed
                            // loop slot, as it will default to slot 0.
                            .p(IntakeConstants.p)
                            .i(IntakeConstants.i)
                            .d(IntakeConstants.d)
                            .outputRange(-1, 1)
                            .feedForward
                            .kS(IntakeConstants.s)
                            .kV(IntakeConstants.v)
                            .kA(IntakeConstants.a)
                            ;

                        IntakeMotorLeftConfig.closedLoop
                        .maxMotion.maxAcceleration(1000000);


                        IntakeMotorRightConfig.closedLoop.feedbackSensor(FeedbackSensor.kPrimaryEncoder)
                            // Set PID values for position control. We don't need to pass a closed
                            // loop slot, as it will default to slot 0.
                            .p(IntakeConstants.p)
                            .i(IntakeConstants.i)
                            .d(IntakeConstants.d)
                            .outputRange(-1, 1)
                            .feedForward
                            .kS(IntakeConstants.s)
                            .kV(IntakeConstants.v)
                            .kA(IntakeConstants.a)
                            ;

                        IntakeMotorRightConfig.closedLoop
                        .maxMotion.maxAcceleration(1000000);

                }

        };

        public static final class KickerSubsystem {
                
            public static final SparkFlexConfig KickerMotorLeftConfig = new SparkFlexConfig();
            public static final SparkFlexConfig KickerMotorRightConfig = new SparkFlexConfig();
            // public static final SparkFlexConfig KickerRightMotorConfig = new SparkFlexConfig();

                static { 

                        KickerMotorLeftConfig.idleMode(IdleMode.kBrake).smartCurrentLimit(40).voltageCompensation(12);
                        KickerMotorRightConfig.idleMode(IdleMode.kBrake).smartCurrentLimit(40).voltageCompensation(12).inverted(true);


                        KickerMotorLeftConfig.closedLoop.feedbackSensor(FeedbackSensor.kPrimaryEncoder)
                            .p(KickerConstants.p)
                            .i(KickerConstants.i)
                            .d(KickerConstants.d)
                            .outputRange(-1, 1)
                            .feedForward
                            .kS(KickerConstants.s)
                            .kV(KickerConstants.v)
                            .kA(KickerConstants.a)
                            ;

                        KickerMotorLeftConfig.closedLoop
                        .maxMotion.maxAcceleration(1000000);


                        KickerMotorRightConfig.closedLoop.feedbackSensor(FeedbackSensor.kPrimaryEncoder)
                            // Set PID values for position control. We don't need to pass a closed
                            // loop slot, as it will default to slot 0.
                            .p(KickerConstants.p)
                            .i(KickerConstants.i)
                            .d(KickerConstants.d)
                            .outputRange(-1, 1)
                            .feedForward
                            .kS(KickerConstants.s)
                            .kV(KickerConstants.v)
                            .kA(KickerConstants.a)
                            ;

                        KickerMotorRightConfig.closedLoop
                        .maxMotion.maxAcceleration(1000000);

                }

        };

public static final class HopperSubsystem {
                
            public static final SparkFlexConfig HopperMotorLeftConfig = new SparkFlexConfig();
            public static final SparkFlexConfig HopperMotorRightConfig = new SparkFlexConfig();
            // public static final SparkFlexConfig HopperRightMotorConfig = new SparkFlexConfig();

                static {

                        HopperMotorLeftConfig.idleMode(IdleMode.kBrake).smartCurrentLimit(40).voltageCompensation(12);
                        HopperMotorRightConfig.idleMode(IdleMode.kBrake).smartCurrentLimit(40).voltageCompensation(12).inverted(true);


                        HopperMotorLeftConfig.closedLoop.feedbackSensor(FeedbackSensor.kPrimaryEncoder)
                            .p(HopperConstants.p)
                            .i(HopperConstants.i)
                            .d(HopperConstants.d)
                            .outputRange(-1, 1)
                            .feedForward
                            .kS(HopperConstants.s)
                            .kV(HopperConstants.v)
                            .kA(HopperConstants.a)
                            ;

                        HopperMotorLeftConfig.closedLoop
                        .maxMotion.maxAcceleration(1000000);


                        HopperMotorRightConfig.closedLoop.feedbackSensor(FeedbackSensor.kPrimaryEncoder)
                            // Set PID values for position control. We don't need to pass a closed
                            // loop slot, as it will default to slot 0.
                            .p(HopperConstants.p)
                            .i(HopperConstants.i)
                            .d(HopperConstants.d)
                            .outputRange(-1, 1)
                            .feedForward
                            .kS(HopperConstants.s)
                            .kV(HopperConstants.v)
                            .kA(HopperConstants.a)
                            ;

                        HopperMotorRightConfig.closedLoop
                        .maxMotion.maxAcceleration(1000000);

                }

        };

        public static final class ShooterSubsystem {
                
            public static final SparkFlexConfig ShooterMotorLeft1Config = new SparkFlexConfig();
            public static final SparkFlexConfig ShooterMotorRight1Config = new SparkFlexConfig();
            public static final SparkFlexConfig ShooterMotorLeft2Config = new SparkFlexConfig();
            public static final SparkFlexConfig ShooterMotorRight2Config = new SparkFlexConfig();
            // public static final SparkFlexConfig ShooterRightMotorConfig = new SparkFlexConfig();

                static {

                        ShooterMotorLeft1Config.idleMode(IdleMode.kBrake).smartCurrentLimit(40).voltageCompensation(12);
                        ShooterMotorRight1Config.idleMode(IdleMode.kBrake).smartCurrentLimit(40).voltageCompensation(12).follow(ShooterConstants.SHOOTER_L1_ID,true);
                        ShooterMotorLeft2Config.idleMode(IdleMode.kBrake).smartCurrentLimit(40).voltageCompensation(12).follow(ShooterConstants.SHOOTER_L1_ID,true);
                        ShooterMotorRight2Config.idleMode(IdleMode.kBrake).smartCurrentLimit(40).voltageCompensation(12).follow(ShooterConstants.SHOOTER_L1_ID,false);


                        ShooterMotorLeft1Config.closedLoop.feedbackSensor(FeedbackSensor.kPrimaryEncoder)
                            .p(ShooterConstants.p)
                            .i(ShooterConstants.i)
                            .d(ShooterConstants.d)
                            .outputRange(-1, 1)
                            .feedForward
                            .kS(ShooterConstants.s)
                            .kV(ShooterConstants.v)
                            .kA(ShooterConstants.a)
                            ;

                        ShooterMotorLeft1Config.closedLoop
                        .maxMotion.maxAcceleration(1000000);

                        ShooterMotorLeft2Config.closedLoop.feedbackSensor(FeedbackSensor.kPrimaryEncoder)
                            .p(ShooterConstants.p)
                            .i(ShooterConstants.i)
                            .d(ShooterConstants.d)
                            .outputRange(-1, 1)
                            .feedForward
                            .kS(ShooterConstants.s)
                            .kV(ShooterConstants.v)
                            .kA(ShooterConstants.a)
                            ;

                        ShooterMotorLeft2Config.closedLoop
                        .maxMotion.maxAcceleration(1000000);


                        ShooterMotorRight1Config.closedLoop.feedbackSensor(FeedbackSensor.kPrimaryEncoder)
                            // Set PID values for position control. We don't need to pass a closed
                            // loop slot, as it will default to slot 0.
                            .p(ShooterConstants.p)
                            .i(ShooterConstants.i)
                            .d(ShooterConstants.d)
                            .outputRange(-1, 1)
                            .feedForward
                            .kS(ShooterConstants.s)
                            .kV(ShooterConstants.v)
                            .kA(ShooterConstants.a)
                            ;

                        ShooterMotorRight1Config.closedLoop
                        .maxMotion.maxAcceleration(1000000);

                        ShooterMotorRight2Config.closedLoop.feedbackSensor(FeedbackSensor.kPrimaryEncoder)
                            // Set PID values for position control. We don't need to pass a closed
                            // loop slot, as it will default to slot 0.
                            .p(ShooterConstants.p)
                            .i(ShooterConstants.i)
                            .d(ShooterConstants.d)
                            .outputRange(-1, 1)
                            .feedForward
                            .kS(ShooterConstants.s)
                            .kV(ShooterConstants.v)
                            .kA(ShooterConstants.a)
                            ;

                        ShooterMotorRight2Config.closedLoop
                        .maxMotion.maxAcceleration(1000000);

                }

        };

        public static final class PushOutSubsystem {
                
            public static final SparkFlexConfig PushOutMotorConfig = new SparkFlexConfig();
            // public static final SparkFlexConfig PushOutRightMotorConfig = new SparkFlexConfig();

                static {

                        PushOutMotorConfig.idleMode(IdleMode.kBrake).smartCurrentLimit(40).voltageCompensation(12);



                        PushOutMotorConfig.closedLoop.feedbackSensor(FeedbackSensor.kPrimaryEncoder)
                            // Set PID values for position control. We don't need to pass a closed
                            // loop slot, as it will default to slot 0.
                            .p(PushOutConstants.p)
                            .i(PushOutConstants.i)
                            .d(PushOutConstants.d)
                            .outputRange(-1, 1);

                        PushOutMotorConfig.closedLoop
                        .maxMotion.maxAcceleration(1000000);


  

                }
    };

}