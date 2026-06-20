import java.util.Scanner;
public class App {
    public static double financialForecasting(double currentAmount,double growthRate,int year){
        if(year==0){
            return currentAmount;
        }
        return financialForecasting(currentAmount*growthRate, growthRate, year-1);
    }
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Amount:");
        double currentAmount=sc.nextDouble();
        System.out.println("Enter the GrowthRate: ");
        double growthRate=sc.nextDouble();
        System.out.println("Enter the no.of.years: ");
        int year=sc.nextInt();
        growthRate=1+growthRate/100;
        double result=financialForecasting(currentAmount, growthRate, year);
        System.out.printf("The amount after %d is : %.2f%n",year,result);
        sc.close();
    }
}
