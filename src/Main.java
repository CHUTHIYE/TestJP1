import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap muc luong co ban cho nhan vien toan thoi gian: ");
        double fullTimeBaseSalary = sc.nextDouble();
        EmployeeFullTime ef = new EmployeeFullTime(fullTimeBaseSalary);

        System.out.println("Nhap muc luong co ban cho nhan vien ban thoi gian: ");
        double partTimeBaseSalary = sc.nextDouble();
        EmployeePartTime ep = new EmployeePartTime(partTimeBaseSalary);

        System.out.println("Luong cho nhan vien toan thoi gian: " + ef.getSalary());
        System.out.println("Luong cho nhan vien ban thoi gian: " + ep.getSalary());
    }
}