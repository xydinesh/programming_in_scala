package com.linkanalytics.steps

object Step8 extends App {
  println("Use lists")
  val oneTwo = List(1, 2)
  val threeFour = List(3, 4)

  // concatination
  val oneTwoThreeFour = oneTwo ::: threeFour
  println(oneTwo + " and  " + threeFour + " were not mutated")
  println("Thus, " + oneTwoThreeFour + " is a new list.") 

  val twoThree = List(2, 3)
  // prepend
  val oneTwoThree = 1 :: twoThree
  println(oneTwoThree)

  /**
    * Notes:
    * 
    * Functional programming methods does not have side effects. A method's only act
    * should be to compute and return a value
    * 
    * Arrays are mutable (can be changed) objects where as Scala Lists are always immutable
    *  objects (Java lists can be mutable)
    * 
    * ::: is list concatination operation
    *  :: prepends values to list 
    * 
    * Creating lists:
    * 
    *  val nlist = List(1, 2, 3) or
    *  val nlist = 1 :: 2 :: 3 :: Nil
    * 
    *  The reason you need Nil at the end is that :: is defined on class list. 1 :: 2 :: 3 wouldn't work.
    **/
}

