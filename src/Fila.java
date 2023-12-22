public class Fila {
    public Fila(int tamanho) {

        this.inicio = 0;
        this.fim = 0;
        this.localicacao = false;
        this.posicao = 0;
        this.capacidade = tamanho;
        this.posicaoFila = new int[tamanho];
    }

    int inicio;
    int fim;

    int capacidade;

    int[] posicaoFila;

    int posicao;

    boolean localicacao;
}
