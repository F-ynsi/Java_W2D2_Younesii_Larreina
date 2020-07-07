package Irati.A2;

public class Bycicle implements VehicleControls{
    public void move(int i){
        System.out.println("Bike is moving at " + i + "km/h.");
    }
    public void applyBreaks(int i){
        System.out.println("Bike is stopping after " + i + " seconds.");
    }
}
