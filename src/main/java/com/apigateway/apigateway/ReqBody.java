package com.apigateway.apigateway;

import org.springframework.data.annotation.Id;

public class ReqBody {

    @Id
    public String id;

    public String functionName;

    public String functionRequestBodyTemplate;



    @Override
    public String toString(){

        return String.format(
                "ReqBody[id=%s, firstName='%s', ReqTemplate='%s' ]",
                id, functionName, functionRequestBodyTemplate);
    }
}
