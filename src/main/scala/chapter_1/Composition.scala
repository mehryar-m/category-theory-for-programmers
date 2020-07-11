package chapter_1
/*
  Sample solutions in Chapter one.
  Scala does not do dynamic types so I chose Integer as the type for this.

  Problem 3 is in the src/test/scala/chapter_1/CompositionTest
 */

object Composition {

  // Problem 1
  def identity(x: (Int) => Int): (Int) => Int = {
     x
  }

  // Problem 2
  def composition(function1: (Int) => Int, function2: (Int) => Int): (Int) => Int = {
    (input: Int) => function1(function2(input))
  }
//  def composition(function1: (Int) => Int, function2: (Int) => Int): (Int) => Int = {
//    (input: Int) => function1(function2(input))
//  }


  def solutionForProblem4(): String = {
     "Yes"
  }

  def solutionForProblem5(): String = {
    "No, The property of if A->B and B->C, then A->C does not hold for friends. You and the friend of " +
      "your friend my not be friends."
  }

  def solutionForProblem6(): String = {
    "If there exists a path between two nodes a,b , then there must be an edge between a,b"
  }

}
