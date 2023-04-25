
package com.knoldus.validator

import org.scalatest.flatspec.AnyFlatSpec
import com.knoldus.models.User

class UserValidatorTest extends AnyFlatSpec {

  val userValidator = new UserValidator

  "userIsValid" should "return true if user is valid" in {
    val user1 = User("John", "Smith", 25, 45000.0, "HR", "Knoldus", "knoldus@gmail.com")
    assert(userValidator.isUserValid(user1))
  }

  "userIsValid" should "return false if user company is not available in DB" in {
    val user = User("Vikki", "Kaushal", 27, 47000.0, "Consultant", "NashTech", "vikki@gmail.com")
    assert(!userValidator.isUserValid(user))
  }

  "userIsValid" should "return true if user data emailId and Company are present in DB" in {
    val user = User("Ajit", "Kumar", 26, 51000.0, "Consultant", "Philips", "ajit.kumar@nashtech.com")
    assert(userValidator.isUserValid(user))
  }
}

