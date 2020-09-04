import java.util.NoSuchElementException;

public class USD extends  GiaoDichTienTe{
    private String nameOfMoney;

    public USD(){
        super();
        this.nameOfMoney = "USD";
    }
    protected USD(String tradingCode, String tradingTime, double unitPrice, int number) {
        super(tradingCode, tradingTime, unitPrice, number);
        this.nameOfMoney = "USD";
    }

    public String getNameOfMoney() {
        return nameOfMoney;
    }

    @Override
    public String toString() {
        return super.toString() + " loai tien = " + this.nameOfMoney;
    }
}
