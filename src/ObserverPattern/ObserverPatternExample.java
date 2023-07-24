/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPattern;

/**
 *
 * @author ahxxm
 */
public class ObserverPatternExample {
    public static void main(String[] args) {
        Notifier notifier = new Notifier();

        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");

        notifier.addObserver(observer1);
        notifier.addObserver(observer2);

        notifier.setMessage("Hello, Observers!"); // Notify all observers
    }
}

