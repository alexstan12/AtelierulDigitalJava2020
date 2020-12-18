package lab5.ch4;

public class ArrayIterator<T> implements IArrayIterator<T>{
    private T[] arr;
    private int position=0;

    public ArrayIterator(T[] arr) {
        this.arr = arr;
    }

    @Override
    public boolean hasNext() {
        if(position<arr.length && arr[position]!=null){
            position++;
            return true;
        }else return false;
    }

    @Override
    public T next() {
            return arr[position-1];
    }
}
