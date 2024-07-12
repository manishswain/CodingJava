package UTIL;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class S3Processing {
    public static void main(String[] args) {
        try {
            BufferedInputStream inputStream = new BufferedInputStream(new URL(
                    "https://aux-app-dev.s3.ap-south-1.amazonaws.com/1/25-04-2022-081253759/Component1.csv?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20220530T074306Z&X-Amz-SignedHeaders=host&X-Amz-Expires=3599&X-Amz-Credential=AKIAZTLE3JSACVBP5UV7%2F20220530%2Fap-south-1%2Fs3%2Faws4_request&X-Amz-Signature=e2db6f37246c72f94a8d9e029e27af66fc0688fc2b82dabdaf90907c798d1e17")
                    .openStream());
            System.out.println(inputStream.toString());
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
