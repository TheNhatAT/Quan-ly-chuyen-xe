import java.io.Serializable;
import java.util.ArrayList;
import java.util.*;
public class Manager implements Serializable{
    private ArrayList<GiaoDich> deallist = new ArrayList<>();
    private int[] sumNumberList = new int[4];
    private double averageMoney = 0;
    private static final Scanner sc = new Scanner(System.in);

    public Manager() {
        for(int i = 0; i < 4; i++){
            sumNumberList[i] = 0;
        }
    }
    public void addGoldIntoList() {
        GiaoDichVang gold = new GiaoDichVang();
        gold.setSortOfGold();
        gold.setTradingCode();
        gold.setTradingTime();
        gold.setUnitPrice();
        gold.setNumber();
        deallist.add(gold);
        sumNumberList[0]++;
    }
    public void addMoneyIntoList() {
        System.out.println(" Nhap 1 neu la Viet Nam Dong \n Nhap 2 neu la USD \n Nhap 3 neu la Euro");
        int x = sc.nextInt();
        boolean flag = true;
        while (true) {
            switch (x) {
                case 1:
                    VietNam vietNam = new VietNam();
                    try {
                        vietNam.setTradingCode();
                        vietNam.setTradingTime();
                        vietNam.setUnitPrice();
                        vietNam.setNumber();
                        deallist.add(vietNam);
                        sumNumberList[1]++;
                    }
                    catch (InputMismatchException e){
                        System.out.println("ERROR");
                    }
                    finally {
                        break;
                    }
                case 2:
                        USD usd = new USD();
                        try{
                        usd.setTradingCode();
                        usd.setTradingTime();
                        usd.setUnitPrice();
                        usd.setNumber();
                        usd.setExchangeRate();
                        deallist.add(usd);
                        sumNumberList[2]++;
                    }
                    catch (InputMismatchException e){
                        System.out.println("ERROR");
                    }
                    finally {
                        break;
                    }
                case 3:
                    Euro euro = new Euro();
                    try {
                        euro.setTradingCode();
                        euro.setTradingTime();
                        euro.setUnitPrice();
                        euro.setNumber();
                        euro.setExchangeRate();
                        deallist.add(euro);
                        sumNumberList[3]++;
                    }
                    catch (InputMismatchException e){
                        System.out.println("ERROR");
                    }
                    finally {
                        break;
                    }
                default:
                    System.out.println("Ban da nhap sai, moi ban nhap lai");
                    flag = false;
                    break;
            }
            if (flag){
                break;
            }
        }
    }

    public void output(){
        for (GiaoDich x: deallist) {
            if(x instanceof GiaoDichVang){
                GiaoDichVang copy = (GiaoDichVang)x;
                System.out.println(copy.toString());
            }
            if (x instanceof VietNam){
                VietNam copy = (VietNam)x;
                System.out.println(copy.toString());
            }
            if (x instanceof USD){
                USD copy = (USD) x;
                System.out.println(copy.toString());
            }
            if (x instanceof Euro){
                Euro copy = (Euro) x;
                System.out.println(copy.toString());
            }
        }
    }
    public int getSumDealGold(){
        return sumNumberList[0];
    }
    public int getSumDealVietNam(){
        return sumNumberList[1];
    }
    public int getSumDealUSD(){
        return sumNumberList[2];
    }
    public int getSumDealEuro(){
        return sumNumberList[3];
    }

    public double averageOfMoney(){
        double sum = 0;
        for (GiaoDich x: deallist) {
            if(x instanceof GiaoDichTienTe){
                sum += x.caculateMoney();
            }
        }
        return averageMoney = sum / (getSumDealEuro() + getSumDealUSD() + getSumDealVietNam());
    }
    public void printUnitPriceMoreBilion(){
        boolean flag = false;
        for (GiaoDich y: deallist){
            if(y.getNumber() > 1000){
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Giao dich co don gia tren 1000 la: ");
            for (GiaoDich x : deallist) {
                if (x.getNumber() > 1000 && x instanceof GiaoDichVang) {
                    GiaoDichVang copy = (GiaoDichVang) x;
                    System.out.println(copy.toString());
                } else if (x.getNumber() > 1000 && x instanceof VietNam) {
                    VietNam copy = (VietNam) x;
                    System.out.println(copy.toString());
                } else if (x.getNumber() > 1000 && x instanceof USD) {
                    USD copy = (USD) x;
                    System.out.println(copy.toString());
                } else if (x.getNumber() > 1000 && x instanceof Euro) {
                    Euro copy = (Euro) x;
                    System.out.println(copy.toString());
                }
            }
        }
        else {
            System.out.println("Khong co giao dich nao co don gia tren 1000");
        }
    }
}
