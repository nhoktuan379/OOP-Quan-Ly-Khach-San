package src;

import java.util.Scanner;
public class QuanLyDSNhanVien {
    DSNhanVien ds1=new DSNhanVien();
    public void menu()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Xem danh sách nhân viên");
        System.out.println("2.Nhập danh sách nhân viên");
        System.out.println("3.Thêm mới nhân viên");
        System.out.println("4.Xóa nhân viên");
        System.out.println("5.Sửa nhân viên");
        System.out.println("6.Thoát");
        System.out.println("7.Thoát");
        System.out.println("Chọn chức năng: ");
        int chon=sc.nextInt();
        switch(chon)
        {
            case 1:
                ds1.xuat();
                break;
            case 2:
                ds1.nhap();
                break;
            case 3:
                ds1.them();
            case 4:
                System.out.println("Nhập mã của nhân viên muốn xóa");
                int ma=sc.nextInt();
                ds1.xoa(ma);
                break;
            case 5:
                ds1.nhap();
                break;
            case 6:
                System.out.println("Nhập mã của nhân viên muốn tìm kiếm");
                ma=sc.nextInt();
                ds1.timkiem(ma);
                break;
            case 7:
                break;
            default:
                System.out.println("Chọn chức năng không tồn tại");
                break;
        }
    }
}
