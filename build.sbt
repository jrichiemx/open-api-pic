name := "hello-world"

version := "1.0"

scalaVersion := "2.11.8"

enablePlugins(DockerPlugin)

lazy val root = (project in file(".")).enablePlugins(PlayScala)

jacoco.settings

libraryDependencies += "junit" % "junit" % "4.12" % "test"

libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"

dockerRepository := Some("jrichiemx")

version in Docker := "0.0.1-SNAPSHOT"

maintainer in Docker := "Ricardo Enriquez"

dockerExposedPorts := Seq(9000)