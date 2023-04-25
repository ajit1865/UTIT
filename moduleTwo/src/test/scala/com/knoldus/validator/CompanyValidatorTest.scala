
package com.knoldus.validator

import com.knoldus.models.Company
import org.scalatest.flatspec.AnyFlatSpec

class CompanyValidatorTest extends AnyFlatSpec {

  val companyValidator = new CompanyValidator
  it should "return true if company is not present in DB" in {
    val company1 = Company("Google", "google@gmail.com", "New Delhi")
    assert(companyValidator.companyIsValid(company1))
  }

  it should "return false if company already in DB" in {
    val company = Company("Knoldus", "knoldus@gmail.com", "Noida")
    assert(!companyValidator.companyIsValid(company))
  }

  it should "return true if company  not present in DB" in {
    val company = Company("NashTech", "global@nashtech.com", "Canada")
    assert(companyValidator.companyIsValid(company))
  }
}
