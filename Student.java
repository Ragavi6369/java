import java.io.Serializable;
public class Student implements Serializable{
    private int id;
    private String name;

    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    public void display(){
        System.out.println("Id:"+id + "Name:"+name);
    }    
}