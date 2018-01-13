/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
  //Link of problem:: https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem
Node Insert(Node head,int data) {
    if (head == null){
        head = new Node();
        head.data = data;
    }
    else {
        Node node = head;
        while (node.next != null){
            node = node.next;
        }
        node.next = new Node();
        node.next.data = data;
    }
    return head;
}

