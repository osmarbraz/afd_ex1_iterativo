
import javax.swing.JOptionPane;

public class Principal {

    /**
     * Estados do AFD.
     */
    enum Estado {
        S0, S1, S2, S3
    }

    //Armazena o estado inicial
    static Estado estado_inicial = Estado.S0;
    //Armazena o estado final
    static Estado estado_final = Estado.S3;
    //Armazena o estado atual
    static Estado estado_atual = estado_inicial;
    //Armazena se a entrada é válida
    static boolean valido = true;

    //Indice da letra da entrada
    static int i = 0;

    //Retorna um caracter da entrada e avança o indice para o próximo
    public static char proximoCaracter(String entrada) {
        char retorno = 0;
        if (i < entrada.length()) {
            retorno = entrada.charAt(i);
            i = i + 1;
        } else {
            retorno = 0;
        }
        return retorno;
    }

    public static void main(String args[]) {

        System.out.println("\nImplementacao iterativa:\n");

        String entrada = "";
        if (args.length != 0) {
            entrada = args[0];
        } else {
            entrada = JOptionPane.showInputDialog("Digite uma palavra a ser avaliada:");
        }

        //Enquando não chegou no final da entrada e seja válido.
        while (i < entrada.length() && valido) {

            //Recupera um caracter
            char avaliar = proximoCaracter(entrada);

            //Analise do estado
            switch (estado_atual) {

                case S0: {
                    // Estado 0 para 1
                    if (avaliar == 'a') {
                        estado_atual = Estado.S1;
                    } else {
                        // Estado 0 para 1
                        if (avaliar == 'b') {
                            estado_atual = Estado.S1;
                        } else {
                            valido = false;
                        }
                    }
                    break;
                }

                case S1: {
                    // Estado 1 para 2
                    if (avaliar == 'a') {
                        estado_atual = Estado.S2;
                    } else {
                        if (avaliar == 'b') {
                            estado_atual = Estado.S2;
                        } else {
                            valido = false;
                        }
                    }
                    break;
                }

                case S2: {
                    // Estado 2 para 3
                    if (avaliar == 'a') {
                        estado_atual = Estado.S3;
                    } else {
                        if (avaliar == 'b') {
                            estado_atual = Estado.S3;
                        } else {
                            valido = false;
                        }
                    }
                    break;
                }

                case S3: {
                    // Estado 3 (final)

                    //Se tem caracteres para ler torna inválida a palavra
                    if (i >= entrada.length()) {
                        valido = false;
                    }
                    break;
                }
            }
        }

        //Verifica se o estado atual é igual ao estado final
        if ((estado_atual == estado_final) && (valido == true)) {
            System.out.println("Entrada valida   :" + entrada);
        } else {
            System.out.println("Entrada invalida :" + entrada);
        }
    }
}
