import java.util.Scanner;

//Faça um programa que leia 5 números e adicione-os num array. Depois quando o usuário
//digitar um número para ser buscado, informe se ele está ou não no array
public class Main {
    public static void main(String[] args) {

        int[]vetor = new int[5];
        boolean foiEncontrado = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 5 valores ");
        //Adiciona os valores no array
        vetor[0] = sc.nextInt();
        vetor[1] = sc.nextInt();
        vetor[2] = sc.nextInt();
        vetor[3] = sc.nextInt();
        vetor[4] = sc.nextInt();

        //Lê a busca
        System.out.println("Digite uma busca: ");
        int valorBuscado = sc.nextInt();

        for(int i = 0; i < 5; i++){
            //Se o vetor naquela posição atual é igual ao valor buscado
            if(vetor[i] == valorBuscado){
                foiEncontrado = true;
            }
        }

        if(foiEncontrado){
            System.out.println("Foi encontrado!");
        }else{
            System.out.println("Não foi encontrado!");
        }
    }
}