package com.yeungeek.leetcode;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
//        System.out.println("Hello LeetCode");
//
//        Random random = new Random(System.currentTimeMillis());
//        System.out.println("random: " + String.valueOf(random.nextInt(10000 - 1000) + 1000));


//            URL urlL = new URL("https://rokid-ota.oss-cn-hangzhou.aliyuncs.com/toB/Rokid_Glass/app/QR/com.rokid.camera.cameradeploy_%E4%BA%BA%E8%84%B8%E8%AF%86%E5%88%AB_V5.1.7.apk");
//        String url = URLDecoder.decode("https://rokid-ota.oss-cn-hangzhou.aliyuncs.com/toB/Rokid_Glass/app/QR/com.rokid.camera.cameradeploy_%E4%BA%BA%E8%84%B8%E8%AF%86%E5%88%AB_V5.1.7.apk", "UTF-8");
//        System.out.println(url);
//
//
////        String url = "https://rokid-ota.oss-cn-hangzhou.aliyuncs.com/toB/Rokid_Glass/infrared/com.rokid.camera.cameradeploy_人脸识别_V5.1.7.apk";
//
//        String fileName = url.substring(url.lastIndexOf("/") + 1).replace(".apk", "");
//        System.out.println(fileName);
//
//        String[] fileInfos = fileName.split("_");
//        for (int i = 0; i < fileInfos.length; i++) {
//            System.out.println(fileInfos[i]);
//            if (i == 2) {
//                System.out.println(fileInfos[2]
//                        .replace(".", "")
//                        .replace("V", ""));
//            }
//        }

        for (int i = 0; i < 10000; i++) {
            System.out.println((int) (Math.random() * 9000 + 1000));
        }
    }
}
