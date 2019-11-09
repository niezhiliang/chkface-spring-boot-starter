package cn.isuyu.baidu.face.h5.liveness.config;

import cn.isuyu.baidu.face.h5.liveness.service.FaceChkService;
import cn.isuyu.baidu.face.h5.liveness.service.impl.FaceChkServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
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
@ConditionalOnClass(FaceChkService.class)
@EnableConfigurationProperties(FaceChkProperties.class)
public class FaceChkAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    public FaceChkService faceChkService() {
        return new FaceChkServiceImpl();
    }
}
