package com.kafka.producer;

import com.config.DatabaseManager;
import com.config.KafkaConfiguration;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.protocol.types.Field;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class KafkaProducer {

    public static void main(String[] args){
        Properties properties = KafkaConfiguration.getKafkaProducerProperties();

        KafkaProducer<String, String> producer = new KafkaProducer<>(properties);

        DatabaseManager databaseManager = new DatabaseManager(dataSourceConfig);

        try(Connection connection = databaseManager.getConnection();
            Statement statement = connection.createStatement()){
            String query = "SELECT * FROM test_table";
            ResultSet resultSet = statement.executeQuery(query);

            while(resultSet.next()){

                String key = resultSet.getString("id");
                String value = resultSet.getString("data");

                ProducerRecord<String, String> record = new ProducerRecord<>("test-topic", key, value);
                producer.send(record);
            }

            resultSet.close();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            producer.close();
        }

    }
}
