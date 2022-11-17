import  java.util.Scanner;
public class Main {
    static void minus(int number, int i){
        int result1 = number;
        System.out.print(number+" ");

        if(result1>0) {
            result1 -=5;
            minus(number - 5,i);
        }else {
            plus(result1, i);
        }
    }
    static void plus(int number, int i){
        int result2 = number+5;

        if(result2<= i){
            System.out.print(""+result2);
            plus(number+5,i);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısını  : ");
        int number = input.nextInt();
        int i = number;
        System.out.print("Çıktısı: ");
        minus(number,i);


    }
}