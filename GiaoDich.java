import java.util.*;
import java.io.*;

public abstract class GiaoDich implements Serializable{
    protected String tradingCode;
    protected String tradingTime;
    protected double unitPrice;
    protected int number;
    public static Scanner sc = new Scanner(System.in);

    protected GiaoDich(){
        //set the default value for variables
        this.tradingCode = "NULL";
        this.tradingTime = "NULL";
        this.unitPrice = 0;
        this.number = 0;
    }
    protected GiaoDich(String tradingCode, String tradingTime, double unitPrice, int number){
        this.tradingCode = tradingCode;
        this.tradingTime = tradingTime;
        this.number = number;
        this.unitPrice = unitPrice;
    }

    protected void setTradingCode () {
        try {
            System.out.println("Nhap vao ma giao dich");
            this.tradingCode = sc.nextLine();
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }
        catch (IllegalStateException e){
            e.printStackTrace();
        }
    }
    protected void setTradingTime (){
        try {
            System.out.println("Nhap vao thoi gian thuc hien giao dich");
            this.tradingTime = sc.nextLine();
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }
        catch (IllegalStateException e){
            e.printStackTrace();
        }
    }
    protected void setUnitPrice () throws InputMismatchException{
        try {
            System.out.println("Nhap vao don gia: ");
            this.unitPrice = Double.parseDouble(sc.nextLine());
            if(this.unitPrice < 0){
                throw new InputMismatchException();
            }
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }
        catch (IllegalStateException e){
            e.printStackTrace();
        }
    }
    protected void setNumber () throws InputMismatchException{
        try {
            System.out.println("Nhap vao so luong don hang: ");
            this.number = Integer.parseInt(sc.nextLine());
            if(this.number < 0){
                throw new InputMismatchException();
            }
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }
        catch (IllegalStateException e){
            e.printStackTrace();
        }
    }

    protected String getTradingCode () {
        return tradingCode;
    }
    protected String getTradingTime () {
        return tradingTime;
    }
    protected int getNumber () {
        return number;
    }
    protected double getUnitPrice () {
        return unitPrice;
    }

    @Override
    public String toString() {
        return "tradingCode = " + tradingCode +
                ", tradingTime = " + tradingTime +
                ", unitPrice = " + unitPrice +
                ", number = " + number;
    }

    protected double caculateMoney(){
        double money = this.number * this.unitPrice;
        return  money;
    }

}
