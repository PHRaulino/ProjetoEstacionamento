import java.util.Random;

public class EX1 {
	public static void main(String[] args) {

		Random gerador = new Random();

		int[][] matriz = new int[4][4];
		int aux = 0;
		int aux2 = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = gerador.nextInt(5);
				if (i == j) {
					aux += matriz[i][j];
				}
				if (i+j == matriz.length-1) {
					aux2+=matriz[i][j];
				}
				
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
		System.out.println("a soma da  primeira diagonal é " + aux);
		System.out.println("a soma da  segunda diagonal é " + aux2);
	}

}