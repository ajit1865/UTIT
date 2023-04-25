
package com.knoldus

object DriverCheckDuplicates extends App {
  private val checkDuplicates = new CheckDuplicates
  private val inputList = List(1, 2, 3, 4, 5, 2, 1, 7, 8, 5)
  println("false for Duplicates, true for not duplicates" + checkDuplicates.duplicatesRemover(inputList))
}
