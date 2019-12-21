/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author Filip
 */
public class ProductContainerRecorder extends ProductContainer {
    private ContainerHistory history = new ContainerHistory();    
    
    public ProductContainerRecorder(String name, double capacity, double initialVolume) {
        super(name, capacity);
        history.add(initialVolume);
        setVolume(initialVolume);
    }
    
    public String history(){
        String s=history.toString();
        return s;
    }
    
    public void addToTheContainer(double amount){
        setVolume(getVolume()+amount);
        history.add(getVolume());
    }
    
    public double takeFromTheContainer(double amount){
        if(amount>getVolume()){
            history.add(0);
            return getVolume();
        }
        setVolume(getVolume()-amount);
        history.add(getVolume());
        return getVolume();
    }
    
    public void printAnalysis(){
        String s="";
        s="Product: "+super.getName()+"\nHistory: "+history()+"\nGreatest product amount: "+
                history.maxValue()+"\nSmallest product amount: "+history.minValue()+
                "\nAverage: "+history.average()+"\nGreatest change: "+history.greatestFluctuation()+
                "\nVariance: "+history.variance();
        System.out.println(s);
    }
    
}
