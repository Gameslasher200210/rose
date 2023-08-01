public class Loop{
    public void greet(int num){
        System.out.println(num*num);
    }
    public int greeti(int num){
        return num*num;
    }
    public static void main(String[] args){
    Loop squared = new Loop();
    squared.greet(7);
    int anything = squared.greeti(5);
    System.out.println(anything);
    }
}