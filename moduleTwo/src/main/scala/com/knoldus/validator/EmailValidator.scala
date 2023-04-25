
package com.knoldus.validator

import com.typesafe.scalalogging.Logger

class EmailValidator {
  val logger: Logger = Logger(getClass.getName)

  def emailIdIsValid(emailId: String): Boolean = {
    logger.info("emailIdIsValid part executed")
    val expression = "[a-zA-Z0-9_\\-\\.]{2,30}+@[a-z]+\\.[a-z]{3}"
    if (emailId.matches(expression)) {
      val domain = emailId.substring((emailId.length - 3), (emailId.length))
      if (domain == "com" || domain == "org" || domain == "net") {
        true
      }
      else {
        false
      }
    }
    else {
      false
    }
  }
}
