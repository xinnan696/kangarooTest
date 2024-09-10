class Command (gridSize: Int){
  val position = new Point(0, 0)
  private var jumps = 0

  def move(direction: String): Unit = {
    direction match {
      case "North" if position.y < gridSize - 1 => position.y += 1
      case "South" if position.y > 0 => position.y -= 1
      case "East" if position.x < gridSize - 1 => position.x += 1
      case "West" if position.x > 0 => position.x -= 1
      case _ => println(s"Oops, hit the boundary: (${position.x}, ${position.y})")
    }
    jumps += 1
    println(s"Hopped to: $position")
  }

  def isAtHome: Boolean = position.x == gridSize - 1 && position.y == gridSize - 1

  def getJump: Int = jumps

}
