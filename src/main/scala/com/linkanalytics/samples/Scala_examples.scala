package com.linkanalytics.samples

class Scala_examples {

  def addOne(m: Int): Int = {
    return m + 1
  }

  //partial application
  def addr(m: Int, n: Int) = {
    m + n
  }

  lazy val add2 = addr(2, _:Int)

  //Curried function
  def multiply(m: Int)(n: Int): Int = {
    m * n
  }

  val timesTwo = multiply(2) _
}

object Scala_examples extends App {
  println("Hello, scala_examples")
  val se = new Scala_examples
  println("Function " + se.addOne(2))
  println("Add 2 using partial application " + se.add2(2))
  println("Times two " + se.timesTwo(3))
}

object Step7 extends App {
  println("Parameterize arrays with types")
  val big = new java.math.BigInteger("123456")
  println(big)

  val greetStrings = new Array[String](3)
  greetStrings(0) = "Hello"
  greetStrings(1) = ", "
  greetStrings(2) = "world!\n"

  greetStrings.foreach(print)

  // arrays in scala access placing index inside paranthesis
  // example:
  // greetStrings(0) 
  // not greetStrings[0]
  for (i <- 0 to 2)
    print(greetStrings(i))

  /**
    *  Notes:
    *  When you call 1 + 2 in Scala
    *  you are calling + method in 1 object, passing 2 as an argument
    *  which equivalent to (1).+(2) in traditional method
    *  Also, calling greetStrings(i) will be interpreted as
    *  greetStrings.apply(i) 
    *  as a general rule any object which has apply method can be called using paranthesis
    *  If object xyz has an apply method
    *  xyz(i) would call xyz.apply(i) 

    *  In addition, assignment will be interpreted as update
    *  greetStrings(0) = "Hello"
    *  interpreted as
    *  greeetStrings.update(0, "Hello")
    **/
}

