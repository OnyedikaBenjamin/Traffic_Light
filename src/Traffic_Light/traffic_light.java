package Traffic_Light;
import java.util.Objects;

public class traffic_light {

        public static void main(String[] args) {
            String str ="red";
            System.out.println(updateLight(str).equals("green"));
        }
        public static String updateLight(String current) {
            String [] arr = {"green", "yellow", "red"};
            for (int i = 0; i < arr.length; i++) {
                if (Objects.equals(current, arr[arr.length - 1])) { return arr[0];}
                else if (Objects.equals(current, arr[i])) {
                    return arr[i+1];
                }
            }
            return "";
        }
}
