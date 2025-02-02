public class Alaska extends State {
    static final String STATE_NAME = "Alaska"; // String to set the name of State.java
    public Alaska() {
        super(STATE_NAME, new NoTax()); // Alaska utilizes NoTax
    }
    public void showTax(double value) { // showTax implemented in State.java

    }
}
