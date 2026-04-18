package Exception;

public class Test {
    public static void main(String[] args) {
        try {
            level1();
        }catch (Exception e){
//            System.out.println(e.getStackTrace());
//            StackTraceElement[] stacktrace = e.getStackTrace();
            e.printStackTrace();
//            for (int i=0; i< stacktrace.length; i++){
//                System.out.println(stacktrace[i]);
            }
        }
    public static  void level3(){
        int[] array = new int[5];
        array[5]=10;
    }
    public static void level2(){
        level3();
    }
    public static void level1(){
        level2();
    }
    }



