import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        int a;
        Scanner s = new Scanner(System.in);
        System.out.print();
        a= s.nextInt();
        if(a> 0)
        {
            System.out.println(" Positive");
        }
        else if(a < 0)
        {
            System.out.println(" Negative");
        }
        else
        {
            System.out.println("");
        }
    }
}
