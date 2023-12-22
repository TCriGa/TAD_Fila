public class OperacoesFila extends Fila {

    int operacao = 0;
    public OperacoesFila(int tamanho) {
        super(tamanho);
    }

    public Boolean isEmpty() {
        return this.inicio == this.fim && this.operacao <= 0;
    }

    public Boolean isFull(){
        return this.inicio == this.fim && this.operacao == 1;
    }
    //enqueue
    public String inserirElemento(int elemento) {
        if (isFull()) {
            return "Fila cheia";
        } else {
            this.posicaoFila[this.fim] = elemento;
            this.fim = (this.fim + 1) % this.capacidade;
            this.operacao = 1;
            return "Elemento inserido com sucesso!";
        }
    }

    //dequeue
    public Integer removerElemento() {
        if (isEmpty()) {
            return null;
        } else {
            int elementoRemovido = this.posicaoFila[this.inicio];
            this.inicio = (this.inicio + 1) % this.capacidade;
            this.operacao = -1;
            return elementoRemovido;
        }
    }

    public int size(){
        if (this.inicio > this.fim){
            return this.capacidade - this.inicio + this.fim;
        } else if (this.inicio == this.fim) {
            if (isEmpty()) {
                return 0;
            } else {
                return this.capacidade;
            }
        } else {
            return this.fim - this.inicio;
        }
    }

    public Integer primeiroFila(){
        if (isEmpty()) {
            return null;
        } else {
            return this.posicaoFila[this.inicio];
        }
    }

    public String print() {
        if (isEmpty()) {
            return "Fila vazia!";
        } else {
            StringBuilder fila = new StringBuilder();
            for (int i = 0; i < this.size(); i++) {
                fila.append(this.posicaoFila[i]).append(" ");
            }
            return fila.toString();
        }
    }
    public String localizaElemento(int elemento) {

        if (isEmpty()) {
            return "Fila vazia!";
        } else if (this.inicio < this.fim) {
            for (int i = this.inicio; i < this.fim; i++) {
                posicao++;
                if (this.posicaoFila[i] == elemento) {
                    localicacao = true;
                    break;
                }
            }
        }else if (this.isFull() || this.inicio > this.fim) {
            for (int i = this.inicio; i < this.capacidade; i++) {
                posicao++;
                if (this.posicaoFila[i] == elemento) {
                    localicacao = true;
                    break;
                }
            }
            if (!localicacao && this.inicio > 0) {
                for (int i = 0; i < this.fim; i++) {
                    posicao++;
                    if (this.posicaoFila[i] == elemento) {
                        localicacao = true;
                        break;
                    }
                }
            }
        }

        if (localicacao) {
            return "O elemento " + elemento + " esta' na posicao " + posicao + " da fila.";
        } else {
            return "O elemento " + elemento + " nao se encontra na fila.";
        }
    }
}
