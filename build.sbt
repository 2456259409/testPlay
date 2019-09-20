name := """beginplay2"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.0"

libraryDependencies += guice
libraryDependencies ++= Seq(
  "mysql" % "mysql-connector-java" % "8.0.12",
  "com.alibaba" % "druid" % "1.1.12",
  "org.projectlombok" % "lombok" % "1.18.4" % "provided",
  "com.alibaba" % "fastjson" % "1.2.33",
  "com.squareup.okhttp3" % "okhttp" % "3.7.0",
  "com.aliyun" % "aliyun-java-sdk-core" % "4.0.3",
  "org.json"%"json"%"20180130",
  "com.aliyun.openservices" % "tablestore" % "4.10.2",
  "com.aliyun" % "aliyun-java-sdk-chatbot" % "1.0.0",
  "com.aliyun.openservices" % "aliyun-log" % "0.6.31",
  "com.aliyun.openservices" % "aliyun-log-producer" % "0.2.0"
)
routesGenerator := InjectedRoutesGenerator

// Test Database
libraryDependencies += "com.h2database" % "h2" % "1.4.197"

