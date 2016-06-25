name := "open-api-poc"

version := "1.0"

scalaVersion := "2.11.8"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies ++= Seq(
  "io.swagger" %% "swagger-play2" % "1.5.1"
)

