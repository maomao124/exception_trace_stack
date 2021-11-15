/**
 * Project name(项目名称)：异常跟踪栈
 * Package(包名): PACKAGE_NAME
 * Class(类名): SelfException
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/15
 * Time(创建时间)： 12:08
 * Version(版本): 1.0
 * Description(描述)：
 * 异常对象的 printStackTrace() 方法用于打印异常的跟踪栈信息，根据 printStackTrace() 方法的输出结果，
 * 开发者可以找到异常的源头，并跟踪到异常一路触发的过程。
 * 在面向对象的编程中，大多数复杂操作都会被分解成一系列方法调用。这是因为实现更好的可重用性，
 * 将每个可重用的代码单元定义成方法，将复杂任务逐渐分解为更易管理的小型子任务。由于一个大的业务功能需要由多个对象来共同实现，
 * 在最终编程模型中，很多对象将通过一系列方法调用来实现通信，执行任务。
 * 所以，面向对象的应用程序运行时，经常会发生一系列方法调用，从而形成“方法调用栈”，异常的传播则相反：
 * 只要异常没有被完全捕获（包括异常没有被捕获，或异常被处理后重新抛出了新异常），异常从发生异常的方法逐渐向外传播，
 * 首先传给该方法的调用者，该方法调用者再次传给其调用者……，直至最后传到 main 方法，
 * 如果 main 方法依然没有处理该异常，则 JVM 会中止该程序，并打印异常的跟踪栈信息。
 */

class SelfException extends RuntimeException
{
    SelfException()
    {

    }

    SelfException(String msg)
    {
        super(msg);
    }
}

public class PrintStackTraceTest
{
    public static void main(String[] args)
    {
        firstMethod();
    }

    public static void firstMethod()
    {
        secondMethod();
    }

    public static void secondMethod()
    {
        thirdMethod();
    }

    public static void thirdMethod()
    {
        throw new SelfException("自定义异常信息");
    }
}
