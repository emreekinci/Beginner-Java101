/*public class Student {
    Course c1; // notes
    Course c2;
    Course c3;

    String name; // info student
    String studentNo;
    String classes;
    double avg; // methods
    boolean isPass;

    Student(String name, String studentNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;

        calcAverage();
        this.avg = avg;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
    }

    void isPass(){
        this.avg = (this.c1.note + this.c2.note + this.c3.note) / 3.0; // double avg
        if (this.avg > 55){
            System.out.println("Basarili sekilde sinif gecildi..");
        }
        else{
            System.out.println("Sinifta kaldiniz");
        }
        printNote();
    }
    void printNote(){
        System.out.println(this.c1.name+" Notu : "+this.c1.note);
        System.out.println(this.c2.name+" Notu : "+this.c2.note);
        System.out.println(this.c3.name+" Notu : "+this.c3.note);
        System.out.println("Ortalama : "+this.avg);
        System.out.println();
    }
}
*/





public class Student {
    Course music;
    Course math;
    Course english;
    String name;
    int stdNo;
    int classes;
    double average;
    boolean isPass;

    Student(String name,int stdNo,int classes,Course music,Course math,Course english){
        this.name=name;
        this.stdNo=stdNo;
        this.classes=classes;
        this.music=music;
        this.math=math;
        this.english=english;
        calcAverage();
        this.isPass=false;
    }

    void addBulkExamNote(int musicNote,int mathNote,int engNote,int musicNote2,int mathNote2,int engNote2){
        if(musicNote>=0 && musicNote<=100){
            this.music.note=musicNote;
        }
        if(mathNote>=0 && mathNote<=100){
            this.math.note=mathNote;
        }
        if(engNote>=0 && engNote<=100){
            this.english.note=engNote;
        }
        if(musicNote2>=0 && musicNote2<=100){
            this.music.tchrNote=musicNote2;
        }
        if(mathNote2>=0 && mathNote2<=100){
            this.math.tchrNote=mathNote2;
        }
        if(engNote2>=0 && engNote2<=100){
            this.english.tchrNote=engNote2;
        }

    }

    void isPass(){
        this.isPass=isCheckPass();
        printNote();
        System.out.println("Ortalama: "+this.average);
        if(this.isPass){
            System.out.println("Sinifi gecti...\n");
        }else{
            System.out.println("Sinifta kaldi...\n");
        }
    }

    void calcAverage(){
        double musicAverage=((this.music.note)*0.8)+((this.music.tchrNote)*0.2);
        double mathAverage=((this.math.note)*0.7)+((this.math.tchrNote)*0.3);
        double engAverage=((this.english.note)*0.6)+((this.english.tchrNote)*0.4);
        this.average=(musicAverage+mathAverage+engAverage)/3;
    }

    boolean isCheckPass(){
        calcAverage();
        return this.average >= 55;
    }

    void printNote(){
        System.out.println("=======================");
        System.out.println("Ogrenci : "+this.name);
        System.out.println("Matematik notu : "+this.math.note);
        System.out.println("Muzik notu : "+this.music.note);
        System.out.println("Ingilizce notu : "+this.english.note );
    }
}


