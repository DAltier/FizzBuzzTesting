package fizzbuzz;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class AppConfig {
	
	@Bean(name = "iConvertString")
	public IConvertString createConvertString() {
		return new ConvertString();
	}
	
	@Bean(name = "iRangeVal")
	public IRangeVal createRangeVal() {
		return new RangeVal();
	}

	@Bean(name = "iGetFizzBuzz")
	public IGetFizzBuzz createGetFizzBuzz() {
		return new GetFizzBuzz();
	}
	
	@Bean(name = "iFizzBuzzFlow")
	public IFizzBuzzFlow createFizzBuzzFlow() {
		return new FizzBuzzFlow(createConvertString(), createRangeVal(), createGetFizzBuzz());
	}
}
