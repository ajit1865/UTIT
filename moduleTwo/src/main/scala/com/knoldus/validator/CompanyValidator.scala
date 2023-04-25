
package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Company
import com.typesafe.scalalogging.Logger

class CompanyValidator {

  def companyIsValid(company: Company): Boolean = {
    val emailValidator = new EmailValidator()
    val companyValidate = new CompanyReadDto().getCompanyByName(company.name)
    val logger: Logger = Logger(getClass.getName)
    logger.info("companyIsValid Executed")
    val isEmailValidCheck = emailValidator.emailIdIsValid(company.emailId)
    val result = companyValidate match {
      case Some(_) => false
      case None => true
    }
    result && isEmailValidCheck
  }
}
