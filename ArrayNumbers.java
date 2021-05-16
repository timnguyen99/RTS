import java.util.Scanner;
public class ArrayNumbers
{ 
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int above = 0;
        int below = 0;
        int equal = 0;
        System.out.println("What is the input number to be compared");
        int input = scn.nextInt();
        System.out.println("How many numbers do you want in your array?");
        int num = scn.nextInt();
        System.out.println("Enter array");
        int [] Array = new int[num];
          for (int i = 0 ; i < Array.length; i++ ) {
          Array[i] = scn.nextInt();
        }
        for (int i = 0; i < Array.length; i++){
            if (Array[i] > input){ 
                above += 1;
        }
            else if(Array [i] < input){
                below += 1;
        }    
        else {equal +=1;}
    }
    System.out.println("above:" + above + " below:" + below+ " equal:"+ equal);
}
    
 
   
  
}
