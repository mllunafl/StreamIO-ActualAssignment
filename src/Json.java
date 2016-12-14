import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

/**
 * Created by LunaFlores on 12/8/16.
 */

public class Json {
    public static void main(String[] args) throws IOException {
        Child child = new Child();
        child.setName("Jenna");
        child.setAge(8);
        child.setNotSerial("Hello");
        Parent parent = new Parent();
        parent.setChild(child);
        parent.setYear(2016);
        parent.setPerson("James");

        System.out.println("before " + parent);

        // mapper class serializes and deseralizes java obj to and from json
        ObjectMapper mapper = new ObjectMapper();

        //seralize parent object to json
        String json = mapper.writeValueAsString(parent);

        System.out.println("json" + json);

        //create instance of a printwriter to write to a file. jvm will close these resources (try w/ resources).
        try (PrintWriter out = new PrintWriter(new FileWriter("parent.json"))) {

           //write json to file.. only writing one line to file
            out.println(json);
            //flush it so its done writing
            out.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //create instance of a bufferreader to read to a file. jvm will close these resources (try w/ resources).
        try (BufferedReader in = new BufferedReader(new FileReader("parent.json"))){

            //read the one and only line of the file
            String stringParent = in.readLine();
            //deseralize json to parent obj
            Parent parent2 = mapper.readValue(stringParent, Parent.class);
            System.out.println("after " + parent2);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
