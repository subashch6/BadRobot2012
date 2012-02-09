/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.badrobots.y2012.technetium.commands;

import com.badrobots.y2012.technetium.OI;

/**
 *
 * @author 1014 Programming Team
 */
public class manualBridge extends CommandBase {

    public manualBridge()
    {
        requires(bridgeTool);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() 
    {
        if(OI.getUpButton())
            bridgeTool.setMotor(1);
        else if(OI.getDownButton())
            bridgeTool.setMotor(-1);
        else
            bridgeTool.setMotor(0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}