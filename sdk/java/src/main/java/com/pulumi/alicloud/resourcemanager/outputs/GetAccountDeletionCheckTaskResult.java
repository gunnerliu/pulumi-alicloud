// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager.outputs;

import com.pulumi.alicloud.resourcemanager.outputs.GetAccountDeletionCheckTaskAbandonAbleCheck;
import com.pulumi.alicloud.resourcemanager.outputs.GetAccountDeletionCheckTaskNotAllowReason;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAccountDeletionCheckTaskResult {
    /**
     * @return The check items that you can choose to ignore for the member deletion. Each element contains the following attributes:
     * 
     */
    private final List<GetAccountDeletionCheckTaskAbandonAbleCheck> abandonAbleChecks;
    private final String accountId;
    /**
     * @return Indicates whether the member can be deleted.
     * 
     */
    private final Boolean allowDelete;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The reasons why the member cannot be deleted. Each element contains the following attributes:
     * 
     */
    private final List<GetAccountDeletionCheckTaskNotAllowReason> notAllowReasons;
    /**
     * @return The status of the check.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private GetAccountDeletionCheckTaskResult(
        @CustomType.Parameter("abandonAbleChecks") List<GetAccountDeletionCheckTaskAbandonAbleCheck> abandonAbleChecks,
        @CustomType.Parameter("accountId") String accountId,
        @CustomType.Parameter("allowDelete") Boolean allowDelete,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("notAllowReasons") List<GetAccountDeletionCheckTaskNotAllowReason> notAllowReasons,
        @CustomType.Parameter("status") String status) {
        this.abandonAbleChecks = abandonAbleChecks;
        this.accountId = accountId;
        this.allowDelete = allowDelete;
        this.id = id;
        this.notAllowReasons = notAllowReasons;
        this.status = status;
    }

    /**
     * @return The check items that you can choose to ignore for the member deletion. Each element contains the following attributes:
     * 
     */
    public List<GetAccountDeletionCheckTaskAbandonAbleCheck> abandonAbleChecks() {
        return this.abandonAbleChecks;
    }
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return Indicates whether the member can be deleted.
     * 
     */
    public Boolean allowDelete() {
        return this.allowDelete;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The reasons why the member cannot be deleted. Each element contains the following attributes:
     * 
     */
    public List<GetAccountDeletionCheckTaskNotAllowReason> notAllowReasons() {
        return this.notAllowReasons;
    }
    /**
     * @return The status of the check.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountDeletionCheckTaskResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetAccountDeletionCheckTaskAbandonAbleCheck> abandonAbleChecks;
        private String accountId;
        private Boolean allowDelete;
        private String id;
        private List<GetAccountDeletionCheckTaskNotAllowReason> notAllowReasons;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountDeletionCheckTaskResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abandonAbleChecks = defaults.abandonAbleChecks;
    	      this.accountId = defaults.accountId;
    	      this.allowDelete = defaults.allowDelete;
    	      this.id = defaults.id;
    	      this.notAllowReasons = defaults.notAllowReasons;
    	      this.status = defaults.status;
        }

        public Builder abandonAbleChecks(List<GetAccountDeletionCheckTaskAbandonAbleCheck> abandonAbleChecks) {
            this.abandonAbleChecks = Objects.requireNonNull(abandonAbleChecks);
            return this;
        }
        public Builder abandonAbleChecks(GetAccountDeletionCheckTaskAbandonAbleCheck... abandonAbleChecks) {
            return abandonAbleChecks(List.of(abandonAbleChecks));
        }
        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        public Builder allowDelete(Boolean allowDelete) {
            this.allowDelete = Objects.requireNonNull(allowDelete);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder notAllowReasons(List<GetAccountDeletionCheckTaskNotAllowReason> notAllowReasons) {
            this.notAllowReasons = Objects.requireNonNull(notAllowReasons);
            return this;
        }
        public Builder notAllowReasons(GetAccountDeletionCheckTaskNotAllowReason... notAllowReasons) {
            return notAllowReasons(List.of(notAllowReasons));
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public GetAccountDeletionCheckTaskResult build() {
            return new GetAccountDeletionCheckTaskResult(abandonAbleChecks, accountId, allowDelete, id, notAllowReasons, status);
        }
    }
}
