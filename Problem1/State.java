public abstract class State {
    private String name;
    private SalesTaxBehavior salesTaxBehavior;

    public State(String name, SalesTaxBehavior salesTaxBehavior) {
        setName(name);
        this.salesTaxBehavior = salesTaxBehavior; // Save behavior of salesTaxBehavior
    }

    // Getter
    public String getName() {
        return name;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }


    public void showTax(Double value) {
        double tax = salesTaxBehavior.compute(value); // Utilize salesTaxBehavior that is set in subclass to return tax double
        System.out.println("The sales tax on $" +
                String.format( "%.2f", value ) + // Format double to 2 decimal places
                " in " + getName() + //Get name of state with Getter method
                " is $" + String.format( "%.2f", tax ) + "."); // Format double to 2 decimal places
    }

}
