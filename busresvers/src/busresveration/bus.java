package busresveration;

public class bus {
   private int busno;
    private boolean ac;
   private int capacity;//get and set
    bus (int no,boolean a,int acp){
        busno=no;
        ac=a;
        capacity=acp;
    }

    public int getCapacity() {//acessor method
        return capacity;
    }

    public int getBusno() {
        return busno;
    }

    public void setCapacity(int capacity) {//mutator
        this.capacity = capacity;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }
    public void displayinfo(){
        System.out.print("BusNo "+busno + "Ac " +ac + "Capacity "+capacity);
    }
}
