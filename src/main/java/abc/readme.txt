
enum days{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
System.out.println(enumMap);
System.out.println(enumMap.entrySet());
//dung iterator
Iterator<String> itr = arrayList.iterator();
while (itr.hasNext()) System.out.println(itr.next());
//dung ListIterator
ListIterator<String> listitr = arrayList.listIterator();
while (listitr.hasNext()) System.out.println(listitr.next());
//dung entry
for(Map.Entry<days,Integer> entryEnumMap:enumMap.entrySet()){
    System.out.println(entryEnumMap);
}
//dung key
Set<days> itrdays=enumMap.keySet();
for(days item: itrdays){
    System.out.println(enumMap.get(item));
}

arraylist    List<1>,[],  k sx,  add, for, iterator, x keySet,ListIterator<->,
linkedlist   <1>,[],  k sx,  add,
set          <1>,[],  k sx,  add,
hashset      <1>,[],  co sx, add,
linkedhashset<1>,[],  k sx,  add,
treeset      <1>,[],  co sx, add, addAll(),<Comparable>
map
hashmap      <1,2>,{}, co sx,   put,keySet, entrySet,
linkedhashmap
treemap      <1,2>,{}, co sx,   put,
hashtable    <1,2>,{}, sx nguoc,put,
hashmap
enumset      EnumSet,          [],k sx,of(days.class),iterator<1>,
enummap      <1,2>(days.class),{},k sx,put,                   keySet,entrySet,

Collections.sort(list, new Comparator<Integer>()
Comparable: compareTo()
