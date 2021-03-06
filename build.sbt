name := "hello-akka"

version := "1.0"

scalaVersion := "2.11.8"

lazy val akkaVersion = "2.5.12"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,


  // Commercial stuff
  "com.lightbend.akka" %% "akka-split-brain-resolver" % "1.1.0",
  "com.lightbend.akka" %% "akka-diagnostics" % "1.1.0",



  "org.scalatest" %% "scalatest" % "2.2.6" % "test",
  "junit" % "junit" % "4.12" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test"
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")
