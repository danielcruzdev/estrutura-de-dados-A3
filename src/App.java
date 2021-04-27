import java.util.ArrayList;
import java.util.Stack;
import java.util.ArrayDeque;

public class App {
    public static void main(String[] args) throws Exception {
        // Passo 1:
        //Insira os números [1, 2, 3, 4 e 5] em uma lista - com 5 células; 
        System.out.println("Inserindo [1, 2, 3, 4 e 5] em uma lista");
        ArrayList<Integer> lista =  new ArrayList<Integer>(5);
        for (int i = 0; i < 5; i++){
            lista.add(i + 1);
        }
 
        //Passo 2:
        // Remova todos os dados da lista e insira-os em uma Pilha - com 5 células. Deve-se sempre remover os dados da célula inicial da lista; 
        System.out.println("Removendo dados da lista e inserindo em uma pilha");
        Stack<Integer> pilha = new Stack<Integer>();

        for (int i = 0; i < lista.size();){
            int element = lista.get(i);
            lista.remove(i);
            pilha.add(element);
        }

        //Passo 3:
        //Remova os dados da Pilha e insira-os em uma Fila - com 10 células); ; 
        System.out.println("Removendo dados pilha e inserindo em uma fila");
        ArrayDeque<Integer> fila = new ArrayDeque<Integer>(10);
        for (int i = 0; i < pilha.size();){
            int element = pilha.get(i);
            pilha.remove(i);
            fila.add(element);
        }

        //Passo 4:
        //Insira os números [6, 7, 8, 9 e 10] na lista;
        System.out.println("Insirindo os números [6, 7, 8, 9 e 10] na lista;");
        for (int i = 0; i < 5; i++){
            lista.add(i + 6);
        }

        //Passo 5:
        //Repita os passos 2 e 3;

        //Passo 2
        System.out.println("Removendo dados da lista e inserindo em uma pilha");
        for (int i = 0; i < lista.size();){
            int element = lista.get(i);
            lista.remove(i);
            pilha.add(element);
        }

        //Passo 3:
        System.out.println("Removendo dados pilha e inserindo em uma fila");
        for (int i = 0; i < pilha.size();){
            int element = pilha.get(i);
            pilha.remove(i);
            fila.add(element);
        }

        //Passo6:
        //Exiba todos os números que foram inseridos na fila. ;
        System.out.println("Dados da Fila");
        System.out.println(fila);
    }
}