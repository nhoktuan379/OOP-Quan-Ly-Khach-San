package src;

import java.util.Scanner;
public class KhachHang extends ThucThe{
    private String diachi;
    private int sdt;
    private String email;

    public KhachHang()
    {
        diachi="";
        sdt=0;
        email="";
    }
    public String getDiachi()
    {
        return diachi;
    }
    public void setDiachi(String diachi)
    {
        this.diachi = diachi;
    }
    public int getSdt()
    {
        return sdt;
    }
    public void setSdt(int sdt)
    {
        this.sdt = sdt;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    @Override
    public void nhapThongtin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten khach hang:");
        this.ten=sc.nextLine();
        System.out.println("Nhap ma khach hang:");
        this.maSo=sc.nextInt();
        System.out.println("Nhập số điện thoại:");
        this.sdt = sc.nextInt();
        System.out.println("Nhập địa chỉ:");
        this.diachi = sc.nextLine();
        System.out.println("Nhập email:");
        this.email = sc.nextLine();
    }
    @Override
    public void inThongtin()
    {
        System.out.println("Số điện thoại:"+sdt);
        System.out.println("Địa chỉ:"+diachi);
        System.out.println("Email khách hàng:"+email);
    }
}
