package lesson10.inheritance;

public class A {
    private String str="";
    private static String GLOBAL_STR="Пример";
   // {
      //  str="test";
    //}
    static{
        GLOBAL_STR="";
   }
    public A(){
        this.str="Constructor";
        System.out.println("Вызван конструктор класса A");
    }
    protected void print(){

    }
}
