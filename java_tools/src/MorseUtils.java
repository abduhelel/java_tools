import cn.hutool.core.codec.Morse;
import org.junit.Test;

/**
 * @author Aaron
 * @Date   2018-10-15
 */
public class MorseUtils {

    final static Morse morseCoder = new Morse();
    /**
     * morse code encryption
     * @return String
     */
    public static String encryption(String content){
        return morseCoder.encode(content);
    }

    /**
     * morse code  decryption
     * @return String
     */
    public static String decryption(String content){
        return morseCoder.decode(content);
    }

    @Test
    public void encryptionTest(){
        String content = "明天晚上6点给打电话";
        String encryption = encryption(content);
        System.out.println("encryption = " + encryption);
        // encryption = --..--.....---./-.--..-..-.-..-/--..--..-.--.-./-..---.....-.-./-..../---....-.---..-/------.--.--..-/--...-..-.-..--/---.-.-..--.-.-/-...-.----.---.-/
    }

    @Test
    public void decryptionTest(){
        String content = "--..--.....---./-.--..-..-.-..-/--..--..-.--.-./-..---.....-.-./-..../---....-.---..-/------.--.--..-/--...-..-.-..--/---.-.-..--.-.-/-...-.----.---.-/";
        String decryption = decryption(content);
        System.out.println("decryption = " + decryption);
        // decryption = 明天晚上6点给打电话
    }

}
