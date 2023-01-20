// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.amqp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetStaticAccountsAccount {
    /**
     * @return Access key.
     * 
     */
    private String accessKey;
    /**
     * @return Create time stamp. Unix timestamp, to millisecond level.
     * 
     */
    private String createTime;
    /**
     * @return The `key` of the resource supplied above.The value is formulated as `&lt;instance_id&gt;:&lt;access_key&gt;`.
     * 
     */
    private String id;
    /**
     * @return InstanceId
     * 
     */
    private String instanceId;
    /**
     * @return The ID of the user&#39;s primary account.
     * 
     */
    private String masterUid;
    /**
     * @return Static password.
     * 
     */
    private String password;
    /**
     * @return Static username.
     * 
     */
    private String userName;

    private GetStaticAccountsAccount() {}
    /**
     * @return Access key.
     * 
     */
    public String accessKey() {
        return this.accessKey;
    }
    /**
     * @return Create time stamp. Unix timestamp, to millisecond level.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The `key` of the resource supplied above.The value is formulated as `&lt;instance_id&gt;:&lt;access_key&gt;`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return InstanceId
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return The ID of the user&#39;s primary account.
     * 
     */
    public String masterUid() {
        return this.masterUid;
    }
    /**
     * @return Static password.
     * 
     */
    public String password() {
        return this.password;
    }
    /**
     * @return Static username.
     * 
     */
    public String userName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStaticAccountsAccount defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accessKey;
        private String createTime;
        private String id;
        private String instanceId;
        private String masterUid;
        private String password;
        private String userName;
        public Builder() {}
        public Builder(GetStaticAccountsAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.createTime = defaults.createTime;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.masterUid = defaults.masterUid;
    	      this.password = defaults.password;
    	      this.userName = defaults.userName;
        }

        @CustomType.Setter
        public Builder accessKey(String accessKey) {
            this.accessKey = Objects.requireNonNull(accessKey);
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        @CustomType.Setter
        public Builder masterUid(String masterUid) {
            this.masterUid = Objects.requireNonNull(masterUid);
            return this;
        }
        @CustomType.Setter
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        @CustomType.Setter
        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public GetStaticAccountsAccount build() {
            final var o = new GetStaticAccountsAccount();
            o.accessKey = accessKey;
            o.createTime = createTime;
            o.id = id;
            o.instanceId = instanceId;
            o.masterUid = masterUid;
            o.password = password;
            o.userName = userName;
            return o;
        }
    }
}
