public class Driver{
  public void main(String[] arg){

  }
  public static int day1(Array arr){
    int count = 0;
    int forward = 0;
    int backward = 0;
    int right = 0;
    int left = 0;
    int direction = 1;
    for (int i =0; i < arr.legnth(); i++){
      int current = parseInt(arr[i].substring(1));
      if(arr[i].has("R")){
        direction++;
      }
      if(direction == 1){
        forward++;
      if(direction == 2){
        right++;
      }
      if(direction == 3){
        backward++;
      }
      if(direction == 4){
        left++;
      }
      }
    }
  }
}
