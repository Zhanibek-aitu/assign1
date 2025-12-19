//University Course Management System
public class Main{
    public static void main(String[] args){
        university AITU = new university("Astana Information Technology University","Astana, Mangilik El, 020000",502);

            instructor l001 = new instructor("Orazova Arailym","senior-lecturer",1,1);

            instructor l002 = new instructor("Askar Khaimuldin","senior-lecturer",2,1);

        course OOP = new course("Object-Oriented programming",1,502);

        course ItP = new course("Introduction to Programming",3,502);
        university SDU = new university("Suleyman Demirel University","Kaskelen, Abylai khan, 1/1",302);
            instructor l003 = new instructor("Zhanibek Abilkhan","senior-lecturer",1,2);

        course LA = new course("Linear Algebra",2,302);

        System.out.println("Compare multiple objects: ");
        System.out.println(" - Courses: ");
        if(OOP.university_id == ItP.university_id){
            System.out.println(OOP.name + " and " + ItP.name + " are offered at the same university\n");
        }else{
            System.out.println(OOP.name + " and " + ItP.name + " are offered at the different universities\n");
        }
        System.out.println(" - Instructors: ");
        if(l001.info == l002.info){
            System.out.println(l001.name + " and " + l002.name + " have the same rank");
        } else{
            System.out.println(l001.name + " and " + l002.name + " have different ranks");
        }
    }
}