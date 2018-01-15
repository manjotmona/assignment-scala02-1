package edu.knoldus

/**
 * Created by manjot on 15/1/18.
 */
class Operations {

  def rotatingListToLeft(num: Int, list: List[Char]): List[Char] = {
    list match {
      case head :: tail if (num > 0) => rotatingListToLeft(num - 1, tail ::: head :: Nil)
      case _ if (num == 0) => list
    }
  }

  def sumOfDigits(a: Int, sum: Int): Int = {
    if (a == 0) {
      sum
    }
    else {
      sumOfDigits(a / 10, sum + ((a % 10) * (a % 10)))
    }
  }

  def checkingForHappyNumber(num: Int): Boolean = {

    if (sumOfDigits(num, 0) == 1) {
      true
    }
    else if (sumOfDigits(num, 0) == 4 || sumOfDigits(num, 0) == 16
             || sumOfDigits(num, 0) == 37 || sumOfDigits(num, 0) == 58
             || sumOfDigits(num, 0) == 89 || sumOfDigits(num, 0) == 145 || sumOfDigits(num, 0) == 42
             || sumOfDigits(num, 0) == 20) {
      false
    }
    else {
      checkingForHappyNumber(sumOfDigits(num, 0))
    }
  }

  def checkingHappyNumberForRange(list: List[Int]): List[Boolean] = {
    for (i <- list) yield {
      checkingForHappyNumber(i)
    }
  }

  def eliminatingConsecutiveDuplicates(list: List[Char]): List[Char] = {
    list match {
      case Nil => Nil
      case _ :: Nil => list
      case head1 :: head2 :: tail if (head1 == head2) => eliminatingConsecutiveDuplicates(
        head2 :: tail)
      case head :: tail => head :: eliminatingConsecutiveDuplicates(tail)
    }
  }

  def runLengthEncoding(list: List[Char], tList: List[(Char, Int)]): List[(Char, Int)] = {
    list match {
      case Nil => tList
      case head :: _ => runLengthEncoding(list.span(x => x == head)._2,
        (head, list.span(x => x == head)._1.length) :: tList)
    }
  }
}

