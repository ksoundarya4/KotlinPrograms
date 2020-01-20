/**
 * Design Pattern
 * @purpose
 */
package designpattern.mvp.view

interface IView {
    fun onAddFailure(message : String)
    fun onAddSuccess(message : String)
    fun onDeleteFailure(message : String)
    fun onDeleteSuccess(message : String)
}