package com.qh.dfs.namenode.server;

public class NameNodeRpcServer {

    /**
     * 负责管理元素据的核心组件
     */
    private FSNameSystem fsNameSystem;

    public NameNodeRpcServer(FSNameSystem nameSystem) {
        this.fsNameSystem = nameSystem;
    }

    /**
     * 创建目录
     * @param path 文件路径
     * @return 是否创建成功
     */
    public boolean mkdir(String path) {

        return this.fsNameSystem.mkdir(path);
    }

    public void start() {
        System.out.println("开始监听指定的rpc server的端口号，来接受这个请求");
    }
}
