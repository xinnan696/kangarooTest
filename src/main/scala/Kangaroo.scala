object Kangaroo {

  def main(args: Array[String]) : Unit = {
    println("Enter dimension of the Grid (>=1):")
    val dimension = scala.io.StdIn.readInt()

    if (dimension < 1) {
      println("Grid size must be at least 1.")
      return
    }

    val die = new Die()
    val kangaroo = new Command(dimension)

    while (!kangaroo.isAtHome) {
      val direction = die.roll()
      kangaroo.move(direction)
    }

    println(s"Finished in ${kangaroo.getJump} hops!")
    die.printStats()
  }

}
