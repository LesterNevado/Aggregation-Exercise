import java.util.*;
import java.io.*;
public class BlockSectionDA {
    public BlockSectionDA() throws FileNotFoundException{
        Scanner blockSectionInfo = new Scanner(new FileReader("blockSectionInfo.csv"));

        String rowBlockSection = new String();
        rowBlockSection = blockSectionInfo.nextLine();
        String[] rowBlockSectionSpecific = new String[3];
        rowBlockSectionSpecific = rowBlockSection.split(",");

        BlockSection blockSection = new BlockSection();
        blockSection.setBlockCode(rowBlockSectionSpecific[0].trim());
        blockSection.setDescription(rowBlockSectionSpecific[1].trim());
        blockSection.setAdviser(rowBlockSectionSpecific[2].trim());

        StudentDA studentDA = new StudentDA();
        blockSection.setStudentList(studentDA.getStudentList());

        System.out.println(blockSection);

        blockSectionInfo.close();
    }
}