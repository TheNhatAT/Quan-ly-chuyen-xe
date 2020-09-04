public class VietNam extends GiaoDichTienTe{
    private String nameOfMoney;

    protected VietNam(){
        super();
        this.nameOfMoney = "VietNam";
    }
    protected VietNam(String tradingCode, String tradingTime, double unitPrice, int number) {
        super(tradingCode, tradingTime, unitPrice, number);
        this.nameOfMoney = "VietNam";
    }

    public String getNameOfMoney() {
        return nameOfMoney;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
