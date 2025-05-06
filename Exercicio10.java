public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

        System.out.println("Digite 10 números:");
        for (int i = 0; i < vetor; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        for (int i = 0; i < vetor - 1; i++) {
                if (vetor[j] > vetor[j + 1]) {
                
                    int temp = vetor[j];
                }
        }

        System.out.println("Vetor ordenado em ordem crescente:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
} 
