import java.util.ArrayList;
public class Driver{
  public static void main(String[] args){
    ArrayList<String> tester = createRandomArray(20);
    System.out.println(tester);
    System.out.println(makeReversedList(tester));
  }
  public static ArrayList<String>createRandomArray(int size){
    ArrayList<String> Arr = new ArrayList<String>(size);
    for (int i = 0; i < size -1; i++){
      int temp = (int)(Math.random() * 11);
      Arr.add("" + temp);

    }
    replaceEmpty(Arr);
    return Arr;
  }
  public static void replaceEmpty( ArrayList<String> original){
  //Modify the ArrayList such that it has all of the empty strings are
  //replaced with the word "Empty".
  for(int i =0; i < original.size(); i++){
    if(original.get(i).equals("0")){
      original.set(i, "Empty");
    }
  }
  }
  public static ArrayList<String> makeReversedList( ArrayList<String> original){
    ArrayList<String> Arr = new ArrayList<String>(original.size());
    for (int i = original.size() -1; i > 0; i--){
      Arr.add(original.get(i));}
      Arr.add(original.get(0));
    return Arr;
  }
  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
    return null;
    //return a new ArrayList that has all values of a and b in alternating order that is:
    //a[0], b[0], a[1], b[1]...
    //If one list is longer than the other, just attach the remaining values to the end.
  }
}
