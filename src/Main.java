import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Student sinhVien = new Student("linh",10,2.0);
//        Student sinhVien2 = new Student("c02",  10);
//        System.out.println(sinhVien2.name); // truy xuất thuộc tính đối tượng
//        sinhVien2.goToSchool(); // truy xuất phương thức
//        System.out.println(sinhVien2.score); // truy xuất gia giá trị mặc định 0.0

//        Student student = null;
//        System.out.println(student.name); // lỗi: cố gắng truy cập vào đối tượng null

        // Tạo 1 lớp product có name, price, quantily và phương thức getName()
        // tạo 2 đối tượng product

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the width: ");
//        double width = scanner.nextDouble();
//        System.out.println("Enter the height: ");
//        double height = scanner.nextDouble();
//        Rectangle rectangle = new Rectangle(width, height);
//        System.out.println("Your Rectange \n" + rectangle.display());
//        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
//        System.out.println("Area of the Rectangle: " + rectangle.getArea());

//        System.out.println("Nhap giá trị a: ");
//        double a = scanner.nextDouble();
//        System.out.println("Nhập giá trị b: ");
//        double b = scanner.nextDouble();
//        System.out.println("Nhập giá trị c: ");
//        double c = scanner.nextDouble();
//
//        QuadraticEquation equation = new QuadraticEquation(a, b, c);
//        double discriminant = equation.getDiscriminant();
//        if (discriminant > 0){
//            double root1 = equation.getRoot1();
//            double root2 = equation.getRoot2();
//            System.out.println("Nghiệm thứ nhất: " + root1);
//            System.out.println("Nghiệm thứ hai: " + root2);
//        } else if (discriminant == 0){
//            double root = equation.getRoot1();
//            System.out.println("Nghiệm kép: " + root);
//        } else {
//            System.out.println("Phương trình vô nghiệm");
//        }

//        int[] array = generateRandomArray(1000000);
//        StopWatch stopwatch = new StopWatch();
//        selctionSort(array);
//        stopwatch.stop();
//        System.out.println("Thời gian thực thi của thuật toán sắp xếp chọn: " + stopwatch.getElapsedTime() + " milliseconds.");
//    }
//    public static int[] generateRandomArray(int size){
//        Random random = new Random();
//        int[] array = new int[size];
//        for (int i = 0; i < size; i++) {
//            array[i] = random.nextInt();
//        }
//        return array;
//    }
//    public static void selctionSort(int[] array){
//        int n = array.length;
//        for (int i = 0; i < n -1; i++) {
//            int minIndex = i;
//            for (int j = i + 1; j < n; j++) {
//                if (array[i] < array[minIndex]){
//                    minIndex = j ;
//                }
//            }
//            int temp = array[minIndex];
//            array[minIndex] = array[i];
//            array[i] = temp;
//        }

        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());

    }
}