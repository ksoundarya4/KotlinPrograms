/**
 * Design Pattern
 * @purpose To implement state design pattern.
 * @file AuthorizationPresenter.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 18/01/2020
 */
package designpattern.state

class AuthorizationPresenter {

    private var state: AuthorizationState = Unauthorized

    val isAuthorized: Boolean
        get() = when (state) {
            is Authorized -> true
            else -> false
        }

    val userName : String
        get() {
            return when (val state = this.state) {
                is Authorized -> state.userName
                else -> "Unknown"
            }
        }

    /**
     * Function to assign state when Authorized
     * user login
     *
     * @param userName
     */
    fun loginUser(userName: String) {
        state = Authorized(userName)
    }

    /**
     * Function to assign state with Unauthorized
     * user logout
     */
    fun logoutUser() {
        state = Unauthorized
    }

    /**
     * Function to override toString()
     */
    override fun toString(): String {
        return "user $userName is logged in : $isAuthorized"
    }
}