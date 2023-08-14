package abc;

import com.sun.source.util.Trees;

import java.io.FilenameFilter;
import java.util.*;

public class main {
    public static void main(String[] args) {
        System.out.println("hlw");
        List<String> arrayList = new ArrayList<>();
        arrayList.add("arraylist 3");
        arrayList.add("arraylist 1");
        arrayList.add("arraylist 2");
        System.out.println(arrayList);


        List<String> linkedList = new LinkedList<>();
        linkedList.add("linkedlist 3");
        linkedList.add("linkedlist 1");
        linkedList.add("linkedlist 2");
        System.out.println(linkedList);

        //có sx
        Set<String> hashSet = new HashSet<>();
        hashSet.add("hashSet 3");
        hashSet.add("hashSet 1");
        hashSet.add("hashSet 2");
        System.out.println(hashSet);

        //có sx
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("treeset 3");
        treeSet.add("treeset 1");
        treeSet.add("treeset 2");
        System.out.println(treeSet);


        //sx theo key
        Map<String, String> hashmap = new HashMap<>();
        hashmap.put("c", "hashMap c");
        hashmap.put("a", "hashMap a");
        hashmap.put("b", "hashMap b");
        System.out.println(hashmap);

        System.out.println("arraylist");
        Iterator<String> itr = arrayList.iterator();
        while (itr.hasNext()) System.out.println(itr.next());

        for (String item : arrayList) System.out.println(item);

        System.out.println("for i");
        for (int i = 0; i < arrayList.size(); i++) System.out.println(arrayList.get(i));



        System.out.println("ListItr");
        ListIterator<String> listitr = arrayList.listIterator();
        while (listitr.hasNext()) System.out.println(listitr.next());
        System.out.println("previous");
        while (listitr.hasPrevious()) System.out.println(listitr.previous());

        System.out.println("ListIterator.set");
        ListIterator<String> listitrcontain = arrayList.listIterator();
        listitrcontain.next();
        Iterator<String> itrcontain = arrayList.iterator();

//        while(listitr.hasNext()) {
//            if(listitr.equals(listitrcontain)) System.out.println("true");
//            else System.out.println("false");
//            listitr.next();
//        }
        listitr.set("arraylist edited");
        for (String item : arrayList) System.out.println(item);

        System.out.println("Hashset");
        Set<String> setA = new HashSet<>();
        setA.add("Set 1");
        setA.add("Set 3");
        setA.add("Set 2");
        System.out.println(setA);
        System.out.println(setA.size());
        System.out.println(setA.contains("Set 1"));

        System.out.println("LinkedHashSet");
        Set setB = new LinkedHashSet();
        setB.add("LinkedHashSet 1");
        setB.add("LinkedHashSet 3");
        setB.add("LinkedHashSet 2");
        System.out.println(setB);

        System.out.println("TreeSet");
        Set setC = new TreeSet();
        setC.add("TreeSet3");
        setC.add("TreeSet1");
        setC.add("TreeSet2");
        System.out.println(setC);

        setC.addAll(setB);
        System.out.println(setC);

        setC.remove("TreeSet1");
        System.out.println(setC);

        setC.clear();
        System.out.println(setC);
        System.out.println(setC.isEmpty());

        List<String> listAddSet = new ArrayList<>();
        listAddSet.addAll(setB);
        System.out.println(listAddSet);

        System.out.println("hashSet Student");
        HashSet<Student> hashSet1 = new HashSet<>();
        Student stu1 = new Student("Kiên", 12, "hanoi");
        Student stu2 = new Student("Dung", 12, "ThanhHoa");
        Student stu3 = new Student("Tuan", 13, "BenTre");
        hashSet1.add(stu1);
        hashSet1.add(stu2);
        hashSet1.add(stu3);
//        hashSet1.add(stu1);
        System.out.println(hashSet1);

        System.out.println("treeSetStudentComparable");
        TreeSet<StudentComparable> treeSetStudent = new TreeSet<>();
        StudentComparable stuC1 = new StudentComparable("KienC", 11, "hanoi");
        StudentComparable stuC2 = new StudentComparable("DungC", 11, "ThanhHoa");
        StudentComparable stuC3 = new StudentComparable("TuanC", 13, "BenTre");
        treeSetStudent.add(stuC1);
        treeSetStudent.add(stuC2);
        treeSetStudent.add(stuC3);
        System.out.println(treeSetStudent);

        for (StudentComparable item : treeSetStudent) System.out.println(item);

        System.out.println("HashMap<Integer,String>");
        Map<Integer, String> map = new HashMap<>();
        map.put(100, "A");
        map.put(103, "B");
        map.put(102, "D");
        System.out.println(map);

        Set<Integer> setMap = map.keySet();
        for (Integer item : setMap) {
            System.out.println(item + " " + map.get(item));
        }
        System.out.println("entry.getKey()");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println("HashMap");
        Map map1 = new HashMap();
        map1.put(1, "A");
        map1.put(2, "D");
        map1.put(4, "B");
        map1.put(3, "E");
        System.out.println(map1);

        Set setHashMap = map1.keySet();
//        for(Object item: setHashMap)

        System.out.println("TreeMap<String,String>");

        TreeMap<String, String> treeMap=new TreeMap<>();
        treeMap.put("J","Java");
        treeMap.put("C","C++");
        treeMap.put("P","PHP");
        treeMap.put("Py","Python");
        System.out.println(treeMap);

        Iterator<String> itrTreeMap=treeMap.keySet().iterator();
//        for(int i=0;i<treeMap.size();i++){
//            System.out.println(treeMap.);
//        }
        TreeMap<Integer, String> treeMapNumber=new TreeMap<>();
        treeMapNumber.put(1,"Java");
        treeMapNumber.put(2,"C++");
        treeMapNumber.put(3,"PHP");
        treeMapNumber.put(4,"Python");
        System.out.println(treeMap);

        //có thể trả về null
        for(int i=0;i<treeMap.size();i++){
            System.out.println(treeMapNumber.get(i));
        }

        System.out.println("Hashtable");
        Hashtable<Integer, String> hashtable=new Hashtable<>();
        hashtable.put(1,"hashtable 1");
        hashtable.put(3,"hashtable 4");
        hashtable.put(4,"hashtable 2");
        hashtable.put(2,"hashtable 3");
        System.out.println(hashtable);

        Set<Integer> setHashtable=hashtable.keySet();
        System.out.println(setHashtable);
        for(Integer itemInt: setHashtable){
            System.out.println(hashtable.get(itemInt));
        }


        System.out.println("enumSet");
        enum days{
            SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
        }
        Set<days> set1=EnumSet.allOf(days.class);
        System.out.println(set1);

        Set<days> set2= EnumSet.noneOf(days.class);
        System.out.println(set2);

        Set<days> set3=EnumSet.of(days.MONDAY,days.TUESDAY,days.WEDNESDAY);
        System.out.println(set3);
        Iterator<days> daysIterator=set3.iterator();
        while(daysIterator.hasNext()) System.out.println(daysIterator.next());

        System.out.println("enumMap");
        EnumMap<days, Integer> enumMap=new EnumMap<>(days.class);
        enumMap.put(days.THURSDAY,1);
        enumMap.put(days.FRIDAY,2);
        System.out.println(enumMap);
        System.out.println(enumMap.entrySet());
        for(Map.Entry<days,Integer> entryEnumMap:enumMap.entrySet()){
            System.out.println(entryEnumMap);
        }
        System.out.println(enumMap);

        Set<days> itrdays=enumMap.keySet();
        for(days item: itrdays){
            System.out.println(enumMap.get(item));
        }

    }
}
