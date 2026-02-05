class First extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(i);
            try{
                sleep(1500);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
class Second extends Thread{
    public void run(){
        for(int j='A';j<=5;j++){
            System.out.println(j);
            try{
                sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class MainThread{
    public static void main(String[] args){
        First f1=new First();
        f1.start();
        Second s1=new Second();
        s1.start();
    }
}