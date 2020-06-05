package gx;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

// Handler value: example.HandlerList
public class HandlerList implements RequestHandler<Object, Integer>{
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    @Override
    public Integer handleRequest(Object event, Context context)
    {
        LambdaLogger logger = context.getLogger();
        // process event
        logger.log("EVENT: " + gson.toJson(event));
        logger.log("EVENT TYPE: " + event.getClass().toString());
        return context.getRemainingTimeInMillis() ;
    }
}
