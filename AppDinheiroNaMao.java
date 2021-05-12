public class AppDinheiroNaMao {
    public static void main(String[] args) {
        ElderlyClient fila = new ElderlyClient(4);

        System.out.println("Vazia: " + fila.isEmpty());
        System.out.println("Cheia: " + fila.isFull());

        fila.enqueue("Daniel", 18);
        
        fila.enqueue("Bianca", 20);
        fila.enqueue("Eduardo", 40);
        fila.enqueue("Angelita", 25);

        System.out.println("Vazia: " + fila.isEmpty());
        System.out.println("Cheia: " + fila.isFull());

        System.out.println("Primeiro da fila: " + fila.peek());
        System.out.println("Qtde de números na fila: " + fila.size());
        System.out.println("Fila: " + fila.show());

        System.out.println("\nRemovendo 1 valor: " + fila.dequeue());
        System.out.println("Fila: " + fila.show());
        System.out.println("Primeiro da fila: " + fila.peek());
        System.out.println("Qtde de números na fila: " + fila.size());
    }
}
