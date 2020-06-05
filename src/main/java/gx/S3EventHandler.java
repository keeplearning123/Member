package gx;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.S3Event;
import com.amazonaws.services.s3.event.S3EventNotification;

public class S3EventHandler implements RequestHandler< S3Event, String> {
    @Override
    public String handleRequest(S3Event event, Context ctx) {
        S3EventNotification.S3EventNotificationRecord record=event.getRecords().get(0);
        System.out.println("Bucket Name is "+record.getS3().getBucket().getName());
        System.out.println("File Path is "+record.getS3().getObject().getKey());
        return null;
    }
}
