/*public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Kenan Sefa","+90546654546545", "TRH");
        Teacher t2 = new Teacher("Ahmet Duran", "+904564444","TRKC");
        Teacher t3 = new Teacher("Lev Tolstoy","11223344","MTH");

        //t1.print();
        Course tarih = new Course("Tarih", "101", "TRH", t1 );
        tarih.addTeacher(t1); // t2 olmaz --> branch = prefix olmali
        //tarih.printTeacherInfo();

        Course turkce = new Course("Turkce", "102", "TRKC",t2);
        turkce.addTeacher(t2);

        Course matematik = new Course("Matematik","103","MTH",t3);
        matematik.addTeacher(t3);


        Student s1 = new Student("Orhan Pamuk","1111","4",tarih,turkce,matematik);
        Student s2 = new Student("Amin Maalouf","2222","4",tarih,turkce,matematik);
        Student s3 = new Student("Emre Gökçe","3333","4",tarih,turkce,matematik);

        s1.addBulkExamNote(100,70,50);
        s2.addBulkExamNote(0,70,50);
        s3.addBulkExamNote(55,55,55);
        //s1.addBulkExamNote(100,200,50);
        //s1.printNote();
        s1.isPass();
        s2.isPass();
        s3.isPass();
    }
}*/



public class Main {
    public static void main(String[] args) {
        Teacher teacher1=new Teacher("Sevgi Şen","msc",3003);
        Teacher teacher2=new Teacher("Ersin Çöl","mat",111);
        Teacher teacher3=new Teacher("Hızır Ali","ing",333);

        Course music=new Course("Muzik","msc101","msc");
        Course mathematics=new Course("Matematik","mat101","mat");
        Course english=new Course("Ingilizce","ingA1","ing");

        music.addTeacher(teacher1);
        mathematics.addTeacher(teacher2);
        english.addTeacher(teacher3);

        Student student1=new Student("Ayhan",6444,1,music,mathematics,english);
        student1.addBulkExamNote(30,70,45,70,20,70);
        student1.isPass();

        Student student2=new Student("Arda",1999,1,music,mathematics,english);
        student1.addBulkExamNote(90,70,45,70,80,60);
        student1.isPass();

    }
}
