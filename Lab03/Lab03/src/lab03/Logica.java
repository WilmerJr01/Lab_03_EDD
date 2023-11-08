package lab03;

import java.text.DecimalFormat;
import java.util.Random;

public class Logica {

    Random mod_lvl1 = new Random();
    DecimalFormat df = new DecimalFormat("#.###");
    public int qstn = 1, puntaje = 0;
    public double aux;
    public String qstna;

    //sumas y restas
    public  String[] operacioneslvl1(int qstn) {
        String[] vector = new String[2];
        int a, b, c, resultado = 0, mod;
        String op;

        a = mod_lvl1.nextInt(qstn * 3) + qstn + 1;
        b = mod_lvl1.nextInt(qstn * 3) + qstn + 1;
        c = mod_lvl1.nextInt(qstn * 3) + qstn + 1;

        mod = mod_lvl1.nextInt(2) + 1;

        switch (mod) {

            case 1:
                qstna = "x = " + String.valueOf(a) + " + " + String.valueOf(b) + " - " + String.valueOf(c);
                vector[0] = qstna;
                resultado = a + b - c;
                vector[1] = String.valueOf(resultado);
                break;
            case 2:
                qstna = "x = " + String.valueOf(a) + " - " + String.valueOf(b) + " + " + String.valueOf(c);
                vector[0] = qstna;
                resultado = a - b + c;
                vector[1] = String.valueOf(resultado);
                break;
        }
        return vector;
    }

    //multiplicaciones
    public String[] operacioneslvl2(int qstn) {
        String[] vector = new String[2];
        int a, b, resultado = 0, mod;
        String op;
        int qstn_aux = qstn - 10;
        a = mod_lvl1.nextInt(qstn_aux * 2) + 2;
        b = mod_lvl1.nextInt(qstn_aux) + 4;

        qstna = "x = " + String.valueOf(a) + " * " + String.valueOf(b);
        resultado = a * b;
        vector[0] = qstna;
        vector[1] = String.valueOf(resultado);

        return vector;
    }

    //multiplicaciones con sumas o restas
    public String[] operacioneslvl3(int qstn) {
        String[] vector = new String[2];
        int a, b, c, resultado = 0, mod;
        String op;
        int qstn_aux = qstn - 10;
        a = mod_lvl1.nextInt(qstn_aux + 1) + 1;
        b = mod_lvl1.nextInt(qstn_aux + 1) + 1;
        c = mod_lvl1.nextInt(qstn_aux + 1) + 1;

        mod = mod_lvl1.nextInt(4) + 1;

        switch (mod) {

            case 1:
                qstna = "x = " + String.valueOf(a) + " + " + String.valueOf(b) + " * " + String.valueOf(c);
                resultado = a + b * c;
                vector[0] = qstna;
                vector[1] = String.valueOf(resultado);
                break;
            case 2:
                qstna = "x = " + String.valueOf(a) + " - " + String.valueOf(b) + " * " + String.valueOf(c);
                resultado = a - b * c;
                vector[0] = qstna;
                vector[1] = String.valueOf(resultado);
                break;
            case 3:
                qstna = "x = " + String.valueOf(a) + " * " + String.valueOf(b) + " + " + String.valueOf(c);
                resultado = a * b + c;
                vector[0] = qstna;
                vector[1] = String.valueOf(resultado);
                break;
            case 4:
                qstna = "x = " + String.valueOf(a) + " * " + String.valueOf(b) + " - " + String.valueOf(c);
                resultado = a * b - c;
                vector[0] = qstna;
                vector[1] = String.valueOf(resultado);
                break;
        }
        return vector;
    }

    //divisiones
    public String[] operacioneslvl4(int qstn) {
        String[] vector = new String[2];
        double a, b;
        double resultado = 0;
        int qstn_aux = qstn - 30;
        a = mod_lvl1.nextInt(qstn_aux * 2) + 2;
        b = mod_lvl1.nextInt(qstn_aux * 2) + 1;

        qstna = "x = " + String.valueOf((int) a) + " ÷ " + String.valueOf((int) b);
        resultado = a / b;
        resultado = resultado * 1000;
        resultado = Math.floor(resultado);
        resultado = resultado / 1000;

        vector[0] = qstna;
        vector[1] = String.valueOf(resultado);

        return vector;
    }

