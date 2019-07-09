package com.gl.springbootcommon.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.IOException;
import java.util.Base64;

/**
 * @description: 测试工具类
 * @author: TL
 * @create: 2019-07-09 10:31
 **/
public class AnalyseFile {

    public static void main(String[] args) {
        String path = "C:\\Users\\lenovo\\Desktop\\game.json";
        StringBuffer buff = new StringBuffer();
        try {
            FileUtils.readToBuffer(buff, path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String str = buff.toString();

        JSONArray jsonArray = JSONArray.parseArray(str);

        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonobject = jsonArray.getJSONObject(i);
            System.out.println("id : " + jsonobject.get("id"));
            System.out.println("title : " + jsonobject.get("title"));
            System.out.println("img : " + jsonobject.get("img"));

            JSONObject p = jsonobject.getJSONObject("p");
            String resurl_fake = p.getString("resurl_fake");

            resurl_fake = resurl_fake.replace("http://szhong.game.com/gameswf/", "http://www.wowcoolwow.com/games/szhong.game.com/gameswf/");
            resurl_fake = resurl_fake.replace("http://sxiao.game.com/gameswf/", "http://www.wowcoolwow.com/games/sxiao.game.com/gameswf/");
            resurl_fake = resurl_fake.replace("http://sda.game.com/gameswf/", "http://www.wowcoolwow.com/games/sda.game.com/gameswf/");
            resurl_fake = resurl_fake.replace("http://s1.game.com/gameswf/", "http://www.wowcoolwow.com/games/s1.game.com/gameswf/");

            if(! resurl_fake.contains("s1.game.com")
                && ! resurl_fake.contains("szhong.game.com")
                && !resurl_fake.contains("sxiao.game.com")
                && !resurl_fake.contains("sda.game.com")){

                System.out.println("+++$$%^&*()_+" + resurl_fake);
                break;
            }

            System.out.println("resurl : " + resurl_fake);
            System.out.println("content : " + new String(Base64.getDecoder().decode(jsonobject.getString("content").getBytes())));

            System.out.println("------------------------");
            System.out.println("\n");
        }
    }
}
