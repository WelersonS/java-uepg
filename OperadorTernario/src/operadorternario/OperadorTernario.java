
package operadorternario;

/**
 *
 * @author weler
 */
public class OperadorTernario {

    public static void main(String[] args) {
        //Operador ternário
        int n1 = 10, n2 = 20;
        
        int maior = n1 > n2 ? n1+n2 : n1-n2;
        
        System.out.println(maior);
        System.out.println("------------");
        
        // Strings -> metódo equals
        String nome1 = "Welerson";
        String nome2 = "welerson";
        String nome3 = new String("Welerson");
        String result;
        
        result = (nome1.equals(nome2)) ? "IGUAIS" : "DIFERENTES";
        
        System.out.println(result);
        System.out.println("------------");
        
        //Operadores lógicos
        int x, y, z;
        
        x = 4; y = 7; z = 12;
        boolean resultBoolean;
        
        resultBoolean = (x < y && y == z);
        
        System.out.println(resultBoolean);
        
    }
    
}
