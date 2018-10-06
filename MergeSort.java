public class MergeSort implements SortingAlgorithm {
    public void sort(int[] arr){
        sorts(arr, 0, arr.length -1 );
    }

    public void sorts(int[] arr, int left, int right){
        if(left>= right){
            return;
        }
        int mid =(left+right)/2;
        sorts(arr, left, mid);
        sorts(arr, mid+1, right);
        mergesort(arr, left, mid, right);

    }
    public void mergesort(int arr[], int left, int mid, int right){
        int n1 = mid -left +1;
        int n2 = right -mid;

        int L[] = new int [n1];
        int R[] = new int [n2];

        for (int i=0; i<n1; ++i)
            L[i] = arr[left + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[mid + 1+ j];

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
