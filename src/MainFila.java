import java.util.Scanner;

public class MainFila {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n Informe o tamanho máximo da fila -> ");
        int tamanho = scanner.nextInt();

        if (tamanho <= 0) {
            System.out.println("\n\n Tamanho inválido! \n\n");
        }

        OperacoesFila operacoesFIla = new OperacoesFila(tamanho);

        while (true){
            System.out.println("\n\n############################################################");
            System.out.println("############# Escolha a opção desejada #########################");
            System.out.println("############# 1 - Inserir elemento na fila #####################");
            System.out.println("############# 2 - Remover elemento da fila #####################");
            System.out.println("############# 3 - Mostrar fila #################################");
            System.out.println("############# 4 - informações sobre a fila #####################");
            System.out.println("############# 5 - Localizar/posição de um elemento na fila #####");
            System.out.println("############# 6 - Sair do programa #############################");
            System.out.println("\n\n############################################################");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n\n Informe o elemento a ser inserido -> ");
                    int elemento = scanner.nextInt();
                    System.out.println(operacoesFIla.inserirElemento(elemento));
                    break;
                case 2:
                    System.out.println("\n\n Informe o elemento a ser removido -> ");
                    int elementoRemovido = operacoesFIla.removerElemento();
                    if (elementoRemovido == -1) {
                        System.out.println("\n\n Fila vazia! \n\n");
                    } else {
                        System.out.println("\n\n Elemento removido com sucesso! \n\n");
                    }
                    break;
                case 3:
                    System.out.println("\n\n Mostrando fila -> ");
                    System.out.println("\n\n" + operacoesFIla.print() + "\n\n");
                    break;
                case 4:
                    System.out.println("\n\n Informações sobre a fila -> ");
                    System.out.println("-------------------------------------------------");
                    System.out.println("       informacoes gerais sobre a fila");
                    System.out.println("-------------------------------------------------");
                    System.out.println("Capacidade maxima -> " + operacoesFIla.capacidade);
                    System.out.println("Tamanho (size) ----> " + operacoesFIla.size());
                    System.out.println("Primeiro elemento -> " + operacoesFIla.primeiroFila());
                    System.out.println("Ponteiro INI ------> " + operacoesFIla.inicio);
                    System.out.println("Ponteiro FIM ------> " + operacoesFIla.fim);
                    break;
                case 5:
                    System.out.println("\n\n Informe o elemento a ser localizado -> ");
                    int elementoLocalizado = scanner.nextInt();
                    System.out.println(operacoesFIla.localizaElemento(elementoLocalizado));;
                    break;
                case 6:
                    System.out.println("\n\n Saindo do programa -> ");
                    System.out.println("\n\n Obrigado por utilizar o programa! \n\n");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n\n Opção inválida! \n\n");
                    break;
            }
        }
    }


}