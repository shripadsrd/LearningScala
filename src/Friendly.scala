trait Friendly {
  def greet() = "Hi"
}

class Dog extends Friendly {
  override def greet() = "Woof"
}

class HungryCat extends Friendly {
  override def greet() = "Hungry Meow"
}

class HungryDog extends Dog {
  override def greet() = "Bark Bark"
}

trait ExcitedFriendly extends Friendly{
  override def greet() = super.greet() + "!!!"
}


