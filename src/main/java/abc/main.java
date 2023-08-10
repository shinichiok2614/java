package abc;

import java.util.*;

public class main {
    public static void main(String[] args) {
        System.out.println("hlw");
        List<String> arrayList=new ArrayList<>();
        arrayList.add("arraylist 3");
        arrayList.add("arraylist 1");
        arrayList.add("arraylist 2");
        System.out.println(arrayList);


        List<String> linkedList=new LinkedList<>();
        linkedList.add("linkedlist 3");
        linkedList.add("linkedlist 1");
        linkedList.add("linkedlist 2");
        System.out.println(linkedList);

        //có sx
        Set<String> hashSet=new HashSet<>();
        hashSet.add("hashSet 3");
        hashSet.add("hashSet 1");
        hashSet.add("hashSet 2");
        System.out.println(hashSet);

        //có sx
        Set<String> treeSet=new TreeSet<>();
        treeSet.add("treeset 3");
        treeSet.add("treeset 1");
        treeSet.add("treeset 2");
        System.out.println(treeSet);


        //sx theo key
        Map<String,String> hashmap=new HashMap<>();
        hashmap.put("c","asdgaf");
        hashmap.put("a","asdgaf");
        hashmap.put("b","asdgaf");
        System.out.println(hashmap);


    }
}
