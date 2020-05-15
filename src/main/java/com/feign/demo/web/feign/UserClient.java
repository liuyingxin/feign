package com.feign.demo.web.feign;

import com.alibaba.fastjson.TypeReference;
import com.google.common.collect.Maps;
import org.apache.commons.codec.digest.DigestUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

@Component
@Slf4j
public class UserClient {
    public static final String secret = "o0mIi39aQLv0zxEgpuIE";
    @Resource
    private RestTemplate restTemplate;

    @Value("url")
    private String url;

    @Value("appid")
    private String appId;

    @Value("/staff/info")
    private String path;

    public Object getUser(String mastername) {


        TreeMap<String, Object> paramMap = Maps.newTreeMap();
        paramMap.put("mastername", mastername);
        paramMap.put("src", appId);
        String sn = getMsgSn(paramMap);
        paramMap.put("sign", sn);
        ResponseEntity<String> response = restTemplate.postForEntity(url + path, paramMap, String.class);
        Object resDto = JsonUtil.toBean(response.getBody(), new TypeReference<Object>() {
        });
        return resDto;
    }


    /**
     * 计算sn
     */
    public static String getMsgSn(TreeMap<String, Object> paramMap) {
        String str = null;
        try {
            str = URLDecoder.decode(http_build_query(paramMap) + secret, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return DigestUtils.md5Hex(str);
    }

    /**
     * Java实现PHP中的http_build_query()效果
     *
     * @param array key=value形式的二位数组
     * @return
     */
    public static String http_build_query(Map<String, Object> array) {
        String reString = "";
        //遍历数组形成akey=avalue&bkey=bvalue&ckey=cvalue形式的的字符串
        Iterator it = array.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = (Map.Entry) it.next();
            String key = entry.getKey();
            String value = entry.getValue();
            reString += key + "=" + value + "&";
        }
        reString = reString.substring(0, reString.length() - 1);
        //将得到的字符串进行处理得到目标格式的字符串
        try {
            reString = URLEncoder.encode(reString, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        reString = reString.replace("%3D", "=").replace("%26", "&");
        return reString;
    }
}