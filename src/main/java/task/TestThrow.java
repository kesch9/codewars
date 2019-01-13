package task;

public class TestThrow
{
    static void method() throws IllegalAccessException
    {
        try {
            System.out.println("inside method"); //от сюда начинается выполнение метода и его первое действие верно?
            throw new IllegalAccessException ("Exception in method"); //тут выбрасывается исключение так?(а вот следующий шаг мне не совсем понятен) толи это исключение ловит catch самого метода, толи тот catch который в main ф-ции, т.е. выполнение  метода останавливается
        } catch (NullPointerException e) { //это или ->
            System.out.println(e.getMessage()); // и тут ещё вопрос, разве это не должно напечататься?
        }
    }
    public static void main(String args[])
    {
        try {
            method(); //тут идёт обращения к методу так?
        } catch(IllegalAccessException  e) { // <- это?
            System.out.println("Catch inside main : " + e.getMessage()); //вместе в этим? непойму :(
        }
    }
}
