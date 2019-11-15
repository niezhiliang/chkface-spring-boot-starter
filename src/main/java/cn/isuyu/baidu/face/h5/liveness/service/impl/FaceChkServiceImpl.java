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
import com.alibaba.fastjson.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author NieZhiLiang
 * @Email nzlsgg@163.com
 * @GitHub https://github.com/niezhiliang
 * @Date 2019-11-08 3:42 下午
 */
public class FaceChkServiceImpl implements FaceChkService {

    @Autowired
    private FaceChkProperties faceChkProperties;

    @Override
    public ResultTokenVO getAccessToken() throws IOException {
        StringBuffer stringBuffer = new StringBuffer(faceChkProperties.getUrlToken())
                .append("?grant_type=client_credentials")
                .append("&client_id=").append(faceChkProperties.getApikey())
                .append("&client_secret=").append(faceChkProperties.getSecretkey());
        String result = OkHttp.get(stringBuffer.toString());
        return JSONObject.parseObject(result,ResultTokenVO.class);
    }

    @Override
    public ResultVO<CodeVO> getCode(String accessToken) throws IOException {
        Map<String,String> params = new HashMap<String,String>(1);
        params.put("access_token",accessToken);
        String result = OkHttp.formPost(faceChkProperties.getUrlCode(),params);
        JSONObject resultJson = JSONObject.parseObject(result);
        if (resultJson.getJSONArray("result").isEmpty()) {
            resultJson.put("result",null);
        }
        return JSONObject.parseObject(resultJson.toJSONString(),new TypeReference<ResultVO<CodeVO>>(){});
    }

    @Override
    public ResultVO<FaceVO> getFaceResult(FaceChkDTO faceChkDTO) throws IOException {
        Map<String,String> params = new HashMap<String,String>(3);
        params.put("session_id",faceChkDTO.getSession_id());
        params.put("video_base64",faceChkDTO.getVideo_base64());
        params.put("access_token",faceChkDTO.getAccess_token());
        String result = OkHttp.formPost(faceChkProperties.getUrlFace(),params);
        JSONObject resultJson = JSONObject.parseObject(result);
        if (resultJson.getJSONArray("result").isEmpty()) {
            resultJson.put("result",null);
        }
        return JSONObject.parseObject(resultJson.toJSONString(),new TypeReference<ResultVO<FaceVO>>(){});
    }


}
