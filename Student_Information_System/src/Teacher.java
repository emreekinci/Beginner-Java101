/*public class Teacher {
    String name;
    String tel_no;
    String branch;


    Teacher(){
        System.out.println("Kendi yazdığımız constructor...");
    }
    Teacher(String name, String tel_no, String branch){ // constructor

        this.name = name;
        this.tel_no = tel_no;
        this.branch = branch;

    }
    void print(){
        System.out.println("\n*************************");
        System.out.println("Adi : "+this.name);
        System.out.println("Telefon No : "+this.tel_no);
        System.out.println("Bolum/Bransi : "+this.branch);
        //System.out.println("\n*************************");
    }
}*/


public class Teacher {
    String name;
    String branch;
    int phoneNumber;

    Teacher(String name,String branch,int phoneNumber){
        this.name=name;
        this.branch=branch;
        this.phoneNumber=phoneNumber;
    }
}
