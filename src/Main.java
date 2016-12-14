import java.io.*;

public class Main {

    public static void main(String[] args){

        Child child = new Child();
        child.setAge(9);
        child.setName("Jill");
        child.setNotSerial("Im not serial");

        Parent parent = new Parent();
        parent.setPerson("Jake");
        parent.setYear(2017);
        parent.setChild(child);

       try(FileOutputStream fos = new FileOutputStream("Parent.ser");
           ObjectOutput oos = new ObjectOutputStream(fos);) {

           oos.writeObject(parent);
           oos.flush();
       }catch (IOException e){
           System.out.println(e.getMessage());
       }
        System.out.println(parent);

        try (FileInputStream fis = new FileInputStream("Parent.ser");
             ObjectInputStream ois = new ObjectInputStream(fis);){

            Parent parent1 = (Parent) ois.readObject();
            System.out.println(parent1);
        } catch (IOException e){
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }
}
