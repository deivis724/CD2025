package t04_01_enjamio_lareo.execicio9;

public class concesionario {
    

import TipoCombustible;

public class Vehiculo {
    private static int numeroTotalVehiculos = 0;
    private static int velocidadeMaxima = 120; // Valor inicial de 120 km/h
    private String matricula;
    private String marca;
    private String modelo;
    private TipoCombustible tipoCombustible;
    private int velocidade;

    // Constructor que recibe matricula, marca e modelo. Combustible por defecto GASOLINA
    public Vehiculo(String matricula, String marca, String modelo) {
        this(matricula, marca, modelo, TipoCombustible.GASOLINA);
    }

    // Constructor que recibe matricula, marca, modelo e tipo de combustible
    public Vehiculo(String matricula, String marca, String modelo, TipoCombustible tipoCombustible) {
        if (comprobarFormatoMatricula(matricula)) {
            this.matricula = matricula;
        } else {
            this.matricula = "0000XXX";
        }
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustible = tipoCombustible;
        this.velocidade = 0;
        numeroTotalVehiculos++;
    }

    // Método estático para comprobar o formato da matricula
    public static boolean comprobarFormatoMatricula(String matricula) {
        return matricula.matches("\\d{4}[BCDFGHJKLMNPRSTVWXYZ]{3}");
    }

    // Método privado para modificar a velocidade
    private void modificarVelocidade(int velocidade) {
        this.velocidade += velocidade;
        if (this.velocidade > velocidadeMaxima) {
            this.velocidade = velocidadeMaxima;
        } else if (this.velocidade < 0) {
            this.velocidade = 0;
        }
    }

    // Método público para acelerar 10km/h
    public void acelerar() {
        modificarVelocidade(10);
    }

    // Método público para acelerar segundo o parámetro indicado
    public void acelerar(int velocidade) {
        modificarVelocidade(velocidade);
    }

    // Método público para decelerar 10km/h
    public void decelerar() {
        modificarVelocidade(-10);
    }

    // Método público para decelerar segundo o parámetro indicado
    public void decelerar(int velocidade) {
        modificarVelocidade(-velocidade);
    }

    // Getters e setters
    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public static int getNumeroTotalVehiculos() {
        return numeroTotalVehiculos;
    }

    public static int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public static void setVelocidadeMaxima(int velocidadeMaxima) {
        Vehiculo.velocidadeMaxima = velocidadeMaxima;
    }
}
