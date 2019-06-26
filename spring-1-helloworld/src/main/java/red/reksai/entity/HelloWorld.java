package red.reksai.entity;

/**
 * @author : <a href="mailto:gnehcgnaw@gmail.com">gnehcgnaw</a>
 * @date : 2019-06-26 10:59
 * @since :
 */
public class HelloWorld {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printMsg(){
        System.out.println("HelloWorld:  \t"+ name);
    }
}
