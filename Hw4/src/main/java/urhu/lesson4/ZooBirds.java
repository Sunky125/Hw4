package urhu.lesson4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@ConditionalOnBean(ZooAnimals.class)
@Component
public class ZooBirds
{
    @Value("animals")
    public List<String> animals;
}