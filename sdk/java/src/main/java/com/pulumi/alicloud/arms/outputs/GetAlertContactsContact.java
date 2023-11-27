// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.arms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAlertContactsContact {
    /**
     * @return Contact ID.
     * 
     */
    private String alertContactId;
    /**
     * @return The name of the alert contact.
     * 
     */
    private String alertContactName;
    /**
     * @return The Creation Time Timestamp.
     * 
     */
    private String createTime;
    /**
     * @return The webhook URL of the DingTalk chatbot.
     * 
     */
    private String dingRobotWebhookUrl;
    /**
     * @return The email address of the alert contact.
     * 
     */
    private String email;
    /**
     * @return The ID of the Alert Contact.
     * 
     */
    private String id;
    /**
     * @return The mobile number of the alert contact.
     * 
     */
    private String phoneNum;
    /**
     * @return Specifies whether the alert contact receives system notifications.
     * 
     */
    private Boolean systemNoc;
    /**
     * @return Webhook Information.
     * 
     */
    private String webhook;

    private GetAlertContactsContact() {}
    /**
     * @return Contact ID.
     * 
     */
    public String alertContactId() {
        return this.alertContactId;
    }
    /**
     * @return The name of the alert contact.
     * 
     */
    public String alertContactName() {
        return this.alertContactName;
    }
    /**
     * @return The Creation Time Timestamp.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The webhook URL of the DingTalk chatbot.
     * 
     */
    public String dingRobotWebhookUrl() {
        return this.dingRobotWebhookUrl;
    }
    /**
     * @return The email address of the alert contact.
     * 
     */
    public String email() {
        return this.email;
    }
    /**
     * @return The ID of the Alert Contact.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The mobile number of the alert contact.
     * 
     */
    public String phoneNum() {
        return this.phoneNum;
    }
    /**
     * @return Specifies whether the alert contact receives system notifications.
     * 
     */
    public Boolean systemNoc() {
        return this.systemNoc;
    }
    /**
     * @return Webhook Information.
     * 
     */
    public String webhook() {
        return this.webhook;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlertContactsContact defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String alertContactId;
        private String alertContactName;
        private String createTime;
        private String dingRobotWebhookUrl;
        private String email;
        private String id;
        private String phoneNum;
        private Boolean systemNoc;
        private String webhook;
        public Builder() {}
        public Builder(GetAlertContactsContact defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertContactId = defaults.alertContactId;
    	      this.alertContactName = defaults.alertContactName;
    	      this.createTime = defaults.createTime;
    	      this.dingRobotWebhookUrl = defaults.dingRobotWebhookUrl;
    	      this.email = defaults.email;
    	      this.id = defaults.id;
    	      this.phoneNum = defaults.phoneNum;
    	      this.systemNoc = defaults.systemNoc;
    	      this.webhook = defaults.webhook;
        }

        @CustomType.Setter
        public Builder alertContactId(String alertContactId) {
            this.alertContactId = Objects.requireNonNull(alertContactId);
            return this;
        }
        @CustomType.Setter
        public Builder alertContactName(String alertContactName) {
            this.alertContactName = Objects.requireNonNull(alertContactName);
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder dingRobotWebhookUrl(String dingRobotWebhookUrl) {
            this.dingRobotWebhookUrl = Objects.requireNonNull(dingRobotWebhookUrl);
            return this;
        }
        @CustomType.Setter
        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder phoneNum(String phoneNum) {
            this.phoneNum = Objects.requireNonNull(phoneNum);
            return this;
        }
        @CustomType.Setter
        public Builder systemNoc(Boolean systemNoc) {
            this.systemNoc = Objects.requireNonNull(systemNoc);
            return this;
        }
        @CustomType.Setter
        public Builder webhook(String webhook) {
            this.webhook = Objects.requireNonNull(webhook);
            return this;
        }
        public GetAlertContactsContact build() {
            final var _resultValue = new GetAlertContactsContact();
            _resultValue.alertContactId = alertContactId;
            _resultValue.alertContactName = alertContactName;
            _resultValue.createTime = createTime;
            _resultValue.dingRobotWebhookUrl = dingRobotWebhookUrl;
            _resultValue.email = email;
            _resultValue.id = id;
            _resultValue.phoneNum = phoneNum;
            _resultValue.systemNoc = systemNoc;
            _resultValue.webhook = webhook;
            return _resultValue;
        }
    }
}
