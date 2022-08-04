import java.util.Scanner;

//编写一个程序，该程序可以接收一个字符，比如：a b c d e f g a表示星期一，b表示星期二
//根据用户的输入显示相应的信息用switch语句完成
public class Switch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符(a-g)" );
        char c1 = scanner.next().charAt(0);
        switch(c1) {
            case 'a':
                System.out.println("今天星期一");
                break;
            case 'b' :
                System.out.println("今天星期二");
                break;
            //.....省略
            default:
                System.out.println("你输入的字符不对没有匹配的");
        }
        System.out.println("退出了switch,继续执行程序");
    }

}
