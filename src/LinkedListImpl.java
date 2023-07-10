public class LinkedListImpl implements LinkedList{

    Node head;

    Node current;

    LinkedListImpl() {
        head = new Node();
        current = head;
    }

    LinkedListImpl(int a) {
        head = new Node();
        current = head;
        current.val = a;
        current.next = null;
    }

    @Override
    public void addFirst(int a) {

        Node newNode = new Node();
        newNode.val = a;
        newNode.next = null;

        if(head == current) {
            current = newNode;
            head.next = current;
        }
        else {
            Node temp = head.next;
            head.next = newNode;
            newNode.next = temp;
        }
    }

    @Override
    public void add(int i, int a) {
        if(i == 0) {
            addFirst(a);
        }

        Node temp = head.next;

        Node prev = temp;
        temp = temp.next;

        int index = 1;

        Node newNode = new Node();
        newNode.val = a;


        while(temp != null) {
            if(i == index) {
                newNode.next = temp;
                prev.next = newNode;
                break;
            }

            index++;
            prev = temp;
            temp = temp.next;
        }
    }

    @Override
    public void add(int a) {
        Node newNode = new Node();
        newNode.val = a;
        newNode.next = null;

        current.next = newNode;
        current = current.next;
    }

    @Override
    public boolean contains(int a) {
        return false;
    }

    @Override
    public int removeFirst() {
        return 0;
    }

    @Override
    public int removeLast() {
        return 0;
    }

    @Override
    public int remove(int i) {
        return 0;
    }

    @Override
    public int get() {
        return head.next.val;
    }

    @Override
    public int get(int i) {
        Node temp = head.next;
        int index = 0;

        while(temp != null) {
            if(index == i) {
                return temp.val;
            }
            index++;
            temp = temp.next;
        }

        return -1;
    }

    public void display() {
        Node temp = head.next;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
