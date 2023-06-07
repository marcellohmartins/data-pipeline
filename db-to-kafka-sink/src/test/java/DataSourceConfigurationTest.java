import com.config.DataSourceConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DataSourceConfigurationTest {
    @Test
    public void testDataSourceConfiguration() {
        // Create a mock instance of DataSourceConfiguration
        DataSourceConfiguration dataSourceConfig = new DataSourceConfiguration(
                "MyDataSource",
                "jdbc:mysql://localhost:3306/mydatabase",
                "myusername",
                "mypassword"
        );

        // Verify the configuration values
        Assertions.assertEquals("MyDataSource", dataSourceConfig.getDataSourceName());
        Assertions.assertEquals("jdbc:mysql://localhost:3306/mydatabase", dataSourceConfig.getConnectionUrl());
        Assertions.assertEquals("myusername", dataSourceConfig.getUsername());
        Assertions.assertEquals("mypassword", dataSourceConfig.getPassword());
    }
}
