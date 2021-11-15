import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Project name(项目名称)：异常跟踪栈
 * Package(包名): PACKAGE_NAME
 * Class(类名): GetPositiveInteger
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/15
 * Time(创建时间)： 12:38
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class GetPositiveInteger
{
    public static void main(String[] args) throws IOException
    {
        String inputStr;
        int inputNum;
        boolean inputIsRight = false;
        do
        {
            try
            {
                System.out.println("请输入一个正整数：");
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                inputStr = in.readLine();
                inputNum = Integer.parseInt(inputStr);
                if (inputNum <= 0)
                {
                    throw new NegativeIntegerException();
                }
                inputIsRight = true;
            }
            catch (NumberFormatException e)
            {
                System.out.println("输入的不是一个整数，请重新输入");
            }
            catch (NegativeIntegerException e)
            {
                System.out.println("输入的不是一个正整数，请重新输入");
            }

        }
        while (!inputIsRight);
    }
}

class NegativeIntegerException extends Exception
{

}