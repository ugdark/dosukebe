lazy val commonSettings = Seq(
  version := "1.0",
  organization := "com.kokodayo",
  startYear := Some(2019),
  scalaVersion := "2.12.6",
  scalacOptions := Seq(
    "-deprecation",
    "-feature",
    "-unchecked",
    "-Xlint",
    "-Ywarn-dead-code",
    "-Ywarn-numeric-widen",
    "-Ywarn-unused",
    "-Ywarn-unused-import",
    "-Ywarn-value-discard"
    // 警告をエラーにする（お好みに応じて）
    , "-Xfatal-warnings"
  ),
  scalacOptions in (Compile, doc) := Seq("-diagrams") // docにグラフを追加する
)

lazy val testSettings = libraryDependencies ++= {
  Seq(
    "org.scalatest" % "scalatest_2.12" % "3.0.5" % "test"
  )
}

lazy val coreModel = Project("core-model", file("core-model"))
  .settings(commonSettings)
  .settings(testSettings)


lazy val util = project.in(file("util"))
  .settings(commonSettings)
  .settings(testSettings)
  .settings(
    libraryDependencies ++= Seq(
      "ch.qos.logback" % "logback-classic" % "1.2.3"
    )
  )

lazy val dosukebe = (project in file("."))
  .settings(commonSettings)
  .enablePlugins(ScalaUnidocPlugin)
  .aggregate(
    coreModel,
    util
  )
