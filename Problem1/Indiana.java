public class Indiana extends State {
    static final String STATE_NAME = "Indiana"; // String to set the name of State.java
    public Indiana() {
        super(STATE_NAME, new SevenPercent()); // Indiana utilizes SevenPercent
    }
    public void showTax(double value) { // showTax implemented in State.java

    }
}
