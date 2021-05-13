import java.util.*;

public class AppDinheiroNaMao {
    public static void main(String[] args) {
        String name;
        int age, option;
        int finish = 0;

        Scanner scan = new Scanner(System.in);
        Scanner read = new Scanner(System.in);
        ManageAttendance manager = new ManageAttendance(6);

        do{
            //Esse é um menu para as operações dessa aplicação
            System.out.println("**********************************************");
            System.out.println("1 – Chegada do cliente na agência.");
            System.out.println("2 – Verificar quem é o próximo a ser atendido.");
            System.out.println("3 – Atender um cliente.");
            System.out.println("4 – Exibir as filas.");
            System.out.println("5 – Finalizar o programa.");
            System.out.println("**********************************************");

            System.out.printf("O que deseja fazer: ");
            option = scan.nextInt();
            
            if(option == 1){//Adiciona pessoas na fila
                System.out.println("");
                System.out.printf("Digite o nome do Cliente: ");
                name = read.nextLine();
                System.out.printf("Digite a idade do Cliente: ");
                age = scan.nextInt();

                manager.addClient(name, age);
                System.out.println("");
            }

            if(option == 2){//Mostra quem é o próximo a ser atendido
                System.out.println("");
                if(manager.showClient() == null){
                    System.out.println("Não tem próximo cliente na fila.");
                }else{
                    System.out.println("O próximo da fila é " + manager.showClient());
                }
                System.out.println("");
            }

            if(option == 3){//Atende o próximo cliente e o remove da fila
                System.out.println("");
                if(manager.showClient() == null){
                    System.out.println("Não tem clientes para atender.");
                }else{
                    System.out.println("O cliente " + manager.getNext() + " foi atendido");
                }
                System.out.println("");
            }

            if(option == 4){//Mostra quem está na fila
                System.out.println("");
                System.out.println(manager.showQueues());
                System.out.println("");
            }

            if(option == 5){//Finaliza o programa se não tem ninguém na fila
                if(manager.isEmpty()){
                    finish = 1;
                }else{
                    System.out.println("");
                    System.out.println("Não pode finalizar pois ainda tem clientes na fila.");
                }
                System.out.println("");
            }

        }while(finish != 1);
        
    }
}
