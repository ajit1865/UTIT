
package com.knoldus.db

import org.scalatest.flatspec.AnyFlatSpec

class CompanyReadDtoTest extends AnyFlatSpec {

  val companyReadDto = new CompanyReadDto

  it should "check company is present in DB" in {
    val company = "Knoldus"
    assert(companyReadDto.getCompanyByName(company).isDefined)
  }

  it should "Check company is not present in DB" in {
    val company = "Google"
    assert(companyReadDto.getCompanyByName(company).isEmpty)
  }

  it should "Check company NashTech is not in DB" in {
    val company = "NashTech"
    assert(companyReadDto.getCompanyByName(company).isEmpty)
  }
}
