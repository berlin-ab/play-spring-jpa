name := "testing"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache
)

libraryDependencies += "org.springframework" % "spring-context" % "4.0.4.RELEASE"

libraryDependencies += "org.postgresql" % "postgresql" % "9.3-1100-jdbc41"

libraryDependencies += "org.springframework.data" % "spring-data-jpa" % "1.5.2.RELEASE"

libraryDependencies += "org.hibernate" % "hibernate-entitymanager" % "4.3.5.Final"

play.Project.playJavaSettings
