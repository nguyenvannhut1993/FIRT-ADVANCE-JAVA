
package task1.pkg29;

/**
 *
 * @author nguyen van nhut
 */
public class SingleTeacher {

    private static SingleTeacher instance = new SingleTeacher();

    public SingleTeacher() {
    }

    public static SingleTeacher getInstance() {
        return instance;
    }

    public String shareDocument() {
        return "Tai lieu tham khao: \n- Chuong 1\n- Chuong 2\n- Chuong 3\n- Chuong 4\n";

    }
}
