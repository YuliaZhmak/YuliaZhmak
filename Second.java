import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a:");
        double a=input.nextDouble();
        System.out.println("Enter b:");
        double b=input.nextDouble();
        System.out.println("Enter c:");
        double c=input.nextDouble();
        double[] roots=compute(a,b,c);
        System.out.println("Number of roots:"+roots.length);
        for (double x: roots) {
            System.out.println(x);
        }

        //System.out.println(compute(a,b,c));
    }

    private static double[] compute(double a, double b,double c) {
        double d=b*b-4*a*c;
        if (d==0) {
            return new double[] { -b / (2 * a) };
        }
        else if (d>0) {
            return new double[] { (-b + Math.sqrt(d))/(2*a), (-b - Math.sqrt(d))/(2*a)};
        }
        else {
            return new double[] {};
        }
    }
}

