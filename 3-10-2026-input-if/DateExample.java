import java.time.LocalDateTime ;

import java.util.Scanner;

public class DateExample {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        LocalDateTime now =LocalDateTime.now() ;
        System.out.println("Now:  "+ now);
       

        System.out.print("Enter Your Name  ");
        String name = sc.nextLine ();

        System.out.print("Enter Your gender(M>/F)  ");
        String gender = sc.nextLine();

        System.out.print("Enter Your Year(ค.ศ.)  ");
        int birth = sc.nextInt();

        int year = now.getYear();
        int age = year - birth;
        
       
        if(age >= 18){
            if(gender.equalsIgnoreCase("M")){
            System.out.println("You can vote and serve nation");
        }
        else {
        System.out.println("You can vote");
        }
    }   else{
            System.out.println("You can not vote");
    }
}}

