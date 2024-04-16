class wild {
  public static void main(String[] args) {
    Rabbit rabbit = new Rabbit();
    rabbit.flee();
    Hawk hawk = new Hawk();
    hawk.hunt();
  }
}

interface prey {
  void flee();
}

interface predator {
  void hunt();
}

class Rabbit implements prey {
  @Override
  public void flee() {
    System.out.println("The Rabbit is Fleeing!!");
  }
}

class Hawk implements predator {
  @Override
  public void hunt(){
    System.out.println("The Hawk is Hunting!!");
  }
}