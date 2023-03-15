import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        int tam, valor, posicao1, posicao2, posicao3;
        Scanner input = new Scanner(System.in);

        System.out.println("valor máximo para a lista: ");
        tam = input.nextInt();

        // instanciando a lista vazia
        ListaSequencial lista = new ListaSequencial(tam);

        // verificando se a lista está vazia
        if(lista.vazio() == true) {
            System.out.println("a lista está vazia");
        }

        // verificando se a lista está cheia
        if(lista.cheio() == true) {
            System.out.println("a lista está cheia");
        }

        // mostrando o tamanho da lista
        System.out.println("o tamanho da lista vale: " + lista.tamanho());

        // obtendo/modificando um valor do elemento de uma determinada posição na lista
        System.out.println("Digite a posição de um elemento na lista para ser obtido/modificado: ");
        posicao1 = input.nextInt();
        System.out.println("elemento obtido: " + lista.elemento(posicao1));

        // inserindo valor em uma determinada posição
        System.out.println("Digite a posição de um elemento na lista para inserir algum valor");
        posicao2 = input.nextInt();
        System.out.println("Digite o valor a ser inserido: ");
        valor = input.nextInt();
        lista.insere(posicao2, valor);

        // removendo valor de uma determinada posição
        System.out.println("Digite a posição do valor que você quer remover: ");
        posicao3 = input.nextInt();
        lista.remove(posicao3);
        input.close();

        //exibindo a lista inteira
        lista.imprimir();
    }
}
