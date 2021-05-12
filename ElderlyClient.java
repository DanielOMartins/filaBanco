public class ElderlyClient {
    private String[] vector;
    private int end, age;
    private String name;

    //Construtor
    public ElderlyClient(int size) {
        vector = new String[size];
        end = 0;
    }

    //Getters
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    
    //Métodos
    public boolean isElderly(int age){
        return (age >= 60);
    }
    public boolean isEmpty() { // verifica se está vazio
        return (end == 0);
    }

    public boolean isFull() { // verifica se está cheio
        return (end == vector.length);
    }

    public void enqueue(String name, int age) { // insere um novo valor na fila
        if (isFull()) {
            return; // termina a execução do método
        }
        String aux = String.valueOf(age);
        vector[end] = name + ":" + aux;
        end++;
    }

    public String dequeue() { // remove um elemento da fila
        if(isEmpty()){
            return null; //Null representa um valor "Vazio", quando a fila está vazia
        }
        String aux = vector[0];
        for (int i = 0; i < end-1; i++) { // end-1 pois termina uma posição antes do final
            vector[i] = vector[i+1];
        }
        end--;
        return aux;
    }

    public String peek() { // informa quem é o primeiro elemento da fila
        if(!isEmpty()){
            return vector[0];
        }
        return null; // -1 representa um valor inválido, quando a fila está vazia
    }

    public int size() { // quantos elementos existem na fila
        return end;
    }

    public String show() {  // retorna todos os valores da fila em forma de String
        String elem = "";

        for (int i = 0; i < end; i++) {
            if(i == (end - 1)){
                elem = elem + vector[i] + ";";
            }else{
                elem = elem + vector[i] + " - ";
            }
        }

        return elem;
    }
    
}