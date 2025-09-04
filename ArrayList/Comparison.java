import java.util.ArrayList;

class Comparison {
    public static void main (String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> copyList = new ArrayList<>();
        
        list.add("Rahul");
        list.add("Sagar");
        list.add("Vishnu");
        list.add("Himanshu");
        list.add("Chetan");
        list.add("Chirag");
        
        for (String str : list) {
            copyList.add(str);
        }

        boolean isEqual = true;
        if (list.size() == copyList.size()) {
            for (int i = 0; i < list.size(); i++) {
                if (!list.get(i).equals(copyList.get(i))) {
                    isEqual = false;
                    break;
                }
            }
        } else {
            isEqual = false;
        }

        if (isEqual) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
