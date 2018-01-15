package edu.knoldus

import org.apache.log4j.Logger

/**
 * Created by manjot on 15/1/18.
 */
object Application extends App {
  val log = Logger.getLogger(this.getClass)
  val obj = new Operations()
  log.info("Scala 02 - Assignment 01\n")
  log.info("Rotating a list to N places:\n")
  log.info(obj.rotatingListToLeft(3, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h')) + "\n")
  log.info("Happy/Sad Number:\n")
  val four = 4
  val nineteen = 19
  val twenty = 20
  val fifty = 50
  val inputList = List(four, nineteen, twenty, fifty)
  val result = obj.checkingHappyNumberForRange(inputList)
  log.info(inputList.zip(result) + "\n")
  log.info("Eliminating Consecutive Duplicates:\n")
  log.info(obj.eliminatingConsecutiveDuplicates(List('a', 'a', 'b', 'c', 'c', 'd')) + "\n")
  log.info("Run Length Encoding:\n")
  log.info(obj.runLengthEncoding(List('a', 'a', 'b', 'c', 'c', 'd'), Nil))
}
