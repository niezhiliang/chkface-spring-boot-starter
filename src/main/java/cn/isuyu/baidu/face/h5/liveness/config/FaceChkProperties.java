package cn.isuyu.baidu.face.h5.liveness.config;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author NieZhiLiang
 * @Email nzlsgg@163.com
 * @GitHub https://github.com/niezhiliang
 * @Date 2019-11-08 3:24 下午
 */
@Component
@ConfigurationProperties(prefix = "baidu.h5")
@Data
@ToString
public class FaceChkProperties {

    /**
     * 应用id
     */
    private String appid;

    /**
     * 应用key
     */
    private String apikey;

    /**
     * 应用secret
     */
    private String secretkey;

    /**
     * 获取token接口
     */
    private String urlToken = "https://aip.baidubce.com/oauth/2.0/token";

    /**
     * 请求验证码接口
     */
    private String urlCode = "https://aip.baidubce.com/rest/2.0/face/v1/faceliveness/sessioncode";

    /**
     * 活体检测接口
     */
    private String urlFace = "https://aip.baidubce.com/rest/2.0/face/v1/faceliveness/verify";
}
