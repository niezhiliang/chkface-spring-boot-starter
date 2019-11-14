## 百度人工智能 H5视频活体检测

该jar包已经推到maven中央仓库，直接pom文件依赖就行

```xml
        <dependency>
            <groupId>cn.isuyu.face.h5.chk</groupId>
            <artifactId>chkface-spring-boot-starter</artifactId>
            <version>1.0.0</version>
        </dependency>
```
#### 配置文件
```yaml
#百度活体检测
baidu:
  h5:
    appid: xxxx
    apikey: xxx
    secretkey: xxxxxx
```
#### 使用

```java

    @Autowired
    private FaceChkService faceChkService;

     //获取请求的access_token
     ResultTokenVO tokenVO = faceChkService.getAccertToken();

    //获取语音校验码
    ResultVO<CodeVO> resultVO = faceChkService.getCode(access_token);          

    //视频活体检测接口
        FaceChkDTO faceChkDTO = new FaceChkDTO()
                .setSession_id(faceDTO.getSessionId())
                .setAccess_token(getAccernToken())
                .setVideo_base64(new BASE64Encoder().encode(faceDTO.getFile().getBytes()));
        ResultVO<FaceVO> result = faceChkService.getFaceResult(faceChkDTO);
    

```
