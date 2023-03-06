public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
     public static void main(String[] args){

     }
    public int max(int[] arr){
       int max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=0 && arr[i]>max){
                
             max = arr[i];
            }
            else if(arr[i]<=0 && arr[i]>max){
                //if(arr[i]<max){
             max = arr[i];
            }
            else{

            }  
         
        }
        return max;
    }
}
