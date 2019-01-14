
package Horodatage_;

import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;

/**
 *
 * @author Estébane
 */

public abstract class functions {
 
    public static String dateToReadableValue( FileTime creationDate){
        String readableValue=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(creationDate.toMillis());
        return readableValue;
    }
}