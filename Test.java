/**
 * @description: 
 * @author leShen 
 * @time 2024/11/6 11:46
 */
public class Test {
    public static void main(String[] args) {
        int decimalNumber = 21350; // 示例十进制数字
        String hexString = decimalToHex(decimalNumber);
        System.out.println("十进制数 " + decimalNumber + " 转换为十六进制为: " + hexString);
    }

    public static String decimalToHex(int decimalNumber) {
        return Integer.toHexString(decimalNumber).toUpperCase();
    }
}
