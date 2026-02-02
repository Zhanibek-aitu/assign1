package org.univer.entities;

public class student extends university_member {
    private String group_id;

    public student(String name, String info, int id, String _group_id){
        super(name,info,id);
        group_id=_group_id;
    }
    @Override
    public String toString(){
        return super.toString() + "\nGroup ID: " + group_id +  "\n";
    }

    @Override
    public boolean equals(Object o){
        if(this==o){
            return true;}
        if(o==null || getClass() != o.getClass()){
            return false;
        }
        student student = (student) o;
        return id==student.id;
    }
    @Override
    public int hashCode(){
        return Integer.hashCode(id);
    }
    public String getGroupId() {
        return group_id;}
}
