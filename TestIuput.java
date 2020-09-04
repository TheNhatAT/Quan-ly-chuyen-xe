import java.io.*;

public class TestIuput {
    public static void main(String [] args){
        try {
            FileInputStream fileInputStream = new FileInputStream("giaodich.dat");
            ObjectInputStream os = new ObjectInputStream(fileInputStream);

            Object o1 = os.readObject();
            Manager manager = (Manager) o1;
            os.close();
            manager.output();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        finally {
            //empty
        }
    }
}
