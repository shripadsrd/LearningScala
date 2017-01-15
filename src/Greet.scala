class Greet {
  val greeting = "Hello, World!"
  def greet() = println(greeting)
}

class FancyGreet(message:String) {
  def greet() = println(message)
}

class CarefulGreeter(message:String) {
  if(message == null) {
    throw new NullPointerException("message cannot be null");
  }
  def greet() = println(message)
}

class RepeatGreet (message: String, i : Int) {
  def this(message: String) = this(message, 1)
  def greet() = println(message + "times" + i)
}



