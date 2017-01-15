val string = "helloscala!"
println(string)

print("hi")

def max(x:Int,y:Int):Int = {
  if (x>y)x else y
}

max(2,-4)

def greet() = print("hellow hi")

greet()

var args = ("a", "b", "c", "d")
print (args)

//args.foreach(arg => print(arg))

true ^ true ^ false ^ false

val greetStrings = new Array[String](3)

greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "world!\n"
greetStrings(1) = " nope "

val greetStrings2 = ("nope","a")
for (i <- 0.to(2))
  print(greetStrings(i))
print(greetStrings2._2)

var a = List()

var b = Nil

var c = List(11,2,3,4)
var d = ("s", "a", 1)
val e = "hi" :: "there" :: Nil
val f = c ::: e

val pair = (99, "Luftballons")
print(pair._1)
print(pair._2)

val v = 5
if (v == 5) println("paanch") else println("not paanch")



















