import java.util.Scanner;

public class Main{
    
    static Scanner input = new Scanner(System.in);
    static boolean found = false;
    static int change, option;
    static String search;
    
    public static void CadastroClientesDefault(String[] client_name,String[] client_address,String[] client_number){
        String[] client_name_default = {"joao", "pedro", "maria", "joaquina", "cirilo", "ze vaqueiro","avicci", "romeu", "billie", "olivia"};
        String[] client_address_default = {"rio de janeiro", "goias", "minas gerais", "bahia", "para", "df","suecia", "inglaterra", "eua", "canada"};
        String[] client_number_default = {"61","62","11","49","21","33","01","55","25","10"};
        
        for(int i = 0; i < 10; ++i){
           client_name[i] = client_name_default[i];
           client_address[i] = client_address_default[i];
           client_number[i] = client_number_default[i];
        }
    }
    public static void CadastroProdutosDefault(String[] product_name, String[] product_description, String[] product_price, String[] product_profit, int[] product_stock){
        String[] product_name_dafult = {"Sabao", "arroz", "detergente", "feijao", "iphone", "zenphone"};
        String[] product_description_dafault = {"Sabao de coco", "Arroz branco", "detergente omo", "feijao carioca", "iphone 12+", "zenphone plus"};
        String[] product_price_dafault = {"7", "25", "12", "15", "4000", "2000"};
        String[] product_profit_dafault = {"10", "15", "5", "10", "15", "100"};
        int[] product_stock_dafault = {10,25,100,35,50,10};
        
         for(int i = 0; i < 6; ++i){
           product_name[i] = product_name_dafult[i];
           product_description[i] = product_description_dafault[i];
           product_price[i] = product_price_dafault[i];
           product_profit[i] = product_profit_dafault[i];
           product_stock[i] = product_stock_dafault[i];
        }
        
    }
	public static void main(String[] args) {
		
		//Atributos do cliente
		String[] client_name = new String[50];
		String[] client_address = new String[50];
		String[] client_number = new String[50];
		
		//Atributos do produto
		String[] product_name = new String[50];
		String[] product_description = new String[50];
		String[] product_price = new String[50];
		String[] product_profit = new String[50];
		int[] product_stock = new int[50];
		
		//Cadastro automatico de clientes e produtos
		CadastroClientesDefault(client_name, client_address, client_number);
		CadastroProdutosDefault(product_name,product_description, product_price, product_profit, product_stock);
		
	    do{
	        System.out.println("Menu de opções");
	        System.out.println("1-Cadastro de novo Cliente");
	        System.out.println("2-Busca por Cliente");
	        System.out.println("3-Cadastro de novo produto");
	        System.out.println("4-Busca por produto");
	        System.out.println("5-Cadastro de venda");
	        System.out.println("6-Mostrar produtos em estoque");
	        System.out.println("7-Sair");
	        System.out.print("Digite a sua opção: ");
	        option = input.nextInt();
	        
	        switch(option){
	            case 1:
	                //Cadastrar Cliente; com nome, endereço e número.
	                
	                CadastrarClientes(client_name, client_address, client_number);
	                
	                break;
	            case 2:
	                //Busca por cliente e alteração
	                
	                BuscarCliente(client_name, client_address, client_number);
	                
	                break;
                case 3:
                    /*Cadastro de Produto; com nome do produto, descrição, valor de compra, 
                    porcentagem de lucro e quantidade em estoque.*/
                    
            	    CadastrarProdutos(product_name,product_description, product_price, product_profit, product_stock);
	                
	                break;
                case 4:
                    //Busca e alteração de Produtos
                    
                    BuscarProdutos(product_name,product_description, product_price, product_profit, product_stock);
                    
	                break;
                case 5:
                    //Cadastro de venda
                    CadastroDeVendas(client_name, product_name, product_stock);
                    //listando e escolhendo cliente
	                break;
                case 6:
                    //Listando produtos e estoque disponível 
                    
                    System.out.println("\n------Estoque Disponível-----");
                    for(int i = 0; i < Length(product_name); ++i){
                        System.out.printf("- %s : %d Un\n", product_name[i], product_stock[i]);
                    }
                    System.out.println("------------------------------");
	                break;
                case 7:
	                break;
	            default:
	                System.out.println("Numero inválido, digite um numero entre 1 e 7.");
	                System.out.println("---------------------------------------------");
	        }
	    }while(option != 7);
	}
    
