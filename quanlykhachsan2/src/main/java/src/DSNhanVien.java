package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class DSNhanVien implements GiaoDien {
    int n;
    NhanVien [] dsNhanVien;
    public DSNhanVien() {
        n = 0;
        dsNhanVien = new NhanVien[0];
    }
    @Override
    public void nhap() {
    //nhập n từ bàn phím ……, nhập n NhanVien như sau
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số lượng nhân viên: ");
        n=sc.nextInt();
        dsNhanVien = new NhanVien[n];
        for (int i=0;i<n;i++) {
            dsNhanVien[i]=new NhanVien();
            dsNhanVien[i].nhapThongtin();
        }
    }
    @Override
     public void xuat() {
        for (int i=0;i<n;i++) {
        dsNhanVien[i].inThongtin();
        }
    } 
    @Override  
    public void them(){
        dsNhanVien = Arrays.copyOf(dsNhanVien, n+1);
        dsNhanVien[n]=new NhanVien();
        dsNhanVien[n].nhapThongtin();
        n++;
    }
    @Override
    public void xoa (int ma) {
        for(int i = 0; i < n; i++)
        {
            if(dsNhanVien[i].getMa() == ma)
            {
                for(int j = i; j < n-1; j++){
                dsNhanVien[j] = dsNhanVien[j+1];
                }
                dsNhanVien = Arrays.copyOf(dsNhanVien, n-1);
                n--;
                break;
            }
        }
    }
    @Override
    public void timkiem (int ma){
        for(int i = 0; i < n; i++)
        {
            if(dsNhanVien[i].getMa()==ma)
            {
                System.out.println("Nhân viên bạn tìm kiếm có trong danh sách");
            }
        }
    }
    public void ReadFile()
    {
        try 
        {
            BufferedReader input = new BufferedReader(new FileReader("data.txt"));
            String line = input.readLine();

            while (line != null) 
            {
                // chia chuỗi thành các chuỗi con phân cách bởi khoảng trắng
                String[] arr = line.split(" ");
                int j=1;
                int n=Integer.parseInt(arr[0]);
                dsNhanVien=new NhanVien[n];
                for (int i = 0; i<n; i++)
                {
                    int temp=Integer.parseInt(arr[i]);
                    dsNhanVien[i].setMa(temp);
                    j++;
                    dsNhanVien[i].setTen(arr[i]);
                    j++;
                    dsNhanVien[i].setDiaChi(arr[i]);
                    j++;
                    temp=Integer.parseInt(arr[i]);
                    dsNhanVien[i].setGioitinh(arr[i]);
                    j++;
                    dsNhanVien[i].setNgaysinh(arr[i]);
                    j++;
                    temp=Integer.parseInt(arr[i]);
                    dsNhanVien[i].setSoDienThoai(temp);
                    j++;
                    temp=Integer.parseInt(arr[i]);
                    dsNhanVien[i].setCmnd(temp);
                    j++;
                }
                line = input.readLine();
            }
            input.close();
        } 
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public void WriteFile()
    {
        try {
            FileWriter fw = new FileWriter("data.txt");
            for (int i = 0; i < dsNhanVien.length; i++)
            {
                fw.write ("Thông tin của khách hàng "+i+"\n");
                fw.write ("Tên nhân vien:"+dsNhanVien[i].getTen()+"\n");
                fw.write ("Mã nhan vien:"+dsNhanVien[i].getMa()+"\n");
                fw.write ("Địa chỉ:"+dsNhanVien[i].getDiaChi()+"\n");
                fw.write ("Số điện thoại:"+dsNhanVien[i].getGioitinh()+"\n");
                fw.write ("Email:"+dsNhanVien[i].getNgaysinh()+"\n");
                fw.write ("CMND:"+dsNhanVien[i].getCmnd()+"\n");
            }
            fw.close();
        } catch (Exception e) 
        {
        System.out.println(e);
        }
        
    }

}
