package red.reksai;

import red.reksai.entity.HelloWorld;

/**
 * @author : <a href="mailto:gnehcgnaw@gmail.com">gnehcgnaw</a>
 * @date : 2019-06-26 11:01
 * @since :
 */
public class Main {
    public static void main(String[] args) {
        //创建对象
        HelloWorld helloWorld = new HelloWorld();
        //设值
        helloWorld.setName("spring");
        //调用方法
        helloWorld.printMsg();
    }
}
