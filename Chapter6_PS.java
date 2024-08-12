public class Chapter6_PS {
    public static void main(String[] args) {

    // Practice Problem 1 --> Create an array of 5 floats and calculate their sum.
    
    /*float[] marks = {1.2f,5.8f,6.2f,3.8f,7.6f};
    float sum = 0;
    
    for (float f : marks) {
        sum = sum + f;
        
    }System.out.println("The value of sum is = " + sum);*/

    // Practice Problem 2 --> To check if The value is present in array or not.

    /*float[] marks = {1.2f,5.8f,6.2f,3.8f,7.6f};
    boolean IsInArray = false;
    float num = 5.8f;

    for (float element : marks) {

        if (num==element) {
            IsInArray = true;
            break;
           
        }
    }if (IsInArray) {
        System.out.println("The value is present in array");
       
   }
    else { System.out.println("The value is not present in array");
       
   }*/


//     Practice Problem 3 --> Calculate the average marks of students.
       
       /*int[] marks ={100,100,50,50,98,52};
       int sum = 0;
       for (int i : marks) {

        sum = sum + i;
        
        
       }
       System.out.println(sum/marks.length);*/

    //     Practice Problem 4 --> Add 2 matrices.

    int[][] matrices1 = {{1,2,3},
                         {4,5,6}};

    int[][] matrices2 = {{1,2,3},
                         {4,5,6}};

    int[][] result =    {{0,0,0},
                         {0,0,0}}; 
                         
    for(int i=0; i<matrices1.length; i++){
        for(int j=0; j<matrices1[i].length; j++){
            result[i][j] = matrices1[i][j]+matrices2[i][j];
            System.out.print(result[i][j]+ " ");
           
        }System.out.println();
    }                  


}
    
}
