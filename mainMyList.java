public class mainMyList {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);
        System.out.print("Show Array number :");
        listInteger.show();
        System.out.println("so phan tu trong mang :"+listInteger.size());
//        listInteger.remove(2);
//        System.out.print("mang sau khi xoa la :");
//        listInteger.show();
     listInteger.indexOf(3);
        System.out.println("Mang sau khi clear :");
        listInteger.clear();


//        System.out.println("element 0: "+listInteger.get(0));
//        System.out.println("element 1: "+listInteger.get(1));
//        System.out.println("element 2: "+listInteger.get(2));
//        System.out.println("element 3: "+listInteger.get(3));
//        System.out.println("element 4: "+listInteger.get(4));

//        listInteger.get(6);
//        System.out.println("element 6: "+listInteger.get(6));
//        listInteger.add(1);
//        listInteger.add(2);
//        listInteger.add(3);
//        listInteger.add(3);
//        listInteger.add(4);
//
//        System.out.println("element 4: "+listInteger.get(4));
//        System.out.println("element 1: "+listInteger.get(1));
//        System.out.println("element 2: "+listInteger.get(2));
//
//        listInteger.get(6);
//        System.out.println("element 6: "+listInteger.get(6));
    }
}
