import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run(){
        if (isCheck()){
            while (this.f1.healt > 0 && this.f2.healt > 0){ // while true da olurdu
                System.out.println("---------YENI ROUND---------");
                int chance = Math.round((float)Math.random());
                System.out.println("Chance : "+chance);
                if (chance == 0) {
                    this.f2.healt = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }
                    this.f1.healt = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }
                }
                if (chance == 1){
                    this.f1.healt = this.f2.hit(this.f1);
                    if (isWin()){
                        break;
                    }
                    this.f2.healt = this.f1.hit(this.f2);
                    if (isWin()){
                        break;
                    }
                }
                //System.out.println(this.f2.healt);
                printScore();
                /*System.out.println(this.f1.name + " Saglik : "+this.f1.healt );
                System.out.println(this.f2.name + " Saglik : "+this.f2.healt );*/
                //break; // bir kere doner
            }
        }
        else{
            System.out.println("Sporcularin sikletleri uyumlu degildir..");
        }
    }

    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin(){
        if(this.f1.healt == 0){
            System.out.println("Kazanan : "+this.f2.name);
            return true;
        }

        else if (this.f2.healt == 0){
            System.out.println("Kazanan : "+this.f1.name);
            return true;
        }
        return false; // dovusme devam ediyor
    }

    public void printScore(){
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t : "+f1.healt);
        System.out.println(f2.name + " Kalan Can \t : "+f2.healt);
    }
}
