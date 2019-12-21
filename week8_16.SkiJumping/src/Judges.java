
import java.util.Random;
/**
 *
 * @author Filip
 */
public class Judges {
    private int [] lista = new int [5];
    private Random rand = new Random();
    
    public Judges(){
    }
    
    public int[] generatePoints(){
        for(int i=0;i<lista.length;i++){
            lista[i]= rand.nextInt((20-10)+1)+10;
        }
        return lista;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0;i<lista.length;i++){
            sb.append(lista[i]);
            if(i!=lista.length-1)
                sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    
    
}
