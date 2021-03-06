

name := "advent-of-code-2020"
organization := "velocorner.com"
version := "1.0.0-SNAPSHOT"

scalaVersion := "3.0.0"

onLoadMessage := Def.setting {
  import scala.Console._
  def green(text: String): String = s"$GREEN$text$RESET"

  s"""|${green("""                                       """)}
      |${green("""                                       """)}
      |${green("""                _==_ _                 """)}
      |${green("""              _,(",)|_|                """)}
      |${green("""               ( . \-|                 """)}
      |${green("""             _(  :  )|_                """)}
      |${green("""                                       """)}
      |${green("""                                       """ + version.value)}
      |
      """.stripMargin
}.value
