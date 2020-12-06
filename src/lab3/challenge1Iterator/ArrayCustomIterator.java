package lab3.challenge1Iterator;

public class ArrayCustomIterator {
    private int[] arr;
    private int position;

    public ArrayCustomIterator(int[] arr){
        this.arr = arr;
    }
    public boolean hasNext(){
        return (position < arr.length);
    }
    public int next(){
        return arr[position++];
    }
}
