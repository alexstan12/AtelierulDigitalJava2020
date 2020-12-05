package lab3.challenge2Strategy;

public interface SortingStrategy {
    void sort(Integer[] list);

}

class BubbleSort implements SortingStrategy{
    public void sort(Integer[] list){
        Integer temp;
        for(int i=0; i< list.length-1; i++)
            for(int j=0; j<list.length-i-1;j++){
                if(list[j] > list[j+1]){
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
    }

    @Override
    public String toString() {
        return "BubbleSort{}";
    }
}

class MergeSort implements SortingStrategy{

    @Override
    public void sort(Integer[] list) {
        int n = list.length;
        if(n<2) return;

        int mid = n/2;
        Integer[] leftArr = new Integer[mid];
        Integer[] rightArr = new Integer[n-mid];
        for(int i=0; i<mid; i++) leftArr[i] = list[i];
        for(int i=mid; i<n; i++) rightArr[i-mid] = list[i];

        sort(leftArr);
        sort(rightArr);
        merge(leftArr, rightArr, list);
    }

    private void merge(Integer[] leftArr, Integer[] rightArr, Integer[] list){
        int nL = leftArr.length;
        int nR = rightArr.length;
        int i=0, j=0, k = 0;
        while(i<nL && j<nR){
            if(leftArr[i] <= rightArr[j]){
                list[k] = leftArr[i];
                k++;
                i++;
            }else{
                list[k] = rightArr[j];
                k++;
                j++;
            }
        }
        while(i<nL){
            list[k] = leftArr[i];
            k++;
            i++;
        }
        while(j<nR){
            list[k] = rightArr[j];
            k++;
            j++;
        }
    }

    @Override
    public String toString() {
        return "MergeSort{}";
    }
}
