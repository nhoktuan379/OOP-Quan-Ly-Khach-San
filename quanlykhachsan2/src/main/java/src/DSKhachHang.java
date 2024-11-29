package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

class DSKhachHang implements GiaoDien{
   int n;
   KhachHang []dsKhachhang;
   public DSKhachHang() {
    n=0;
    dsKhachhang = new KhachHang[0];
   }
   @Override
   public void nhap() {
    //nhập n từ bàn phím ……, nhập n dsKhachhang như sau
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số lượng khách hàng: ");
        n=sc.nextInt();
        dsKhachhang = new KhachHang[n];
        for (int i=0;i<n;i++) {
                dsKhachhang[i]=new KhachHang();
                dsKhachhang[i].nhapThongtin();
        }
    }
    @Override
    public void xuat() {
        for (int i=0;i<n;i++) {
        dsKhachhang[i].inThongtin();
        }
    }   
    @Override
    public void them(){
        dsKhachhang = Arrays.copyOf(dsKhachhang, n+1);
        dsKhachhang[n]=new KhachHang();
        dsKhachhang[n].nhapThongtin();
        n++;
    }
    @Override
    public void xoa (int ma) {
        for(int i = 0; i < n; i++)
        {
            if(dsKhachhang[i].getMa()==ma)
            {
                for(int j = i; j < n-1; j++){
                dsKhachhang[j] = dsKhachhang[j+1];
                }
                dsKhachhang = Arrays.copyOf(dsKhachhang, n-1);
                n--;
                break;
            }
        }
    }
    @Override
    public void timkiem (int ma){
        for(int i = 0; i < n; i++)
        {
            if(dsKhachhang[i].getMa()==ma)
            {
                System.out.println("Phòng bạn tìm kiếm có trong danh sách");
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
                dsKhachhang=new KhachHang[n];
                for (int i = 0; i<n; i++)
                {
                    int temp=Integer.parseInt(arr[i]);
                    dsKhachhang[i].setMa(temp);
                    j++;
                    dsKhachhang[i].setTen(arr[i]);
                    j++;
                    dsKhachhang[i].setDiachi(arr[i]);
                    j++;
                    temp=Integer.parseInt(arr[i]);
                    dsKhachhang[i].setSdt(temp);
                    j++;
                    dsKhachhang[i].setEmail(arr[i]);
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
            for (int i = 0; i < dsKhachhang.length; i++)
            {
                fw.write ("Thông tin của khách hàng "+i+"\n");
                fw.write ("Tên khách hàng:"+dsKhachhang[i].getTen()+"\n");
                fw.write ("Mã khách hàng:"+dsKhachhang[i].getMa()+"\n");
                fw.write ("Địa chỉ:"+dsKhachhang[i].getDiachi()+"\n");
                fw.write ("Số điện thoại:"+dsKhachhang[i].getSdt()+"\n");
                fw.write ("Email:"+dsKhachhang[i].getEmail()+"\n");
            }
            fw.close();
        } catch (Exception e) 
        {
        System.out.println(e);
        }
        
    }
   
}
