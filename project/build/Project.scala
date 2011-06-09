import sbt._

class MyProject(info: ProjectInfo) extends DefaultProject(info) {

    // Repositories
    // val toolsSnapshots      = "scala tools" at "http://nexus.scala-tools.org/content/repositories/snapshots/"
    // val scalaToolsSnapshots = "Scala-Tools Maven2 Snapshots Repository" at "http://scala-tools.org/repo-snapshots"
    val toolsPublic      = "scala tools" at "http://nexus.scala-tools.org/content/repositories/public/"

    // Dependencies. Using '%%' means to append the "_2.9.0" (or whatever the scala version) to the artifact
    val scalatest = "org.scalatest" %% "scalatest" % "1.4.1"
    val junit = "junit" % "junit" % "4.8.2"
}