
package trainingClassAndObject.emploees;

public class Emploees {
    private String emploee;

    public String getEmploee() {
        return emploee;
    }

    public void setEmploee(String emploee) {
        this.emploee = emploee;
    }
    
    
    
    public Emploees(String emploee) {
        this.emploee = emploee;
    }

    @Override
    public String toString() {
        return emploee;
    }
    
}
