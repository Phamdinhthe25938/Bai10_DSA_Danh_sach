import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Arrays;
import java.util.Comparator;

public class MyList<E> implements Comparable<MyList> {
        private int size = 0;
        private static final int DEFAULT_CAPACITY = 10;
        private Object elements[];
        public MyList() {
            elements = new Object[DEFAULT_CAPACITY];
        }
        private void ensureCapa() {
            int newSize = elements.length * 2;
//            Arrays.copyOf(Mang ban dau, ban sao cua mang goc)
            elements = Arrays.copyOf(elements, newSize);
        }
        public void add(E e) {
            if (size == elements.length) {
                ensureCapa();
            }
            elements[size] = e;
            size++;
        }
        public void show(){
            for (int i = 0; i < elements.length; i++){
                if(elements[i]!=null){
                    System.out.print(elements[i]+" ");
                }
            }
            System.out.println("");
        }
        public  void Clone(){
            Object newArray[] = new Object[elements.length];
           for (int i = 0; i < newArray.length ; i++){
               newArray[i]=elements[i];
           }
        }
        public void indexOf(E e){
//            int vt=0;
            int dem=0;
            boolean check=false;
            for (int i = 0; i < elements.length ; i++){
                if(elements[i]==e){
                    dem++;
                    check=true;
                }

            }
            Object newArray[] = new Object[dem];
            int x=0;
           if (check){
               for (int i = 0; i < elements.length ; i++){
                   if(elements[i]==e){
                       newArray[x]=i;
                       x++;
                   }
               }
               System.out.print("Vi tri "+e+":");
               for(int i =0;i<newArray.length;i++){
                   System.out.print(newArray[i]+" ");
               }
           }
        }
        public void remove(int index) {
            int x=0;
            Object newArray[] = new Object[elements.length - 1];
            for (int i = 0; i < elements.length-1 ; i++) {
               if(elements[i]!=null && i!=index) {
                   newArray[x]=elements[i];
                   x++;
               }
            }
            elements = newArray;
        }
        public int size(){
            int dem=0;
            for (int i = 0; i < elements.length; i++){
                if(elements[i]!=null){
                    dem++;
                }
            }
            return dem;
        }
        public E get(int i) {
            if (i>= size || i <0) {
                throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
            }
            return (E) elements[i];
        }
        public  void clear(){
            Object newArray[] = new Object[0];
            elements=newArray;
            for (int i=0;i<elements.length;i++){
                System.out.println( elements[i]);
            }
        }

        @Override
        public int compareTo(MyList o) {
            return 0;
        }
    }