    //divisiones y multiplicaciones
    public String[] operacioneslvl5(int qstn) {
        String[] vector = new String[2];
        int mod;
        double a, b, c;
        double resultado = 0;
        int qstn_aux = qstn - 40;
        a = mod_lvl1.nextInt(qstn_aux) + qstn_aux + 1;
        b = mod_lvl1.nextInt(qstn_aux * 2) + 2;
        c = mod_lvl1.nextInt(qstn_aux) + qstn_aux + 1;

        mod = mod_lvl1.nextInt(2) + 1;

        switch (mod) {
            case 1:
                qstna = "x = " + String.valueOf((int) a) + " * " + String.valueOf((int) b) + " ÷ " + String.valueOf((int) c);
                resultado = a * b / c;
                resultado = resultado * 1000;
                resultado = Math.floor(resultado);
                resultado = resultado / 1000;
                vector[0] = qstna;
                vector[1] = String.valueOf(resultado);
                break;
            case 2:
                qstna = "x = " + String.valueOf((int) a) + " ÷ " + String.valueOf((int) b) + " * " + String.valueOf((int) c);
                resultado = a / b * c;
                resultado = resultado * 1000;
                resultado = Math.floor(resultado);
                resultado = resultado / 1000;
                vector[0] = qstna;
                vector[1] = String.valueOf(resultado);
                break;
        }
        return vector;
    }

    //despejar la x con multiplicaciones, sumas y restas
    public String[] operacioneslvl6(int qstn) {
        String[] vector = new String[2];
        double a, b, c, d, resultado = 0;
        int mod;
        String op;
        int qstn_aux = qstn - 50;
        a = mod_lvl1.nextInt(7) + 1;
        b = mod_lvl1.nextInt(7) + 1;
        c = mod_lvl1.nextInt(7) + 1;
        d = mod_lvl1.nextInt(7) + 1;

        mod = mod_lvl1.nextInt(4) + 1;

        switch (mod) {

            case 1:
                //ax + b * c = d
                qstna = String.valueOf((int) a) + "x + " + String.valueOf((int) b) + " * " + String.valueOf((int) c) + " = " + String.valueOf((int) d);
                resultado = (d - b * c) / a;
                resultado = resultado * 1000;
                resultado = Math.floor(resultado);
                resultado = resultado / 1000;
                vector[0] = qstna;
                vector[1] = String.valueOf(resultado);
                break;
            case 2:
                //ax - b * c = d
                qstna = String.valueOf((int) a) + "x - " + String.valueOf((int) b) + " * " + String.valueOf((int) c) + " = " + String.valueOf((int) d);
                resultado = (d + b * c) / a;
                resultado = resultado * 1000;
                resultado = Math.floor(resultado);
                resultado = resultado / 1000;
                vector[0] = qstna;
                vector[1] = String.valueOf(resultado);
                break;
            case 3:
                //a + bx * c = d
                qstna = String.valueOf((int) a) + " + " + String.valueOf((int) b) + "x * " + String.valueOf((int) c) + " = " + String.valueOf((int) d);
                resultado = (d - a) / b * c;
                resultado = resultado * 1000;
                resultado = Math.floor(resultado);
                resultado = resultado / 1000;
                vector[0] = qstna;
                vector[1] = String.valueOf(resultado);
                break;
            case 4:
                //ax * b - c = d
                qstna = String.valueOf((int) a) + "x * " + String.valueOf((int) b) + " - " + String.valueOf((int) c) + " = " + String.valueOf((int) d);
                resultado = (d + c) / a * b;
                resultado = resultado * 1000;
                resultado = Math.floor(resultado);
                resultado = resultado / 1000;
                vector[0] = qstna;
                vector[1] = String.valueOf(resultado);
                break;
        }
        return vector;
    }

    // despejar la x con divisiones, sumas y restas
    public String[] operacioneslvl7(int qstn) {
        String[] vector = new String[2];
        double a, b, c, d, resultado = 0;
        int mod;
        String op;
        int qstn_aux = qstn - 60;
        a = mod_lvl1.nextInt(6) + 1;
        b = mod_lvl1.nextInt(6) + 1;
        c = mod_lvl1.nextInt(6) + 1;
        d = mod_lvl1.nextInt(6) + 1;

        mod = mod_lvl1.nextInt(4) + 1;

        switch (mod) {

            case 1:
                //ax + b / c = d
                qstna = String.valueOf((int) a) + "x + " + String.valueOf((int) b) + " ÷ " + String.valueOf((int) c) + " = " + String.valueOf((int) d);
                resultado = (d - (b / c)) / a;
                resultado = resultado * 1000;
                resultado = Math.floor(resultado);
                resultado = resultado / 1000;
                vector[0] = qstna;
                vector[1] = String.valueOf(resultado);
                break;
            case 2:
                qstna = String.valueOf((int) a) + "x ÷ " + String.valueOf((int) b) + " - " + String.valueOf((int) c) + " = " + String.valueOf((int) d);
                resultado = (d + c) / (a / b);
                resultado = resultado * 1000;
                resultado = Math.floor(resultado);
                resultado = resultado / 1000;
                vector[0] = qstna;
                vector[1] = String.valueOf(resultado);
                break;
            case 3:
                qstna = String.valueOf((int) a) + " ÷ " + String.valueOf((int) b) + "x + " + String.valueOf((int) c) + " = " + String.valueOf((int) d);
                resultado = a / (b * (c - d));
                resultado = resultado * 1000;
                resultado = Math.floor(resultado);
                resultado = resultado / 1000;
                vector[0] = qstna;
                vector[1] = String.valueOf(resultado);
                break;
            case 4:
                qstna = String.valueOf((int) a) + "x - " + String.valueOf((int) b) + " ÷ " + String.valueOf((int) c) + " = " + String.valueOf((int) d);
                resultado = (d + (b / c)) / a;
                resultado = resultado * 1000;
                resultado = Math.floor(resultado);
                resultado = resultado / 1000;
                vector[0] = qstna;
                vector[1] = String.valueOf(resultado);
        }
        return vector;
    }

