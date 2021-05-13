import java.util.Scanner;

public class AppDinheiroNaMao {
    public static void main(String[] args) {
        String name;
        int age, option;
        int finish = 0;

        Scanner scan = new Scanner(System.in);
        ManageAttendance manager = new ManageAttendance(6);

        do{
            System.out.println("**********************************************");
            System.out.println("1 – Chegada do cliente na agência.");
            System.out.println("2 – Verificar quem é o próximo a ser atendido.");
            System.out.println("3 – Atender um cliente.");
            System.out.println("4 – Exibir as filas. (idoso e não idoso)");
            System.out.println("5 – Finalizar o programa.");
            System.out.println("**********************************************");

            System.out.printf("O que deseja fazer: ");
            option = scan.nextInt();
            
            if(option == 1){
                System.out.printf("Digite o nome do Cliente: ");
                name = scan.nextLine();
                System.out.println("Digite a idade do Cliente: ");
                age = scan.nextInt();

                manager.addClient(name, age);
            }

            if(option == 2){
                System.out.println("O próximo da fila é " + manager.showClient());
            }

            if(option == 3){
                System.out.println("O cliente " + manager.getNext());
            }

            if(option == 4){
                manager.showQueues();
            }

            if(option == 5){
                if(manager.isEmpty()){
                    finish = 1;
                }
            }

        }while(finish != 1);
    }
}
