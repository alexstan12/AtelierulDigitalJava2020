package lab5.ch5;

import java.util.Arrays;
import java.util.Iterator;

public class BinarySearch<T extends Comparable<T>> {
    private T[] arr;

    public BinarySearch(T[] arr){
        this.arr = arr;
    }

    public T[] getArr() {
        return arr;
    }

    public int binarySearch(T[] arr, int first, int last, T key){
        try{
        if(isSorted(arr)) {
            if (first <= last) {
                int mid = first + (last - first) / 2;
                if (arr[mid] == key) {
                    return mid;
                }
                if (arr[mid].compareTo(key) > 0) {
                    return binarySearch(arr, first, mid - 1, key);
                } else {
                    return binarySearch(arr, mid + 1, last, key);
                }
            }
        }

        }catch (ArrayNotSortedException e){
            System.out.println("Sort the array!");
        }
        return -1;
    }

    public boolean isSorted(T[] arr) throws ArrayNotSortedException {
        if (arr.length == 0 || arr.length == 1) {
            return true;
        }
        ArrayNotSortedException e = new ArrayNotSortedException();
        Iterator<T> iterator = Arrays.stream(arr).iterator();
        T current, previous = iterator.next();
        if (iterator.hasNext()) {
            current = iterator.next();
            if (previous.compareTo(current) < 0) {
                while (iterator.hasNext()) {
                    current = iterator.next();
                    if (previous.compareTo(current) > 0) {
                        throw e;
                    }
                    previous = current;
                }
                return true;
            } else {
                while (iterator.hasNext()) {
                    current = iterator.next();
                    if (previous.compareTo(current) < 0) {
                        throw e;
                    }
                    previous = current;
                }
                return true;
            }
        }
        return true;
    }
}