    //despejar la x con todas las operaciones
    public String[] operacioneslvl8(int qstn) {
        String[] vector = new String[2];
        double a, b, c, d, resultado = 0;
        int mod;
        String op;
        int qstn_aux = qstn - 70;
        a = mod_lvl1.nextInt(qstn_aux + 2) + qstn_aux + 1;
        b = mod_lvl1.nextInt(qstn_aux + 2) + qstn_aux + 1;
        c = mod_lvl1.nextInt(qstn_aux + 2) + qstn_aux + 1;
        d = mod_lvl1.nextInt(qstn_aux + 2) + qstn_aux + 1;

        mod = mod_lvl1.nextInt(8) + 1;

        switch (mod) {

            case 1:
                //ax + b / c = d
                qstna = String.valueOf((int) a) + "x + " + String.valueOf((int) b) + " ÷ " + String.valueOf((int) c) + " = " + String.valueOf((int) d);
                resultado = (d - (b / c)) / a;
                resultado = resultado * 1000;
                resultado = Math.floor(resultado);
                resultado = resultado / 1000;
                vector[0] = qstna;
                vector[1] = String.valueOf(resultado);
                break;
            case 2:
                qstna = String.valueOf((int) a) + "x ÷ " + String.valueOf((int) b) + " - " + String.valueOf((int) c) + " = " + String.valueOf((int) d);
                resultado = (d + c) / (a / b);
                resultado = resultado * 1000;
                resultado = Math.floor(resultado);
                resultado = resultado / 1000;
                vector[0] = qstna;
                vector[1] = String.valueOf(resultado);
                break;
            case 3:
                qstna = String.valueOf((int) a) + " ÷ " + String.valueOf((int) b) + "x + " + String.valueOf((int) c) + " = " + String.valueOf((int) d);
                resultado = a / (b * (c - d));
                resultado = resultado * 1000;
                resultado = Math.floor(resultado);
                resultado = resultado / 1000;
                vector[0] = qstna;
                vector[1] = String.valueOf(resultado);
                break;
            case 4:
                qstna = String.valueOf((int) a) + "x - " + String.valueOf((int) b) + " ÷ " + String.valueOf((int) c) + " = " + String.valueOf((int) d);
                resultado = (d + (b / c)) / a;
                resultado = resultado * 1000;
                resultado = Math.floor(resultado);
                resultado = resultado / 1000;
                vector[0] = qstna;
                vector[1] = String.valueOf(resultado);
            case 5:
                //ax + b * c = d
                qstna = String.valueOf((int) a) + "x + " + String.valueOf((int) b) + " * " + String.valueOf((int) c) + " = " + String.valueOf((int) d);
                resultado = (d - b * c) / a;
                resultado = resultado * 1000;
                resultado = Math.floor(resultado);
                resultado = resultado / 1000;
                vector[0] = qstna;
                vector[1] = String.valueOf(resultado);
                break;
            case 6:
                //ax - b * c = d
                qstna = String.valueOf((int) a) + "x - " + String.valueOf((int) b) + " * " + String.valueOf((int) c) + " = " + String.valueOf((int) d);
                resultado = (d + b * c) / a;
                resultado = resultado * 1000;
                resultado = Math.floor(resultado);
                resultado = resultado / 1000;
                vector[0] = qstna;
                vector[1] = String.valueOf(resultado);
                break;
            case 7:
                //a + bx * c = d
                qstna = String.valueOf((int) a) + " + " + String.valueOf((int) b) + "x * " + String.valueOf((int) c) + " = " + String.valueOf((int) d);
                resultado = (d - a) / b * c;
                resultado = resultado * 1000;
                resultado = Math.floor(resultado);
                resultado = resultado / 1000;
                vector[0] = qstna;
                vector[1] = String.valueOf(resultado);
                break;
            case 8:
                //ax * b - c = d
                qstna = String.valueOf((int) a) + "x * " + String.valueOf((int) b) + " - " + String.valueOf((int) c) + " = " + String.valueOf((int) d);
                resultado = (d + c) / a * b;
                resultado = resultado * 1000;
                resultado = Math.floor(resultado);
                resultado = resultado / 1000;
                vector[0] = qstna;
                vector[1] = String.valueOf(resultado);
                break;
        }
        return vector;
    }
}
