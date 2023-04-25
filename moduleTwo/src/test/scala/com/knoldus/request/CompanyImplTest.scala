
package com.knoldus.request

import com.knoldus.validator.CompanyValidator
import org.scalatest.flatspec.AnyFlatSpec
import com.knoldus.models.Company
import org.scalatest.matchers.should.Matchers

class CompanyImplTest extends AnyFlatSpec with Matchers {

  val companyValidator = new CompanyValidator
  val companyImpl = new CompanyImpl(companyValidator)

  it should "return true if company is in DB" in {
    val company = Company("Knoldus", "knoldus@google.com", "Noida")
    companyImpl.createCompany(company) shouldEqual None
  }

  it should "return true if company is present in DB" in {
    val company = Company("Google", "search@google.com", "Washington")
    companyImpl.createCompany(company) shouldEqual Some(company.name)
  }

  it should "return true if company is not present in DB" in {
    val company = Company("NashTech", "nash.tech@knoldus.com", "Canada")
    companyImpl.createCompany(company) shouldEqual Some(company.name)
  }

}
