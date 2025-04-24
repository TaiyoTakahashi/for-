package chatGPT_2_120問;
public class Q118_NullPointer {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("nullに対して操作できません");
        }
    }
}
