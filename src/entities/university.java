package entities;

public class university {
    public String name;
    public String location;
    private int id;

    public university(String _name, String _location, int _id){
        setValues(_name, _location, _id);
        System.out.println(getValues());
    }

    public void setValues(String _name, String _location, int _id){
        name = _name;
        location = _location;
        id=_id;
    }

    public String getValues(){
        String info = "University id: " + id + "\nUniversity name: " + name + "\nUniversity location: " + location + "\n";
        return info;
    }
}
