package designpattern.mvp.view

import designpattern.mvp.model.IModel
import designpattern.mvp.model.Student
import designpattern.mvp.presenter.IPresenter

class StudentView(val presenter : IPresenter) : IView{

    override fun onAddFailure(message: String) {
        println(message)
    }

    override fun onAddSuccess(message: String) {
        println(message)
        presenter.addStudent()
    }
    }
