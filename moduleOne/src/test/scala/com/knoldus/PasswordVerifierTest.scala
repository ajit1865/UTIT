
package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PasswordVerifierTest extends AnyFlatSpec with Matchers {
  "PasswordVerifier" should "return Left(\"Weak Password\") if password length is less than 8" in {
    val password = PasswordVerifier("John Cena", "john@gmail.com", "weak")
    password.passwordValidator(password.userName, password.email, password.password) shouldEqual Left("Weak Password")
  }

  it should "return Right(false) if password contain userName" in {
    val password = PasswordVerifier("John Cena", "john@gmail.com", "John@12345")
    password.passwordValidator(password.userName, password.email, password.password) shouldEqual Right(false)
  }

  it should "return Right(false) if password doesn't contain a mix of upper and lower case letters" in {
    val password = PasswordVerifier("John Cena", "john@gmail.com", "JOHN@12345")
    password.passwordValidator(password.userName, password.email, password.password) shouldEqual Right(false)
  }

  it should "return Right(false) if password doesn't contain at least one special character from @$%&#" in {
    val password = PasswordVerifier("John Cena", "john@gmail.com", "John12345")
    password.passwordValidator(password.userName, password.email, password.password) shouldEqual Right(false)
  }

}
