public class TestMyList {
    public static void main(String[] args) {
        MyList list = new MyList();
        System.out.println(list);
        System.out.println("size: "+list.size());
        list.addFirst(1);
        list.addLast(8);
        list.addLast(7);
        list.addLast(33);
        list.addLast(43);
        list.addFirst(99);

        System.out.println(list);
        System.out.println("size: "+list.size());
        list.clear();
        System.out.println(list);
        System.out.println("size: "+list.size());
    }
}
