package StatePattern;

/**
 *
 * @author ahxxm
 */
// Context: Vending Machine
class VendingMachine {
    private int currentBalance;
    static VendingMachineState noCoinState;
    static VendingMachineState hasCoinState;
    static VendingMachineState currentState;

    public VendingMachine() {
        currentBalance = 0;
        noCoinState = new NoCoinState();
        hasCoinState = new HasCoinState();
        currentState = noCoinState;
    }

    public void insertCoin(int amount) {
        currentState.insertCoin(amount);
    }

    public void selectItem(String item) {
        currentState.selectItem(item);
    }

    public void dispenseItem() {
        currentState.dispenseItem();
    }
}
