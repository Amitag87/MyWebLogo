public class RemoveNth {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(11);
        Node b = new Node(22);
        Node c = new Node(33);
        Node d = new Node(44);
        Node e = new Node(55);
        Node f = new Node(66);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        Node n1 = RemoveN(a,4);
        System.out.println(n1.data);

    }

    public static Node RemoveN(Node head, int n) {

        Node slow = head;
        Node fast = head;

        for(int i=0; i<n ; i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }
}
