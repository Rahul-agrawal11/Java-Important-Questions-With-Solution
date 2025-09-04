import java.util.ArrayList;

class Change {
    public static void main (String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        list.add("Rahul");
        list.add("Sagar");
        list.add("Vishnu");
        list.add("Himanshu");
        list.add("Rahul");
        list.add("Chetan");
        list.add("Chirag");
        list.add("Rahul");
        String str = "Rohit";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("Rahul")) {
                // list.get(i).replace("Rahul","Rohit");
                list.set(i,str);
            }
        }
        System.out.print(list);
    }
}
