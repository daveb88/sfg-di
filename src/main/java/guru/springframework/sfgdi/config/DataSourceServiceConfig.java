package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.datasource.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
public class DataSourceServiceConfig {

    @Bean
    FakeDataSource fakeDataSource(SfgConfiguartion sfgConfiguartion) {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(sfgConfiguartion.getUsername());
        fakeDataSource.setPassword(sfgConfiguartion.getPassword());
        fakeDataSource.setJdbcUrl(sfgConfiguartion.getJdbcUrl());

        return fakeDataSource;
    }
}
