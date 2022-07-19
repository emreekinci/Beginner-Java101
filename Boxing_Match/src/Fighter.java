public class Fighter {
    String name;
    int damage;
    int healt;
    int weight;
    int dodge;

    Fighter(String name, int damage, int healt, int weight,int dodge){
        this.name = name;
        this.damage = damage;
        this.healt = healt;
        this.weight = weight;
        if (dodge >= 0 && dodge <= 100){
            this.dodge = dodge;
        }
        else{
            this.dodge = 0;
        }
        //this.dodge = dodge;
    }

    int hit(Fighter foe){ // foe hasari alan dovuscu
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");

        if (foe.isDodge()){
            System.out.println(foe.name+ " Gelen hasari blokladi");
            System.out.println("-----------");
            return foe.healt;
        }

        if (foe.healt - this.damage < 0){ // can negatif deger alamaz
            return 0;
        }
        return foe.healt - this.damage ;
    }

    boolean isDodge(){
        double randomNumber = Math.random() * 100; //    100 x (0-1) = (0 - 100)
        return randomNumber <= this.dodge;
    }
}
