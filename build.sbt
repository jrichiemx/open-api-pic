name := "open-api-poc"

version := "1.0"

scalaVersion := "2.11.8"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

jacoco.settings

libraryDependencies += "junit" % "junit" % "4.12" % "test"

libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
