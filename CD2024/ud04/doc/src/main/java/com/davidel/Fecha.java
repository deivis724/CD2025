package com.davidel;

public class Fecha {

    private static final int DIA_MINIMO = 1;
    private static final int DIA_MAXIMO = 31;
    private static final int MES_MINIMO = 1;
    private static final int MES_MAXIMO = 12;
    private static final int DIAS_FEBRERO_NORMAL = 28;
    private static final int DIAS_FEBRERO_BISIESTO = 29;
    private static final int DIAS_MES_30 = 30;
    private static final int DIAS_MES_31 = 31;

    private static final int ENERO = 1;
    private static final int FEBRERO = 2;
    private static final int MARZO = 3;
    private static final int ABRIL = 4;
    private static final int MAYO = 5;
    private static final int JUNIO = 6;
    private static final int JULIO = 7;
    private static final int AGOSTO = 8;
    private static final int SEPTIEMBRE = 9;
    private static final int OCTUBRE = 10;
    private static final int NOVIEMBRE = 11;
    private static final int DICIEMBRE = 12;

    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public boolean valida() {
        if (dia < DIA_MINIMO || dia > DIA_MAXIMO) {
            return false;
        }
        if (mes < MES_MINIMO || mes > MES_MAXIMO) {
            return false;
        }

        int diasMes = 0;

        switch (mes) {
            case ENERO:
                diasMes = DIAS_MES_31;
                break;

            case MARZO:
                diasMes = DIAS_MES_31;
                break;

            case MAYO:
                diasMes = DIAS_MES_31;
                break;

            case JULIO:
                diasMes = DIAS_MES_31;
                break;

            case AGOSTO:
                diasMes = DIAS_MES_31;
                break;

            case OCTUBRE:
                diasMes = DIAS_MES_31;
                break;

            case DICIEMBRE:
                diasMes = DIAS_MES_31;
                break;

            case ABRIL:
                diasMes = DIAS_MES_30;
                break;

            case JUNIO:
                diasMes = DIAS_MES_30;
                break;

            case SEPTIEMBRE:
                diasMes = DIAS_MES_30;
                break;

            case NOVIEMBRE:
                diasMes = DIAS_MES_30;
                break;

            case FEBRERO:
                final int modulo = 400;
                final int modulo1 = 4;
                final int modulo2 = 100;
                if (anio % modulo == 0 || anio % modulo1 == 0 && anio % modulo2 != 0) {
                    diasMes = DIAS_FEBRERO_BISIESTO;
                } else {
                    diasMes = DIAS_FEBRERO_NORMAL;
                }
                break;

            default:
                return false;
        }

        return dia <= diasMes;
    }
}
