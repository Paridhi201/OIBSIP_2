import java.lang.Math;  
import java.util.*; 
public class numberGuessing {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome!Let us play a number guessing game.");
    System.out.println();
    System.out.println("Rules are simple! We have a hidden number in between 0 t0 20.");
    System.out.println();
    System.out.println("You have to guess the number.");
    System.out.println();
   Random ran = new Random();
   int max=20;
   int min = 1;
   int count =0;
   int a = ran.nextInt(20);

   System.out.println("You get five chances to guess the number. So,let us begin.");
   System.out.println();
    for(int i = 1;i<=5;i++){
        System.out.println("Enter the number between 0 to 20.");
       int num = sc.nextInt();
    if(a==num){
        System.out.println("Yes!You have guessed it right!");
        count++;
        break;
    }
    else{
        if(a>num){
        System.out.println("Uh-oh! The number you guessed is smaller.");
    }
    else{
        System.out.println("Uh-oh! The number you guessed is greater.");
    }
}
    }
    System.out.println("Number was:"+a);
    System.out.println("Your score is:"+count);
}
}
