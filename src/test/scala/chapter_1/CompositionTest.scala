package chapter_1

import org.scalatest.funsuite.AnyFunSuite

class CompositionTest extends AnyFunSuite {
  val myFunction: Int => Int = (int: Int) => 2 * int

  test("Challenge 3. identity") {
    assert(Composition.identity(myFunction) == myFunction)
  }

  test("Challenge 4. Composition") {
    assert(Composition.composition(identity(myFunction), myFunction)(2) == 8)
    assert(Composition.composition(myFunction, identity(myFunction))(2) == 8)

  }
}
