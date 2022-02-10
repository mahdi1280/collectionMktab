import java.util.ArrayList;
import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        ArrayList<Integer> number=new ArrayList<>();
        int n=getNumber();
        do{
            number.add(n);
            n=getNumber();
        }while (n!=-1);
        if(number.size()%2==1)
            number.remove(number.size()-1);
        for(int i=0;i<number.size();i+=2){
            if(number.get(i)> number.get(i+1)){
                number.remove(i);
                number.remove(i+1);
            }
        }
        print(number);
    }

    private static void print(ArrayList<Integer> number) {
        System.out.println("---------------------");
        for (int n:
             number) {
            System.out.println(n);
        }
        System.out.println("------------------------------");
    }

    public static int getNumber(){
        Scanner scanner=new Scanner(System.in);
        while(true){
            try {
                return scanner.nextInt();
            }catch (Exception e){
                System.out.println("please enter number valid.");
                scanner.nextLine();
            }
        }
    }
}
