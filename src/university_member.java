import java.util.Objects;
public class university_member {
    protected String name, info;
    protected int id;

    public university_member(String _name, String _info, int _id){
        name = _name;
        info = _info;
        id = _id;
    }
    public int getId(){ return id;}
    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Name: " + name + "\nID: "+ id + "\nInfo: " + info;
    }

    @Override
    public boolean equals(Object o){
        if(this ==o){return true;}
        if(o==null || getClass() != o.getClass()){return false;}
        university_member that = (university_member) o;
        return id==that.id;}
    @Override
    public int hashCode(){
        return Objects.hash(id);
    }
}
