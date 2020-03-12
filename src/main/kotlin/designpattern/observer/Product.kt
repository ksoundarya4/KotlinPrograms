/**
 * Design Pattern
 * @purpose to implement observer design pattern
 * @file Product.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 17/01/2020
 */
package designpattern.observer

/**
 * Product class that has name, product type
 * product availability and list of observers.
 */
class Product(
        val name: String,
        val type: String,
        val availability: String
) : Student {

    val observers = ArrayList<Observer>()

    /**
     * Function to add observer to observers list.
     *
     * @param observer to be added to the list.
     */
    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    /**
     * Function to remove obser form observers list
     *
     * @param observer that has to be removed from list.
     */
    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    /**
     * Function to notify the observers in list
     * whether the product is available or not.
     */
    override fun notifyObserver() {
        println("Notifying to all observers ")
        for(observer in observers)
            observer.update(availability)
    }
}