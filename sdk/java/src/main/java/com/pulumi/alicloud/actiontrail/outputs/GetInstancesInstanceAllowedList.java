// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.actiontrail.outputs;

import com.pulumi.alicloud.actiontrail.outputs.GetInstancesInstanceAllowedListInternetList;
import com.pulumi.alicloud.actiontrail.outputs.GetInstancesInstanceAllowedListVpcList;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetInstancesInstanceAllowedList {
    /**
     * @return The deployed type of the instance.
     * 
     */
    private String deployType;
    /**
     * @return The internet list of the instance.
     * 
     */
    private List<GetInstancesInstanceAllowedListInternetList> internetLists;
    /**
     * @return The vpc list of the instance.
     * 
     */
    private List<GetInstancesInstanceAllowedListVpcList> vpcLists;

    private GetInstancesInstanceAllowedList() {}
    /**
     * @return The deployed type of the instance.
     * 
     */
    public String deployType() {
        return this.deployType;
    }
    /**
     * @return The internet list of the instance.
     * 
     */
    public List<GetInstancesInstanceAllowedListInternetList> internetLists() {
        return this.internetLists;
    }
    /**
     * @return The vpc list of the instance.
     * 
     */
    public List<GetInstancesInstanceAllowedListVpcList> vpcLists() {
        return this.vpcLists;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancesInstanceAllowedList defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String deployType;
        private List<GetInstancesInstanceAllowedListInternetList> internetLists;
        private List<GetInstancesInstanceAllowedListVpcList> vpcLists;
        public Builder() {}
        public Builder(GetInstancesInstanceAllowedList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deployType = defaults.deployType;
    	      this.internetLists = defaults.internetLists;
    	      this.vpcLists = defaults.vpcLists;
        }

        @CustomType.Setter
        public Builder deployType(String deployType) {
            this.deployType = Objects.requireNonNull(deployType);
            return this;
        }
        @CustomType.Setter
        public Builder internetLists(List<GetInstancesInstanceAllowedListInternetList> internetLists) {
            this.internetLists = Objects.requireNonNull(internetLists);
            return this;
        }
        public Builder internetLists(GetInstancesInstanceAllowedListInternetList... internetLists) {
            return internetLists(List.of(internetLists));
        }
        @CustomType.Setter
        public Builder vpcLists(List<GetInstancesInstanceAllowedListVpcList> vpcLists) {
            this.vpcLists = Objects.requireNonNull(vpcLists);
            return this;
        }
        public Builder vpcLists(GetInstancesInstanceAllowedListVpcList... vpcLists) {
            return vpcLists(List.of(vpcLists));
        }
        public GetInstancesInstanceAllowedList build() {
            final var o = new GetInstancesInstanceAllowedList();
            o.deployType = deployType;
            o.internetLists = internetLists;
            o.vpcLists = vpcLists;
            return o;
        }
    }
}
