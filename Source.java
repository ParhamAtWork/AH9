class Node<T> {
    T val;
    Node<T> next;
    
    public Node(T val) {
      this.val = val;
      this.next = null;
    }
}

class Source {
    public static <T> Node<T> reverseList(Node<T> head) {
        Node<T> prev = null;
        Node<T> curr = head;
        while (curr != null) {
            Node<T> nextVal = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextVal;
        }
        return prev;
    }
    
    public static void main(String[] args) {
        Node<String> x = new Node<>("x");
        Node<String> y = new Node<>("y");
    
        x.next = y; // x -> y
    
        Node<String> head = reverseList(x); // y -> x

        // Printing solution
        while (head != null) {
            System.out.println(head.val);
            head = head.next;            
        }
    }
}
