import java.time.DayOfWeek;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount of balance you have in your Debit Card");
        int amount=sc.nextInt();
        int amt=0;
        String ans = "";
        int swipeAmt = amountLeftAfterPlaying(ans,amount,amt,sc);
        System.out.println(swipeAmt);
}
    public static int amountLeftAfterPlaying(String ans, int amount, int amt, Scanner sc){
        int n;
        System.out.println("Do you want to play the game (Yes/yes)");
        ans = sc.next();
        if(ans.equals("Yes") || ans.equals("yes")){
            System.out.println("There are 10 Games- G1,G2,G3,G4,G5,G6,G7,G8,G9,G10");
            System.out.println("If it is a Weekday Rs.10/Game else Rs.20/Game");
            System.out.println("Enter the amount you want to add for the gaming card");
            amt=sc.nextInt();
            if(amt>=10)
            amount = amount-amt;
        } 
        if(amt<10){
           System.out.println("Minimum amount should be 10");
           System.out.println("Do you want to add the amount greater than 10 (Yes/yes)");
           ans = sc.next();
           if(ans.equals("Yes") || ans.equals("yes")){
               System.out.println("Enter the amount you want to add for the Gaming Card");
               amt=sc.nextInt();
               amount = amount-amt;
            }
        }
        while(amt>=10 && (ans.equals("Yes") || ans.equals("yes")) ){
            System.out.println("Enter the number of games you want to play");
            n=sc.nextInt();
            Date today = Calendar.getInstance().getTime();
            String day = today.toString();
            String days=day.substring(0,3);
            if(days.equals("Sat") || days.equals("Sun"))
            amt-=(20*n);
            else
            amt-=(10*n);
            if(amt>0){
            System.out.println("Do you want to play the game (Yes/yes) or Swipe-out");
            ans=sc.next();
          }
            else if(amt <= 0){
            System.out.println("You cannot Swipe-out");
            System.out.println("You have to add amount to your card, minimum amount should be 1.");
            System.out.println("Enter amount to be added in Gaming Card");
            int x=sc.nextInt();
            amount-=x;
            amt+=x;
          }
        }
       return amt;
    }
   
}
