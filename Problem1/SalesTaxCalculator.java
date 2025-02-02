public class SalesTaxCalculator {
    public static void main(String[] args) {
        // Initialize Scanner to take 2 lines of input: String stateName . Double saleAmount
        String stateName = args[0];
        Double saleAmount = Double.parseDouble(args[1]);

        // Utilize switch on stateName to determine which state is initialized
        State state = null;
        switch (stateName) {
            case Alaska.STATE_NAME:
                state = new Alaska();
                break;
            case Indiana.STATE_NAME:
                state = new Indiana();
                break;
            case Hawaii.STATE_NAME:
                state = new Hawaii();
                break;
        }

        if (state != null) { // Check if state is initialized
            state.showTax(saleAmount);
        }
        else { // The stateName is not "Indiana" or "Alaska"
            System.out.println("Invalid State");
        }
    }
}
