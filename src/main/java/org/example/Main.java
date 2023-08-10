package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();

        danhSachSinhVien.add(new SinhVien("Tuấn"));
        danhSachSinhVien.add(new SinhVien("Dũng"));
        danhSachSinhVien.add(new SinhVien("Kiên"));

        System.out.println("Danh sách sinh viên ban đầu:");
        printList(danhSachSinhVien);

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nNhập tên sinh viên cần xóa: ");
        String tenSinhVienCanXoa = scanner.nextLine();

        SinhVien sinhVienCanXoa = new SinhVien(tenSinhVienCanXoa);
        boolean isRemoved = danhSachSinhVien.remove(sinhVienCanXoa);

        if (isRemoved) {
            System.out.println("\nDanh sách sinh viên sau khi xóa " + tenSinhVienCanXoa + ":");
            printList(danhSachSinhVien);
        } else {
            System.out.println("\nSinh viên " + tenSinhVienCanXoa + " không tồn tại trong danh sách.");
        }

        scanner.close();
    }

    private static void printList(ArrayList<SinhVien> list) {
        for (SinhVien sinhVien : list) {
            System.out.println(sinhVien.getTen());
        }
    }
}
