public class Arrays {

    public static void main(String[] args) {
        // Example Usage
        int[] arr = {10, 20, 25, 30, 40};
        int length = 4;

        //length = removeMiddle(arr, 2, length); // Removing 25


        length = deleteLast(arr,length); //have to update length so the 0 doesn't print

        //Print updated array
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //"Soft delete" last element in array
    public static int deleteLast(int[] arr, int length){
        if(length > 0){
            arr[length - 1] = 0;
            length--;
        }
        return length;
    }

    //insert n into arr at the next open position
    //Length is the number of 'real' values in arr.
    //Capacity is the size (memory allocated for the fixed array size)

    public void insertEnd(int[] arr, int n, int length, int capacity) {
        if(length < capacity){
            arr[length] = n;
        }
    }

    /*Remove from the last position in the array if the array
    is not empty (if length is not zero)
     */
    public int removeEnd(int[] arr1, int length){
        if(length > 0){
            /* overwrite last element with default value */
            arr1[length - 1] = 0;
            length--;
        }
        return length;
    }

    //insert n into index i after shifting elements to the right
    //Assuming i is a valid index and arr is not full

    /*InsertMiddle takes 4 parameters
for loop begins at the last index of the array
while the index is greater than i - 1, decrement
-shifting to the right so set arr[index] to the index to its
right
insert n
 */

    public void insertMiddle(int[] arr, int i, int n, int length){
        //shift starting from the end to i
        for(int index = length - 1; index > i - 1; index--){
            arr[index + 1] = arr[index];
        }
        arr[i] = n;
    }

    //Remove value at index i before shifting elements to the left
    //assuming i is a valid index
    public static int removeMiddle(int[] arr, int i, int length){
        //shift starting from i + 1 to end
        for(int index = i + 1; index < length; index++){
            arr[index - 1] = arr[index];
        }
        return length - 1;
    }



}


