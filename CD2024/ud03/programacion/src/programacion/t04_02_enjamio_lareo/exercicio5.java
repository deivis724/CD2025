package t04_02_enjamio_lareo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Scanner;

public class exercicio5 {
    private static ArrayList<String> pacientes = new ArrayList<>();
    private static ArrayList<LocalDateTime> citas = new ArrayList<>();
    private static DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");

    public static void main(String[] args) {
        // Datos de proba
        engadirCita("Juan Perez", "09:00 12/02/2025");
        engadirCita("Ana Garcia", "10:00 12/02/2025");
        engadirCita("Luis Rodriguez", "11:00 12/02/2025");

        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("Menú:");
            System.out.println("1. Engadir cita");
            System.out.println("2. Eliminar cita");
            System.out.println("3. Seleccionar data");
            System.out.println("4. Saír");
            System.out.print("Selecciona unha opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer
            
            switch (opcion) {
                case 1:
                    System.out.print("Introduce o nome do paciente: ");
                    String nome = scanner.nextLine();
                    System.out.print("Introduce a cita (HH:mm dd/MM/yyyy): ");
                    String dataHora = scanner.nextLine();
                    engadirCita(nome, dataHora);
                    break;
                case 2:
                    eliminarCita();
                    break;
                case 3:
                    System.out.print("Introduce a data (dd-MM-yyyy): ");
                    String data = scanner.nextLine();
                    seleccionarData(data);
                    break;
                case 4:
                    System.out.println("Saíndo");
                    break;
                default:
                    System.out.println("Opción non Válida");
            }
        } while (opcion != 4);
    }

    private static void engadirCita(String nome, String dataHora) {
        try {
            LocalDateTime cita = LocalDateTime.parse(dataHora, formato);
            if (cita.getDayOfWeek() == DayOfWeek.SATURDAY || cita.getDayOfWeek() == DayOfWeek.SUNDAY) {
                System.out.println("Non se poden engadir citas en sábados ou domingos.");
                return;
            }
            for (LocalDateTime c : citas) {
                if (Math.abs(cita.compareTo(c)) < 30) {
                    System.out.println("Xa existe unha cita 30 minutos antes ou despois.");
                    return;
                }
            }
            pacientes.add(nome);
            citas.add(cita);
            System.out.println("Cita engadida correctamente.");
        } catch (Exception e) {
            System.out.println("Formato de data/hora incorrecto.");
        }
    }

    private static void eliminarCita() {
        Scanner scanner = new Scanner(System.in);
        if (citas.isEmpty()) {
            System.out.println("Non hai citas para eliminar.");
            return;
        }
        for (int i = 0; i < citas.size(); i++) {
            System.out.println((i + 1) + ". " + pacientes.get(i) + " - " + citas.get(i).format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
        }
        System.out.print("Selecciona a cita a eliminar: ");
        int seleccion = scanner.nextInt();
        if (seleccion > 0 && seleccion <= citas.size()) {
            citas.remove(seleccion - 1);
            pacientes.remove(seleccion - 1);
            System.out.println("Cita eliminada correctamente.");
        } else {
            System.out.println("Selección non válida.");
        }
    }

    private static void seleccionarData(String data) {
        try {
            LocalDateTime dataSeleccionada = LocalDateTime.parse(data, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            boolean atopada = false;
            for (int i = 0; i < citas.size(); i++) {
                if (citas.get(i).toLocalDate().equals(dataSeleccionada.toLocalDate())) {
                    System.out.println(pacientes.get(i) + " - " + citas.get(i).format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
                    atopada = true;
                }
            }
            if (!atopada) {
                System.out.println("Non se atoparon citas para esta data.");
            }
        } catch (Exception e) {
            System.out.println("Formato de data incorrecto.");
        }
    }
}