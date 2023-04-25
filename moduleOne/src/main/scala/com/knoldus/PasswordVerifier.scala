
package com.knoldus

case class PasswordVerifier(userName: String, email: String, password: String) {
  /**
   * Check if length of password is greater than 8 then check for condition
   *
   * @param userName = "John Cena"
   * @param email    = "john@gmail.com
   * @param password = "John@12345
   * @return true if matches all condition and false if doesn't match with criteria
   */
  def passwordValidator(userName: String, email: String, password: String): Either[String, Boolean] = {
    if (password.length < 8) {
      Left("Weak Password")
    }
    else {
      Right(stringBreaker(userName, password))
    }
  }

  private def stringBreaker(userName: String, password: String): Boolean = {
    val separator = userName.indexOf(" ")
    val firstName = userName.substring(0, separator)
    val userNameCheck = !password.contains(firstName)
    val checkerLower: Boolean = if (password.exists(_.isUpper)) {
      if (password.exists(_.isLower)) {
        password.forall(eachElement => eachElement.isLetterOrDigit || "@$%&#".contains(eachElement))
      }
      else {
        false
      }
    }
    else {
      false
    }

    userNameCheck && checkerLower
  }
}