package designpattern.mvp.view

import designpattern.mvp.model.FileSystem
import designpattern.mvp.model.IModel
import designpattern.mvp.presenter.IPresenter
import designpattern.mvp.presenter.StudentPresenter

fun main() {
    val view : IView = StudentView()
    val model = FileSystem()
    val presenter : IPresenter = StudentPresenter(view,model)
    (view as StudentView).presenter = presenter


}