package com.qh.dfs.namenode.server;

import java.util.concurrent.TimeUnit;

/**
 * NameNode 核心启动类
 * @author qinhan
 */
public class NameNode {

    /**
     * NameNode 是否在运行
     */
    private volatile  Boolean shouldRun;

    /**
     * 负责管理元素据的核心组件
     */
    private FSNameSystem nameSystem;

    /**
     * 对外提供RPC接口的Server
     */
    private NameNodeRpcServer rpcServer;

    public NameNode() {
        this.shouldRun = true;
    }

    public static void main (String[] args) {
        NameNode nameNode = new NameNode();
        nameNode.init();
        nameNode.run();
    }


    /**
     * 初始化NameNode
     */
    private void init() {
        this.nameSystem = new FSNameSystem();
        this.rpcServer = new NameNodeRpcServer(nameSystem);
        this.rpcServer.start();
    }

    private void run() {
        while (shouldRun) {
            try {
                TimeUnit.SECONDS.sleep(10L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
