class wild {
  public static void main(String[] args) {
    Rabbit rabbit = new Rabbit();
    rabbit.flee();
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
    System.out.println("The Rabbit is Fleeing");
  }
}
