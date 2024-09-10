import scala.util.Random

class Die {
  private val directions = Array("North", "South", "East", "West")
  private var count = 0;
  private var directionMap = Map("North" -> 0, "South" -> 0, "East" -> 0, "West" -> 0)

  def roll(): String = {
    val direction = directions(Random.nextInt(4))
    directionMap += (direction -> (directionMap(direction) + 1))
    count += 1
    direction
  }

  def printStats(): Unit = {
    println(s"Total throws:: $count")
    directionMap.foreach { case (dir, count) =>
      println(f"$dir: ${count.toDouble / count * 100}%.1f%%")
    }
  }

}
