/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CD;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Program {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyCD ql = new QuanLyCD();
        int luaChon;
            do {
                System.out.println("1. Xuat Toan Bo CD");
                System.out.println("2. CD phat hanh truoc 2020");
                System.out.println("3. Tim CD chua 'tinh'");
                System.out.println("4. Sap xep CD theo gia giam dan");
                System.out.println("5. Xoa CD theo ma so");
                System.out.println("6. Sua gia ban cua CD theo ma so");
                System.out.println("7. Thoat");
                System.out.print("Chon chuc nang: ");
                luaChon = sc.nextInt();
                sc.nextLine();
                switch (luaChon) {
                    case 1:
                        ql.xuatToanBoCD();
                        break;
                    case 2:
                        ql.layCDTruocNam2020();
                        break;
                    case 3:
                        ql.timCD();
                        break;
                    case 4:
                        ql.SapXep();
                        break;
                    case 5:
                        System.out.println("Nhap ma CD can xoa");
                        String maso = sc.nextLine();
                        ql.Xoa(maso);
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ.");
                }
            } while (luaChon != 7);
        }
    }
