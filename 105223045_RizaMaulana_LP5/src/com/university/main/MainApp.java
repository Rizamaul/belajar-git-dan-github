package com.university.main;

import com.university.model.Student;

public class MainApp {
    public static void main(String[] args) {
        // Membuat array dari objek Student
        Student[] students = new Student[5];

        // Mengisi array dengan data dummy
        students[0] = new Student("S001", "Alice", 20, 3.8);
        students[1] = new Student("S002", "Bob", 22, 3.6);
        students[2] = new Student("S003", "Charlie", 21, 3.9);

        // Menampilkan data semua mahasiswa
        System.out.println("=== Data Mahasiswa ===");
        for (Student student : students) {
            student.displayInfo();
        }
    }
}
