package StatePattern;

/**
 *
 * @author ahxxm
 */
// Concrete State 1: NoCoinState
class NoCoinState implements VendingMachineState {
    @Override
    public void insertCoin(int amount) {
        System.out.println(amount + " cents inserted.");
        // Transition to the HasCoinState
        VendingMachine.currentState = VendingMachine.hasCoinState;
    }

    @Override
    public void selectItem(String item) {
        System.out.println("Please insert coins first.");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Please insert coins first.");
    }
}
