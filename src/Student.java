public class Student {
    String name; // Khai bao cacs thuoc tinh cua cac doi tuong student
    int age;
    double score;
    // Các biến thuộc tính thì có giá trị mặc định tương ứng với kiểu dữ liệu
    // Clint: 0, double: 0.0, String: null, ...
     Student(String name, int age, double score) { // contructor: phương thức khởi tạo trùng với class
         this.name = name; // Gan giá trị cho thuộc tisnh
         this.age = age;
         this.score = score;
     }
     Student(String name, int age){ // có thể có nhiều contructor
         this.name = name;
         this.age = age;
     }

     void goToSchool(){ // Khởi tao phương thuc
         System.out.println("Student is going");
     }
}
