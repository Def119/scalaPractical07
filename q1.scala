object Q1 extends App {
  def filterEvenNumbers(numbers: Array[Int]): Array[Int] = {
    numbers.filter(_ % 2 == 0)
  }

  val numArray = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  println(filterEvenNumbers(numArray).mkString(", "))
}
