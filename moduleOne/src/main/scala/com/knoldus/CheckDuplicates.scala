
package com.knoldus

class CheckDuplicates {
  def duplicatesRemover(duplicateNumber: List[Int]): Either[String, Boolean] = {
    if (duplicateNumber.nonEmpty) {
      val temporaryList = duplicateNumber.distinct
      if (duplicateNumber.length == temporaryList.length) {
        Right(true)
      }
      else {
        Right(false)
      }
    }
    else {
      Left("Empty list")
    }
  }
}
