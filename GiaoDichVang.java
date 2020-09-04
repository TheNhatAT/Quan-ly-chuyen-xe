import java.util.NoSuchElementException;
import java.io.Serializable;
public class GiaoDichVang extends GiaoDich implements Serializable{
    private String sortOfGold;

    protected GiaoDichVang(){
        super();
        this.sortOfGold = "NULL";
    }
    protected GiaoDichVang(String tradingCode, String tradingTime, double unitPrice, int number, String sortOfGold){
        super(tradingCode,tradingTime,unitPrice,number);
        this.sortOfGold = sortOfGold;
    }

    protected void setSortOfGold(){
        try{
            System.out.println("Nhap vao loai vang: ");
            this.sortOfGold = sc.nextLine();
            //sc.nextLine();
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }
        catch (IllegalStateException e){
            e.printStackTrace();
        }
    }
    protected String getSortOfGold() {
        return sortOfGold;
    }

    @Override
    public String toString() {
        return super.toString() + " sortOfGold = " + sortOfGold;
    }
    @Override
    protected double caculateMoney() {
        return super.caculateMoney();
    }
}
