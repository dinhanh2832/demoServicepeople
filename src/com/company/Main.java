package com.company;

import com.company.model.Student;
import com.company.service.StudentService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StudentService studentService = new StudentService();
        int choice = -1;
        Scanner input = new Scanner(System.in);

        while(choice != 0) {
            int checkEx = -2;
            System.out.println("Menu");
            System.out.println("1. Hiển thị tất cả học sinh ");
            System.out.println("2. Hiển thị học sinh có điểm Vly cao nhất");
            System.out.println("3. Thêm mới 1 học sinh ");
            System.out.println("4. Sửa học sinh theo tên: ");
            System.out.println("5. Tính điểm trung bình của lớp: ");
            System.out.println("0. Exit");
            System.out.println("Chọn menu: ");
            while (checkEx == -2){
                try {
                    choice =  input.nextInt();
                    checkEx = 1;
                } catch (Exception e){
                    System.out.println("Vui lòng nhập số");
                    input.nextLine();

                }
            }
            switch (choice) {
                case 1:
                    studentService.print();
                    break;
                case 2:
                    studentService.sortMaxToMin();
                    studentService.getIndex(0);
                    break;
                case 3:
                    int id = 0;
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Nhập vào id: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.println("Nhập tuổi: ");
                    int age = scanner.nextInt();
                    System.out.println("Nhập điểm toán: ");
                    int pointMath = scanner.nextInt();
                    System.out.println("Nhập điểm Lý: ");
                    int pointPhys = scanner.nextInt();
                    studentService.add(new Student(id,name,age,pointMath,pointPhys));
                    studentService.print();
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
