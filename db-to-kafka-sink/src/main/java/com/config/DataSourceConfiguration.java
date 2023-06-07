package com.config;

public class DataSourceConfiguration {
    private String dataSourceName;
    private String connectionUrl;
    private String username;
    private String password;

    public DataSourceConfiguration(String dataSourceName, String connectionUrl, String username, String password){
        this.dataSourceName = dataSourceName;
        this.connectionUrl = connectionUrl;
        this.username = username;
        this.password = password;
    }

    public String getDataSourceName(){
        return dataSourceName;
    }

    public void setDataSourceName(){
        this.dataSourceName = dataSourceName;
    }
    public String getConnectionUrl(){
        return connectionUrl;
    }

    public void setConnectionUrl(){
        this.connectionUrl = connectionUrl;
    }
    public String getUsername(){
        return username;
    }

    public void setUsername(){
        this.username = username;
    }
    public String getPassword(){
        return password;
    }

    public void setPassword(){
        this.password = password;
    }
}
