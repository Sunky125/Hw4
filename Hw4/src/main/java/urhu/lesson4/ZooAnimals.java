package urhu.lesson4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Profile("test")
@Component
public class ZooAnimals
{
    @Value("animals")
    public List<String> animals;
}
