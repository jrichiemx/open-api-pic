import com.typesafe.sbt.packager.docker._


name := "hello-world"

version := "1.0"

scalaVersion := "2.11.8"

enablePlugins(DockerPlugin)

lazy val root = (project in file(".")).enablePlugins(PlayScala)

jacoco.settings

libraryDependencies += "junit" % "junit" % "4.12" % "test"

libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"

dockerRepository := Some("jrichiemx")

version in Docker := "0.0.2-SNAPSHOT"

maintainer in Docker := "Ricardo Enriquez"

dockerExposedPorts := Seq(9000)

dockerCommands := dockerCommands.value.filterNot {

  // ExecCmd is a case class, and args is a varargs variable, so you need to bind it with @
  case ExecCmd("ENTRYPOINT", args @ _*) => args.contains("bin/hello-world")

  // dont filter the rest
  case cmd                       => false
}

dockerCommands ++= Seq(
  // setting the run script executable
  ExecCmd("ENTRYPOINT", "/opt/docker/bin/hello-world", "-Dconfig.file=/opt/docker/conf/production.conf")

)

