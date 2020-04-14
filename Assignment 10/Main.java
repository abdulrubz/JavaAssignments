public class Main {
    public static void main(String[] args) {
        SList<Integer> list=new SList<Integer>();
        SListIterator<Integer> itr =list.iterator();

        itr.insert(2);
        itr.insert(3);
        itr.insert(5);
        itr.remove(2);
        itr.insert(6);
        itr.insert(7);
        itr.remove(4);
        itr.insert(34);
        itr.insert(56);
        itr.insert(67);

        System.out.println("List : "+list);
    }
}
