//University Course Management System
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        university AITU = new university("Astana Information Technology University","Astana, Mangilik El, 020000",502);
        course OOP = new course("Object-Oriented programming",1,502);
        course ItP = new course("Introduction to Programming",3,502);
        university SDU = new university("Suleyman Demirel University","Kaskelen, Abylai khan, 1/1",302);
        course LA = new course("Linear Algebra",2,302);

        ArrayList<university_member> members = new ArrayList<>();
        members.add(new instructor("Orazova Arailym", "Senior Lecturer", 1, 1));
        members.add(new instructor("Askar Khaimuldin", "Senior Lecturer", 2, 3));
        members.add(new student("Gordan Freeman", "Ph.D Student", 255004, "SE-2505"));
        members.add(new student("Alyx Vance", "Bachelor", 255005, "CS-2505"));

        System.out.println("All University Members:");
        for(university_member m: members){
            System.out.println(m.toString());
        }

        System.out.println("Students in group SE-2505:");
        for(university_member m: members){
            if(m instanceof student){
                student s=(student) m;
                if(s.getGroupId().equals("SE-2505")){
                    System.out.println(s.getName());
                }
            }
        }
    }
}