package com.apigateway.apigateway;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface ReqBodyRepository extends MongoRepository<ReqBody, String> {

    public ReqBody findByid(String Id);
    public List<ReqBody> findByFunctionName(String functionName);

}
