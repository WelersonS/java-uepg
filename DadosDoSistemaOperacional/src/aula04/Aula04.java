package aula04;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author weler
 */
public class Aula04 {

    public static void main(String[] args) {
        System.out.println("Olá Mundo Java!");
        System.out.println("Linguagem de programação");
        
        System.out.println();      
        Date systemTime = new Date();
        
        System.out.println("A data/hora do sistema é:");
        System.out.println(systemTime.toString());
        
        System.out.println();
        System.out.println("O idioma do sistema é: " + Locale.getDefault().getDisplayLanguage());
        
        System.out.println();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        
        System.out.println("A resolução do sistema é " + (int)width + "x" + (int)height);
        
    }
    
}
