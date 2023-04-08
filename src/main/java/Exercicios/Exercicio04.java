package Exercicios;

import java.text.DecimalFormat;

public class Exercicio04 {

	public static void main(String[] args) {
		
		double fatSP = 67836.43;
        double fatRJ = 36678.66;
        double fatMG = 29229.88;
        double fatES = 27165.48;
        double fatOutros = 19849.53;

        double fatTotal = fatSP + fatRJ + fatMG + fatES + fatOutros;

        double perSP = (fatSP / fatTotal) * 100;
        double perRJ = (fatRJ / fatTotal) * 100;
        double perMG = (fatMG / fatTotal) * 100;
        double perES = (fatES / fatTotal) * 100;
        double perOutros = (fatOutros / fatTotal) * 100;

        DecimalFormat df = new DecimalFormat("0.##");

        System.out.println("Percentual de cada estado no faturamento total:");
        System.out.println("SP: " + df.format(perSP) + "%");
        System.out.println("RJ: " + df.format(perRJ) + "%");
        System.out.println("MG: " + df.format(perMG) + "%");
        System.out.println("ES: " + df.format(perES) + "%");
        System.out.println("Outros: " + df.format(perOutros) + "%");

	}

}
