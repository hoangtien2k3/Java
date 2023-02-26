/*
*
*   * List_Interface:
*       + List là một kiểu Collection và là src.java.JavaCore.Interface dành cho kiểu danh sách.
*       + ArrayList là một danh sách kiểu mảng, là một lớp thực thể (concrete) của List.
*
*
*
*   * ArrayList implement List. List là một interface
*
*
*
*   syntax List src.java.JavaCore.Interface:
*
*                   public interface List<E> extends Collection<E>
 *
*
*   * Tại sao lại khai báo:
*
*   Lợi ích:
*       + Khi khai báo List thì các hàm có thể trả về cùng 1 kiểu dữ liệu.
*       Nguyên nhân là do các lớp: ArrayList, Vector hay LinkedList đều implement từ src.java.JavaCore.Interface List
*           Ex:
*               List <data-type> list1= new ArrayList();
                List <data-type> list2 = new LinkedList();
                List <data-type> list3 = new Vector();
                List <data-type> list4 = new Stack();
 *
 *
 *      + Trên thực tế mỗi cấu trúc dữ liệu sẽ phù hợp với một loại dữ liệu hay chạy đơn luồng hay đa luồng
 *         sẽ phải có các hàm trả về khác nhau.
 *
 *          Ex:
 *              public ArrayList<Student_1> getListStudents(){
                ArrayList<Student_1> list = new ArrayList<>();
                    //do something
                    return list;
                }

                public Vector<Student_1> getListStudents(){
                    Vector<Student_1> list = new Vector<>();
                    //do something
                    return list;
                }

                public LinkedList<Student_1> getListStudents(){
                    LinkedList<Student_1> list = new LinkedList<>();
                    //do something
                    return list;
                }


       => Nhưng viết như trên thì tận 3 hàm trả về liền: Nên viết ngắn gọn sẽ là;
        Ex:
            public List<Student_1> getListStudents(List<Student_1> list){
                list.add(new Student_1(1L, "B142", "A"));
                list.add(new Student_1(2L, "B145", "B"));
                //... do something.
                return list;
            }

            public void perform(String[] args) {
                List<Student_1> list1 = getListStudents(new ArrayList<>());
                List<Student_1> list2 = getListStudents(new Vector<>());
                List<Student_1> list3 = getListStudents(new LinkedList<>());
                or
                ArrayList<Student_1> list1 = (ArrayList<Student_1>) getListStudents(new ArrayList<>());
                Vector<Student_1> list2 = (Vector<Student_1>) getListStudents(new Vector<>());
                LinkedList<Student_1> list3 = (LinkedList<Student_1>) getListStudents(new LinkedList<>());
            }


*
* */

package src.java.Collection.List.List.ListInterface;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class List_Interface {
    public static void main(String[] args) {
        // Create list with no parameter
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            // Add element to list
            list.add("0" + i);
        }

        Iterator<String> iterator = list.iterator();
        System.out.println("Using Iterator_Interface: Only Traversing the list in the forward direction ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
            iterator.remove();
        }

        System.out.println();
        System.out.println("list.isEmpty() = " + list.isEmpty());


        ////////////////////////////////////////////////////////////////

        List<String> newList = new List<String>() {

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @NotNull
            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @NotNull
            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @NotNull
            @Override
            public <T> T[] toArray(@NotNull T[] a) {
                return null;
            }

            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(@NotNull Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(@NotNull Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, @NotNull Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean removeAll(@NotNull Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(@NotNull Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public String get(int index) {
                return null;
            }

            @Override
            public String set(int index, String element) {
                return null;
            }

            @Override
            public void add(int index, String element) {

            }

            @Override
            public String remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @NotNull
            @Override
            public ListIterator<String> listIterator() {
                return null;
            }

            @NotNull
            @Override
            public ListIterator<String> listIterator(int index) {
                return null;
            }

            @NotNull
            @Override
            public List<String> subList(int fromIndex, int toIndex) {
                return null;
            }
        };

    }
}
