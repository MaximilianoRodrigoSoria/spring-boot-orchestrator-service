package ar.com.orchestrator.graphql;

import ar.com.orchestrator.models.client.ProductFeingClient;
import ar.com.orchestrator.models.pojo.Product;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductGraphQL implements GraphQLQueryResolver {

    private ProductFeingClient productFeingClient;

    public Product getProduct(Long id){

        return  productFeingClient.findById(id).getBody();
    }



    @Autowired
    public void setProductFeingClient(ProductFeingClient productFeingClient){
        this.productFeingClient = productFeingClient;
    }
}
