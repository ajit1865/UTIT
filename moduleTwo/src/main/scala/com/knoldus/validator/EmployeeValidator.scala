
package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Employee

class EmployeeValidator {

  def employeeIsValid(employee: Employee): Boolean = {

    val emailValidator = new EmailValidator()
    val companyValidator = new CompanyReadDto()
    if (emailValidator.emailIdIsValid(employee.emailId) && companyValidator.getCompanyByName(employee.companyName).isDefined) {
      true
    }
    else {
      false
    }
  }
}
