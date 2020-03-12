/**
 * Design Pattern
 * @purpose To implement MVP design pattern.
 * @file IView.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 20/01/2020
 */
package designpattern.mvp.view

/**
 * View Interface
 */
interface IView {
    fun onAddFailure(message : String)
    fun onAddSuccess(message : String)
    fun onDeleteFailure(message : String)
    fun onDeleteSuccess(message : String)
}