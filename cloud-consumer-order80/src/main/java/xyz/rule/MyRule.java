package xyz.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRule {

    public IRule myRule(){
        return new RandomRule();
    }
}
