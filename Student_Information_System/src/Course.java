/*public class Course {
    Teacher teacher; // Teacher sınıfındaki tüm özellikler teacher nesnemde bulunuyor--> inherit.

    String name;
    String code;
    String prefix;
    int note;

    Course(String name, String code, String prefix, Teacher teacher ){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        this.note = 0; // default note : 0
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
            //printTeacherInfo();
        }
        else{
            System.out.println(" Ogretmen : "+this.teacher+" ile ders uyumu saglanamadi !! ");
        }
        this.teacher = teacher;
        //printTeacherInfo();
    }
    void printTeacher(){
        if(this.teacher!=null){
            System.out.println(this.name+ " dersinin öğretmeni: "+this.teacher.name);
        }else{
            System.out.println(this.name+" dersine öğretmen atanmamıştır...");
        }
    }

    void printTeacherInfo(){
        this.teacher.print();
    }

}*/







public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int tchrNote;

    Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(prefix)){
            this.teacher=teacher;
        }else{
            System.out.println(teacher+ " ogretmeni bu dersi veremez...");
        }
    }
/*
    void printTeacher(){
        if(this.teacher!=null){
            System.out.println(this.name+ " dersinin öğretmeni: "+this.teacher.name);
        }else{
            System.out.println(this.name+" dersine öğretmen atanmamıştır...");
        }
    }

 */

}
