import java.util.Scanner;

class atvd3{
    public static void questao01(){
         Scanner sc = new Scanner(System.in);
        String nome = sc.next();
        System.out.println("Bem vindo " + nome + "!");
    }
     public static void questao02(){
         // Peça ao usuário que digite sua idade em texto (por exemplo, "18") e converta-a em um número inteiro.
        Scanner sc = new Scanner(System.in);
        String idade = "18";
        int number = Integer.parseInt(idade);
        System.out.println(number);
    }
     public static void questao03(){
         // Receba um número inteiro do usuário e converta-o em um número decimal (float).
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float nDec = (float) n;
        System.out.println(nDec);
    }
    public static void questao04(){
         //Peça ao usuário para digitar dois números inteiros e exiba a soma deles.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println(c);
    }
    public static void questao05(){
         //Receba um número decimal do usuário e calcule o seu quadrado.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("O quadrado do número é " + n*n);
    }
    public static void questao06(){
        // Peça ao usuário que insira o seu ano de nascimento e, em seguida, exiba a sua idade.
        Scanner sc = new Scanner(System.in);
        int ano = sc.nextInt();
        int idade =  2023 - ano;
        System.out.println("Você nasceu no ano " + ano + " e tem " + idade + " anos.");
    }
    public static void questao07(){
        //Peça ao usuário que digite seu primeiro nome e seu sobrenome separadamente. Em seguida, concatene-os em uma única string e exiba o nome completo.
        Scanner sc = new Scanner(System.in);
        String nome = sc.next();
        String sobrenome = sc.next();
        System.out.println("Seu nome é " + nome + " " + sobrenome);
    }
    public static void questao08(){
        //Solicite ao usuário uma sequência de números separados por espaço e exiba quantos números foram digitados.
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        String[] numeros = N.split(" ");
        System.out.println("Foram digitados " + numeros.length + " números.");
    }
    public static void questao09(){
         //Receba o nome de um animal digitado pelo usuário e exiba uma mensagem informando qual animal foi digitado.
        Scanner sc = new Scanner(System.in);
        String animal = sc.next();
        System.out.println("O animal digitado foi " + animal + ".");

    }
    public static void questao10(){
         //Peça ao usuário que digite o seu nome e o seu sobrenome. Em seguida, exiba o nome completo invertido (sobrenome, nome).
        Scanner sc = new Scanner(System.in);
        String nomeC = sc.nextLine();
        String[] nome = nomeC.split(" ");
        String primeiro = nome[0];
        String segundo = nome[1];
        System.out.println(segundo + ", " + primeiro);
    }
    public static void questao11(){
        // Receba uma string digitada pelo usuário e imprima o seu tamanho (número de caracteres).
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String[] qtd = string.split("");
        System.out.println("o numero de caracteres dessa string é " + qtd.length);
    }
    public static void questao12(){
          // Solicite ao usuário um número inteiro e exiba se ele é par ou ímpar.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N%2 == 0){
            System.out.println("É par");
        }else
            System.out.println("É impar");
    }
    public static void questao13(){
        // Receba um número inteiro digitado pelo usuário e verifique se ele é positivo ou negativo.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N>0){
            System.out.println("É positivo");
        }else
            System.out.println("É negativo");
    }
    public static void questao14(){
         //Peça ao usuário que insira dois números e exiba o maior deles.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a>b){
            System.out.println(a + " é maior");
        }else
            System.out.println(b + " é maior");
    }
    public static void questao15(){
         /* Receba a altura e o peso de uma pessoa digitados pelo usuário. Em seguida, calcule o seu índice de
       massa corporal (IMC) utilizando a fórmula: IMC = peso / (altura * altura) e exiba o resultado.         */
        Scanner sc = new Scanner(System.in);
        double altura = sc.nextDouble();
        double peso = sc.nextDouble();
        double IMC = peso / (altura*altura);
        System.out.printf("O seu IMC é: %.2f",IMC);
    }
    public static void questao16(){
         // Peça ao usuário que digite o seu nome e verifique se ele contém mais de 5 caracteres.
        Scanner sc = new Scanner(System.in);
        String nome = sc.next();
        String[] qtd = nome.split("");
        if(qtd.length > 5){
            System.out.println("O nome contém mais de 5 caracteres");
        }else
            System.out.println("O nome contém menos de 5 caracteres");
        System.out.println("Quantidade de caracteres: " + qtd.length);
    }
    public static void questao17(){
         //Solicite ao usuário que insira o seu estado civil e exiba uma mensagem apropriada (por exemplo: "Você é casado(a)", "Você é solteiro(a)", etc.).
        Scanner sc = new Scanner(System.in);
        String estadoC = sc.next();
        System.out.println("Você é " + estadoC);
    }
    public static void questao18(){
         //Receba a base e a altura de um retângulo digitados pelo usuário. Em seguida, calcule a sua área e exiba o resultado.
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int altura = sc.nextInt();
        int area = base * altura;
        System.out.println("A área do retângulo é " + area);
    }
    public static void questao19(){
         //Peça ao usuário que digite a sua cidade e verifique se ela começa com a letra "S" (ou outra letra de sua escolha).
        Scanner sc = new Scanner(System.in);
        String cidade = sc.next();
        char primeira_letra = cidade.charAt(0);
        System.out.println(primeira_letra);
        if(cidade.charAt(0) == 'S'){
            System.out.println("A cidade digitada começa com S");
        }
        else
            System.out.println("A cidade não começa com S, mas sim com " + primeira_letra);
    }
    public static void questao20(){
        // Solicite ao usuário que insira dois números decimais e calcule o resto da divisão entre eles.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int resto = a%b;
        if(resto == 0){
            System.out.println("A divisão não tem resto");
        }
        else
            System.out.println("O resto da divisão é " + resto);
    }
    public static void questao21(){
         //Solicite ao usuário um número decimal e converta-o em um número inteiro.
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        int nInt = (int) N;
        System.out.println(nInt);
    }
    public static void questao22(){
         //Receba uma string contendo um número inteiro e some 10 a esse número, convertendo-o novamente para uma string antes de exibi-lo.
         Scanner sc = new Scanner(System.in);
         String numeroStr = sc.next();
         int numeroInt = Integer.parseInt(numeroStr);
         int soma = numeroInt + 10;
         String printNumero = Integer.toString(soma);
 
 
         System.out.println(printNumero);
    }
    public static void questao23(){
         //Solicite ao usuário que digite uma data no formato "dd/mm/aaaa" e extraia o dia, o mês e o ano separadamente, convertendo-os em números inteiros.
         Scanner sc = new Scanner(System.in);
         String data = sc.next();
         String[] barra = data.split("/");
         int dia = Integer.parseInt(barra[0]);
         int mes = Integer.parseInt(barra[1]);
         int ano = Integer.parseInt(barra[2]);
         System.out.println("Nasceu no dia " + dia + ", no mês " + mes + ", do ano de " + ano);
    }
    public static void questao24(){
         //Receba o nome de uma cidade do usuário e concatene-o com o nome do estado para formar uma mensagem completa, como "Você mora em [cidade], [estado].".
         Scanner sc = new Scanner(System.in);
         String cidade = sc.next();
         String estado = sc.next();
         System.out.println("Você mora em " + cidade + ", " + estado);
    }
    public static void questao25(){
        //Solicite ao usuário que insira seu ano de nascimento e concatene-o com uma mensagem de boas-vindas, como "Bem-vindo ao nosso programa, nascido em [ano de nascimento]!".
        Scanner sc = new Scanner(System.in);
        String ano = sc.next();
        System.out.println("Bem-vindo ao nosso programa, nascido em " + ano);
    }
    public static void questao26(){
         //Receba um número inteiro e uma string do usuário. Em seguida, concatene-os em uma única string, separando-os com um espaço.
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         String b = sc.next();
         String c = a + " " + b;
         System.out.println(c);
    }
    public static void questao27(){
         //Receba o nome de um produto digitado pelo usuário e concatene-o com o preço do produto, adicionando o símbolo de moeda da sua escolha.
         Scanner sc = new Scanner(System.in);
         String produto = sc.next();
         float preço = sc.nextFloat();
         String moeda = sc.next();
         System.out.println("Produto: " + produto);
         System.out.println("Preço: " + moeda + preço);
 
    }
    public static void questao28(){
        // Receba um número inteiro do usuário e concatene-o com uma mensagem, informando o dobro desse número.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() * 2;
        System.out.println("O dobro do numero digitado é " + n);
    }
    public static void questao29(){
         //Receba uma string contendo um endereço de e-mail e concatene-a com uma mensagem de agradecimento personalizada.
         Scanner sc = new Scanner(System.in);
         String mensagem = "obrigado pelo convite,";
         String email = "guilherme.melo@outlook.com";
         System.out.println( mensagem + " " + email);
    }
    public static void questao30(){
        //Receba dois números inteiros do usuário e exiba a soma, a diferença, o produto e o quociente (divisão inteira) entre eles.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Soma: " + (a+b));
        System.out.println("Diferença: " + (a-b));
        System.out.println("Produto: " + (a*b));
        System.out.println("Quociente: " + (a/b));
    }
    public static void questao31(){
         //Peça ao usuário para digitar a base e a altura de um triângulo. Em seguida, calcule e exiba a área do triângulo.
         Scanner sc = new Scanner(System.in);
         int base = sc.nextInt();
         int altura = sc.nextInt();
         int area = (base*altura)/2;
         System.out.println("A área do triângulo é " + area);
    }
    public static void questao32(){
        // Receba o raio de uma circunferência digitado pelo usuário e calcule o seu perímetro (2 * π * raio).
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextInt();
        double perimetro = 2 * 3.14 * raio;
        System.out.printf("O perímetro é %.2f", perimetro);
    }
    public static void questao33(){
        // Receba a base e a altura de um retângulo digitados pelo usuário. Em seguida, calcule e exiba o perímetro do retângulo.
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double altura = sc.nextDouble();
        double perimetro = 2 * (base+altura);
        System.out.printf("O perímetro do retângulo é %.2f", perimetro);
    }
    public static void questao34(){
         // Solicite ao usuário que insira três números decimais. Em seguida, calcule e exiba a média aritmética desses números.
         Scanner sc = new Scanner(System.in);
         double n1 = sc.nextDouble();
         double n2 = sc.nextDouble();
         double n3 = sc.nextDouble();
         double media = (n1+n2+n3) / 3;
         System.out.printf("A média é %.2f",media);
    }
    public static void questao35(){
        // Peça ao usuário para digitar a sua idade e, em seguida, informe quantos meses e quantos dias ele já viveu (considerando um ano com 365 dias).
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        int meses = 12 * idade;
        int dias = 365 * idade;
        System.out.println("Você tem " + idade +" anos " + "e já viveu " + meses + " meses e " + dias + " dias");
    }
    public static void questao36(){
         //Receba um valor em reais e a cotação do dólar digitados pelo usuário. Em seguida, converta o valor para dólares e exiba o resultado.
         Scanner sc = new Scanner(System.in);
         double reais = sc.nextDouble();
         double cotaçãoD = 4.98;
         double dolar = reais*cotaçãoD;
         System.out.printf("O valor da conversão é de U$ %.2f dólares",dolar);
     }
    public static void questao37(){
        // Solicite ao usuário para digitar um número decimal e arredonde-o para o inteiro mais próximo.
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        int arredondado = (int) Math.round(n);
        System.out.println("O numero arredondado para o inteiro mais próximo é " + arredondado);
    }
    public static void questao38(){
         //Receba três números inteiros digitados pelo usuário e exiba o resultado da operação (n1 + n2) * n3.
         Scanner sc = new Scanner(System.in);
         int n1 = sc.nextInt();
         int n2 = sc.nextInt();
         int n3 = sc.nextInt();
         System.out.println( (n1+n2) * n3);
    }
    public static void questao39(){
        //Peça ao usuário que digite uma temperatura em graus Celsius e a converta para Fahrenheit usando a fórmula: Fahrenheit = (Celsius * 9/5) + 32.
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("A conversão de " + celsius + " °C" + " para Fahrenheit é de " + fahrenheit + " °F");
    }
    public static void main(String[] args) {
        
    }
    }
 

    
