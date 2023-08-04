package com.atguigu.gulimall.product;

import com.aliyun.oss.OSSClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @author 钊思暮想
 * @date 2023/8/4 19:22
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class uploadDemo2 {
    @Autowired
    private OSSClient ossClient;
    @Test
    public void saveFile() throws FileNotFoundException {

        InputStream inputStream = new FileInputStream("/Users/ikun/Pictures/清晨.png");

        // download file to local
        ossClient.putObject("gulimall-vae","清晨.png" ,inputStream);
        ossClient.shutdown();//关闭ossClient
        System.out.println("上传完成");
    }
}
