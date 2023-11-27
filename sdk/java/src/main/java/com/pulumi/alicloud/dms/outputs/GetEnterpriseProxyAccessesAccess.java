// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEnterpriseProxyAccessesAccess {
    /**
     * @return The authorized account of the security agent.
     * 
     */
    private String accessId;
    private String accessSecret;
    /**
     * @return The authorization time of the security access agent permission.
     * 
     */
    private String createTime;
    /**
     * @return Security Protection authorization ID.
     * 
     */
    private String id;
    /**
     * @return Database account.
     * 
     */
    private String indepAccount;
    /**
     * @return The ID of the instance.
     * 
     */
    private String instanceId;
    /**
     * @return The source information of the security access agent permission is enabled, and the return value is as follows:**Owner Authorization**: The UID of the owner in parentheses.**Work Order Authorization**: The ticket number in parentheses is the number of the user to apply for permission.
     * 
     */
    private String originInfo;
    /**
     * @return Security Protection authorization ID. After the target user is authorized by the security protection agent, the system automatically generates a security protection authorization ID, which is globally unique.
     * 
     */
    private String proxyAccessId;
    /**
     * @return The ID of the security agent.
     * 
     */
    private String proxyId;
    /**
     * @return The user ID.
     * 
     */
    private String userId;
    /**
     * @return User nickname.
     * 
     */
    private String userName;
    /**
     * @return User UID.
     * 
     */
    private String userUid;

    private GetEnterpriseProxyAccessesAccess() {}
    /**
     * @return The authorized account of the security agent.
     * 
     */
    public String accessId() {
        return this.accessId;
    }
    public String accessSecret() {
        return this.accessSecret;
    }
    /**
     * @return The authorization time of the security access agent permission.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Security Protection authorization ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Database account.
     * 
     */
    public String indepAccount() {
        return this.indepAccount;
    }
    /**
     * @return The ID of the instance.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return The source information of the security access agent permission is enabled, and the return value is as follows:**Owner Authorization**: The UID of the owner in parentheses.**Work Order Authorization**: The ticket number in parentheses is the number of the user to apply for permission.
     * 
     */
    public String originInfo() {
        return this.originInfo;
    }
    /**
     * @return Security Protection authorization ID. After the target user is authorized by the security protection agent, the system automatically generates a security protection authorization ID, which is globally unique.
     * 
     */
    public String proxyAccessId() {
        return this.proxyAccessId;
    }
    /**
     * @return The ID of the security agent.
     * 
     */
    public String proxyId() {
        return this.proxyId;
    }
    /**
     * @return The user ID.
     * 
     */
    public String userId() {
        return this.userId;
    }
    /**
     * @return User nickname.
     * 
     */
    public String userName() {
        return this.userName;
    }
    /**
     * @return User UID.
     * 
     */
    public String userUid() {
        return this.userUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnterpriseProxyAccessesAccess defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accessId;
        private String accessSecret;
        private String createTime;
        private String id;
        private String indepAccount;
        private String instanceId;
        private String originInfo;
        private String proxyAccessId;
        private String proxyId;
        private String userId;
        private String userName;
        private String userUid;
        public Builder() {}
        public Builder(GetEnterpriseProxyAccessesAccess defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessId = defaults.accessId;
    	      this.accessSecret = defaults.accessSecret;
    	      this.createTime = defaults.createTime;
    	      this.id = defaults.id;
    	      this.indepAccount = defaults.indepAccount;
    	      this.instanceId = defaults.instanceId;
    	      this.originInfo = defaults.originInfo;
    	      this.proxyAccessId = defaults.proxyAccessId;
    	      this.proxyId = defaults.proxyId;
    	      this.userId = defaults.userId;
    	      this.userName = defaults.userName;
    	      this.userUid = defaults.userUid;
        }

        @CustomType.Setter
        public Builder accessId(String accessId) {
            this.accessId = Objects.requireNonNull(accessId);
            return this;
        }
        @CustomType.Setter
        public Builder accessSecret(String accessSecret) {
            this.accessSecret = Objects.requireNonNull(accessSecret);
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
        public Builder indepAccount(String indepAccount) {
            this.indepAccount = Objects.requireNonNull(indepAccount);
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        @CustomType.Setter
        public Builder originInfo(String originInfo) {
            this.originInfo = Objects.requireNonNull(originInfo);
            return this;
        }
        @CustomType.Setter
        public Builder proxyAccessId(String proxyAccessId) {
            this.proxyAccessId = Objects.requireNonNull(proxyAccessId);
            return this;
        }
        @CustomType.Setter
        public Builder proxyId(String proxyId) {
            this.proxyId = Objects.requireNonNull(proxyId);
            return this;
        }
        @CustomType.Setter
        public Builder userId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }
        @CustomType.Setter
        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        @CustomType.Setter
        public Builder userUid(String userUid) {
            this.userUid = Objects.requireNonNull(userUid);
            return this;
        }
        public GetEnterpriseProxyAccessesAccess build() {
            final var _resultValue = new GetEnterpriseProxyAccessesAccess();
            _resultValue.accessId = accessId;
            _resultValue.accessSecret = accessSecret;
            _resultValue.createTime = createTime;
            _resultValue.id = id;
            _resultValue.indepAccount = indepAccount;
            _resultValue.instanceId = instanceId;
            _resultValue.originInfo = originInfo;
            _resultValue.proxyAccessId = proxyAccessId;
            _resultValue.proxyId = proxyId;
            _resultValue.userId = userId;
            _resultValue.userName = userName;
            _resultValue.userUid = userUid;
            return _resultValue;
        }
    }
}
