public class ManageAttendance {
    private ElderlyClient elderly;
    private NormalClient normal;
    private int show, attended;
    
    public ManageAttendance(int size){
        elderly = new ElderlyClient(size);
        normal = new NormalClient(size);
        attended = 0;
        show = 0;
    }

    public Boolean isEmpty(){ //Retorna se as filas estão vazias
        return (elderly.isEmpty() && normal.isEmpty());
    }

    public int numClients(){//Retorna a quantidade total de clientes na fila
        return elderly.size() + normal.size();
    }

    public int numElderlyClients(){//Retorna a quantidade de idosos na fila
        return elderly.size();
    }

    public void addClient(String name, int age){//Adiciona um cliente a fila
        if(elderly.isElderly(age)){
            elderly.enqueue(name, age);
        }else{
            normal.enqueue(name, age);
        }
    }

    public String showClient(){//Retorna o proximo cliente a ser atendido
        if(show <= 2 && !elderly.isEmpty()){
            show++;
            return elderly.peek();
        }
        if(show > 2 || elderly.isEmpty()){
            show = 0;
        }
        return normal.peek();
    }
    
    public String getNext(){//Atende o primeiro da fila e o remove da fila
        if(attended <= 2 && !elderly.isEmpty()){
            attended++;
            return elderly.dequeue();
        }
        if(attended > 2 || elderly.isEmpty()){
            attended = 0;
        }
        return normal.dequeue();
    }

    public String showQueues(){//Mostra quem está nas filas
        if(elderly.isEmpty() && normal.isEmpty()){
            return "Idoso:Vazio;Normal:Vazio";
        }
        if(elderly.isEmpty()){
            return "Idoso:Vazio;" + "Normal:" + normal.show();
        }
        if(normal.isEmpty()){
            return "Idoso:" + elderly.show() + "Normal:Vazio";
        }
        return "Idoso:" + elderly.show() + "Normal:" + normal.show();
    }

}
