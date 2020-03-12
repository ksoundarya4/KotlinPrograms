/**
 * Design Pattern
 * @purpose To implement proxy design pattern
 * @file SecuredFile.kt
 * @author ksoundarya4
 * @version 1.0
 * @since 17/01/2020
 */
package designpattern.proxy

/**
 * SecuredFile implements File.
 * It is a proxy class
 */
class SecuredFile(private val normalFile: File) : File {

    var password: String = ""
    /**
     * Function to read file only if password is correct.
     *
     * @param name file name.
     */
    override fun read(name: String) {
        if (password == "secret") {
            println("Password is correct : $password")
            normalFile.read(name)
        } else {
            println("Incorrect Password. Access denied")
        }
    }
}