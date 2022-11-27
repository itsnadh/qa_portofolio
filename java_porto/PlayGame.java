class Player {
  public void skill() {
    System.out.println("run fast");
  }

  public void life() {
    System.out.println(5);
  }
}

class Mario extends Player {
  public void skill() {
    System.out.println("jump high");
  }

  public void life() {
    System.out.println(4);
  }
}

class Luigi extends Player {
  public void skill() {
    System.out.println("shoot fire");
  }

  public void life() {
    System.out.println(3);
  }
}

class PlayGame {
  public static void main(String[] args) {
    Player player1 = new Mario();
    Player player2 = new Luigi();

    player1.skill();
    player1.life();

    player2.skill();
    player2.life();
  }
}