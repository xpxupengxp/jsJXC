package com.js.util;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * 文件处理工具
 */
public class FileUtil {

    /**
     * 上传图片保存到服务器
     * @param file
     * @return
     */
    public static String[] imgUpload(HttpServletRequest request,MultipartFile... file) {
        String savePath = "";
        String type = "";
        String[] imgUrl = new String[file.length];
        int i = 0;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        String filePath = request.getSession().getServletContext().getRealPath("/")+"upload/"+simpleDateFormat.format(new Date())+"/";
        for(MultipartFile f:file) {
            type = f.getOriginalFilename();
            type = type.substring(type.lastIndexOf('.'));
            savePath = filePath+ UUID.randomUUID().toString()+type;
            File newFile = new File(savePath);
            if(!newFile.exists() && !newFile.isDirectory()) {
                newFile.mkdirs();
            }
            try {
                f.transferTo(newFile);
                imgUrl[i] = savePath;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return imgUrl;
    }


}
