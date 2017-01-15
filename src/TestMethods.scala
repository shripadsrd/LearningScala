
class Calculator {
  private var sum = 0
  def add(b: Byte): Unit = sum += b
  def oneMore: Int = sum + 1
  def oneMoreNoReturn: Unit = sum + 1
  def oneMoreReturn = {
    sum + 1 + "yay"
  }
  def noReturnAgain: Unit = sum + 1
  def oneMoreNoReturnAgain {
    sum + 1 + "yay"
  }

}


object mainObject {
  def main(args: Array[String]) {

    val calculator: Calculator = new Calculator
    println(calculator.oneMore)
    calculator.add(22)
    println(calculator.oneMore)
    println(calculator.oneMoreNoReturn)
    println(calculator.oneMoreReturn)
    println(calculator.noReturnAgain)
    println("scala is weird!")
  }
}

