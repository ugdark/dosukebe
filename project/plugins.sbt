logLevel := Level.Warn

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// update等が早くなる
addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.3")

// jarを作ったりできるやつ。
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.7")

// scalaのコードフォーマッター
addSbtPlugin("com.geirsson" % "sbt-scalafmt" % "1.5.1")

// scala doc をプロジェクトで１つにまとめてくれる
addSbtPlugin("com.eed3si9n" % "sbt-unidoc" % "0.4.1")
