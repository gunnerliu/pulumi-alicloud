// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.graphdatabase.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDbInstancesInstanceDbInstanceIpArray {
    /**
     * @return The default is empty. To distinguish between the different property console does not display a `hidden` label grouping.
     * 
     */
    private final @Nullable String dbInstanceIpArrayAttribute;
    /**
     * @return IP ADDRESS whitelist group name.
     * 
     */
    private final @Nullable String dbInstanceIpArrayName;
    /**
     * @return IP ADDRESS whitelist addresses in the IP ADDRESS list, and a maximum of 1000 comma-separated format is as follows: `0.0.0.0/0` and `10.23.12.24`(IP) or `10.23.12.24/24`(CIDR mode, CIDR (Classless Inter-Domain Routing)/24 represents the address prefixes in the length of the range [1,32]).
     * 
     */
    private final @Nullable String securityIps;

    @CustomType.Constructor
    private GetDbInstancesInstanceDbInstanceIpArray(
        @CustomType.Parameter("dbInstanceIpArrayAttribute") @Nullable String dbInstanceIpArrayAttribute,
        @CustomType.Parameter("dbInstanceIpArrayName") @Nullable String dbInstanceIpArrayName,
        @CustomType.Parameter("securityIps") @Nullable String securityIps) {
        this.dbInstanceIpArrayAttribute = dbInstanceIpArrayAttribute;
        this.dbInstanceIpArrayName = dbInstanceIpArrayName;
        this.securityIps = securityIps;
    }

    /**
     * @return The default is empty. To distinguish between the different property console does not display a `hidden` label grouping.
     * 
     */
    public Optional<String> dbInstanceIpArrayAttribute() {
        return Optional.ofNullable(this.dbInstanceIpArrayAttribute);
    }
    /**
     * @return IP ADDRESS whitelist group name.
     * 
     */
    public Optional<String> dbInstanceIpArrayName() {
        return Optional.ofNullable(this.dbInstanceIpArrayName);
    }
    /**
     * @return IP ADDRESS whitelist addresses in the IP ADDRESS list, and a maximum of 1000 comma-separated format is as follows: `0.0.0.0/0` and `10.23.12.24`(IP) or `10.23.12.24/24`(CIDR mode, CIDR (Classless Inter-Domain Routing)/24 represents the address prefixes in the length of the range [1,32]).
     * 
     */
    public Optional<String> securityIps() {
        return Optional.ofNullable(this.securityIps);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDbInstancesInstanceDbInstanceIpArray defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dbInstanceIpArrayAttribute;
        private @Nullable String dbInstanceIpArrayName;
        private @Nullable String securityIps;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDbInstancesInstanceDbInstanceIpArray defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbInstanceIpArrayAttribute = defaults.dbInstanceIpArrayAttribute;
    	      this.dbInstanceIpArrayName = defaults.dbInstanceIpArrayName;
    	      this.securityIps = defaults.securityIps;
        }

        public Builder dbInstanceIpArrayAttribute(@Nullable String dbInstanceIpArrayAttribute) {
            this.dbInstanceIpArrayAttribute = dbInstanceIpArrayAttribute;
            return this;
        }
        public Builder dbInstanceIpArrayName(@Nullable String dbInstanceIpArrayName) {
            this.dbInstanceIpArrayName = dbInstanceIpArrayName;
            return this;
        }
        public Builder securityIps(@Nullable String securityIps) {
            this.securityIps = securityIps;
            return this;
        }        public GetDbInstancesInstanceDbInstanceIpArray build() {
            return new GetDbInstancesInstanceDbInstanceIpArray(dbInstanceIpArrayAttribute, dbInstanceIpArrayName, securityIps);
        }
    }
}
