public class Employee { 
    String name; // ad soyad
    double salary; // maas
    int workHours; // haftalik calisma saati
    int hireYear; // ise baslama yili

    Employee(String name,double salary,int workHours,int hireYear){  // constructor
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){ // vergi hesabi
        if(this.salary < 1000){
            return this.salary; // vergi yok
        } else{
            double tax = salary * 0.03; // maaşın 3% vergidir
            return tax;
        }
    }

    int bonus(){
        if(this.workHours>40){
            int bns = (this.workHours-40) * 30; // 40 saatten fazlası icin her saatin hesabi
            return bns;
        }
        return 0;
    }

    double raiseSalary(){
        double extra;
        if (hireYear<=0  || hireYear>2021){ // 0 dan kucuk ve 2021(su anki sene) den buyuk degerler gecersizdir.
            System.out.println("You entered an invalid working year value. \nPlease check the year !!! ");
            extra = 0; // yanlis yil degeri varsa extra = 0 olsun
            return extra;
        }
        else{ // gecerli degerler
            int diffYear = 2021 - hireYear ; // calisilan toplam yil
           //double extra;
            extra = 0 ;
            if (diffYear>0 && diffYear<10){
                extra = this.salary*0.05 ; // 10 yildan az calisma ---> % 5 , [1, 9]
                return extra ;
            } else if (diffYear > 9 && diffYear < 20) { // 10 dahil 20 yildan az calisma ---> % 10 , [10, 19]
                extra = salary*0.1 ;
                return extra;
            } else if (diffYear>19) { // 19 yildan fazla calisma ---> % 15 ,  [20, ...]
                extra = salary*0.15 ;
                return extra ;
            } else if (diffYear==0) {
                return 0 ;
            }
        }
        return 0 ;
    }

    public String toString(){

        double total = this.salary-tax() +bonus() +raiseSalary();
        double  totall = this.salary +bonus() -tax();
        System.out.println("Adi\t: " + this.name);
        System.out.println("Salary:\t " + this.salary);
        System.out.println("WorkHours\t: " + this.workHours);
        System.out.println("HireYear\t: " + this.hireYear);
        System.out.println("Tax\t: " + tax());
        System.out.println("Bonus\t: " + bonus());
        System.out.println("SalaryIncrease\t: " + raiseSalary());
        System.out.println("salary with taxes and bonuses\t: " + totall);
        System.out.println("TotalSalary\t: " + total);
        System.out.println("-------------------------------------------");

        return null;
    }
}
