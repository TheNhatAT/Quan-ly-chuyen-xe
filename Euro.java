import java.util.NoSuchElementException;

public class Euro extends GiaoDichTienTe{
    private String nameOfMoney;

    protected Euro(){
        super();
        this.nameOfMoney = "Euro";
    }
    protected Euro(String tradingCode, String tradingTime, double unitPrice, int number) {
        super(tradingCode, tradingTime, unitPrice, number);
        this.nameOfMoney = "Euro";
    }

    public String getNameOfMoney() {
        return nameOfMoney;
    }

    @Override
    public String toString() {
        return super.toString() + " loai tien = " + this.nameOfMoney;
    }
}
