
package com.knoldus

class FactorialCalculator {
  def calculateFactorial(inputNumber: Int): Either[String, BigInt] = {
    if (inputNumber < 1) {
      Left("Input Valid Numbers")
    }
    else {
      def factorialHelper(number: Int, accumulator: BigInt): BigInt = {
        if (number <= 1) {
          accumulator
        }
        else {
          factorialHelper(number - 1, number * accumulator)
        }
      }

      Right(factorialHelper(inputNumber, 1))
    }
  }
}
