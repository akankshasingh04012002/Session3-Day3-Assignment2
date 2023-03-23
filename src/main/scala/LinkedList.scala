class LinkedList[T] {
  private class Node(var data: T, var next: Node)

  private var head: Node = null

  def insert(data: T): Unit = {
    head = new Node(data, head)
  }

  def delete(data: T): Boolean = {
    if (head == null) false
    else if (head.data == data) {
      head = head.next
      true
    }
    else {
      var current = head
      var previous = current
      while (current != null && current.data != data) {
        previous = current
        current = current.next
      }
      if (current == null) false
      else {
        previous.next = current.next
        true
      }
    }
  }

  def search(data: T): Boolean = {
    var current = head
    while (current != null && current.data != data) {
      current = current.next
    }
    current != null
  }

  def traverse(): Unit = {
    var current = head
    while (current != null) {
      println(current.data)
      current = current.next
    }
  }
}