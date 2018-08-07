lazy val commonSettings = Seq(
  version := "1.0",
  organization := "com.kokodayo",
  startYear := Some(2018),
  scalaVersion := "2.12.6",
  scalacOptions := Seq(
    "-feature",
    "-deprecation",
    "-unchecked",
    "-Xlint"
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

lazy val dosukebe = (project in file("."))
  .settings(commonSettings)
  .enablePlugins(ScalaUnidocPlugin)
  .aggregate(
    coreModel
  )
