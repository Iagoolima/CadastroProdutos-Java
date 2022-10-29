import java.util.Scanner;


public class App {
    
   
    //Metodo do menu 1
     public static String[] cadastrar(){

        Scanner entrada = new Scanner(System.in);
        String[] nome = new String[3];
        
        for(int i = 0; i < nome.length; i++){
            System.out.println("DIgite o nome do "+(i+1)+"° produto: ");
            nome[i] = entrada.nextLine();
        }
        
        return nome;
    }
     
     //metodo do menu 2
     public static int[] cadastrarQuantidade(String[] nome){
        Scanner entrada = new Scanner(System.in);
        int[] quantidade = new int[3];
        
        for(int i = 0; i < quantidade.length; i++){
            System.out.println("Quantidade do produto " + nome[i]+" : ");
            quantidade[i] = entrada.nextInt();
        }
        
        return quantidade;
    }

    //metodo 3
    public static double[] cadastrarValor(String[] nome){
        Scanner entrada = new Scanner(System.in);
        double[] valor = new double[3];

        for(int i = 0; i < valor.length; i++){
            System.out.println("Valor do produto " + nome[i]+" : ");
            valor[i] = entrada.nextDouble();
        }

        return valor;
    }
     
     //metodo do menu 4
     public static void imprimir(String[] nome, int[] quantidade, double[] valor){
        for(int i = 0; i < nome.length; i++){
            System.out.println("produto "+(i+1)+"\nNome: " +nome[i]+"\nQuantidade: "+quantidade[i]+"\nValor Unitario: "+valor[i]);
            System.out.println("\n--------------------------------------------------------------------------------------");
        }
    }


    //metodo 5
    
    public static double[] totalValor(String[] nome, double[] valor, int[]quantidade){
        Scanner entrada = new Scanner(System.in);
        double[] somaProduto = new double[3];
        

        for(int i = 0; i < somaProduto.length; i++){
            somaProduto[i] = valor[i]* quantidade[i];
            System.out.println("Produto: "+nome[i]+"Valor total Estoque "+somaProduto[i]);
            System.out.println("\n--------------------------------------------------------------------------------------");
            
        }

        return somaProduto;
    }

    //metodo 6   
    public static void totalEstoque(double[] somaProduto){
        Scanner entrada = new Scanner(System.in);
        double valorEstoque;
        valorEstoque = 0;
        
        for(int i = 0; i < somaProduto.length; i++){
            
            valorEstoque += somaProduto[i];
            
        }
        System.out.println("valor Estoque: "+valorEstoque);
            System.out.println("\n--------------------------------------------------------------------------------------");
            

      
    }
     
    //programa principal
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op;
        String[] nomeProduto = new String[3];
        int[] quantidade = new int[3];
        double[] valorProduto = new double[3];
        double[] estoqueUnitario = new double[3];
        double[] estoqueValorTotal = new double[3];
       
        
        
        do{

            System.out.println("\nMenu de opcoes");
            System.out.println("1 - Cadastrar os nomes dos produtos");
            System.out.println("2 - Cadastrar a quantidade em estoque de cada produto");
            System.out.println("3 - Cadastrar o valor unitario de cada  produto");
            System.out.println("4 - Exibir todos os produtos");
            System.out.println("5 - Calular o valor total em estoque de cada produto");
            System.out.println("6 - Calcular o valor total em estoque de todos os produtos");
            System.out.println("0 - Sair do programa");
            
            System.out.println("Entre com a opcao do menu: ");
            op = entrada.nextInt();
            
            if (op >= 0 & op <= 6){
            
                switch(op){
                    case 1: 
                        System.out.println("CADASTRO DOS NOMES DOS PRODUTOS\n");
                        nomeProduto = cadastrar();
                        break;
                    case 2: 
                        System.out.println("CADASTRO DA QUANTIDADE DOS PRODUTOS\n");
                        quantidade = cadastrarQuantidade(nomeProduto);
                        break;
                    case 3:
                        System.out.println("CADASTRO DO VALOR UNITARIO DOS PRODUTOS");
                        valorProduto = cadastrarValor(nomeProduto);
                        break;
                    case 4:
                        System.out.println("EXBIR OS PRODUTOS");
                        imprimir(nomeProduto,quantidade,valorProduto);
                        break;
                    case 5:
                        System.out.println("VALOR TOTAL EM ESTOQUE DE CADA PRODUTO\n");
                        estoqueUnitario = totalValor(nomeProduto,valorProduto,quantidade);
                        break;
                    case 6:
                        System.out.println("VALOR TOTAL EM ESTOQUE - GERAL\n");
                        totalEstoque(estoqueUnitario);

                        break;
                }
            }else
            {
                    System.out.println("Opcao invalida!!");
            }
            }while(op != 0);

        entrada.close();
    }
  
}
