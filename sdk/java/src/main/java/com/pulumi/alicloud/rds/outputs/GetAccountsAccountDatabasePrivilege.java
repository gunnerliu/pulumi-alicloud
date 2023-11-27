// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rds.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAccountsAccountDatabasePrivilege {
    /**
     * @return The type of permission for the account.
     * 
     */
    private String accountPrivilege;
    /**
     * @return The specific permissions corresponding to the type of account permissions.
     * 
     */
    private String accountPrivilegeDetail;
    /**
     * @return Database name.
     * 
     */
    private String dbName;

    private GetAccountsAccountDatabasePrivilege() {}
    /**
     * @return The type of permission for the account.
     * 
     */
    public String accountPrivilege() {
        return this.accountPrivilege;
    }
    /**
     * @return The specific permissions corresponding to the type of account permissions.
     * 
     */
    public String accountPrivilegeDetail() {
        return this.accountPrivilegeDetail;
    }
    /**
     * @return Database name.
     * 
     */
    public String dbName() {
        return this.dbName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountsAccountDatabasePrivilege defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountPrivilege;
        private String accountPrivilegeDetail;
        private String dbName;
        public Builder() {}
        public Builder(GetAccountsAccountDatabasePrivilege defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountPrivilege = defaults.accountPrivilege;
    	      this.accountPrivilegeDetail = defaults.accountPrivilegeDetail;
    	      this.dbName = defaults.dbName;
        }

        @CustomType.Setter
        public Builder accountPrivilege(String accountPrivilege) {
            this.accountPrivilege = Objects.requireNonNull(accountPrivilege);
            return this;
        }
        @CustomType.Setter
        public Builder accountPrivilegeDetail(String accountPrivilegeDetail) {
            this.accountPrivilegeDetail = Objects.requireNonNull(accountPrivilegeDetail);
            return this;
        }
        @CustomType.Setter
        public Builder dbName(String dbName) {
            this.dbName = Objects.requireNonNull(dbName);
            return this;
        }
        public GetAccountsAccountDatabasePrivilege build() {
            final var _resultValue = new GetAccountsAccountDatabasePrivilege();
            _resultValue.accountPrivilege = accountPrivilege;
            _resultValue.accountPrivilegeDetail = accountPrivilegeDetail;
            _resultValue.dbName = dbName;
            return _resultValue;
        }
    }
}
