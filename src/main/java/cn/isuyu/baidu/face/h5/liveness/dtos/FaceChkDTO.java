package cn.isuyu.baidu.face.h5.liveness.dtos;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author NieZhiLiang
 * @Email nzlsgg@163.com
 * @GitHub https://github.com/niezhiliang
 * @Date 2019-11-08 5:48 下午
 */
@Data
@Accessors(chain = true)
public class FaceChkDTO implements Serializable {

    private static final long serialVersionUID = -4050959899367643566L;

    /**
     * 短信验证码的sessionId
     */
    private String session_id;

    /**
     * 视频文件的base64
     */
    private String video_base64;

    /**
     * 请求的access_token
     */
    private String access_token;
}
