package designpattern.state

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test


class StateTest{

    @Test
    fun state() {
        val authorizedPresenter = AuthorizationPresenter()

        authorizedPresenter.loginUser("admin")
        println(authorizedPresenter)
        assertThat(authorizedPresenter.isAuthorized).isEqualTo(true)
        assertThat(authorizedPresenter.userName).isEqualTo("admin")

        authorizedPresenter.logoutUser()
        println(authorizedPresenter)
        assertThat(authorizedPresenter.isAuthorized).isEqualTo(false)
        assertThat(authorizedPresenter.userName).isEqualTo("Unknown")


    }
}