abstract class Instrument{
    abstract void play();
    String what(){
        return "hello from instrument";
    }
    abstract void adjust();


    public static void main(String[] args) {
        Wind wind = new Wind();
        Percussion percussion = new Percussion();
        Stringed stringed = new Stringed();
        Woodwind woodwind = new Woodwind();
        Brass brass = new Brass();
        tune(wind);
        Instrument[] arr = {wind,percussion,stringed,woodwind,brass};
        tuneAll(arr);

    } 


static void tune(Instrument i){
    i.play();
}

static void tuneAll(Instrument[] i){
   for(int n=0; n < i.length ;n++){
    i[n].play();
   }
}
}

class Wind extends Instrument{
    void play(){
        System.out.println("Wind is Playing");;
    }
    String what(){
        return "hello how is it going";
    }
    void adjust(){
        System.out.println("Adjusting");
    }
};

class Percussion extends Instrument{
    void play(){
        System.out.println("Percussion is Playing");
    }
    String what(){
        return "hello how is it going";
    }
    void adjust(){
        System.out.println("Adjusting");
    }
};

class Stringed extends Instrument{
    void play(){
        System.out.println("Stringed is Playing");
    }
    String what(){
        return "hello how is it going";
    }
    void adjust(){
        System.out.println("Adjusting");
    }
};

class Woodwind extends Wind{
    void play(){
        System.out.println("Woodwind is Playing");
    }
    String what(){
        return "hello how is it going";
    }
    void adjust(){
        System.out.println("Adjusting");
    }
};

class Brass extends Wind{
    void play(){
        System.out.println("Brass is Playing");
    }
    String what(){
        return "hello how is it going";
    }
    void adjust(){
        System.out.println("Adjusting");
    }
}
