name := "NameOfMacro"

version := "1.0"

scalaVersion := "2.11.6"

libraryDependencies <++= (scalaVersion)(sv =>
  Seq(
    "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test",
    "org.scala-lang" % "scala-reflect" % "2.11.+",
    "org.scala-lang" % "scala-compiler" % "2.11.+"
  )
)