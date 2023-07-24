package StatePattern;

/**
 *
 * @author ahxxm
 */
// State interface
interface VendingMachineState {
    void insertCoin(int amount);
    void selectItem(String item);
    void dispenseItem();
}
