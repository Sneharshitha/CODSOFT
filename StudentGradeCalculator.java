import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int ts; 
        System.out.println("Enter the total subject");
        ts=sc.nextInt();
        float num,total=0; 
        for(int i=1;i<=ts;i++) {
            System.out.println("Enter the marks obtained in 100 in subject "+i);
            num = sc.nextFloat();
            total+=num;
        }
        float totalMarks=ts*100;     
        System.out.println(totalMarks);
        float averagePercentage=(total*100)/totalMarks;
        System.out.println(averagePercentage);
        char grade;
        
        if(averagePercentage>=90)
        {
            grade='O';
        }
       else if(averagePercentage>=80){
            grade = 'A';
        }else if(averagePercentage>=60){
            grade = 'B';
        }
        else if(averagePercentage>=40){
            grade = 'C';
        }
        else {
            grade = 'D';
        }
        System.out.println("Yours total marks is "+total +" with average percentage of "+ averagePercentage+" % and you have got "+grade+" grade");



    }
}