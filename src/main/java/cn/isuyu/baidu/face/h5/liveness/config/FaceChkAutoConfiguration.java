package cn.isuyu.baidu.face.h5.liveness.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author NieZhiLiang
 * @Email nzlsgg@163.com
 * @GitHub https://github.com/niezhiliang
 * @Date 2019-11-08 3:38 下午
 */
@Configuration
@EnableConfigurationProperties(FaceChkProperties.class)
public class FaceChkAutoConfiguration {

    @Bean
    public FaceChkProperties faceChkProperties() {
        return new FaceChkProperties();
    }
}
