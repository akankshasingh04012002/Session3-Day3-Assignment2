import org.scalatest.matchers.should.Matchers
import org.scalatest.funsuite.AnyFunSuite

class LinkedListTest extends AnyFunSuite with Matchers {

  //Tests for integers
  val intList = new LinkedList[Int]()

  test("Adding an element to the linked list") {
    intList.insert(1)
  }

  test("Adding multiple elements to the linked list") {
    intList.insert(2)
    intList.insert(3)
  }

  test("Deleting an element from the linked list") {
    intList.delete(2)
  }

  test("Searching for an existing element in the linked list ") {
    intList.search(1) should be(true)
  }

  test("Searching for a non-existing element in the linked list should return false") {
    intList.search(2) should be(false)
  }

  //Tests for Long
  val longList = new LinkedList[Long]()

  test("Inserting an element in the linked list") {
    longList.insert(123456789012345L)
  }

  test("Searching for existing element from Linked list") {
    longList.search(123456789012345L) should be(true)
  }

  test("deletion of an element from the Linked list") {
    longList.delete(123456789012345L)
  }

  //Tests for string
  val stringList = new LinkedList[String]()

  test("test for Inserting string in the linked list") {
    stringList.insert("Hello, This is Akanksha Singh")
  }

  test("searching for non-existing element in the linked list") {
    stringList.search("hey!") should be(false)
  }

  test("test for searching a existing string in the linked list") {
    stringList.search("Hello, This is Akanksha Singh") should be(true)
  }

  test("Deletion from linked list") {
    stringList.delete("Hello, This is Akanksha Singh")
  }

}

