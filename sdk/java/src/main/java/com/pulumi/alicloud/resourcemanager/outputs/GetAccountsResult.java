// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager.outputs;

import com.pulumi.alicloud.resourcemanager.outputs.GetAccountsAccount;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAccountsResult {
    /**
     * @return A list of accounts. Each element contains the following attributes:
     * 
     */
    private final List<GetAccountsAccount> accounts;
    private final @Nullable Boolean enableDetails;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A list of account IDs.
     * 
     */
    private final List<String> ids;
    private final @Nullable String outputFile;
    /**
     * @return The status of the member account.
     * 
     */
    private final @Nullable String status;

    @CustomType.Constructor
    private GetAccountsResult(
        @CustomType.Parameter("accounts") List<GetAccountsAccount> accounts,
        @CustomType.Parameter("enableDetails") @Nullable Boolean enableDetails,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("status") @Nullable String status) {
        this.accounts = accounts;
        this.enableDetails = enableDetails;
        this.id = id;
        this.ids = ids;
        this.outputFile = outputFile;
        this.status = status;
    }

    /**
     * @return A list of accounts. Each element contains the following attributes:
     * 
     */
    public List<GetAccountsAccount> accounts() {
        return this.accounts;
    }
    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of account IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return The status of the member account.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetAccountsAccount> accounts;
        private @Nullable Boolean enableDetails;
        private String id;
        private List<String> ids;
        private @Nullable String outputFile;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accounts = defaults.accounts;
    	      this.enableDetails = defaults.enableDetails;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.outputFile = defaults.outputFile;
    	      this.status = defaults.status;
        }

        public Builder accounts(List<GetAccountsAccount> accounts) {
            this.accounts = Objects.requireNonNull(accounts);
            return this;
        }
        public Builder accounts(GetAccountsAccount... accounts) {
            return accounts(List.of(accounts));
        }
        public Builder enableDetails(@Nullable Boolean enableDetails) {
            this.enableDetails = enableDetails;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public GetAccountsResult build() {
            return new GetAccountsResult(accounts, enableDetails, id, ids, outputFile, status);
        }
    }
}
