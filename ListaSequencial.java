public class ListaSequencial {
    
    // declaração dos atributos da lista
    int dados[], tamAtual, tamMax;

    // criando a lista vazia
    public ListaSequencial(int tam) {
        tamMax = tam;
        tamAtual = 0;
        dados = new int[tamMax];
    }

    // método para verificar se a lista está vazia
    public boolean vazio() {
        if (tamAtual == 0 ) {
            return true;
        }
        else return false;
    }

    // método para verificar se a lista está cheia
    public boolean cheio() {
    if (tamAtual == tamMax) {
        return true;
    }  
    else return false;
    }

    // método para verificar o tamanho da lista
    public int tamanho() {
        return tamAtual;
    }

    // método para obter o i-ésimo elemento de uma lista.
    public int elemento(int pos) {
        int dado;
        if ((pos > tamAtual) || (pos <= 0))
        return -1;
        dado = dados[pos-1];
        return dado;
    }

    // método para retornar a posição de um elemento pesquisado.
    public int posicao (int dado) {
        for (int i = 0; i < tamAtual; i++) {
            if (dados[i] == dado) {
                return (i + 1);
            }
        }
        return -1;
    }

    // método para inserir um elemento de uma determinada posição.
    public boolean insere (int pos, int dado) {
        if (cheio() || (pos > tamAtual+1) || (pos<=0)) {
            return false;
        }
        for (int i = tamAtual; i >= pos; i--) {
            dados[i] = dados[i-1];
        }
        dados[pos - 1] = dado;
        tamAtual++;
        return true;
    }

    // método para verificar remover um elemento de uma determinada posição
    public int remove(int pos) {
        int dado;
        if ((pos > tamAtual) || (pos < 1 ))
        return -1;
        dado = dados[pos-1];
        for (int i = pos - 1; i < tamAtual - 1; i++) {
            dados[i] = dados[i+1];
        }
        tamAtual--;
        return dado;
    }

    public void imprimir() {
        for(int i = 0; i < tamMax; i++) {
            System.out.println("Lista: " + dados[i]);
        }
    } 
}