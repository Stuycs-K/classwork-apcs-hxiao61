public class Driver{
  public static String[]parse(String file){
    try{
      Scanner inf = new Scanner(new File "input.txt");
      Scanner line = inf.nextLine();
      System.out.println(line);
      return null;
    } catch(Exception e){
      System.exit(1);
    }
    return null;
  }
  public void main(String[] arg){
    String[]data = parse("input.txt");

  }
  public static int day1(String[]data){
    int count = 0;
    int forward = 0;
    int backward = 0;
    int right = 0;
    int left = 0;
    int direction = 1;
    for (int i =0; i < data.legnth(); i++){
      int current = parseInt(data[i].substring(1));
      if(data[i].has("R")){
        direction++;
        if(direction == 1){
          forward = forward+current;
        if(direction == 2){
          right = right+current
        }
        if(direction == 3){
          backward = backward+current;
        }
        if(direction == 4){
          left = left+current;
        }
      }
      }
      if(data[i].has("L")){
        direction--;
        if(direction == 1){
          forward = forward+current;
        if(direction == 2){
          right = right+current
        }
        if(direction == 3){
          backward = backward+current;
        }
        if(direction == 4){
          left = left+current;
        }
      }
      }
    }
    return(Math.abs(right-left) + Math.abs(forward-backward));
  }
}
