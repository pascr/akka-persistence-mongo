organization := "com.github.ddevore"

name := "akka-persistence-mongo"

version := "0.2-SNAPSHOT"

scalaVersion := "2.10.2"

parallelExecution in Test := false

libraryDependencies += "org.mongodb" %% "casbah" % "2.6.3" % "compile"

libraryDependencies += "com.typesafe.akka" %% "akka-persistence-experimental" % "2.3.0-RC1" % "compile"

libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % "2.3.0-RC1" % "test"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.0" % "test"

libraryDependencies += "commons-io" % "commons-io" % "2.4" % "test"
