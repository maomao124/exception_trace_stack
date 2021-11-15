import java.io.IOException;

/**
 * Project name(项目名称)：异常跟踪栈
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/15
 * Time(创建时间)： 12:42
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String[] args)
    {
        try
        {
            GetPositiveInteger.main(null);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println();
        PrintStackTraceTest.main(null);
    }
}
