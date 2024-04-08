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
        System.out.println("Enter the width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter the height: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectange \n" + rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
    }
}