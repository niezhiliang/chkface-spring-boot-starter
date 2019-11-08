package cn.isuyu.baidu.face.h5.liveness.dtos;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author NieZhiLiang
 * @Email nzlsgg@163.com
 * @GitHub https://github.com/niezhiliang
 * @Date 2019-11-08 5:48 下午
 */
@Data
public class FaceChkDTO implements Serializable {

    /**
     * 短信验证码的sessionId
     */
    private String session_id;

    /**
     * 视频文件的base64
     */
    private String video_base64;
}
