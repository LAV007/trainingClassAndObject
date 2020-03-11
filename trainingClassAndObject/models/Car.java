
package trainingClassAndObject.models;

public class Car {
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
            
    public Car(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "number " + number;
    }
    
    
}
