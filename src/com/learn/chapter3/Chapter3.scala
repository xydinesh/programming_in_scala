// Dinesh Weerapurage
// 06/20/2013
// Programming
object ParaArray {
  def main(args: Array[String]) {
    val numNames = Array("one", "two", "three")
    numNames.foreach(a => println(a))

    print("Using for loop\n")
    for (a <- numNames) {
      println(a)
    }
  }
}

object UseLists {
  def main(args: Array[String]) {
    var oneTwoThree = List(1, 2, 3)
    oneTwoThree.foreach(a => print(a + " "))
    println()
    var fourFive = List(4, 5)
    // :: is cons operation
    var oneToFive = oneTwoThree ::: fourFive
    oneToFive.foreach(a => print(a + " "))
    println()
  }
}

object NewLists {
  def main(args: Array[String]) {
    var oneTwoThree = 1 :: 2 :: 3 :: Nil
    var fourFive = 4 :: 5 :: Nil
    // :: Nil is important as it defined in List object
    // scala infer that current object has :: operator based on 'Nil'
    // if we were to use 1 :: 2 :: 3 to define a new list , compiler 
    // will throw an error as :: operator not available to integers
    var oneToFive = oneTwoThree ::: fourFive
    oneToFive.foreach(a => print(a + " "))
    println()
  }
}

object UseTuples {
  def main(args: Array[String]) {
    println("Step 9: Use Tuples")
    val pair = (99, "Luftballons")
    // Accessing elements in a tuple
    // Note that pair is 1 based
    // significant difference or tuple and list is tuple is capable of holding different element types
    // where as list always store same type elements
    println(pair._1)
    println(pair._2)
  }
}


object UseSetAndMaps {
  def main(args: Array[String]) {
    println("Step 10: Use set and maps")
    // creating immutable set
    var jetSet = Set("Boeing", "Airbus")
    jetSet += "Lear"
    println(jetSet.contains("Cessna"))
  }
}

object MmutableSet {
  import scala.collection.mutable.Set
  def main(args: Array[String]) {
    val movieSet = Set("Hitch", "Poltergeist")
    movieSet += "Shrek"
    println(movieSet)
  }
}

object ImmutableSet {
  import scala.collection.immutable.HashSet
  def main(args: Array[String]) {
    val hashSet = HashSet("Tomatoes", "Chilies")
    println(hashSet + "Coriander")
  }
}


object MutableImmutableMap {
  def main(args: Array[String]) {
    val romanNumeral = Map (
      1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V"
    )
    println(romanNumeral(4))

    import scala.collection.mutable.Map
    val treasureMap = Map[Int, String]()
    treasureMap += (1 -> "Go to island")
    treasureMap += (2 -> "Find big X on ground")
    treasureMap += (3 -> "Dig")
    println(treasureMap(2))
    
  }
}

object FunctionalProgramming {

  def formatString(args: Array[String]) = args.mkString("\n")

  def main(args: Array[String]) {
    println("Step 11. Learn to recognize the functional style")
    var i = 0
    while (i < args.length) {
      println(args(i))
      i += 1
    }

    // writing without vars
    args.foreach(println)

    println(formatString(args))
  }
}

object ReadLinesFromFile {
  import scala.io.Source

  def mkWidth(a: String, w: Int) = " " * (w - a.length.toString.length) + a.length.toString

  def main(args: Array[String]) {
    println("Step 12: Read lines from a file")

    if (args.length > 0) {
      val lines = Source.fromFile(args(0)).getLines().toList
      val maxWidth = lines.map(a => a.length.toString.length).max
      lines.foreach(a => println(mkWidth(a,maxWidth) + "| " + a))
    }
    else
      Console.err.println("Please enter filename")
  }
}










