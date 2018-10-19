package example.phonebook;

public class Phone {

    String name;
    String tel;
    Phone(String name, String tel){
        this.name = name;
        this.tel = tel;
    }
    String getName(){
        return name;
    }
    String getTel(){
        return tel;
    }

}
