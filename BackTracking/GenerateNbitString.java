public class GenerateNbitString {

    public static void main(String args[]){

        int n = Integer.parseInt(args[0]);
        int [] arr = new int[n];
        generateString(arr,n);
    }

    static void generateString(int[]arr,int n){
   if(n==0){
       printArray(arr);
       return;
   }
   else {
       arr[n-1]=1;
       generateString(arr,n-1);
       arr[n-1]=0;
    generateString(arr,n-1);

   }
    }

    static void printArray(int[]arr){
        int len = arr.length;
        for (int i=0;i<len;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}