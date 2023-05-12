// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudfirewall.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirewallVpcFirewallCenLocalVpcVpcCidrTableListRouteEntryList {
    /**
     * @return The target network segment of the VPC.
     * 
     */
    private final @Nullable String destinationCidr;
    /**
     * @return The ID of the next hop instance in the VPC.
     * 
     */
    private final @Nullable String nextHopInstanceId;

    @CustomType.Constructor
    private FirewallVpcFirewallCenLocalVpcVpcCidrTableListRouteEntryList(
        @CustomType.Parameter("destinationCidr") @Nullable String destinationCidr,
        @CustomType.Parameter("nextHopInstanceId") @Nullable String nextHopInstanceId) {
        this.destinationCidr = destinationCidr;
        this.nextHopInstanceId = nextHopInstanceId;
    }

    /**
     * @return The target network segment of the VPC.
     * 
     */
    public Optional<String> destinationCidr() {
        return Optional.ofNullable(this.destinationCidr);
    }
    /**
     * @return The ID of the next hop instance in the VPC.
     * 
     */
    public Optional<String> nextHopInstanceId() {
        return Optional.ofNullable(this.nextHopInstanceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallVpcFirewallCenLocalVpcVpcCidrTableListRouteEntryList defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String destinationCidr;
        private @Nullable String nextHopInstanceId;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallVpcFirewallCenLocalVpcVpcCidrTableListRouteEntryList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationCidr = defaults.destinationCidr;
    	      this.nextHopInstanceId = defaults.nextHopInstanceId;
        }

        public Builder destinationCidr(@Nullable String destinationCidr) {
            this.destinationCidr = destinationCidr;
            return this;
        }
        public Builder nextHopInstanceId(@Nullable String nextHopInstanceId) {
            this.nextHopInstanceId = nextHopInstanceId;
            return this;
        }        public FirewallVpcFirewallCenLocalVpcVpcCidrTableListRouteEntryList build() {
            return new FirewallVpcFirewallCenLocalVpcVpcCidrTableListRouteEntryList(destinationCidr, nextHopInstanceId);
        }
    }
}
