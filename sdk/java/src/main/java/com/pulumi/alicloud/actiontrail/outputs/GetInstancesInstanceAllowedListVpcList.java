// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.actiontrail.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetInstancesInstanceAllowedListVpcList {
    /**
     * @return The allowed ip list of the internet_list.
     * 
     */
    private final List<String> allowedIpLists;
    /**
     * @return The port range of the internet_list.
     * 
     */
    private final String portRange;

    @CustomType.Constructor
    private GetInstancesInstanceAllowedListVpcList(
        @CustomType.Parameter("allowedIpLists") List<String> allowedIpLists,
        @CustomType.Parameter("portRange") String portRange) {
        this.allowedIpLists = allowedIpLists;
        this.portRange = portRange;
    }

    /**
     * @return The allowed ip list of the internet_list.
     * 
     */
    public List<String> allowedIpLists() {
        return this.allowedIpLists;
    }
    /**
     * @return The port range of the internet_list.
     * 
     */
    public String portRange() {
        return this.portRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancesInstanceAllowedListVpcList defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedIpLists;
        private String portRange;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstancesInstanceAllowedListVpcList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedIpLists = defaults.allowedIpLists;
    	      this.portRange = defaults.portRange;
        }

        public Builder allowedIpLists(List<String> allowedIpLists) {
            this.allowedIpLists = Objects.requireNonNull(allowedIpLists);
            return this;
        }
        public Builder allowedIpLists(String... allowedIpLists) {
            return allowedIpLists(List.of(allowedIpLists));
        }
        public Builder portRange(String portRange) {
            this.portRange = Objects.requireNonNull(portRange);
            return this;
        }        public GetInstancesInstanceAllowedListVpcList build() {
            return new GetInstancesInstanceAllowedListVpcList(allowedIpLists, portRange);
        }
    }
}
