package readproperties;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public interface ConfigProvider {
    static Config readConfig(){
        Config load = ConfigFactory.load("application.conf");
        return load;
    }
    Config config = readConfig();

    String URL = readConfig().getString("url");
    String USER_LOGIN = readConfig().getString("usersParams.user.login");
    String USER_PASSWORD = readConfig().getString("usersParams.user.password");
    String DATA = readConfig().getString("usersParams.user.data");

}
