import java.util.*;
public class main {
    public static void main(String[] args) {

        //Type Safe
        ArrayList<String> names= new ArrayList<>();
        names.add("ravi");
        names.add("sita");
        names.add("raman");
        names.add("om");
        names.add("prakash");
        names.add("prakash");
        System.out.println(names);
        System.out.println(names.get(0));
        System.out.println(names.remove("sita"));
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("om"));
        System.out.println(names.equals("om"));
        System.out.println(names.isEmpty());
        System.out.println(names.lastIndexOf("ravi"));
        System.out.println(names.lastIndexOf("raman"));
        System.out.println(names.lastIndexOf("sita"));
        System.out.println(names.lastIndexOf("om"));
        System.out.println(names.lastIndexOf("prakash"));
        System.out.println(names.indexOf("ravi"));
        System.out.println(names.indexOf("sita"));
        System.out.println(names.indexOf("raman"));
        System.out.println(names.indexOf("om"));
        System.out.println(names.indexOf("prakash"));
        System.out.println(names.listIterator(0));
        System.out.println(names.set(0,"shweta"));
        System.out.println(names);

        //for loop
        for(String str : names){
            System.out.println(str+" " +str.length());
        }
        System.out.println("-----------------------");

        //traversing through iterator: forward traversing
        Iterator<String> itr = names.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("-----------------------");

        //backward traversing: list iteration
        ListIterator<String> litr = names.listIterator(names.size());
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }

        //Enumerator

        //for each method
        names.forEach(nms->{
            System.out.println(nms);
        });
        names.clear();
        System.out.println(names);

        //Un Type safe
        LinkedList<Object> list= new LinkedList<>();
        list.add("sachin");
        list.add(101);
        list.add(20.333);
        list.add(true);
        list.add(true);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.contains(101));
        System.out.println(list.remove(1));
        System.out.println(list.isEmpty());
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.getClass());
        System.out.println(list.hashCode());

        Vector<String> vec = new Vector<>();
        vec.addAll(names);
        System.out.println(vec);

        HashSet<Object> hash = new HashSet<>();
        hash.add(10.22);
        hash.add(0.000);
        hash.add(333.222);
        hash.add(1.333);
        System.out.println(hash);

        //sorting of elements
        TreeSet trr=  new TreeSet<>();
        trr.addAll(hash);
        System.out.println(trr );
        trr.forEach(e-> System.out.println(e));

        //custom sorting using comparator and comparable

        HashMap<String, Integer> stu= new HashMap<>();
        stu.put("ravi",1);
        stu.put("om",2);
        stu.put("prakash", 3);
        stu.put("prakash", 4);
        System.out.println(stu);
        stu.forEach((k,v)-> System.out.println(k+" \t" +v));
        System.out.println( stu.keySet());
        System.out.println(stu.entrySet());
        System.out.println(stu.get("om"));
    }
}