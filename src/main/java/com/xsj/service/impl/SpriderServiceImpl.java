package com.xsj.service.impl;

import com.xsj.service.SpriderService;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;

@Service
public class SpriderServiceImpl implements SpriderService {
    @Override
    public String getHtml(String url) {

        HttpClient httpClient = HttpClients.createDefault();
        HttpGet get = new HttpGet(url);
        String content = null;
        try {
            HttpResponse response = httpClient.execute(get);
            HttpEntity entity = response.getEntity();
            content = EntityUtils.toString(entity, "utf-8");

        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}
