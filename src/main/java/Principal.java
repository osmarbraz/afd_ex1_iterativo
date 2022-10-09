
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String args[]) {
        
        String entrada = "";
        if (args.length != 0) {
            entrada = args[0];
        } else {
            entrada = JOptionPane.showInputDialog("Digite uma palavra a ser avaliada:");
        }

        //Armazena o estado inicial
        int estado_inicial = 0;
        //Armazena o estado final
        int estado_final = 2;

        //Armazena o estado atual
        int estado_atual = estado_inicial;

        //Armazena o estado próximo
        int estado_proximo = -1;

        //Indice da letra da entrada
        int i = 0;

        //Enquando não chegou no final da entrada e diferente do estado final
        while ((i < entrada.length()) && (estado_atual != estado_final)) {

            //Recupera um caracter
            char avaliar = entrada.charAt(i);

            // Avaliando as combinações
            // Estado 0 para 1
            if (estado_atual == 0 && avaliar == 'a') {
                estado_proximo = 1;
            }
            // Estado 1 para 1
            if (estado_atual == 1 && avaliar == 'b') {
                estado_proximo = 1;
            }
            // Estado 1 para 2 (Estado final)
            if (estado_atual == 1 && avaliar == 'a') {
                //Se chegou no final da entrada
                if (i + 1 == entrada.length()) {
                    estado_proximo = 2;
                } else {
                    estado_proximo = -1;
                    break;
                }
            }
            // Atualiza o estado atual
            estado_atual = estado_proximo;

            //Incrementa o indice das letras da entrada	
            i = i + 1;
        }

        //Verifica se o estado atual é igual ao estado final
        if (estado_atual == estado_final) {
            System.out.println("\nEntrada valida   :" + entrada);
        } else {
            System.out.println("\nEntrada invalida :" + entrada);
        }
    }
}
