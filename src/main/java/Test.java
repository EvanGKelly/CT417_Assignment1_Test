import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        ArrayList<Module> mList = new ArrayList<>();
        ArrayList<Module> mList2 = new ArrayList<>();

        ArrayList<String> mod_List = new ArrayList<>();
        ArrayList<String> student_List = new ArrayList<>();

        ArrayList<Student> sList = new ArrayList<>();
        ArrayList<Student> sList2 = new ArrayList<>();

        ArrayList<Course> cList = new ArrayList<>();

        Course c1 = new Course("CT101", mList, sList, "10/11/21", "10/07/22");
        Course c2 = new Course("CT103", mList2, sList2, "10/11/212", "10/07/22");

        Module m1 = new Module("Computer Science", 111);
        Module m2 = new Module("Computer Engineering", 112);
        Module m3 = new Module("Science", 113);

        Module m4 = new Module("History", 114);
        Module m5 = new Module("English", 115);
        Module m6 = new Module("Geography", 116);

        Student s1 = new Student("Tom Hardy", 19, "10/12/00", 123, "t.hardy", mList, c1);
        Student s2 = new Student("Black Lively", 18, "10/12/00", 124, "b.lively", mList, c1);
        Student s3 = new Student("Shara Hardy", 19, "10/12/00", 125, "s.hardy", mList, c1);

        Student s4 = new Student("Jake Hardy", 19, "19/12/00", 126, "j.hardy", mList2, c2);
        Student s5 = new Student("Chuck Lively", 18, "10/11/00", 127, "c.lively", mList2, c2);
        Student s6 = new Student("Chris Hardy", 19, "10/12/01", 128, "c.hardy", mList2, c2);

        mList.add(m1);
        mList.add(m2);
        mList.add(m3);

        mList2.add(m4);
        mList2.add(m5);
        mList2.add(m6);

        sList.add(s1);
        sList.add(s2);
        sList.add(s3);

        sList2.add(s4);
        sList2.add(s5);
        sList2.add(s6);

        cList.add(c1);
        cList.add(c2);

        for(int i=0; i<cList.size(); i++) {
            System.out.println("Course: " + cList.get(i).getName() + " associated modules: " + cList.get(i).getModules().toString());
        }

        System.out.println(sList.toString());
    }
}
