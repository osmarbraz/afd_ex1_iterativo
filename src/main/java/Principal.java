
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String args[]) {
        
        System.out.println("\nImplementacao iterativa:\n");
        
        String entrada = "";
        if (args.length != 0) {
            entrada = args[0];
        } else {
            entrada = JOptionPane.showInputDialog("Digite uma palavra a ser avaliada:");
        }

        //Armazena o estado inicial
        int estado_inicial = 0;        
        //Armazena o estado final
        int estado_final = 3;
        //Armazena o estado atual
        int estado_atual = estado_inicial;
        //Armazena o estado próximo
        int estado_proximo = -1;
        
        //Indice da letra da entrada
        int i = 0;

        //Enquando não chegou no final da entrada
        while (i < entrada.length())  {

            //Recupera um caracter
            char avaliar = entrada.charAt(i);

            // Avaliando as combinações
            // Estado 0 para 1
            if (estado_atual == 0 && avaliar == 'a') {
                estado_proximo = 1;
            }
            // Estado 0 para 1
            if (estado_atual == 0 && avaliar == 'b') {
                estado_proximo = 1;
            }
            // Estado 1 para 2
            if (estado_atual == 1 && avaliar == 'a') {
                estado_proximo = 2;
            }
            // Estado 1 para 2
            if (estado_atual == 1 && avaliar == 'b') {
                estado_proximo = 2;
            }
            // Estado 2 para 3 
            if (estado_atual == 2 && avaliar == 'a') {                
                estado_proximo = 3;                
            }
            // Estado 2 para 3 
            if (estado_atual == 2 && avaliar == 'b') {
                estado_proximo = 3;
            }            
            // Estado 3 (Estado final)
            if (estado_atual == 3 ) {
                
                //Se tem caracteres a avaliar
                if (i < entrada.length()) {
                    estado_proximo = -1;                    
                }
            }
                                    
            // Atualiza o estado atual
            estado_atual = estado_proximo;
            
            //Incrementa o indice das letras da entrada	
            i = i + 1;
        }

        //Verifica se o estado atual é igual ao estado final
        if (estado_atual == estado_final) {
            System.out.println("Entrada valida   :" + entrada);
        } else {
            System.out.println("Entrada invalida :" + entrada);
        }
    }
}