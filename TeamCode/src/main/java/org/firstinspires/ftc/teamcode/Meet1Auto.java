package org.firstinspires.ftc.teamcode;

import static com.qualcomm.robotcore.util.ElapsedTime.Resolution.SECONDS;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous
public class Meet1Auto extends LinearOpMode {
    MechanumDriveTrain drive = new MechanumDriveTrain();

    ClawPrototype claw = new ClawPrototype();

    Lift lift = new Lift();

    @Override
    public void runOpMode() {
        drive.initMechanumDrivetrainTeleOp(hardwareMap);

        lift.initLiftAuto(hardwareMap);

        claw.initSpecimen_Claw(hardwareMap);

        claw.Specimen_Claw_Closed();
        waitForStart();
        if (opModeIsActive() && !isStopRequested()) {
        lift.autoLift(-1478);
        drive.mechanumDrive(.03,0,0);
        safeWaitSeconds(4);
        drive.mechanumDrive(0,0,0);
        lift.autoLift(-612);
        safeWaitSeconds(3);
        claw.Specimen_Claw_Open();
        drive.mechanumDrive(-.03,0,0);
        safeWaitSeconds(1);
        drive.mechanumDrive(0,.03,0);
        safeWaitSeconds(3.5);
        }


    }

    public void safeWaitSeconds(double time) {
        ElapsedTime timer = new ElapsedTime(SECONDS);
        timer.reset();
        while (!isStopRequested() && timer.time() < time) {
        }

    }
}
