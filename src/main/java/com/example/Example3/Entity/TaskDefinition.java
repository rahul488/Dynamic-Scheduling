package com.example.Example3.Entity;

public class TaskDefinition {

    private String cronExpression;
    private String actionType;
    private String data;

    public TaskDefinition() {
    }

    public TaskDefinition(String cronExpression, String actionType, String data) {
        this.cronExpression = cronExpression;
        this.actionType = actionType;
        this.data = data;
    }

    public String getCronExpression() {
        return cronExpression;
    }

    public String getActionType() {
        return actionType;
    }

    public String getData() {
        return data;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public void setData(String data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "TaskDefinition{" +
                "cronExpression='" + cronExpression + '\'' +
                ", actionType='" + actionType + '\'' +
                ", data='" + data + '\'' +
                '}';
    }


}
