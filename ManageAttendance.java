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

    public Boolean isEmpty(){
        return (elderly.isEmpty() && normal.isEmpty());
    }

    public int numClients(){
        return elderly.size() + normal.size();
    }

    public int numElderlyClients(){
        return elderly.size();
    }

    public void addClient(String name, int age){
        if(elderly.isElderly(age)){
            elderly.enqueue(name, age);
        }else{
            normal.enqueue(name, age);
        }
    }

    public String showClient(){
        if(show <= 2 && !elderly.isEmpty()){
            show++;
            return elderly.peek();
        }
        if(show > 2 || elderly.isEmpty()){
            show = 0;
        }
        return normal.peek();
    }
    
    public String getNext(){
        if(attended <= 2 && !elderly.isEmpty()){
            attended++;
            return elderly.dequeue();
        }
        if(attended > 2 || elderly.isEmpty()){
            attended = 0;
        }
        return normal.dequeue();
    }

    public String showQueues(){
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
