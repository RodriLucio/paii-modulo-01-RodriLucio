package edu.enidh.exemplo;
/**
 *
 * @author valeriapequeno
 */
public class BreakClassb {
    public static void main(String[] args) {
        long i = System.currentTimeMillis();

        for(int count=1 ; count <=1000000000 ; count++){
            if((count % 17 == 0) && (count % 19 == 0)){
                System.out.println(count);
                break; }
        }
        System.out.println("Tempo de execução, em milisegundos: "+ (System.currentTimeMillis()-i));
    }
}
