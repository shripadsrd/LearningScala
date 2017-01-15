
object WorldApp {
  def main(args: Array[String]) {

//    new Greet().greet()
//
//    new FancyGreet("Wonderful").greet()
//
//    new CarefulGreeter("This is nice").greet()
//
//    new RepeatGreet("wow", 3).greet()
//    new RepeatGreet("once").greet()
//
//    new WorldlyGreeter("hi").greet()
//
    var pet:Friendly = new Dog
    println(pet.greet())

    pet = new HungryCat
    println(pet.greet())

    pet = new HungryDog
    println(pet.greet())

    pet = new Dog with ExcitedFriendly
    println(pet.greet())

    pet = new HungryCat with ExcitedFriendly
    println(pet.greet())

    pet = new HungryDog with ExcitedFriendly
    println(pet.greet())

//    val i:Int
//    print(i)



  }

}
