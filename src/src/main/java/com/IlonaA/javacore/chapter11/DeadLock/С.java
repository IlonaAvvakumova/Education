package src.main.java.com.IlonaA.javacore.chapter11.DeadLock;

 class Cccc implements Runnable{
   Cccc(){
       Thread t = new Thread(this, "Potok");
       System.out.println(t.getName());
       t.start();
   }
    @Override
    public void run() {
        System.out.println("C");
    }

    public static void main(String[] args) {
        new Cccc();
    }
}
