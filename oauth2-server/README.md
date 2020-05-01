### 获取访问授权码
http://localhost:8080/oauth/authorize?client_id=client&response_type=code
### 通过授权码向服务器申请令牌
curl -X POST -H "Content-Type: application/x-www-form-urlencoded" -d 'grant_type=authorization_code&code=1JuO6V' "http://client:secret@localhost:8080/oauth/token"
