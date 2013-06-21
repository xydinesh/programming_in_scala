object While {
  def main(args: Array[String]){
    var i = 0
    while (i < args.length) {
      println(args(i))
      i += 1
    }
  }
}


object While1{
  def main(args: Array[String]){
    var i = 0
    while (i < args.length) {
      if (i > 0)
        print (" ")
      print(args(i))
      i += 1
    }
    println()
  }
}


object Foreach {
  def main(args: Array[String]) {
    args.foreach(a => println(a))
  }
}

object For {
  def main(args: Array[String]) {
    for (a <- args)
      println(a)
  }
}


