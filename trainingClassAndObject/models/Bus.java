
package trainingClassAndObject.models;
import trainingClassAndObject.emploees.*;

public class Bus extends Car {
    private Car bus;
    private Emploees driver;
    private String passengers;
    
    /**
     * Метод возвращает номер автобуса.
     */
    public Car getBus() {
        return bus;
    }

    public void setBus(Car bus) {
        this.bus = bus;
    }
    
    /**
     * Метод возвращает имя водителя автобуса.
     */
    public Emploees getDriver() {
        return driver;
    }

    public void setDriver(Emploees driver) {
        this.driver = driver;
    }
    
    /**
     * Метод getPassengers() возвращает колличество пассажиров,
     * которые могут поместиться в автобусе.
     * @return number of passangers
     */
    public String getPassengers() {
        return passengers;
    }

    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }
    
    
    
    public Bus(Car bus, Emploees driver, String passengers, String number) {
        super(number);
        this.bus = bus;
        this.driver = driver;
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "bus " + bus + ", driver is " + driver + ", ammount of passangers is " + passengers;
    }
    
}
