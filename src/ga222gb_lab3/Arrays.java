package ga222gb_lab3;

public class Arrays {

    public static void main(String[] args){
        int[] arr = {5,2,3,9,5,1,1,2};
        int[] sub = {9,5};

        boolean leke = hasSubsequence(arr, sub);

        System.out.println(leke);
}

    private static int sum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    private static String toString(int[] arr){
        String n = "";
        for(int i = 0 ; i < arr.length; i++){
            n = n + arr[i] + ", ";
        }
        return n;
    }

    private static int[] addN(int[] arr, int n){
        int[] newArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[i] + n;
        }
        return newArr;
    }

    //Funkar men dubbelkolla sen
    private static int[] reverse(int[] arr){
        int[] reversedArr = new int[arr.length];
        for(int i = arr.length - 1; i >= 0; i--){
            reversedArr[arr.length - i - 1] = arr[i];
        }
        return reversedArr;
    }

    private static boolean hasN(int[] arr, int n){
        boolean hasN = false;
        for(int i = 0; i < arr.length; i++){
            if(n == arr[i]){
                hasN = true;
                break;
            }
        }
        return hasN;
    }

    private static void replaceAll(int[] arr, int old, int nw){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == old){
                arr[i] = nw;
            }
        }
    }

    private static int[] sort(int[] arr){
        int[] sortedArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            sortedArr[i] = arr[i];
        }
        for(int i = 0; i < sortedArr.length; i++){
            for(int j = i + 1; j < sortedArr.length; j++){
                int temp = 0;
                if (sortedArr[i] > sortedArr[j]) {
                    temp = sortedArr[i];
                    sortedArr[i] = sortedArr[j];
                    sortedArr[j] = temp;
                }
            }
        }
        return sortedArr;
    }

    private static boolean hasSubsequence(int[] arr, int[] sub){
        boolean hasSub = false;
        for(int i = 0; i < arr.length - (sub.length - 1); i++){
            int subCounter = 0;
            for(int j = 0; j < sub.length; j++){
                if(arr[i + j] == sub[subCounter]){
                    subCounter++;
                    if(subCounter == sub.length){
                        return true;
                    }
                }
            }
        }
        return hasSub;
    }
}
