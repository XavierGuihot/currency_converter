name := "currency_converter"

version := "1.0.1"

scalaVersion := "2.10.4"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-Xfatal-warnings")

assemblyJarName in assembly := name.value + "-" + version.value + ".jar"

assemblyOutputPath in assembly := file("./" + name.value + "-" + version.value + ".jar")

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.6.1" % "provided"

libraryDependencies += "joda-time" % "joda-time" % "2.9.4"

libraryDependencies += "org.joda" % "joda-convert" % "1.2"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

libraryDependencies += "com.holdenkarau" %% "spark-testing-base" % "1.6.1_0.6.0" % "test"

parallelExecution in Test := false
