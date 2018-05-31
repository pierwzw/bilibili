package com.sf.entity;

/**
 * @author: pier
 * @date: 2018/6/1 0:40
 * @desc:
 */
public class VideoUploadEntity {
    private String fileName;// 文件名字

    private long fileSize;// 文件总大小

    private long fileRest;// 文件上传 剩余的

    private int tag=0;//如果大于0就是上传完成

    private int percentage=0;//百分比

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public long getFileRest() {
        return fileRest;
    }

    public void setFileRest(long fileRest) {
        this.fileRest = fileRest;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
}

