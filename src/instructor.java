public class instructor extends university_member {
    private int course_id;

    public instructor(String name, String info, int id, int _course_id){
        super(name,info,id);
        course_id=_course_id;
    }
    @Override
    public String toString(){
        return super.toString() + "\nCourse ID: " + course_id +  "\n";
    }
}

