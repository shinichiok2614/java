package propertise;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class main{
    public static void main(String[] args) {
        Properties properties=System.getProperties();
//        System.out.println(properties);
        Set set=properties.entrySet();
        Iterator itr=set.iterator();
        while(itr.hasNext()) System.out.println(itr.next());


        System.out.println(properties.getProperty("user.name"));
        properties.setProperty("user","admin");
        properties.setProperty("password","admin123");
        try {
            properties.store(new FileWriter("info.propertise"),"Comment here");
            System.out.println("success");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}