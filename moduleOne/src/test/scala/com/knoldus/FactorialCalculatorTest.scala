package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class FactorialCalculatorTest extends AnyFlatSpec with Matchers {

  val calculator = new FactorialCalculator()

  "FactorialCalculator" should "return Left(\"Input Valid Numbers\") for input less than 1" in {
    calculator.calculateFactorial(0) shouldEqual Left("Input Valid Numbers")
    calculator.calculateFactorial(-5) shouldEqual Left("Input Valid Numbers")
  }

  it should "return Right(1) for input of 1" in {
    calculator.calculateFactorial(1) shouldEqual Right(1)
  }

  it should "return Right(120) for input of 5" in {
    calculator.calculateFactorial(5) shouldEqual Right(120)
  }

  it should "return Right(3628800) for input of 10" in {
    calculator.calculateFactorial(10) shouldEqual Right(3628800)
  }

}
