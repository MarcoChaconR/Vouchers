package vouchers;

public class Num2Char {

    public static String[] laUnidades = {"UN", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO", "NUEVE", "DIEZ", "ONCE", "DOCE", "TRECE", "CATORCE",
        "QUINCE", "DIECISEIS", "DIECISIETE", "DIECIOCHO", "DIECINUEVE", "VEINTE", "VEINTIUN", "VEINTIDOS", "VEINTITRES", "VEINTICUATRO", "VEINTICINCO",
        "VEINTISEIS", "VEINTISIETE", "VEINTIOCHO", "VEINTINUEVE"};
    public static String[] laDecenas = {"DIEZ", "VEINTE", "TREINTA", "CUARENTA", "CINCUENTA", "SESENTA", "SETENTA", "OCHENTA", "NOVENTA"};
    public static String[] laCentenas = {"CIENTO", "DOSCIENTOS", "TRESCIENTOS", "CUATROCIENTOS", "QUINIENTOS", "SEISCIENTOS", "SETECIENTOS", "OCHOCIENTOS", "NOVECIENTOS"};

    public static String Letras(double Valor) {
        String hilera = "";
        long lyCantidad;
        byte lyCentimos = 0;
        byte lnDigito;
        byte lnPrimerDigito;
        byte lnSegundoDigito;
        byte lnTercerDigito;
        String lcBloque;
        byte lnNumeroBloques = 1;
        byte lnBloqueCero;
        String ValorEntero;

        ValorEntero = String.valueOf((long) (Valor * 100));
        lyCentimos = Byte.parseByte(ValorEntero.substring(ValorEntero.length() - 2));
        lyCantidad = (long) (Valor - (lyCentimos / 100));

        do {
            lnPrimerDigito = 0;
            lnSegundoDigito = 0;
            lnTercerDigito = 0;
            lcBloque = "";
            lnBloqueCero = 0;

            for (int i = 1; i <= 3; i++) {
                lnDigito = (byte) (lyCantidad % 10);
                if (lnDigito != 0) {
                    switch (i) {
                        case 1:
                            lcBloque = " " + laUnidades[lnDigito - 1];
                            lnPrimerDigito = lnDigito;
                            break;
                        case 2:
                            if (lnDigito <= 2) {
                                lcBloque = " " + laUnidades[(lnDigito * 10) + lnPrimerDigito - 1];
                            } else {
                                lcBloque = " " + laDecenas[lnDigito - 1] + IIf(lnPrimerDigito != 0, " Y", "") + lcBloque;
                            }
                            lnSegundoDigito = lnDigito;
                            break;
                        case 3:
                            lcBloque = " " + IIf((lnDigito == 1) && (lnPrimerDigito == 0) && (lnSegundoDigito == 0), "CIEN", laCentenas[lnDigito - 1]) + lcBloque;
                            lnTercerDigito = lnDigito;
                    }
                } else {
                    lnBloqueCero++;

                }

                if (lyCantidad == 0) {
                    i = 4;
                } else {
                    lyCantidad = (int) (lyCantidad / 10);
                }
            }

            switch (lnNumeroBloques) {
                case 1:
                    hilera = lcBloque;
                    break;
                case 2:
                    hilera = lcBloque + IIf(lnBloqueCero == 3, "", " MIL") + hilera;
                    break;
                case 3:
                    hilera = lcBloque + IIf((lnPrimerDigito == 1) && (lnSegundoDigito == 0) && (lnTercerDigito == 0), " MILLON", " MILLONES") + hilera;
            }
            lnNumeroBloques++;

        } while (lyCantidad != 0);
        if (lyCentimos == 0) {
            hilera = hilera + " EXACTOS";
        } else {
            hilera = hilera + " con " + IIf(lyCentimos < 10, "0", "") + lyCentimos + "/100";
        }
        return hilera.trim();
    }

    public static String IIf(boolean Condicion, String verdadero, String falso) {
        String resultado;

        if (Condicion) {
            resultado = verdadero;
        } else {
            resultado = falso;
        }
        return resultado;
    }

}
