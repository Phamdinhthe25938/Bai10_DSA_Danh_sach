public class mainLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> listLinkedList = new MyLinkedList<>(1);
        listLinkedList.add(1,3);
        listLinkedList.add(4,4);
        listLinkedList.add(3,5);
        listLinkedList.add(2,2);
        listLinkedList.show();
    }
}
