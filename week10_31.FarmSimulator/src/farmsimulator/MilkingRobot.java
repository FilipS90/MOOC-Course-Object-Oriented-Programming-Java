/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author Filip
 */
public class MilkingRobot {
    private BulkTank tank;
    
    public MilkingRobot(){
        
    }
    
    public void setBulkTank(BulkTank t){
        tank=t;
    }
    
    public void milk(Milkable milk){
        if(tank==null)
            throw new IllegalStateException("The tank has not been initialized");
        tank.addToTank(milk.milk());
    }
    
    public BulkTank getBulkTank(){
        return tank;
    }
}
