package investment;

public abstract class Investment implements Comparable<Investment> {
    protected String name;
    protected double value;
    protected String ssn;
    protected String phoneNumber;
    protected int age;
    protected String type;

    public Investment() {
    }

    public abstract void calcValue();

    public String getName() {
        return this.name;
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getSsn() {
        return this.ssn;
    }

    public String toString() {
        String a = "[ Name: " + this.name + " ] [ Value: " + this.value + " ] [ Type: " + this.type + " ]";
        return a;
    }

    public int compareTo(Investment investment) {
        return (int) (this.value - investment.value);
    }
}
