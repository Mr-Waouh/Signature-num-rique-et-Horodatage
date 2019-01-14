package Horodatage_;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
/**
 *
 * @author EstÃ©bane
 */
public class ScanFile extends functions {
    private File fichier=null;
    private Path chemin=null;//= Paths.get(p.getAbsolutePath());
    BasicFileAttributes details =null;// Files.readAttributes(file, BasicFileAttributes.class);
    //private BasicFileAttributes detailsView=null;//=Files.getFileAttributeView(p, BasicFileAttributeView.class).readAttributes();
    public ScanFile(String inputPath){
        try{
            this.fichier=new File(inputPath);
            this.chemin=this.fichier.toPath();
            //this.detailsView=Files.getFileAttributeView(this.chemin, BasicFileAttributeView.class).readAttributes();
            this.details=Files.readAttributes(this.chemin, BasicFileAttributes.class);
            System.out.println("\nChargement du fichier Effectué !!");
        }catch(IOException e){
             System.err.println("*******Oups**********\nErreur de Chargement du fichier!");
             System.out.println(e.getMessage());
        } 
    }
    public String getName(){
        return this.fichier.getName();
    }
    public String getPath(){
        return this.fichier.getAbsolutePath();
    }
    public String getCreatedDate(){
        return dateToReadableValue( this.details.creationTime() );
    }
    public String getLastModifiedDate(){
        return dateToReadableValue( this.details.lastModifiedTime() );
    }
    public String getLastAccesDate(){
        return dateToReadableValue( this.details.lastAccessTime() );
    }
    
}
