package OOPs.Generics;

public class Main {
    public static void main(String[] args) {

        CustomArrayList<Integer> list = new CustomArrayList<>();
        /*
            Limitation is that it makes another array of double size when limit is reached.
        */
        list.add(4);
        list.add(5);
        list.add(25);
        System.out.println(list.size());;

        System.out.println(list);
    }
}
