import java.util.Scanner;
public class Rotate
{
   public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    System.out.println("What string do you want to rotate:");
    String input = scn.nextLine();
    System.out.println("by how many times?");
    int rotate = scn.nextInt();
    int i = input.length();
    
    String NewString = "";
    
    NewString = NewString + input.substring(i- rotate);
    NewString = NewString + input.substring(0 , i - rotate);
    System.out.println(input + " rotated by "+ rotate + "is" + NewString);

    System.out.println(NewString);
}
}
