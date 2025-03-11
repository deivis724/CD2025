public class Suma {
    public static void main(String[] argumentos) {

        //Definición de variables
        double numero1, numero2, numero3, suma;

        //Inicialización de variables
        numero1 = 0;
        numero2 = 0;
        numero3 = 0;
        suma = 0;
        
        try {
            // Convertir los argumentos a números
            numero1 = Double.parseDouble(argumentos[0]);
            numero2 = Double.parseDouble(argumentos[1]);

            suma = numero1 + numero2;

            if(argumentos.length == 3){
                numero3 = Double.parseDouble(argumentos[2]);
                suma = suma + numero3;
            }

            // Imprimir el resultado
            System.out.println(suma);
            
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
