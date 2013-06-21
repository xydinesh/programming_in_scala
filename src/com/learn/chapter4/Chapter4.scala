import scala.collection.mutable.Map


class CheksumAccumulator {
  private var sum = 0
  def add(b: Byte) { sum += b}
  def checksum(): Int = ~(sum & 0xFF) + 1
}


object ChecksumAccumulator {
  private val cache = Map[String, Int]()
  
  def calculate(s: String) = 
    if (cache.contains(s)) {
      cache(s)
    } else {
      val acc = new CheksumAccumulator
      s.foreach(a => acc.add(a.toByte))
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
}

object Summer {
  import ChecksumAccumulator.calculate
  def main(args: Array[String]) {
    args.foreach(a => println(a + " : " + calculate(a)))
  }
}

object FAllWinderSprintSummer extends Application {
  import ChecksumAccumulator.calculate
  val season = "fall" :: "winter" :: "sprint" :: Nil
  season.foreach(a => println(a + ":" + calculate(a)))
}


