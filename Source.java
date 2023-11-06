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
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        Node<String> e = new Node<>("e");
        Node<String> f = new Node<>("f");
    
        System.out.println("Hi Dhruv! ");

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f; 
    
        Node<String> head = reverseList(a); 

        
        while (head != null) {
            System.out.println(head.val);
            head = head.next;


reverseList(a); // f -> e -> d -> c -> b -> a
        }
    }
}

 