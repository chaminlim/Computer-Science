public class Test{

  public static void main(String[] args) {
    for(int x = 1; x <= 7; x++){
      for(int y = 1; y <= 7; y++){
        if(x == y)
          System.out.print("1");
        else
          System.out.print("0");
      }
      System.out.print("\n");
    }
  }
}
