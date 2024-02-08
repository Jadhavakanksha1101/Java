import java.util.*;
class Dailyflash1 {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a first number ");
        int num1=obj.nextInt();
        System.out.println("enter a second number");
        int num2 = obj.nextInt();
        if(num1>num2){
            System.out.println(num1+" "+"is greater than"+" "+num2);
        }
        else if(num2>num1){
            System.out.println(num2+" "+"is greater than"+" "+num1);
        }
    }
}
