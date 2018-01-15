def runLengthEncoding(list: List[Char],tList: List[(Char,Int)]): List[(Char,Int)] = {
  list match {
    case Nil => tList
    case head :: _ => runLengthEncoding(list.span(x => x == head)._2,
      (head, list.span(x => x == head)._1.length) :: tList)
  }
}
def rotatingListToLeft(num: Int, list: List[Char]): List[Char] = {
  list match {

    case head :: tail if (num > 0) => rotatingListToLeft(num - 1, tail ::: head :: Nil)
    case _ if (num == 0) => list
  }
}
rotatingListToLeft(0,List())
runLengthEncoding(List('a','a','a','c','b','b','b'),Nil)