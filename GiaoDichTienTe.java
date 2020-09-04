import java.util.*;

public abstract class GiaoDichTienTe extends GiaoDich{
    private double exchangeRate;

    protected GiaoDichTienTe(){
        super();
        this.exchangeRate = 0;
    }
    protected GiaoDichTienTe(String tradingCode, String tradingTime, double unitPrice, int number) {
        super(tradingCode, tradingTime, unitPrice, number);
        this.exchangeRate = 0;
    }
    protected GiaoDichTienTe(String tradingCode, String tradingTime, double unitPrice, int number, double exchangeRate) {
        super(tradingCode, tradingTime, unitPrice, number);
        this.exchangeRate = exchangeRate;
    }

    protected void setExchangeRate() throws InputMismatchException{
        try{
            System.out.println("Nhap vao ty gia hoi doai: ");
            //this.exchangeRate = Double.parseDouble(sc.nextLine());
            this.exchangeRate = sc.nextDouble();
            if(this.exchangeRate < 0) {
                throw new InputMismatchException();
            }
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }
        catch (IllegalStateException e){
            e.printStackTrace();
        }
        finally {
            sc.nextLine();
        }
    }
    protected double getExchangeRate(){
        return this.exchangeRate;
    }

    @Override
    public String toString() {
        return super.toString() + " ty gia = " + this.exchangeRate;
    }

    @Override
    protected double caculateMoney() {
        if(this.exchangeRate == 0) {
            return super.caculateMoney();
        }
        else {
            return super.caculateMoney() * exchangeRate;
        }
    }
}
