public class Robot {
    String name;
    int id;
    String material;
    Boolean Is_On_Market;
    Boolean Is_It_Mobile;
    String type;
    private Robot(String name,int id,String material,Boolean Is_On_Market,Boolean Is_It_Mobile,String type) {
        this.name=name;
        this.id=id;
        this.material=material;
        this.Is_On_Market=Is_On_Market;
        this.Is_It_Mobile=Is_It_Mobile;
        this.type=type;
    }
    public void getName(){
    }
    public void getId(){
    }
    public void getMaterial(){
    }
    public void getIs_on_Market(){
    }
    public void getIs_It_Mobile(){
    }
    public void gettype(){
    }
    public String toString(){
        return name+" "+id+" "+material+" "+Is_On_Market+" "+Is_It_Mobile+" "+type;
    }
}
