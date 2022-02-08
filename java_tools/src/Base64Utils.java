import cn.hutool.core.codec.Base64;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
/**
 * @author Aaron
 * @author Aaron
 * @Date   2018-10-15
 */
public class Base64Utils {

    /**
     * @Author： Aaron
     * 本地图片转换base64
     * @param imagePath
     * @return fileList
     */
    public static String imageToBase64(String imagePath) {
        InputStream in = null;
        byte[] data = null;
        try {
            in = new FileInputStream(imagePath);
            data = new byte[in.available()];
            in.read(data);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Base64.encode(data);
    }
}
