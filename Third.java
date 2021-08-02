import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Choose 1 for Pythagor, 2 for Geron, 3 for S:");
        int x=input.nextInt();
        if (x==1) {
            System.out.println("Enter a:");
            double a = input.nextDouble();
            System.out.println("Enter b:");
            double b = input.nextDouble();
            System.out.println("Pythagor:" + pythagor(a, b));
        }
        else if (x==2) {
            System.out.println("Enter a:");
            double a = input.nextDouble();
            System.out.println("Enter b:");
            double b = input.nextDouble();
            System.out.println("Enter c:");
            double c = input.nextDouble();
            System.out.println("Geron:" + geron(a, b, c));
        }
        else if (x==3) {
            System.out.println("Enter a:");
            double a = input.nextDouble();
            System.out.println("Enter b:");
            double b = input.nextDouble();
            System.out.println("Enter c:");
            double c = input.nextDouble();
            System.out.println("Sin:" + sin(a, b, c));
        }
    }

    private static double pythagor(double a, double b) {
        return (a*b)/2;
    }
    private static double geron(double a, double b,double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    private static double sin(double a, double b,double c){
        return (a*b*Math.sin(c))/2;
    }

}

