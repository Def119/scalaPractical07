object Q2 extends App {
  def squareNumbers(numbers: Array[Int]): Array[Int] = {
    numbers.map(n => n * n)
  }

  val numArray = Array(1, 2, 3, 4, 5)

  println(squareNumbers(numArray).mkString(", "))
}
