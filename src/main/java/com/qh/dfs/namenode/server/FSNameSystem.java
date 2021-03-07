package com.qh.dfs.namenode.server;

/**
 * 负责管理元素据的核心组件
 * @author qinhan
 */
public class FSNameSystem {

    /**
     * 负责管理内存目录树的组件
     */
    private FSDirectory directory;
    /**
     * 负责管理 edit-log 写入磁盘的组件
     */
    private FSEditLog editLog;

    public FSNameSystem() {
        this.directory = new FSDirectory();
        this.editLog = new FSEditLog();
    }

    /**
     * 创建目录
     * @param path 目录路径
     * @return 创建是否成功
     */
    public boolean mkdir(String path) {

        return true;
    }
}
