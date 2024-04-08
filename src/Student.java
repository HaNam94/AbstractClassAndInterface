public class Student {
    String name; // Khai bao cacs thuoc tinh cua cac doi tuong student
    int age;
    double scores;
    // Các biến thuộc tính thì có giá trị mặc định tương ứng với kiểu dữ liệu
    // Clint: 0, double: 0.0, String: null, ...
     Student(String name, int age, double scores) { // contructor: phương thức khởi tạo trùng với class
         this.name = name; // Gan giá trị cho thuộc tisnh
         this.age = age;
         this.scores = scores;
     }
//     Student(String name, int age){ // có thể có nhiều contructor
//         this.name = name;
//         this.age = age;
//     }
    public void setName(String name){
         this.name = name;
    }
    public void setAge(int age){
         this.age = age;
    }
    public void setScores(double scores){
         this.scores = scores;
    }
     public String getName(){
         return name;
     }
     public int getAge(){
         return age;
     }
     public double getScores(){
         return scores;
     }
     public double calculateAverageScore(){
         double total = 0;
         for (int socre : scores){
             total += score;
         }
         return total/ scores.length;
     }
     public void displayInfo(){
         System.out.println("Name: " + name);
         System.out.println("Age: " + age);
         System.out.println("Scores: " + scores);
         for (int score : scores){
             System.out.println(score + " ");
         }
         System.out.println();
         System.out.println("Average Score: " + calculateAverageScore());
     }

     void goToSchool(){ // Khởi tao phương thuc
         System.out.println("Student is going");
     }
}
