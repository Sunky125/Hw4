package urhu.lesson4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

import java.util.List;

@ConditionalOnExpression("'${environment.variable}' != 'default'")
@Component
public class ZooFishes
{
    @Value("animals")
    public List<String> animals;
}