import java.util.ArrayList;

class StartsWith {
    public static void main (String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        list.add("Rahul");
        list.add("Sagar");
        list.add("Vishnu");
        list.add("Himanshu");
        list.add("Chetan");
        list.add("Chirag");
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).startsWith("S")) {
                count++;
            }
        }
        System.out.print(count);
    }
}
