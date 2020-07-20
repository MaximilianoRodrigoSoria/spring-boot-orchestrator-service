package ar.com.orchestrator.graphql;



import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class QueryGraphQL implements GraphQLQueryResolver {

	public String echoTest() {
		return "GraphQL found OK!!!";
	}



}
