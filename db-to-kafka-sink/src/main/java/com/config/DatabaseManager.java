package com.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    private final DataSourceConfiguration dataSourceConfig;

    public DatabaseManager(DataSourceConfiguration dataSourceConfig) {

        this.dataSourceConfig = dataSourceConfig;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                dataSourceConfig.getConnectionUrl(),
                dataSourceConfig.getUsername(),
                dataSourceConfig.getPassword()
        );
    }
}
