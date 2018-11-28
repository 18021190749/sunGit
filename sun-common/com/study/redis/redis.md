#启动命令
redis-server redis.windows.conf 
#设置服务命令
redis-server --service-install redis.windows-service.conf --loglevel verbose
#卸载服务
redis-server --service-uninstall
#开启服务
redis-server --service-start
#停止服务
redis-server --service-stop