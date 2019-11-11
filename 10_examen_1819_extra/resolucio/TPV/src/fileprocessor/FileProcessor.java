package fileprocessor;
 
import dummy.DummyClass;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
 
import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;
 
 
/**
 *
 * @author bernat
 */
public class FileProcessor {
    public static void main(String[] args) throws Exception {
 
        if(args.length<2) {
            System.out.println("Error: el programa necessita dos arguments");
            System.exit(-1);
        }
        File codeFile = new File(args[0]);
        if(!codeFile.exists()) {
            System.out.println("Error: l'arxiu d'entrada "+args[0]+" no s'ha trobat.");
            System.exit(-1);
        }
        File outputFolder = new File(args[1]);
        if(!outputFolder.exists() || !outputFolder.isDirectory()) {
            System.out.println("Error: La carpeta de sortida "+args[1]+" no s'ha trobat o no és una carpeta v?lida.");
            System.exit(-1);
        }        
                
        DummyClass dc = new DummyClass();
        FileReader in = new FileReader(codeFile);
        BufferedReader br = new BufferedReader(in);

        String line;
        int i=0;
        while ((line = br.readLine()) != null) {
            Barcode barcode = BarcodeFactory.createCode128(line);
            File f = new File(outputFolder, "BC"+i+"_"+line+".png");
            BarcodeImageHandler.savePNG(barcode, f);
            i++;
        }
        in.close();
 
    }
    
}
