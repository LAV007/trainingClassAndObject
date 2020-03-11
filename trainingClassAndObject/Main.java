package trainingClassAndObject;
import trainingClassAndObject.models.*;
import trainingClassAndObject.emploees.*;


public class Main {

    public static void main(String[] args) {
       Bus bus = new Bus("a154aa178", new Emploees("Dima"), "10");
       Bus bus_2 = new Bus("c345oo147", new Emploees("Petya"), "12");
       
       System.out.println(bus + "\n" + bus_2 + "\n" + "\n" + bus.getDriver() + " ... " + bus.getNumber() + " ... " +
                          bus.getPassengers());
    }
    
}
