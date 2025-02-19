package t04_01_enjamio_lareo.exercicio10;

import java.util.Scanner;

public class exercicio10 {
    
    static class TresEnRaia {
        private char[][] taboleiro;
        private char xogadorActual;
    
        public TresEnRaia() {
            taboleiro = new char[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    taboleiro[i][j] = '-';
                }
            }
            xogadorActual = 'X';
        }
    
        public void xogar() {
            boolean xogoRematado = false;
            Scanner scanner = new Scanner(System.in);
    
            while (!xogoRematado) {
                imprimirTaboleiro();
                System.out.println("Xogador " + xogadorActual + ", escolle unha fila (0, 1, ou 2) e unha columna (0, 1, ou 2):");
                int fila = scanner.nextInt();
                int columna = scanner.nextInt();
    
                if (fila < 0 || columna < 0 || fila > 2 || columna > 2 || taboleiro[fila][columna] != '-') {
                    System.out.println("Movimiento inválido. Intenta de novo.");
                } else {
                    taboleiro[fila][columna] = xogadorActual;
                    if (alguenGaña()) {
                        xogoRematado = true;
                        imprimirTaboleiro();
                        System.out.println("Xogador " + xogadorActual + " gaña!");
                    } else if (empate()) {
                        xogoRematado = true;
                        imprimirTaboleiro();
                        System.out.println("É un empate!");
                    } else {
                        xogadorActual = (xogadorActual == 'X') ? 'O' : 'X';
                    }
                }
            }
            scanner.close();
        }
    
        private void imprimirTaboleiro() {
            System.out.println("  C0 C1 C2");
            for (int i = 0; i < 3; i++) {
                System.out.print("F" + i + " ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(taboleiro[i][j] + " ");
                }
                System.out.println();
            }
        }
    
        private boolean alguenGaña() {
            for (int i = 0; i < 3; i++) {
                if (taboleiro[i][0] == xogadorActual && taboleiro[i][1] == xogadorActual && taboleiro[i][2] == xogadorActual) {
                    return true;
                }
            }
            for (int j = 0; j < 3; j++) {
                if (taboleiro[0][j] == xogadorActual && taboleiro[1][j] == xogadorActual && taboleiro[2][j] == xogadorActual) {
                    return true;
                }
            }
            if (taboleiro[0][0] == xogadorActual && taboleiro[1][1] == xogadorActual && taboleiro[2][2] == xogadorActual) {
                return true;
            }
            if (taboleiro[0][2] == xogadorActual && taboleiro[1][1] == xogadorActual && taboleiro[2][0] == xogadorActual) {
                return true;
            }
            return false;
        }
    
        private boolean empate() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (taboleiro[i][j] == '-') {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        TresEnRaia xogo = new TresEnRaia();
        xogo.xogar();
    }
}