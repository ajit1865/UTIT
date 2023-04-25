//
//package com.knoldus
//
//import com.typesafe.scalalogging.Logger
//
//object DriverPasswordVerifier extends App {
//  private val passwordVerifier = new PasswordVerifier
//  val password = "Pkija@12345"
//  private val fullName = "John Cena"
//  private val email = "john@gmail.com"
//  private val resultOfPassword = passwordVerifier.passwordValidator(fullName, email, password)
//  resultOfPassword match {
//    case Right(value) => logger.info("Is Password Valid = " + value)
//    case Left(result) => logger.info("Result = " + result)
//  }
//}
