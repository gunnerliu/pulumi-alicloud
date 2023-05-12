// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cddc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDedicatedHostAccountsAccount {
    /**
     * @return The name of the Dedicated host account.
     * 
     */
    private final String accountName;
    /**
     * @return The ID of the Dedicated host.
     * 
     */
    private final String dedicatedHostId;
    /**
     * @return The ID of the Dedicated Host Account. The value formats as `&lt;dedicated_host_id&gt;:&lt;account_name&gt;`.
     * 
     */
    private final String id;

    @CustomType.Constructor
    private GetDedicatedHostAccountsAccount(
        @CustomType.Parameter("accountName") String accountName,
        @CustomType.Parameter("dedicatedHostId") String dedicatedHostId,
        @CustomType.Parameter("id") String id) {
        this.accountName = accountName;
        this.dedicatedHostId = dedicatedHostId;
        this.id = id;
    }

    /**
     * @return The name of the Dedicated host account.
     * 
     */
    public String accountName() {
        return this.accountName;
    }
    /**
     * @return The ID of the Dedicated host.
     * 
     */
    public String dedicatedHostId() {
        return this.dedicatedHostId;
    }
    /**
     * @return The ID of the Dedicated Host Account. The value formats as `&lt;dedicated_host_id&gt;:&lt;account_name&gt;`.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDedicatedHostAccountsAccount defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String dedicatedHostId;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDedicatedHostAccountsAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.dedicatedHostId = defaults.dedicatedHostId;
    	      this.id = defaults.id;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder dedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = Objects.requireNonNull(dedicatedHostId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public GetDedicatedHostAccountsAccount build() {
            return new GetDedicatedHostAccountsAccount(accountName, dedicatedHostId, id);
        }
    }
}
