public class ArrayUtils {
    public static int encontrarMaximo(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío");
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int encontrarMinimo(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío");
        }

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static double calcularPromedio(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío");
        }

        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        return (double) suma / array.length;
    }
}