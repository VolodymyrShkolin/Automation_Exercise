package core.data.properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class LoadFromProperties {

    public static String getProperty(String property){
        Properties properties = new Properties();

        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            InputStream is = classLoader.getResourceAsStream("data.properties");
            properties.load(is);
        }catch (IOException e){
            e.printStackTrace();
        }

        return properties.getProperty(property);
    }

}
