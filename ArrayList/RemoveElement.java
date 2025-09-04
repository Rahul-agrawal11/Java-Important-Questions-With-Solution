import java.util.ArrayList;

class RemoveElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0, 3);
        list.add(1, 2);
        list.add(2, 2);
        list.add(3, 3);
        int k = 3;
        ArrayList<Integer> l = solution(list, k);
        System.out.println(l);
    }

    public static ArrayList<Integer> solution(ArrayList<Integer> list, int k) {
        for (int i = list.size()-1; i >= 0; i--) {
            if (k == list.get(i)) {
                list.remove(i);
            }
        }
        return list;
    }
}