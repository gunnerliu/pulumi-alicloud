// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAccountsAccount {
    private final String accountId;
    /**
     * @return (Available in v1.125.0+) The Alibaba Cloud account name of the member account.
     * 
     */
    private final String accountName;
    private final String displayName;
    /**
     * @return The ID of the folder.
     * 
     */
    private final String folderId;
    /**
     * @return The ID of the resource.
     * * `account_id`- The ID of the account.
     * * `display_name`- The name of the member account.
     * 
     */
    private final String id;
    /**
     * @return The way in which the member account joined the resource directory.
     * 
     */
    private final String joinMethod;
    /**
     * @return The time when the member account joined the resource directory.
     * 
     */
    private final String joinTime;
    /**
     * @return The time when the member account was modified.
     * 
     */
    private final String modifyTime;
    /**
     * @return (Available in v1.124.3+) Settlement account ID. If the value is empty, the current account will be used for settlement.
     * 
     */
    private final String payerAccountId;
    /**
     * @return The ID of the resource directory.
     * 
     */
    private final String resourceDirectoryId;
    /**
     * @return The status of account, valid values: `CreateCancelled`, `CreateExpired`, `CreateFailed`, `CreateSuccess`, `CreateVerifying`, `InviteSuccess`, `PromoteCancelled`, `PromoteExpired`, `PromoteFailed`, `PromoteSuccess`, and `PromoteVerifying`.
     * 
     */
    private final String status;
    /**
     * @return The type of the member account.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetAccountsAccount(
        @CustomType.Parameter("accountId") String accountId,
        @CustomType.Parameter("accountName") String accountName,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("folderId") String folderId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("joinMethod") String joinMethod,
        @CustomType.Parameter("joinTime") String joinTime,
        @CustomType.Parameter("modifyTime") String modifyTime,
        @CustomType.Parameter("payerAccountId") String payerAccountId,
        @CustomType.Parameter("resourceDirectoryId") String resourceDirectoryId,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("type") String type) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.displayName = displayName;
        this.folderId = folderId;
        this.id = id;
        this.joinMethod = joinMethod;
        this.joinTime = joinTime;
        this.modifyTime = modifyTime;
        this.payerAccountId = payerAccountId;
        this.resourceDirectoryId = resourceDirectoryId;
        this.status = status;
        this.type = type;
    }

    public String accountId() {
        return this.accountId;
    }
    /**
     * @return (Available in v1.125.0+) The Alibaba Cloud account name of the member account.
     * 
     */
    public String accountName() {
        return this.accountName;
    }
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The ID of the folder.
     * 
     */
    public String folderId() {
        return this.folderId;
    }
    /**
     * @return The ID of the resource.
     * * `account_id`- The ID of the account.
     * * `display_name`- The name of the member account.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The way in which the member account joined the resource directory.
     * 
     */
    public String joinMethod() {
        return this.joinMethod;
    }
    /**
     * @return The time when the member account joined the resource directory.
     * 
     */
    public String joinTime() {
        return this.joinTime;
    }
    /**
     * @return The time when the member account was modified.
     * 
     */
    public String modifyTime() {
        return this.modifyTime;
    }
    /**
     * @return (Available in v1.124.3+) Settlement account ID. If the value is empty, the current account will be used for settlement.
     * 
     */
    public String payerAccountId() {
        return this.payerAccountId;
    }
    /**
     * @return The ID of the resource directory.
     * 
     */
    public String resourceDirectoryId() {
        return this.resourceDirectoryId;
    }
    /**
     * @return The status of account, valid values: `CreateCancelled`, `CreateExpired`, `CreateFailed`, `CreateSuccess`, `CreateVerifying`, `InviteSuccess`, `PromoteCancelled`, `PromoteExpired`, `PromoteFailed`, `PromoteSuccess`, and `PromoteVerifying`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The type of the member account.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountsAccount defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountId;
        private String accountName;
        private String displayName;
        private String folderId;
        private String id;
        private String joinMethod;
        private String joinTime;
        private String modifyTime;
        private String payerAccountId;
        private String resourceDirectoryId;
        private String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountsAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.accountName = defaults.accountName;
    	      this.displayName = defaults.displayName;
    	      this.folderId = defaults.folderId;
    	      this.id = defaults.id;
    	      this.joinMethod = defaults.joinMethod;
    	      this.joinTime = defaults.joinTime;
    	      this.modifyTime = defaults.modifyTime;
    	      this.payerAccountId = defaults.payerAccountId;
    	      this.resourceDirectoryId = defaults.resourceDirectoryId;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder folderId(String folderId) {
            this.folderId = Objects.requireNonNull(folderId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder joinMethod(String joinMethod) {
            this.joinMethod = Objects.requireNonNull(joinMethod);
            return this;
        }
        public Builder joinTime(String joinTime) {
            this.joinTime = Objects.requireNonNull(joinTime);
            return this;
        }
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = Objects.requireNonNull(modifyTime);
            return this;
        }
        public Builder payerAccountId(String payerAccountId) {
            this.payerAccountId = Objects.requireNonNull(payerAccountId);
            return this;
        }
        public Builder resourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = Objects.requireNonNull(resourceDirectoryId);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetAccountsAccount build() {
            return new GetAccountsAccount(accountId, accountName, displayName, folderId, id, joinMethod, joinTime, modifyTime, payerAccountId, resourceDirectoryId, status, type);
        }
    }
}
