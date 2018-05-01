package com.liucz.message.model.message;

import java.util.Date;

public class MessageReceiver {
    private Integer id;

    private Integer uid;

    private Integer messageBodyId;

    private String messageReceiverName;

    private String messageReceiverPhone;

    private Integer messageSenderId;

    private String messageSenderName;

    private Integer messageStatus;

    private Integer sendStatus;

    private Date readTime;

    private Integer smsStatus;

    private Integer tmsStatus;

    private Date createTime;

    private Date updateTime;

    private Integer deleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getMessageBodyId() {
        return messageBodyId;
    }

    public void setMessageBodyId(Integer messageBodyId) {
        this.messageBodyId = messageBodyId;
    }

    public String getMessageReceiverName() {
        return messageReceiverName;
    }

    public void setMessageReceiverName(String messageReceiverName) {
        this.messageReceiverName = messageReceiverName == null ? null : messageReceiverName.trim();
    }

    public String getMessageReceiverPhone() {
        return messageReceiverPhone;
    }

    public void setMessageReceiverPhone(String messageReceiverPhone) {
        this.messageReceiverPhone = messageReceiverPhone == null ? null : messageReceiverPhone.trim();
    }

    public Integer getMessageSenderId() {
        return messageSenderId;
    }

    public void setMessageSenderId(Integer messageSenderId) {
        this.messageSenderId = messageSenderId;
    }

    public String getMessageSenderName() {
        return messageSenderName;
    }

    public void setMessageSenderName(String messageSenderName) {
        this.messageSenderName = messageSenderName == null ? null : messageSenderName.trim();
    }

    public Integer getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(Integer messageStatus) {
        this.messageStatus = messageStatus;
    }

    public Integer getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
    }

    public Date getReadTime() {
        return readTime;
    }

    public void setReadTime(Date readTime) {
        this.readTime = readTime;
    }

    public Integer getSmsStatus() {
        return smsStatus;
    }

    public void setSmsStatus(Integer smsStatus) {
        this.smsStatus = smsStatus;
    }

    public Integer getTmsStatus() {
        return tmsStatus;
    }

    public void setTmsStatus(Integer tmsStatus) {
        this.tmsStatus = tmsStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
}