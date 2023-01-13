// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetHandshakesHandshake {
    /**
     * @return The time when the invitation expires.
     * 
     */
    private String expireTime;
    private String handshakeId;
    /**
     * @return The ID of the resource.
     * * `handshake_id`- The ID of the invitation.
     * 
     */
    private String id;
    /**
     * @return (Available in v1.114.0+) The real name of the invited account.
     * 
     */
    private String invitedAccountRealName;
    /**
     * @return The ID of the master account of the resource directory.
     * 
     */
    private String masterAccountId;
    /**
     * @return The name of the master account of the resource directory.
     * 
     */
    private String masterAccountName;
    /**
     * @return (Available in v1.114.0+) The real name of the master account of the resource directory.
     * 
     */
    private String masterAccountRealName;
    /**
     * @return The time when the invitation was modified.
     * 
     */
    private String modifyTime;
    /**
     * @return The invitation note.
     * 
     */
    private String note;
    /**
     * @return The ID of the resource directory.
     * 
     */
    private String resourceDirectoryId;
    /**
     * @return The status of handshake, valid values: `Accepted`, `Cancelled`, `Declined`, `Deleted`, `Expired` and `Pending`.
     * 
     */
    private String status;
    /**
     * @return The ID or logon email address of the invited account.
     * 
     */
    private String targetEntity;
    /**
     * @return The type of the invited account.
     * 
     */
    private String targetType;

    private GetHandshakesHandshake() {}
    /**
     * @return The time when the invitation expires.
     * 
     */
    public String expireTime() {
        return this.expireTime;
    }
    public String handshakeId() {
        return this.handshakeId;
    }
    /**
     * @return The ID of the resource.
     * * `handshake_id`- The ID of the invitation.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Available in v1.114.0+) The real name of the invited account.
     * 
     */
    public String invitedAccountRealName() {
        return this.invitedAccountRealName;
    }
    /**
     * @return The ID of the master account of the resource directory.
     * 
     */
    public String masterAccountId() {
        return this.masterAccountId;
    }
    /**
     * @return The name of the master account of the resource directory.
     * 
     */
    public String masterAccountName() {
        return this.masterAccountName;
    }
    /**
     * @return (Available in v1.114.0+) The real name of the master account of the resource directory.
     * 
     */
    public String masterAccountRealName() {
        return this.masterAccountRealName;
    }
    /**
     * @return The time when the invitation was modified.
     * 
     */
    public String modifyTime() {
        return this.modifyTime;
    }
    /**
     * @return The invitation note.
     * 
     */
    public String note() {
        return this.note;
    }
    /**
     * @return The ID of the resource directory.
     * 
     */
    public String resourceDirectoryId() {
        return this.resourceDirectoryId;
    }
    /**
     * @return The status of handshake, valid values: `Accepted`, `Cancelled`, `Declined`, `Deleted`, `Expired` and `Pending`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The ID or logon email address of the invited account.
     * 
     */
    public String targetEntity() {
        return this.targetEntity;
    }
    /**
     * @return The type of the invited account.
     * 
     */
    public String targetType() {
        return this.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHandshakesHandshake defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String expireTime;
        private String handshakeId;
        private String id;
        private String invitedAccountRealName;
        private String masterAccountId;
        private String masterAccountName;
        private String masterAccountRealName;
        private String modifyTime;
        private String note;
        private String resourceDirectoryId;
        private String status;
        private String targetEntity;
        private String targetType;
        public Builder() {}
        public Builder(GetHandshakesHandshake defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expireTime = defaults.expireTime;
    	      this.handshakeId = defaults.handshakeId;
    	      this.id = defaults.id;
    	      this.invitedAccountRealName = defaults.invitedAccountRealName;
    	      this.masterAccountId = defaults.masterAccountId;
    	      this.masterAccountName = defaults.masterAccountName;
    	      this.masterAccountRealName = defaults.masterAccountRealName;
    	      this.modifyTime = defaults.modifyTime;
    	      this.note = defaults.note;
    	      this.resourceDirectoryId = defaults.resourceDirectoryId;
    	      this.status = defaults.status;
    	      this.targetEntity = defaults.targetEntity;
    	      this.targetType = defaults.targetType;
        }

        @CustomType.Setter
        public Builder expireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }
        @CustomType.Setter
        public Builder handshakeId(String handshakeId) {
            this.handshakeId = Objects.requireNonNull(handshakeId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder invitedAccountRealName(String invitedAccountRealName) {
            this.invitedAccountRealName = Objects.requireNonNull(invitedAccountRealName);
            return this;
        }
        @CustomType.Setter
        public Builder masterAccountId(String masterAccountId) {
            this.masterAccountId = Objects.requireNonNull(masterAccountId);
            return this;
        }
        @CustomType.Setter
        public Builder masterAccountName(String masterAccountName) {
            this.masterAccountName = Objects.requireNonNull(masterAccountName);
            return this;
        }
        @CustomType.Setter
        public Builder masterAccountRealName(String masterAccountRealName) {
            this.masterAccountRealName = Objects.requireNonNull(masterAccountRealName);
            return this;
        }
        @CustomType.Setter
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = Objects.requireNonNull(modifyTime);
            return this;
        }
        @CustomType.Setter
        public Builder note(String note) {
            this.note = Objects.requireNonNull(note);
            return this;
        }
        @CustomType.Setter
        public Builder resourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = Objects.requireNonNull(resourceDirectoryId);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder targetEntity(String targetEntity) {
            this.targetEntity = Objects.requireNonNull(targetEntity);
            return this;
        }
        @CustomType.Setter
        public Builder targetType(String targetType) {
            this.targetType = Objects.requireNonNull(targetType);
            return this;
        }
        public GetHandshakesHandshake build() {
            final var o = new GetHandshakesHandshake();
            o.expireTime = expireTime;
            o.handshakeId = handshakeId;
            o.id = id;
            o.invitedAccountRealName = invitedAccountRealName;
            o.masterAccountId = masterAccountId;
            o.masterAccountName = masterAccountName;
            o.masterAccountRealName = masterAccountRealName;
            o.modifyTime = modifyTime;
            o.note = note;
            o.resourceDirectoryId = resourceDirectoryId;
            o.status = status;
            o.targetEntity = targetEntity;
            o.targetType = targetType;
            return o;
        }
    }
}
