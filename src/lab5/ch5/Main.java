package lab5.ch5;

public class Main {
    public static void main(String[] args) {
        BinarySearch<Integer> search = new BinarySearch<>(new Integer[]{5,4,3,2,1});
        int index = search.binarySearch(search.getArr(), 0,search.getArr().length,3);
        System.out.println("Element is at position: " + index);
    }
}
