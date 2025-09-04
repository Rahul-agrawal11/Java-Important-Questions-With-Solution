// Use of ArrayList
import java.util.ArrayList;
class Use_Of_ArrayList {
    public static void main(String[] args) {
   
		// Initialization
        ArrayList<Integer> list = new ArrayList<>();
		
		// Add elements by .add()
        list.add(12);
        list.add(20);
        list.add(121);
        list.add(115);
        list.add(142);
        System.out.println(list);
		
		// Add elements on a defined index by .add(index,value)
        list.add(2,45);
        System.out.println(list);
		
		// Remove elements by passing the index by .remove(index)
        list.remove(3);
        System.out.println(list);
		
		// Check the list contains any element or not (.contains(value))
        boolean b = list.contains(45);
        System.out.println(b);
		
		// To get the value of an specific index (.get(index))
        System.out.println(list.get(2));
		
		// Check empty or not (.isEmpty())
        boolean e = list.isEmpty();
        System.out.println(e);
		
		// Replaces element at index with value (.set(3,56))
        System.out.println(list.set(3,56));
        System.out.println(list);
		
		// For size (.size())
        System.out.println(list.size());
		
		// Remove all the values (.clear())
        list.clear();
        System.out.println(list);
        
		// throws error set only can replace the value
		// System.out.println(list.set(5,56));
        // System.out.println(list);
        
    }
}