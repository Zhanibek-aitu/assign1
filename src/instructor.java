public class instructor {
    public String name, info;
    private int id;
    private int course_id;

    public instructor(String _name, String _info, int _id, int _course_id){
        setValues(_name, _info, _id,_course_id);
        System.out.println(getValues());
    }

    public void setValues(String _name, String _info, int _id, int _course_id){
        name = _name;
        info = _info;
        id = _id;
        course_id = _course_id;
    }

    public String getValues(){
        String info1 = "Name: " + name + "\nInfo: " + info + "\nID: " + id + "\nCourse ID: " + course_id +  "\n";
        return info1;
    }
}

