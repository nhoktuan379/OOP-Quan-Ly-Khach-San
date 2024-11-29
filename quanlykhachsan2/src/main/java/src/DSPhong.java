package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;
public class DSPhong implements GiaoDien {
    static int n1;
    static Phong [] dsPhong;
    static boolean []phongdonTrong;
    static boolean []phongdoiTrong;
    public DSPhong() {
        this.n1 = 0;
        dsPhong = new Phong[0];
    }
    @Override
    public void nhap(){
        System.out.println("Nhap so phong:");
        Scanner sc=new Scanner(System.in);
        n1 = sc.nextInt();
        dsPhong=new Phong[n1];
        phongdonTrong=new boolean[n1];
        phongdoiTrong=new boolean[n1];
        int loaiphong;
        for(int i=0;i<n1;i++)
        {
            System.out.println("Chọn loại phòng:");
            loaiphong=sc.nextInt();
            switch(loaiphong)
            {
                case 1:
                    dsPhong[i]=new PhongDon();
                    break;
                case 2:
                    dsPhong[i]=new PhongDoi();
                    break;
                default:
                    System.out.println("Chọn không hợp lệ");
            }
            dsPhong[i].nhapThongtin();
        }
    }
    @Override
    public void xuat(){
        for(int i=0;i<n1;i++)
            dsPhong[i].inThongtin();
    }
    @Override
    public void them(){
        dsPhong=Arrays.copyOf(dsPhong,n1+1);
        System.out.println("Chọn loại phòng:");
        int loaiphong;
        Scanner sc=new Scanner(System.in);
        loaiphong=sc.nextInt();
        switch(loaiphong)
        {
            case 1:
                dsPhong[n1]=new PhongDon();
                break;
            case 2:
                dsPhong[n1]=new PhongDoi();
                break;
            default:
                System.out.println("Chọn không hợp lệ");
        }
        dsPhong[n1].inThongtin();
        n1++;
    }
    @Override
    public void xoa (int ma) {
        for (int i = 0; i < n1; i++) {
            if (dsPhong[i] != null && dsPhong[i].getMa() == ma) {
                // Dịch chuyển các phần tử sau phần tử cần xóa lên trước
                for (int j = i; j < n1 - 1; j++) {
                    dsPhong[j] = dsPhong[j + 1];
                }
                // Giảm kích thước mảng và giảm giá trị n
                dsPhong = Arrays.copyOf(dsPhong, n1 - 1);
                n1--;
                break;  // Thoát khỏi vòng lặp khi đã xóa xong
            }
        }  
    }
    @Override
    public void timkiem (int ma){
        for(int i = 0; i < n1; i++)
        {
            if(dsPhong[i].getMa()==ma)
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
                dsPhong=new Phong[n];
                for (int i = 0; i<n; i++)
                {
                    int temp=Integer.parseInt(arr[i]);
                    dsPhong[i].setMa(temp);
                    j++;
                    dsPhong[i].setTen(arr[i]);
                    j++;
                    temp=Integer.parseInt(arr[i]);
                    dsPhong[i].setGiaPhong(temp);;
                    j++;
                    boolean temp1=Boolean.parseBoolean(arr[i]);
                    dsPhong[i].settrangthaiPhong(temp1);
                    j++;
                    temp=Integer.parseInt(arr[i]);
                    dsPhong[i].setSoPhong(temp);
                    j++;
                    temp=Integer.parseInt(arr[i]);
                    dsPhong[i].setSoLuongLuongKhachToiDa(temp);
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
            for (int i = 0; i < dsPhong.length; i++)
            {
                fw.write ("Thông tin của phòng: "+i+"\n");
                fw.write ("Tên phong:"+dsPhong[i].getTen()+"\n");
                fw.write ("Mã phong:"+dsPhong[i].getMa()+"\n");
                fw.write ("Gia phong:"+dsPhong[i].getGiaPhong()+"\n");
                fw.write ("Trang thai phong:"+dsPhong[i].gettrangthaiPhong()+"\n");
                fw.write ("So phong:"+dsPhong[i].getsoPhong()+"\n");
                fw.write ("So luong khach toi da:"+dsPhong[i].getSoLuongKhachToiDa()+"\n");
            }
            fw.close();
        } catch (Exception e) 
        {
        System.out.println(e);
        }
        
    }

}

