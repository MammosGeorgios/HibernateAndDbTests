package common;

import java.util.Properties;

public class DbConnectionProperties {

    private String uri;
    private String user;
    private String password;
    private String driver;
    private String dialect;
    private String hbm2ddl;
    private String showSql;
    private String formatSql;

    private boolean isOverride;


    public Properties getConnectionProperties(){
        return null;
    }
}
