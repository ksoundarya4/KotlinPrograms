/**
 * Design Pattern
 * @purpose To Test proxy design pattern
 * @file ProxyTest.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 17/01/2020
 */
package designpattern.proxy

import org.junit.Test

class ProxyTest{

    @Test
    fun proxy(){
        val securedFile = SecuredFile(NormalFile())

        with(securedFile){
            read("readme.md")
            password = "secret"
            read("readme.md")
        }
    }
}