import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in=new Scanner(System.in);
        int x;
        x=in.nextInt();
        if(x<=40)
            System.out.printf("%d",x*100);
        if(x>40)
            System.out.printf("%d",4000+(x-40)*120);
    }
}
