
package com.knoldus.validator

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class EmailValidatorTest extends AnyFlatSpec with Matchers {

  val emailValidator = new EmailValidator

  "emailIdIsValid" should "return true as emailId is valid" in {
    val emailId = "raj@knoldus.com"
    emailValidator.emailIdIsValid(emailId) shouldEqual true
  }
  "emailIdIsNotValid" should "return false as emailId is not valid" in {
    val emailId = "knoldus@gmail.co"
    emailValidator.emailIdIsValid(emailId) shouldEqual false
  }

  "emailIdIsValid" should "return true 'knoldus@gmail.com' if it is valid" in {
    val emailId = "knoldus@gmail.com"
    emailValidator.emailIdIsValid(emailId) shouldEqual (true)
  }

  "emailIdIsValid" should "return false if it is not valid" in {
    val emailId = "john.smith@knoldus.in"
    emailValidator.emailIdIsValid(emailId) shouldEqual (false)
  }
}
