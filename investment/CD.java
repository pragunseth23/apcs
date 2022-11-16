package investment;

public class CD extends Investment {
    private double rate;
    private double term;
    private double amount;

    public CD(String name, String phoneNumber, String ssn, int age, double amount, double rate, int term) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.amount = amount;
        this.age = age;
        this.ssn = ssn;
        this.rate = rate;
        this.term = term;
        this.type = "CD";
    }

    public void calcValue() {
        double value = this.amount * (this.term * (this.rate / 360));
        setValue(value);
    }

}
