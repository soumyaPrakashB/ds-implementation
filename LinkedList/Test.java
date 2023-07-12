public class Test {

    public static void main(String[] args) {
        LinkedList list = new LinkedListImpl();

        list.add(1);
        list.display();

        list.add(2);
        list.display();

        list.add(3);
        list.display();

        list.add(4);
        list.display();

        list.add(2,6);
        list.display();

        list.add(5);
        list.display();

        list.add(5, 7);
        list.display();

        System.out.println(list.get(7));
        System.out.println(list.get(5));
        System.out.println(list.get(1));
        System.out.println(list.get());
        System.out.println(list.contains(5));
        System.out.println(list.contains(50));

        list.display();
        System.out.println(list.remove(0));
        list.display();

        System.out.println(list.remove(5));
        list.display();

        System.out.println(list.remove(2));
        list.display();



    }
}
