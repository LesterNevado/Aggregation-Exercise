import java.io.FileNotFoundException;

public class COMReport {

    public COMReport() throws FileNotFoundException{
        BlockSectionDA blockSectionDA = new BlockSectionDA();
    }
    public static void main(String[] args) throws FileNotFoundException{
        new COMReport();
        //System.out.println(blockSectionDA.blockSection);
    }

}