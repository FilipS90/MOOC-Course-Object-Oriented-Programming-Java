/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Collection;

/**
 *
 * @author Filip
 */
public class Barn {
    private BulkTank tank;
    private MilkingRobot robot;
    
    public Barn(BulkTank tank){
        this.tank=tank;
    }
    
    public BulkTank getBulkTank(){
        return tank;
    }
    
    public void installMilkingRobot(MilkingRobot robo){
        robo.setBulkTank(tank);
        this.robot=robo;
    }
    
    public void takeCareOf(Cow cow){
        if(robot==null)
            throw new IllegalStateException("The robot has not yet been initilized");
        robot.milk(cow);
    }
    
    public void takeCareOf(Collection<Cow> cows){
        if(robot==null)
            throw new IllegalStateException("The robot has not yet been initilized");
        for(Cow c:cows){
            robot.milk(c);
        }
    }
    @Override
    public String toString(){
        return tank.toString();
    }
}
