ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "Session6Assignment1",

  )
lazy val moduleOne = (project in file("moduleOne"))
  .settings(
    name := "ModuleOne",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.15" % Test,
      "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5",
    )
  )
lazy val moduleTwo = (project in file("moduleTwo"))
  .settings(
    name := "ModuleTwo",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.15" % Test,
      "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5",
    )
  )