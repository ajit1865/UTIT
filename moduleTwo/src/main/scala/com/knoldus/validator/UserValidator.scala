package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.User
import com.typesafe.scalalogging.Logger

class UserValidator {
  val logger: Logger = Logger(getClass.getName)

  def isUserValid(user: User): Boolean = {
    val emailValidator = new EmailValidator
    val companyValidator = new CompanyReadDto().getCompanyByName(user.companyName)

    logger.info("UserValidator.isUserValid executed")
    val emailValidCheck = emailValidator.emailIdIsValid(user.emailId)
    val companyCheck = companyValidator match {
      case Some(_) => if (emailValidCheck) true else false
      case None => false
    }
    companyCheck
  }
}