package com.qfl.trading.entity;
public class Files {
    private int fileID;
    private String description;

    public int getFileID() {
        return fileID;
    }

    public void setFileID(int fileID) {
        this.fileID = fileID;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Files{" +
                "fileID=" + fileID +
                ", description='" + description + '\'' +
                '}';
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

