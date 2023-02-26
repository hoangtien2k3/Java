package src.java.JavaCore.OOP.JavaOOPsMisc.Object_Cloning;

class COURSE implements Cloneable
{
    String subject1;
    String subject2;
    String subject3;

    public COURSE(String sub1, String sub2, String sub3) {
        this.subject1 = sub1;
        this.subject2 = sub2;
        this.subject3 = sub3;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class STUDENT implements Cloneable {
    int id;
    String name;
    COURSE course;

    public STUDENT(int id, String name, COURSE course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    //Overriding clone() method to create a deep copy of an object.

    protected Object clone() throws CloneNotSupportedException {
        STUDENT student = (STUDENT) super.clone();
        student.course = (COURSE) course.clone();
        return student;
    }
}

public class Deep_Cloning {
    public static void main(String[] args) {
        COURSE science = new COURSE("Physics", "Chemistry", "Biology");

        STUDENT student1 = new STUDENT(111, "John", science);

        STUDENT student2 = null;

        try
        {
            //Creating a clone of student1 and assigning it to student2

            student2 = (STUDENT) student1.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }

        //Printing the subject3 of 'student1'

        System.out.println(student1.course.subject3);         //Output : Biology

        //Changing the subject3 of 'student2'

        student2.course.subject3 = "Maths";

        //This change will not be reflected in original student 'student1'

        System.out.println(student1.course.subject3);       //Output : Biology
    }
}