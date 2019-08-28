# webservice-test
webservice project test

wsclient项目修改为使用外部tomcat
tomcat中需要修改bin/catalina.bat：
    --在setlocal下添加：
        set JAVA_OPTS=-Xms512m -Xmx1024m -XX:MaxPermSize=1024m -Dfile.encoding=UTF-8