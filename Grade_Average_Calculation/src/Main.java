import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //initialize variable
        float math, physics, chemistry, turkish, history, music;
        float total_num_of_lesson = 6;
        float total = 0;
        float result = 0;
        Scanner scanner = new Scanner(System.in);

        // warning text
        System.out.println("\n\t\tPlease enter positive numbers between 0 and 100 !!\n");
        // get values from user
        System.out.println("math: ");
        math = scanner.nextFloat();

        System.out.println("physics: ");
        physics = scanner.nextFloat();

        System.out.println("chemistry: ");
        chemistry = scanner.nextFloat();

        System.out.println("turkish: ");
        turkish = scanner.nextFloat();

        System.out.println("history: ");
        history = scanner.nextFloat();

        System.out.println("music: ");
        music = scanner.nextFloat();

        total = math + physics + chemistry + turkish + history + music;
        result = total / total_num_of_lesson;

        System.out.println("Student's grade point average is : " + result);

        boolean les_pass = result >= 60;
        String query  = les_pass ? "Student passed the class..": "Student Failed !!";
        System.out.println("Result is : "+query);
    }
}

