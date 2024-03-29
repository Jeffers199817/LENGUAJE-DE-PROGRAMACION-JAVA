package ArreglosObjetosArrayList;

import java.security.SecureRandom;

public class TirarDado {
    public static void main(String[] args) {
        SecureRandom numerosAleatorios = new SecureRandom();
        int[] frecuencia = new int[7];
        // arreglo de contadores de frecuencia

        // tira el dado 6,000,000 veces: usa el valor del dado com indice de
        //frecuencia.

        for (int tiro = 1; tiro <= 6000000; tiro++)
            ++frecuencia[1 + numerosAleatorios.nextInt(6)];

        System.out.printf( "%s%10s%n", "Cara", "Frecuencia");

        //imprime el valor de cada elemento del arreglo

        for(int cara = 1; cara< frecuencia.length; cara++)
            System.out.printf("%4d%10d%n", cara, frecuencia[cara]   );


    }
}// fin de la clase TirarDado