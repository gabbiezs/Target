package Exercicios;

public class Exercicio05 {

	public static void main(String[] args) {
		
		String strOriginal = "teste1234";
        String strInvertida = "";

        for (int i = strOriginal.length() - 1; i >= 0; i--) {
            strInvertida += strOriginal.charAt(i);
        }
        System.out.println("String original: " + strOriginal);
        System.out.println("String invertida: " + strInvertida);

	}

}
