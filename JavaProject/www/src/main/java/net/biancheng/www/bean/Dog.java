package net.biancheng.www.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@PropertySource(value="classpath:dog.properties")
@ConfigurationProperties(prefix="dog")
public class Dog {
    private String name;
    private String age;

}
