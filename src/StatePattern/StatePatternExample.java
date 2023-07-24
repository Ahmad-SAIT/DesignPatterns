package StatePattern;


public class StatePatternExample {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.insertCoin(25); // Inserting 25 cents
        vendingMachine.selectItem("Soda"); // Selecting an item
        vendingMachine.dispenseItem(); // Dispensing the item
    }
}

