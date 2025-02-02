public class Hawaii extends State {
    static final String STATE_NAME = "Hawaii"; // String to set the name of State.java
    public Hawaii() {
        super(STATE_NAME, new FourPointFivePercent()); // Hawaii utilizes FourPointFivePercent
    }
    public void showTax(double value) { // showTax implemented in State.java

    }
}
