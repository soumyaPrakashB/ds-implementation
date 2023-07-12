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

        Node temp = head.next;

        while(temp != null) {
            if(temp.val == a) {
                return true;
            }

            temp = temp.next;
        }

        return false;
    }

    @Override
    public int removeFirst() {
        Node temp = head.next;

        head.next = temp.next;

        return temp.val;
    }

    @Override
    public int removeLast() {
        Node temp = head.next;
        int lastVal;

        while(temp != null) {
            if(temp.next.next == null) {
                lastVal = temp.next.val;
                temp.next = null;
                return lastVal;
            }

            temp = temp.next;
        }

        return 0;
    }

    @Override
    public int remove(int i) {

        int removedVal = 0;

        if(i == 0) {
            return removeFirst();
        }

        int index = 0;
        Node temp = head.next;

        while(temp != null) {
            if(temp.next == null) {
                return removeLast();
            }
            else if(i == index + 1) {
                removedVal = temp.next.val;
                temp.next = temp.next.next;
                break;
            }

            index++;
            temp = temp.next;
        }

        return removedVal;
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
