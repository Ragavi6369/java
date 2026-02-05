class Multithread1 extends Thread{
    private int threadN;
    Multithread1(int n){
        this.threadN=n;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
                
            }
            catch(InterruptedException e){
                System.out.println(threadN+"Interrupted");
            }
        }
        System.out.println(threadN+" Finished");

    }
    public static void main(String[] args){
        Multithread1 t1=new Multithread1(1);
        Multithread1 t2=new Multithread1(2);
        Multithread1 t3=new Multithread1(3);

        t1.start();
        t2.start();
        t3.start();
    }
}