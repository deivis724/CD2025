package t04_02_enjamio_lareo;

import java.time.LocalDateTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class exercicio6 {
    private static HashMap<String, ArrayList<LocalDateTime>> fichaxes = new HashMap<>();
    private static DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    private static final double SALARIO_HORA = 12.0;

    public static void main(String[] args) {
        // Datos de proba
        ficharEntrada("12345678A");
        ficharSaida("12345678A");
        ficharEntrada("23456789B");
        ficharSaida("23456789B");

        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;

            do {
                System.out.println("Menú:");
                System.out.println("1. Fichar entrada/saída");
                System.out.println("2. Comprobar salario");
                System.out.println("3. Saír");
                System.out.print("Selecciona unha opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpar buffer

                switch (opcion) {
                    case 1:
                        System.out.print("Introduce o DNI: ");
                        String dni = scanner.nextLine();
                        fichar(dni);
                        break;
                    case 2:
                        System.out.print("Introduce o DNI: ");
                        dni = scanner.nextLine();
                        comprobarSalario(dni);
                        break;
                    case 3:
                        System.out.println("Saíndo...");
                        break;
                    default:
                        System.out.println("Opción non válida.");
                }
            } while (opcion != 3);
        }
    }

    private static void fichar(String dni) {
        LocalDateTime agora = LocalDateTime.now();
        if (!fichaxes.containsKey(dni)) {
            fichaxes.put(dni, new ArrayList<>());
        }
        fichaxes.get(dni).add(agora);
        System.out.println("Fichaxe rexistrada: " + agora.format(formato));
    }

    private static void comprobarSalario(String dni) {
        if (!fichaxes.containsKey(dni)) {
            System.out.println("Non se atoparon fichaxes para o DNI " + dni);
            return;
        }

        ArrayList<LocalDateTime> horarios = fichaxes.get(dni);
        Duration totalDuracion = Duration.ZERO;

        for (int i = 0; i < horarios.size() - 1; i += 2) {
            LocalDateTime entrada = horarios.get(i);
            LocalDateTime saida = horarios.get(i + 1);
            Duration duracion = Duration.between(entrada, saida);
            totalDuracion = totalDuracion.plus(duracion);
        }

        long minutosTraballados = totalDuracion.toMinutes();
        double salario = (minutosTraballados / 60.0) * SALARIO_HORA;
        System.out.println("Salario a percibir: " + String.format("%.2f", salario) + " €");
    }

    private static void ficharEntrada(String dni) {
        LocalDateTime agora = LocalDateTime.now().minusHours(1); // Para datos de proba
        if (!fichaxes.containsKey(dni)) {
            fichaxes.put(dni, new ArrayList<>());
        }
        fichaxes.get(dni).add(agora);
        System.out.println("Entrada de proba rexistrada: " + agora.format(formato));
    }

    private static void ficharSaida(String dni) {
        LocalDateTime agora = LocalDateTime.now(); // Para datos de proba
        if (!fichaxes.containsKey(dni)) {
            fichaxes.put(dni, new ArrayList<>());
        }
        fichaxes.get(dni).add(agora);
        System.out.println("Saída de proba rexistrada: " + agora.format(formato));
    }
}