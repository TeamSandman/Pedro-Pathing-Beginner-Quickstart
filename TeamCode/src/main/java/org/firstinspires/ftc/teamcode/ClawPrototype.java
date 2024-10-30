package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class ClawPrototype {

    private Servo Pincer_Left;
    private Servo Pincer_Right;
    private Servo Specimen_Claw;
    private CRServo Intake_Left;
    private CRServo Intake_Right;

    private CRServo Spinner;


    public void initPincer_Claw(HardwareMap hwMap) {


        Pincer_Left = hwMap.get(Servo.class, "Pincer_Left");
        Pincer_Right = hwMap.get(Servo.class, "Pincer_Right");

    }

    public void initSpecimen_Claw(HardwareMap hwMap) {


        Specimen_Claw = hwMap.get(Servo.class, "Specimen_Claw");


    }
    public void initIntake_Claw(HardwareMap hwMap) {


        Intake_Left = hwMap.get(CRServo .class, "Intake_Left");
        Intake_Right =hwMap.get(CRServo.class, "Intake_Right");


    }
    public void initR_30Hrs(HardwareMap hwMap) {


        Spinner = hwMap.get(CRServo.class, "Spinner");

    }

    public void pincerClaw(double input){
        Pincer_Right.setPosition(1-input);
        Pincer_Left.setPosition(input);
    }

    public void Specimen_Claw_Open(){

        Specimen_Claw.setPosition(.1);
    }

    public void Specimen_Claw_Closed(){

        Specimen_Claw.setPosition(.5);
    }
    public void intakeClaw (double left, double right){
        Intake_Left.setPower(-left);
        Intake_Right.setPower(right);

    }

    public  void spinner (double spin) {
        Spinner.setPower(spin);

    }

}
