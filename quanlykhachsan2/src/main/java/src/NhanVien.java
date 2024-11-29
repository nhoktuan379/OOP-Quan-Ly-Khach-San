package src;

import java.util.Scanner;
class NhanVien extends ThucThe {
    private String gioiTinh;
    private int cmnd;
    private String ngaySinh;
    private int soDienThoai;
    private String diaChi;

    public NhanVien() {
        this.gioiTinh = "";
        this.cmnd = 0;
        this.ngaySinh = "";
        this.soDienThoai = 0;
        this.diaChi = "";
    }
    public String getGioitinh()
    {
        return this.gioiTinh;
    }
    public void setGioitinh(String gioiTinh)
    {
        this.gioiTinh = gioiTinh;
    }
    public int getCmnd()
    {
        return this.cmnd;
    }
    public void setCmnd(int cmnd)
    {
        this.cmnd = cmnd;
    }
    public String getNgaysinh()
    {
        return this.ngaySinh;
    }
    public void setNgaysinh(String ngaySinh)
    {
        this.ngaySinh = ngaySinh;
    }
    public int getSoDienThoai()
    {
        return this.soDienThoai;
    }
    public void setSoDienThoai(int soDienThoai)
    {
        this.soDienThoai = soDienThoai;
    }
    public String getDiaChi()
    {
        return this.diaChi;
    }
    public void setDiaChi(String diaChi)
    {
        this.diaChi = diaChi;
    }

    @Override
    public void nhapThongtin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên: ");
        this.maSo=sc.nextInt();
        System.out.println("Nhập tên nhân viên:");
        this.ten = sc.nextLine();
        System.out.println("Nhập giới tính:");
        this.gioiTinh = sc.nextLine();
        System.out.println("Nhập số CMND:");
        this.cmnd = sc.nextInt();
        System.out.println("Nhập ngày sinh:");
        this.ngaySinh=sc.nextLine();
        System.out.println("Nhập số điện thoại:");
        this.soDienThoai = sc.nextInt();
        System.out.println("Nhập địa chỉ:");
        this.diaChi = sc.nextLine();
    }
    @Override
    public void inThongtin()
    {
        System.out.println("Mã nhân viên: "+maSo);
        System.out.println("Tên nhân viên: "+ten);
        System.out.println("Giới tính nhân viên:"+gioiTinh);
        System.out.println("Số cmnd:"+cmnd);
        System.out.println("Số điện thoại:"+soDienThoai);
        System.out.println("Địa chỉ:"+diaChi);
    }
}

