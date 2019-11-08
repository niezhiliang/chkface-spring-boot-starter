package cn.isuyu.baidu.face.h5.liveness.service.impl;

import cn.isuyu.baidu.face.h5.liveness.config.FaceChkProperties;
import cn.isuyu.baidu.face.h5.liveness.dtos.FaceChkDTO;
import cn.isuyu.baidu.face.h5.liveness.service.FaceChkService;
import cn.isuyu.baidu.face.h5.liveness.utils.OkHttp;
import cn.isuyu.baidu.face.h5.liveness.vos.CodeVO;
import cn.isuyu.baidu.face.h5.liveness.vos.FaceVO;
import cn.isuyu.baidu.face.h5.liveness.vos.ResultTokenVO;
import cn.isuyu.baidu.face.h5.liveness.vos.ResultVO;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @Author NieZhiLiang
 * @Email nzlsgg@163.com
 * @GitHub https://github.com/niezhiliang
 * @Date 2019-11-08 3:42 下午
 */
@Service
public class FaceChkServiceImpl implements FaceChkService {

    @Autowired
    private FaceChkProperties faceChkProperties;

    public ResultTokenVO getAccertToken() throws IOException {
        StringBuffer stringBuffer = new StringBuffer(faceChkProperties.getUrlToken())
                .append("?grant_type=client_credentials")
                .append("&client_id=").append(faceChkProperties.getApikey())
                .append("&client_secret=").append(faceChkProperties.getSecretkey());
        String result = OkHttp.get(stringBuffer.toString());
        return JSONObject.parseObject(result,ResultTokenVO.class);
    }

    public ResultVO<CodeVO> getCode() {

        return null;
    }

    public ResultVO<FaceVO> getFaceResult(FaceChkDTO faceChkDTO) {
        return null;
    }


}
