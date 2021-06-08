public class basics {
    public static void main(String[] args){
        //Print 1-255
        for (int i=1; i<256; i++){
            System.out.print(i + ", ");
        }
        //Print Odds 1-255
        for (int i=1; i<256; i++){
            if (i % 2 != 0)
            System.out.print(i + ", ");
        } 
        //Print Sum
        int i   = 1;
        int sum = 0;
        while (i < 101) {
            sum += i;
            i++;
            System.out.println("New Number:" + i);
            System.out.println("Sum:" + sum);
        }
        //Iterating through an array
        int [] array1 = new int [] {1, 3, 5, 7, 9, 13};     
        for (int j = 0; j < array1.length; j++) {  
            System.out.print(array1[j] + " ");
        }
        //Find Max
        int [] arr = new int [] {33, 58, 99, 8, 22};
        int max = arr[0];
        for (int k = 0; k < arr.length; k++) {
            if(arr[k] > max)  
            max = arr[k];  
        }  
        System.out.println(max);
        //Get Average
        double[] array2 = {54, -50, 22.7, 300, -100};
        double total = 0;
        for(int l=0; l<arr.length; l++){
            total = total + array2[l];
        }
        double average = total / arr.length;
        //Formats the answer to only 1 place after decimal
        System.out.format("The average of this array is: %.1f", average);
        //






    }

}