import java.util.*;

class StudentGradeCalculator {
    public static int check() {
        Scanner S = new Scanner(System.in);
        int k = S.nextInt();
        while (k < 0 || k > 100) {
            System.out.println("The mark must be greater than zero and less than hundred. Please re-enter the mark.");
            k = S.nextInt();
        }
        return k;
    }

    public static void main(String[] args) {
        System.out.println("Enter Tamil Mark");
        int m1 = check();
        System.out.println("Enter English Mark");
        int m2 = check();
        System.out.println("Enter Mathematics Mark");
        int m3 = check();
        System.out.println("Enter Physics Mark");
        int m4 = check();
        System.out.println("Enter Chemistry Mark");
        int m5 = check();
        System.out.println("Enter Biology Mark");
        int m6 = check();
        int total = m1 + m2 + m3 + m4 + m5 + m6;
        double avg = total / 6.0;

        System.out.println("Total Marks : " + total);
        System.out.println("Average : " + avg);
        int g = 6; 
        if (avg > 90.0) {
            g = 1;
        } else if (avg > 80.0) {
            g = 2;
        } else if (avg > 70.0) {
            g = 3;
        } else if (avg > 60.0) {
            g = 4;
        } else if (avg > 50.0) {
            g = 5;
        }
        System.out.print("Grade : " + g);
    }
}
