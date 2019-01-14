package Horodatage_;

/**
 *
 * @author Estébane
 */
public class main {

    public static void main(String[] args) {
        // TODO code application logic here
        System.err.println("start");
        
        FileChooser chooser = new FileChooser();
        String chemin = chooser.getSelectedPath();
        ScanFile input = new ScanFile(chemin);
        FilePropertyPrinter output = new FilePropertyPrinter(input);
        output.console();
        //output.drawBox();
        
       System.err.println("End");
       //System.exit(0);
    }
   
    
}
