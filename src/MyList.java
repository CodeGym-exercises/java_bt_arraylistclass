import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E>{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private E[] elements = (E[]) new Object[DEFAULT_CAPACITY];

    public MyList() {
    }

    public void add(int index, E element){
        if(index<0||index>elements.length){
            System.out.println("Can't add this element to list,(index: "+index+", sizeoflist: "+size+")");
        }
        else {
            size++;
            ensureCapacity();
            for(int i = size; i > index; i--){
                elements[i] = elements[i-1];
            }
            elements[index] = element;
        }
    }

    public void addFirst(E element){
       this.add(0,element);
    }

    public void addLast(E element){
        this.add(size,element);
    }

    public E remove(int index){
        if(index<0||index>elements.length){
            System.out.println("Can't remvove this element to list,(index: "+index+", sizeoflist: "+size+")");
            return null;
        }
        else {
            E element = elements[index];
            for(int i = index; i < size; i++){
                elements[i] = elements[i+1];
            }
            elements[size--] = null;
            return element;
        }
    }

    public int size(){
        return this.size;
    }

    public E[] clone(){
        E[] nElements = (E[]) new Object[this.size];
        for(int i = 0; i < this.size; i++){
            nElements[i] = nElements[i];
        }
        return nElements;
    }

    public boolean contains(E o){
        for(int i = 0; i < this.size; i++){
            if(this.elements[i] == o){
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o){
        for(int i = 0; i < this.size; i++){
            if(this.elements[i] == o){
                return i;
            }
        }
        return -1;
    }

    public void ensureCapacity(){
        if(size==elements.length){
            elements = Arrays.copyOf(elements,elements.length*2);
        }
    }

    public E get(int index){
        if(index<0||index>elements.length){
            System.out.println("Can't get this element to list,(index: "+index+", sizeoflist: "+size+")");
            return null;
        }
        return elements[index];
    }

    public void clear(){
        elements ;
        this.size = 0;
    }

    @Override
    public String toString(){
        String result = "";
        for(int i = 0; i < size; i++){
            result+= elements[i] + " ";
        }
        return result;
    }
}
