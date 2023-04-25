
package com.knoldus.request

import com.knoldus.validator.UserValidator
import org.scalatest.flatspec.AnyFlatSpec
import com.knoldus.models.User
import org.scalatest.matchers.should.Matchers

class UserImplTest extends AnyFlatSpec with Matchers {

  val userValidator = new UserValidator
  val userImpl = new UserImpl(userValidator)

  it should "return true if user is valid" in {
    val user = User("Raj", "Mishra", 25, 48000.0, "Software Developer", "Knoldus", "raj@gmail.com")
    userImpl.createUser(user) shouldEqual Some(user.emailId)
  }

  it should "return false if user is not valid" in {
    val user = User("Vishal", "Tiwari", 27, 40000.0, "Developer", "Google", "vishal@gmail.com")
    userImpl.createUser(user) shouldEqual None
  }

  it should "return true if user has valid details" in {
    val user = User("Tom", "Smith", 35, 60000.0, "Developer", "Philips", "tom@gmail.com")
    userImpl.createUser(user) shouldEqual Some(user.emailId)
  }
}
