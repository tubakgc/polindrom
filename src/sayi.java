import java.util.Scanner;
public class sayi {

    static boolean isPolindrom (int number){
        int temp=number,reverseNumber=0, lastNumber;
        while (temp!=0){
            lastNumber = temp % 10;
            reverseNumber= (reverseNumber*10) + lastNumber;
            temp/=10;

        }
        if (number==reverseNumber)
             return true ;
        else
            return true;

    }

    public static void main(String[] args) {
        System.out.println(isPolindrom(101));
    }
}



