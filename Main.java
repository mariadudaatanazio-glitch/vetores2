import javax.print.attribute.standard.NumberUp;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

         Algoritmo1();
         Algoritmo2();
         Algoritmo3();
         Algoitmo4();
         Algoritmo5();
         Algoritmo6();
         Algoritmo7();
         Algoritmo8();
         Algoritmo9();
         Algoritmo10();
         Algoritmo11();
         Algoritmo12();
         Algoritmo13();
         Algoritmo14();
         Algoritmo15();
         Algoritmo16();
         Algoritmo17();
         Algoritmo18();
        Algoritmo19();
        Algoritmo20();
    }

    private static void Algoritmo1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("+++++Algoritmo 1+++++");

        int i;
        int[] numeros = new int[10];
        int numerosPrimos;
        int divisor;

        for (i = 0; i < numeros.length; i++) {
            System.out.print("digite o " + (i + 1) + "° número: ");
            numeros[i] = scanner.nextInt();
        }

        for (i = 0; i < numeros.length; i++) {
            numerosPrimos = 0;

            for (divisor = 1; divisor <= numeros[i]; divisor++) {
                if (numeros[i] % divisor == 0) {
                    numerosPrimos++;
                }
            }
            if (numerosPrimos == 2) {
                System.out.println("Os números primos são: " + numeros[i] + " Na posição: " + i);
            }
            scanner.close();
        }
    }

    private static void Algoritmo2() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("++++Algoritmo 2++++++");

        int[] numVetor1 = new int[10];
        int[] numVetor2 = new int[10];
        int[] numIntercalados = new int[20];
        int i;

        for (i = 0; i < numVetor1.length; i++) {

            System.out.println("Digite o " + (i + 1) + "° número para a etapa 1:");
            numVetor1[i] = scanner.nextInt();
        }

        for (i = 0; i < numVetor2.length; i++) {
            System.out.println("Digte o " + (i + 1) + "° número para a etapa 2:");
            numVetor2[i] = scanner.nextInt();
        }

        for (i = 0; i < numIntercalados.length; i++) {
            if (i % 2 == 0) {
                numIntercalados[i] = numVetor1[i / 2];
            } else {
                numIntercalados[i] = numVetor2[i / 2];
            }

            System.out.println("Os número intercalados etapa 1 e 2 são: " + numIntercalados[i]);
        }
        scanner.close();
    }

    private static void Algoritmo3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("+++++Algoritmo 3++++++++");

        double[] numero = new double[10];
        double media = 0;
        double soma = 0;
        int cont;

        for (cont = 0; cont < numero.length; cont++) {

            System.out.println("Digite o " + (cont + 1) + "° número:");
            numero[cont] = scanner.nextInt();

            soma += numero[cont];
            media = soma / (cont + 1);
        }
        System.out.println("A média dos números é:" + media);
        scanner.close();
    }

    private static void Algoitmo4() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("++++Algoritmo 4++++++");

        int[] numeros = new int[20];
        int i;
        boolean isTrue = false;
        Random random = new Random();

        for (i = 0; i < numeros.length; i++) {

            numeros[i] = random.nextInt(30);
        }
        for (i = 0; i < numeros.length; i++) {

            if (numeros[i] == 25) {
                isTrue = true;
                System.out.println("O número 25 foi encontrado");
            }
        }

        scanner.close();
    }

    private static void Algoritmo5() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("+++++Algoritmo 5++++++");

        int[] numeros = new int[15];
        int i;
        Random random = new Random();
        boolean isTrue = false;

        for (i = 0; i < numeros.length; i++) {

            numeros[i] = random.nextInt(50);
        }
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] == 20) {
                isTrue = true;
                System.out.println("O número 20 está no intervalo " + (i + 1));

            }
        }

        scanner.close();
    }

    private static void Algoritmo6() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("+++ Algoritmo 6+++++");

        int[] numeros = new int[30];
        Random random = new Random();
        int i;
        int numExcluido;
        int j;

        for (i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        System.out.println("Digite um número para ser excluído:");
        numExcluido = scanner.nextInt();
        for (i = 0; i < numeros.length; i++) {

            if (numeros[i] == numExcluido) {
                for (j = 0; j < numeros.length - 1; j++)
                    numeros[j] = numeros[j + 1];
                numeros[numeros.length - 1] = 0;
            }
        }
        System.out.println("número " + numExcluido + " excluído");
        scanner.close();
    }


    private static void Algoritmo7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("+++++Algoritmo 7++++++");

        double[] numeros = new double[5];
        int i;
        double maior = numeros[0];
        double menor = numeros[0];


        System.out.println("Digite 5 números decimais");
        for (i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + " número;");
            numeros[i] = scanner.nextDouble();

            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        scanner.close();
    }

    private static void Algoritmo8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("+++++++Algoritmo 8+++++++");

        int[] numerosA = new int[15];
        int[] numerosB = new int[15];
        int i;
        Random rendom = new Random();

        for (i = 0; i < numerosA.length; i++) {
            numerosA[i] = rendom.nextInt(100);
            System.out.println("Os números são " + numerosA[i]);
        }
        for (i = 0; numerosB.length > i; i++) {
            numerosB[i] = numerosA[numerosA.length - 1 - i];

            System.out.println("O números de trás para frente são: " + numerosB[i]);
        }
        scanner.close();
    }

    private static void Algoritmo9() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("+++++Algoritmo 9+++++++");

        System.out.println("Ditite o numero de recibos;");
        int quantidade = scanner.nextInt();

        int[] recibos = new int[quantidade];
        int i = 0;

        while (i < quantidade) {
            recibos[i] = i + 1;

            System.out.println("nÚMERO DOS RECIBOS: " + recibos[i]);
            i++;
        }
        scanner.close();
    }

    private static void Algoritmo10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("+++++Algoritmo 10++++++");

        int[] tabuada = new int[10];
        int i;

        System.out.println("Digite um número");
        int numero = scanner.nextInt();

        for (i = 0; i < tabuada.length; i++) {
            tabuada[i] = numero * (i + 1);

            System.out.println("A tabuada de" + numero + "até o número 10 é: " + tabuada[i]);
        }
        scanner.close();
    }

    private static void Algoritmo11() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("++++Algoritmo 11+++++");

        int[] temperatura = new int[10];
        int i;
        int soma = 0;
        int media;

        for (i = 0; i < temperatura.length; i++) {
            System.out.println("Digite a " + (i + 1) + "° temperatura");
            temperatura[i] = scanner.nextInt();
            soma += temperatura[i];
        }
        media = soma / i;
        System.out.println("A média das temperatuas é: " + media);
    }

    private static void Algoritmo12() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("++++++Algoritmo 12++++++");

        int[] numeros = new int[50];
        int numerosPares;
        int i;

        System.out.println("Digite numeros de 1 a 50:");
        for (i = 0; i < numeros.length; i++) {

            numeros[i] = scanner.nextInt();
            numeros[i] = i + 1;
        }
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                numerosPares = numeros[i];
                System.out.println("Os números pares são " + numerosPares);
            }
        }
        scanner.close();
    }

    private static void Algoritmo13() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("++++Algoritmo 13+++++");


        System.out.print("Digite um número inteiro para gerar as chaves: ");
        int n = scanner.nextInt();

        int i = 0;
        int j;

        int[] quantidadePrimos = new int[n];


        for (i = 0; i < n; i++) {
            quantidadePrimos[i] = i + 1;
        }


        for (i = 0; i < n; i++) {

            int primo = quantidadePrimos[i];
            int divisores = 0;

            for (j = 1; j <= primo; j++) {

                if (primo % j == 0) {
                    divisores++;
                }
            }

            if (divisores == 2) {
                System.out.println("Chave gerada: " + primo);
            }
        }
        scanner.close();
    }

    private static void Algoritmo14() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("+++++Algoritmo 14+++++");

        System.out.print("Digite o número de etapas de produção: ");
        int etapaProducao = scanner.nextInt();

        double[] tempos = new double[etapaProducao];
        double tempoTotal = 0.0;

        for (int i = 0; i < etapaProducao; i++) {
            System.out.println("Digite o tempo da etapa : " + i + 1);
            tempos[i] = scanner.nextDouble();
        }
        for (int i = 0; i < etapaProducao; i++) {
            tempoTotal += tempos[i];
        }
        System.out.println("Tempo total de produção:" + tempoTotal);

        scanner.close();
    }

    private static void Algoritmo15() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("++++++Algoritmo 15+++++++");

        System.out.print("Digite o número de tarefas: ");
        int numero = scanner.nextInt();

        long[] prazos = new long[numero];

        for (int i = 0; i < numero; i++) {
            if (i == 0) {
                prazos[i] = 0;
            } else if (i == 1) {
                prazos[i] = 1;
            } else {
                prazos[i] = prazos[i - 1] + prazos[i - 2];
            }
        }

        for (int i = 0; i < numero; i++) {
            System.out.println("Tarefa : " + i + 1);
            System.out.println("tempo: " + prazos[i]);
        }

        scanner.close();
    }

    private static void Algoritmo16() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("+++++Algoritmo 16++++++");

        int[] numeros = new int[5];
        int[] numerosIverso = new int[5];
        int i;

        for (i = 0; i < numeros.length; i++) {
            System.out.println("Digite a nota do " + (i + 1) + "° entrevistado:");
            numeros[i] = scanner.nextInt();
        }
        for (i = 0; numerosIverso.length > i; i++) {
            numerosIverso[i] = numeros[numeros.length - 1 - i];

            System.out.println("As notas dos candidatos de trás para frente são: " + numerosIverso[i]);
        }
        scanner.close();
    }

    private static void Algoritmo17() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("+++Algoritmo 17+++++");

        int[] notas = new int[10];
        int soma = 0;
        int media;
        int i;

        for (i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota do " + (i + 1) + "° aluno:");
            notas[i] = scanner.nextInt();
            soma += notas[i];

        }
        media = soma / i;
        System.out.println("A média de notas dos alunos é: " + media);
        scanner.close();
    }

    private static void Algoritmo18() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("++++Algoritmo 18+++++");

        int[] temperatura = new int[8];
        int i;
        int maior = 0;


        for (i = 0; i < temperatura.length; i++) {
            System.out.println("Digite a " + (i + 1) + "° temperatura");
            temperatura[i] = scanner.nextInt();

            if (temperatura[i] > maior) {
                maior = temperatura[i];
            }
        }
        System.out.println("A maior temperatura registrada foi: "+ maior);
        scanner.close();
    }
    private static void Algoritmo19(){
        Scanner scanner=new Scanner(System.in);
         System.out.println("++++++Algoritmo 19++++++++");

        System.out.print("Quantos produtos deseja cadastrar no estoque:");
        int quantidade = scanner.nextInt();

        int[] estoque = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o código do produto para a posição " + i + ": ");
            estoque[i] = scanner.nextInt();
        }
        System.out.println("Digite o código do produto que deseja buscar: ");
        int codigoProcurado = scanner.nextInt();

        boolean encontrado = false;
        int posicao = -1;

        for (int i = 0; i < quantidade; i++) {
            if (estoque[i] == codigoProcurado) {
                encontrado = true;
                posicao = i;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O produto " + codigoProcurado + " foi encontrado na posição " + posicao + " do vetor.");
        } else {
            System.out.println("O produto " + codigoProcurado + " não está no vetor.");
        }
        scanner.close();
    }
    private static void Algoritmo20(){
        Scanner scanner=new Scanner(System.in);

        System.out.println("+++++Algoritmo 20++++++++");

        double[] precos = new double[10];
        int i;
        int j;
        double copo;

        for ( i = 0; i < precos.length; i++) {
            System.out.print("Digite o preço do produto " + (i + 1) + ": R$ ");
            precos[i] = scanner.nextDouble();
        }
        for ( i = 0; i < precos.length - 1; i++) {
            for (j = 0; j < precos.length - 1 - i; j++) {
                if (precos[j] > precos[j + 1]) {
                    copo = precos[j];
                    precos[j] = precos[j + 1];
                    precos[j + 1] = copo;
                }
            }
        }
        for ( i = 0; i < precos.length; i++) {
            System.out.println("Posição : "+ i+"  Preço: "+ precos[i]);
        }
        scanner.close();
    }
    }







