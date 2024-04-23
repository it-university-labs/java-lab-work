package midterm;


import org.w3c.dom.CDATASection;

import java.util.Date;

interface Assingments {

    String setProgress(String status);

    String assignExecutor(String status);

    String displayInfo();
}

class Development implements Assingments {
    public String title;
    public String describtion;
    public String status;
    public String executor;
    public String dateCreation;

    Development(){}
    Development(String title, String describtion, String status, String executor, String dateCreation) {
        this.title = title;
        this.describtion = describtion;
        this.status = status;
        this.executor = executor;
        this.dateCreation = dateCreation;
    }

    public String getTitle() {
        return title;
    }

    public String getDescribtion() {
        return describtion;
    }

    public String getStatus() {
        return status;
    }

    public String getExecuter() {
        return executor;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setExecuter(String executer) {
        this.executor = executer;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Override
    public String setProgress(String status) {
        return this.status = status;
    }

    @Override
    public String assignExecutor(String executor) {
        return this.executor = executor;
    }

    @Override
    public String displayInfo() {
        return title + " " + describtion + " " + status + " " + executor + " " + dateCreation;
    }
}

class Designer implements Assingments {
    public String title;
    public String describtion;
    public String status;
    public String executor;
    public String dateCreation;

    Designer(){}
    Designer(String title, String describtion, String status, String executor, String dateCreation) {
        this.title = title;
        this.describtion = describtion;
        this.status = status;
        this.executor = executor;
        this.dateCreation = dateCreation;
    }

    public String getTitle() {
        return title;
    }

    public String getDescribtion() {
        return describtion;
    }

    public String getStatus() {
        return status;
    }

    public String getExecutor() {
        return executor;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Override
    public String setProgress(String status) {
        return this.status = status;
    }

    @Override
    public String assignExecutor(String executor) {
        return this.executor = executor;
    }

    @Override
    public String displayInfo() {
        return title + " " + describtion + " " + status + " " + executor + " " + dateCreation;
    }
}

class Test implements Assingments {
    public String title;
    public String describtion;
    public String status;
    public String executor;
    public String dateCreation;

    Test(){}
    Test(String title, String describtion, String status, String executor, String dateCreation) {
        this.title = title;
        this.describtion = describtion;
        this.status = status;
        this.executor = executor;
        this.dateCreation = dateCreation;
    }

    public String getTitle() {
        return title;
    }

    public String getDescribtion() {
        return describtion;
    }

    public String getStatus() {
        return status;
    }

    public String getExecutor() {
        return executor;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Override
    public String setProgress(String status) {
        return this.status = status;
    }

    @Override
    public String assignExecutor(String executor) {
        return this.executor = executor;
    }

    @Override
    public String displayInfo() {
        return title + " " + describtion + " " + status + " " + executor + " " + dateCreation;
    }
}
