package core.data.configurations;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public interface ConfigProvider {
    Config conf = readConfig();

    static Config readConfig(){
        return ConfigFactory.systemProperties().hasPath("testProfile")
                ? ConfigFactory.load(ConfigFactory.systemProperties().getString("testProfile"))
                : ConfigFactory.load("application.conf");
    }

    String URL = conf.getString("url");
    String EMAIL = conf.getString("email");
    String PASSWORD = conf.getString("password");
    String INVALID_PASSWORD = conf.getString("incorrect_password");
    String USER_NAME = conf.getString("user_name");
}
