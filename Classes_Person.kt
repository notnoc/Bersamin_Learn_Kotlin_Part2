// Write your class below 
class Person(val name: String, val age: Int, val favoriteColor: String)


fun main() {
  // Create your instances below 
val me = Person("AMX", 69, "Green")
val myFriend = Person("LTTB", 69, "Yellow")
println("${me.name} is ${me.age} years old and my favorite color is ${me.favoriteColor}.")
println("${myFriend.name} is ${myFriend.age} years old and their favorite color is ${myFriend.favoriteColor}.")
}