    public static void CadastrarClientes (String[] client_name, String[] client_address, String[] client_number){
        int listLength = 0;
        int costumers;
        
        System.out.print("Digite quantos clientes a serem cadastrar: ");
        costumers = input.nextInt();
        input.nextLine();
        
        listLength = Length(client_name) + costumers;
        
        for(int i = Length(client_name); i < listLength; ++i){
            System.out.printf("Digite o nome do %dº cliente: ", i+1);
            client_name[i] = input.nextLine();
            System.out.printf("Digite o endereço de %s: ", client_name[i]);
            client_address[i] = input.nextLine();
            System.out.printf("Digite o numero de %s: ", client_name[i]);
            client_number[i] = input.nextLine();
        }
        
    }
    public static void BuscarCliente (String[] client_name,String[] client_address,String[] client_number){
        
        
        if(Length(client_name) != 0){
            found = false;
            input.nextLine();
            System.out.print("Digite o nome do cliente que procura: ");
            search = input.nextLine();
            for(int i = 0; i < Length(client_name); ++i){
                if(search.equalsIgnoreCase(client_name[i])){
                    found = true;
                    System.out.println("\n========================");
                    System.out.println("\nCliente Encontrado");
                    System.out.printf("Nome: %s\n", client_name[i]);
                    System.out.printf("Endereço: %s\n", client_address[i]);
                    System.out.printf("Numero: %s\n", client_number[i]);
                    System.out.println("\n========================");
                    do{
	                    System.out.print("Deseja alterar os dados? [1-sim | 2-não] ");
	                    change = input.nextInt();
	                    input.nextLine();
	                    if(change == 1){
                            System.out.printf("Digite o NOVO nome do cliente: ");
    	                    client_name[i] = input.nextLine();
    	                    System.out.printf("Digite o NOVO endereço do cliente: ");
    	                    client_address[i] = input.nextLine();
    	                    System.out.printf("Digite o NOVO numero do cliente: ");
    	                    client_number[i] = input.nextLine();
    	                    break;
	                    }else if(change == 2){
    	                    break;
	                    }else{
                            System.out.println("Numero invalido. digite [1-sim | 2-não]");
	                    }
                    }while(true);
                    break;
                }
            }   
            if(found == false){
                System.out.println("Cliente não encontrado!");
            }
        }else{
            System.out.println("Nenhum cliente cadastrado ainda!");
        }
    }
    public static void CadastrarProdutos (String[] product_name, String[] product_description, String[] product_price, String[] product_profit, int[] product_stock){
    	
    	int listLength = 0;
    	int products;
    	
    	System.out.print("Digite quantos produtos deseja cadastrar: ");
        products = input.nextInt();
        input.nextLine();
        
        listLength = Length(product_name) + products;
        
    	for(int i = Length(product_name); i < listLength; ++i){
    	    
		    System.out.printf("Digite o nome do %dº produto: ", i+1);
		    product_name[i] = input.nextLine();
		    System.out.printf("Digite a descrição do(a) %s: ", product_name[i]);
		    product_description[i] = input.nextLine();
		    System.out.printf("Digite o preço do(a) %s:  R$", product_name[i]);
		    product_price[i] = input.nextLine();
		    System.out.printf("Digite a taxa de lucro do(a) %s: %%", product_name[i]);
		    product_profit[i] = input.nextLine();
		    System.out.printf("Digite a quantidade em estoque do(a) %s: ", product_name[i]);
		    product_stock[i] = input.nextInt();
		    input.nextLine();
		}
    }
    public static void BuscarProdutos (String[] product_name, String[] product_description, String[] product_price, String[] product_profit, int[] product_stock){
        
        if(Length(product_name) != 0){
	                    input.nextLine();
    	                System.out.print("Digite o nome do produto que procura: ");
    	                search = input.nextLine();
    	                found = false;
    	                for(int i = 0; i < Length(product_name); ++i){
    	                    if(search.equalsIgnoreCase(product_name[i])){
    	                        found = true;
    	                        System.out.println("\n========================");
    	                        System.out.println("\nProduto Encontrado");
        	                    System.out.printf("Nome do produto: %s\n", product_name[i]);
        	                    System.out.printf("Descrição do produto: %s\n", product_description[i]);
        	                    System.out.printf("Preço: R$%s\n", product_price[i]);
        	                    System.out.printf("Taxa de lucro: %s %%\n", product_profit[i]);
        	                    System.out.printf("Estoque: %s Un\n", product_stock[i]);
        	                    System.out.println("\n========================");
        	                    do{
            	                    System.out.print("Deseja alterar os dados? [1-sim | 2-não] ");
            	                    change = input.nextInt();
            	                    input.nextLine();
            	                    if(change == 1){
        	                            System.out.printf("Digite o NOVO nome do %dº produto: ", product_name[i]);
                            		    product_name[i] = input.nextLine();
                            		    System.out.printf("Digite a NOVA descrição do %dº produto: ", product_description[i]);
                            		    product_description[i] = input.nextLine();
                            		    System.out.printf("Digite o NOVO preço do %dº produto: R$", product_price[i]);
                            		    product_price[i] = input.nextLine();
                            		    System.out.printf("Digite a NOVA taxa de lucro do %dº produto: %%", product_profit[i]);
                            		    product_profit[i] = input.nextLine();
                            		    System.out.printf("Digite a NOVA quantidade em estoque do %dº produto: ", product_stock[i]);
                            		    product_stock[i] = input.nextInt();
                            		    input.nextLine();
                	                    break;
            	                    }else if(change == 2){
                	                    break;
            	                    }else{
        	                            System.out.println("Numero invalido. digite [1-sim | 2-não]");
            	                    }
        	                    }while(true);
        	                    break;
    	                    }
    	                }   
    	                if(found == false){
        	                System.out.println("Produto não encontrado!");
    	                }
	                }else{
	                    System.out.println("Nenhum produto cadastrado ainda!");
	                }
    }
    public static void CadastroDeVendas(String[] client_name, String[] product_name, int[] product_stock){
        
        int proceed = 0;
        int sell;
        if(Length(client_name) != 0 && Length(product_name) != 0){
            System.out.println("\n------Lista de clientes-----");
            for(int i = 0; i < Length(client_name); ++i){
                System.out.printf("(%d) %s\n", i+1, client_name[i]);
            }
            System.out.println("\n========================");
            System.out.print("Digite o id do cliente que deseja: ");
            option = input.nextInt();
            input.nextLine();
            
            
            //listando e escolhendo produto
            do{
                option = 0;
                
                System.out.println("\n------Lista de Produtos-----");
                for(int i = 0; i < Length(product_name); ++i){
                    System.out.printf("(%d) %s\n", i+1, product_name[i]);
                }
                System.out.println("\n========================");
                System.out.print("Digite o id do produto que deseja: ");
                option = input.nextInt();
                input.nextLine();
                
                if(product_stock[option - 1] > 0){
                    System.out.print("Informe quantos itens deseja vender: ");
                    sell = input.nextInt();
                    input.nextLine();
                    
                    if(product_stock[option - 1] - sell >= 0){
                        product_stock[option - 1] -= sell;
                        System.out.println("Venda realizada! ");
                        System.out.printf("Estoque restante: %d\n", product_stock[option - 1]);
                    }else{
                        System.out.printf("Estoque insuficiente. %s possui apenas %d itens disponíveis.\n", product_name[option - 1], product_stock[option - 1]);
                    }
                    
                    System.out.print("Digite um numero negativo para sair das vendas... \n");
                    proceed = input.nextInt();
                    input.nextLine();
                }else{
                    System.out.printf("%s está com estoque zerado!", product_name[option - 1]);
                }
                
            }while(proceed > 0);
        }else if(Length(client_name) == 0 && Length(product_name) == 0){
            System.out.println("Nenhum cliente nem produto cadastrado!");    
        }else if(Length(client_name) == 0){
            System.out.println("Nenhum cliente cadastrado!");
        }else if(Length(product_name) == 0){
            System.out.println("Nenhum produto cadastrado!");
        }   
    }
    
    public static int Length(String[] list){
        int size = 0;
        for(int i = 0; i < list.length; ++i){
            if(list[i] != null){
                size ++;
            }else{
                break;
            }
        }
        return size;
    }
}

