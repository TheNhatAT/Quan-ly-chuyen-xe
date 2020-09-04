import java.io.*;
import java.util.*;

public class MainTest {
    public static void main(String [] args){
        Manager manager = new Manager();
        int chose;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi chon chuc nang: \n 1.Nhap gia dich vang \n 2.Nhap giao dich tien te \n "
        + "3.Xuat danh sach giao dich \n 4.Xuat tong so giao dich \n 5.Xuat trung binh so tien duoc giao dich \n " +
                "6.Xuat giao dich co don gia tren 1000" + "\n 7.Exit");
        while (true) {
            System.out.println("Moi chon chuc nang:");
            try {
                chose = Integer.parseInt(sc.nextLine()); //cast String to Integer
            switch (chose){
                case 1:
                    manager.addGoldIntoList();
                    break;
                case 2:
                    manager.addMoneyIntoList();
                    break;
                case 3:
                    manager.output();
                    break;
                case 4:
                    System.out.println(" Chon 1 neu xuat tong giao dich vang \n Chon 2 neu xuat tong giao dich tien te");
                    int check = Integer.parseInt(sc.nextLine());
                    if(check == 1){
                        System.out.println("Tong so giao dich Vang la " +manager.getSumDealGold());
                    }
                    else if (check == 2) {
                        System.out.println(" Chon 1 neu USD \n Chon 2 neu Euro \n Chon 3 neu la Viet Nam");
                        int check_1 = Integer.parseInt(sc.nextLine());
                        if(check_1 == 1) {
                            System.out.println("Tong so giao dich USD la "+ manager.getSumDealUSD());
                        }
                        else if(check_1 == 2) {
                            System.out.println("Tong so giao dich Euro la "+ manager.getSumDealEuro());
                        }
                        else if(check_1 == 3){
                            System.out.println("Tong so giao dich Viet Nam la "+ manager.getSumDealVietNam());
                        }
                        else {
                            System.out.println("Ban nhap sai chuc nang!!!");
                        }
                    }
                    else {
                        System.out.println("Ban nhap sai chuc nang!!!");
                }
                    break;
                case 5:
                    System.out.println("Trung binh so tien giao dich duoc la " + manager.averageOfMoney());
                    break;
                case 6:
                    manager.printUnitPriceMoreBilion();
                    break;
                case 7:
                    flag = false;
                    break;
                default:
                    System.out.println("Ban nhap sai chuc nang!!! Moi ban chon lai");
                    break;
            }
            if (!flag){
                break;
            }
            }
            catch (InputMismatchException e){
                System.out.println("Ban nhap sai chuc nang!!! Moi ban chon lai");
            }
            catch (NumberFormatException e){
                System.out.println("Ban nhap sai chuc nang!!! Moi ban chon lai");
            }
        }
      /**  try {
            FileOutputStream fileStream = new FileOutputStream("giaodich.dat");
            ObjectOutputStream os = new ObjectOutputStream(fileStream);
            os.writeObject(manager);
            os.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }*/
    }
}
