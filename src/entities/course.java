package entities;

public class course {
    private int id;
    public int university_id;
    public String name;

    public course(String _name, int _id, int _university_id){
        setValues(_name, _id, _university_id);
        System.out.println(getValues());
    }

    public void setValues(String _name, int _id, int _university_id){
        name = _name;
        id = _id;
        university_id = _university_id;
    }

    public String getValues(){
        String info = "Course: " + name + "\nID: " + id + "\nUniversity ID: " + university_id + "\n";
        return info;
    }
}
