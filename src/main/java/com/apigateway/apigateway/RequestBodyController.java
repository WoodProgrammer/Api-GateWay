package com.apigateway.apigateway;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;

import java.util.List;



@RestController
@RequestMapping("/requestBodies")
public class RequestBodyController {


    @Autowired
    private ReqBodyRepository repository;




    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<ReqBody> getAllReqTemplates() {
        return repository.findAll();
    }
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public List<ReqBody> getReqTemplateById(@PathVariable("name") String name) {
        return repository.findByFunctionName(name);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ReqBody createReqBody(@Valid @RequestBody ReqBody reqBody) {
        repository.save(reqBody);
        return reqBody;
    }


}
