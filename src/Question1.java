import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Question1 {

    private static final Map<String, String> value = new HashMap<>();

    public static void main(String[] args) {
        String var = null;
        String str = JOptionPane.showInputDialog("Enter Input");
        if (str.split(" ").length > 1) {
            var = str.split(" ")[1];
        }
        str =  str.split(" ")[0];
        int n = str.length();
        Question1.getStr(str, 0, n - 1);
        JFrame frame = new JFrame();
        if(var==null) {
            JOptionPane.showMessageDialog(frame, value);
        }else{
            JOptionPane.showMessageDialog(frame
                    ,value.containsKey(var) ? "passed" : "failed");
        }
    }

    private static void getStr(String str, int l, int r) {
        if (l == r)
            value.put(str, str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                getStr(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    private static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
