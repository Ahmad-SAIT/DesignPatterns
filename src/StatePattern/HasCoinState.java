package StatePattern;

/**
 *
 * @author ahxxm
 */
// Concrete State 2: HasCoinState
class HasCoinState implements VendingMachineState {
    @Override
    public void insertCoin(int amount) {
        System.out.println(amount + " cents inserted. You can insert only one coin at a time.");
    }

    @Override
    public void selectItem(String item) {
        System.out.println("Item " + item + " selected. Dispensing...");
        // Transition to the NoCoinState after dispensing
        VendingMachine.currentState = VendingMachine.noCoinState;
    }

    @Override
    public void dispenseItem() {
        System.out.println("Please select an item first.");
    }
}
