package Level_9;

public class ExceptionExample {
    public static void main(String[] args) {
        method5();
    }
        public static void method1(){
        method2();
    }

    public static void method2(){
        method3();
    }

    public static void method3() {
        method4();
    }

    public static void method4() {
        method5();
    }

    public static String method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[2].getMethodName();
        }
}
