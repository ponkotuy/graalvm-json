import java.util.Scanner

import io.circe._
import io.circe.parser._

import scala.collection.JavaConverters._

object Main {
  def main(args: Array[String]) {
    val scanner = new Scanner(System.in)
    val input = scanner.asScala.mkString("")
    parse(input).fold(
      failure => println(failure),
      json => println(Printer.spaces2.pretty(json))
    )
  }
}
