public class Main {
    public static void main(String[] args) {
        MyArray arr = new MyArray(5);

        arr.insert(1);
        arr.insert(2);
        arr.insert(3);
        arr.insert(4);
        arr.insert(500);
        arr.insert(7);
        arr.insert(8);
        arr.insert(9);
        arr.insert(10);

        arr.reverse();
        System.out.println(arr);

        System.out.println(arr.max());
        System.out.println(arr.min());
    }
}
