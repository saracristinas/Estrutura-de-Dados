import java.util.Scanner;

public class Estrutura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo a estrutura de dados
        String[][] dic = {
                {"cachorro", "dog"},
                {"gato", "cat"},
                {"abacaxi", "pineapple"},
                {"banana", "banana"},
                {"carro", "car"},
                {"elefante", "elephant"},
                {"futebol", "football"},
                {"janela", "window"},
                {"sol", "sun"},
                {"lua", "moon"},
                {"arvore", "tree"},
                {"computador", "computer"},
                {"piano", "piano"},
                {"praia", "beach"},
                {"montanha", "mountain"},
                {"aviao", "airplane"},
                {"livro", "book"},
                {"escola", "school"},
                {"familia", "family"},
                {"amigo", "friend"},
                {"chocolate", "chocolate"},
                {"chuva", "rain"},
                {"rio", "river"},
                {"verde", "green"},
                {"azul", "blue"},
                {"vermelho", "red"},
                {"branco", "white"},
                {"preto", "black"},
                {"rosa", "pink"},
                {"laranja", "orange"},
                // Adicione mais palavras conforme necessário
        };

        // Solicitando a escolha do idioma
        char choice;
        do {
            System.out.print("Digite [P] para Português ou [I] para Inglês: ");
            choice = scanner.next().charAt(0);
        } while (choice != 'P' && choice != 'p' && choice != 'I' && choice != 'i');

        // Ordenando a estrutura de dados com Bubble Sort
        bubbleSort(dic, choice);

        // Exibindo as palavras ordenadas
        if (choice == 'P' || choice == 'p') {
            System.out.println("Português - Inglês");
            System.out.println("==================");
        } else {
            System.out.println("Inglês - Português");
            System.out.println("==================");
        }

        for (String[] pair : dic) {
            if (choice == 'I' || choice == 'i') {
                System.out.println(pair[1] + " - " + pair[0]);
            } else {
                System.out.println(pair[0] + " - " + pair[1]);
            }
        }
    }

    private static void bubbleSort(String[][] array, char choice) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Comparando as palavras com base na escolha do idioma
                if ((choice == 'P' || choice == 'p') && array[j][0].compareToIgnoreCase(array[j + 1][0]) > 0) {
                    swap(array, j, j + 1);
                } else if ((choice == 'I' || choice == 'i') && array[j][1].compareToIgnoreCase(array[j + 1][1]) > 0) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    private static void swap(String[][] array, int i, int j) {
        String[] temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
