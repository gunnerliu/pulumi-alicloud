// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.alicloud.vpc.outputs.GetSwitchesVswitch;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSwitchesResult {
    /**
     * @return CIDR block of the VSwitch.
     * 
     */
    private @Nullable String cidrBlock;
    private @Nullable Boolean dryRun;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of VSwitch IDs.
     * 
     */
    private List<String> ids;
    /**
     * @return Whether the VSwitch is the default one in the region.
     * 
     */
    private @Nullable Boolean isDefault;
    private @Nullable String nameRegex;
    /**
     * @return A list of VSwitch names.
     * 
     */
    private List<String> names;
    private @Nullable String outputFile;
    /**
     * @return The resource group ID of the VSwitch.
     * 
     */
    private @Nullable String resourceGroupId;
    /**
     * @return The route table ID of the VSwitch.
     * 
     */
    private @Nullable String routeTableId;
    /**
     * @return The status of the VSwitch.
     * 
     */
    private @Nullable String status;
    /**
     * @return The Tags of the VSwitch.
     * 
     */
    private @Nullable Map<String,Object> tags;
    /**
     * @return ID of the VPC that owns the VSwitch.
     * 
     */
    private @Nullable String vpcId;
    /**
     * @return Name of the VSwitch.
     * 
     */
    private @Nullable String vswitchName;
    private @Nullable Integer vswitchOwnerId;
    /**
     * @return A list of VSwitches. Each element contains the following attributes:
     * 
     */
    private List<GetSwitchesVswitch> vswitches;
    /**
     * @return ID of the availability zone where the VSwitch is located.
     * 
     */
    private @Nullable String zoneId;

    private GetSwitchesResult() {}
    /**
     * @return CIDR block of the VSwitch.
     * 
     */
    public Optional<String> cidrBlock() {
        return Optional.ofNullable(this.cidrBlock);
    }
    public Optional<Boolean> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of VSwitch IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    /**
     * @return Whether the VSwitch is the default one in the region.
     * 
     */
    public Optional<Boolean> isDefault() {
        return Optional.ofNullable(this.isDefault);
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of VSwitch names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return The resource group ID of the VSwitch.
     * 
     */
    public Optional<String> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }
    /**
     * @return The route table ID of the VSwitch.
     * 
     */
    public Optional<String> routeTableId() {
        return Optional.ofNullable(this.routeTableId);
    }
    /**
     * @return The status of the VSwitch.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return The Tags of the VSwitch.
     * 
     */
    public Map<String,Object> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return ID of the VPC that owns the VSwitch.
     * 
     */
    public Optional<String> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }
    /**
     * @return Name of the VSwitch.
     * 
     */
    public Optional<String> vswitchName() {
        return Optional.ofNullable(this.vswitchName);
    }
    public Optional<Integer> vswitchOwnerId() {
        return Optional.ofNullable(this.vswitchOwnerId);
    }
    /**
     * @return A list of VSwitches. Each element contains the following attributes:
     * 
     */
    public List<GetSwitchesVswitch> vswitches() {
        return this.vswitches;
    }
    /**
     * @return ID of the availability zone where the VSwitch is located.
     * 
     */
    public Optional<String> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String cidrBlock;
        private @Nullable Boolean dryRun;
        private String id;
        private List<String> ids;
        private @Nullable Boolean isDefault;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable String resourceGroupId;
        private @Nullable String routeTableId;
        private @Nullable String status;
        private @Nullable Map<String,Object> tags;
        private @Nullable String vpcId;
        private @Nullable String vswitchName;
        private @Nullable Integer vswitchOwnerId;
        private List<GetSwitchesVswitch> vswitches;
        private @Nullable String zoneId;
        public Builder() {}
        public Builder(GetSwitchesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.dryRun = defaults.dryRun;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.isDefault = defaults.isDefault;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.routeTableId = defaults.routeTableId;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
    	      this.vswitchName = defaults.vswitchName;
    	      this.vswitchOwnerId = defaults.vswitchOwnerId;
    	      this.vswitches = defaults.vswitches;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder cidrBlock(@Nullable String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        @CustomType.Setter
        public Builder dryRun(@Nullable Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder isDefault(@Nullable Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        @CustomType.Setter
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupId(@Nullable String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder routeTableId(@Nullable String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,Object> tags) {
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        @CustomType.Setter
        public Builder vswitchName(@Nullable String vswitchName) {
            this.vswitchName = vswitchName;
            return this;
        }
        @CustomType.Setter
        public Builder vswitchOwnerId(@Nullable Integer vswitchOwnerId) {
            this.vswitchOwnerId = vswitchOwnerId;
            return this;
        }
        @CustomType.Setter
        public Builder vswitches(List<GetSwitchesVswitch> vswitches) {
            this.vswitches = Objects.requireNonNull(vswitches);
            return this;
        }
        public Builder vswitches(GetSwitchesVswitch... vswitches) {
            return vswitches(List.of(vswitches));
        }
        @CustomType.Setter
        public Builder zoneId(@Nullable String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public GetSwitchesResult build() {
            final var o = new GetSwitchesResult();
            o.cidrBlock = cidrBlock;
            o.dryRun = dryRun;
            o.id = id;
            o.ids = ids;
            o.isDefault = isDefault;
            o.nameRegex = nameRegex;
            o.names = names;
            o.outputFile = outputFile;
            o.resourceGroupId = resourceGroupId;
            o.routeTableId = routeTableId;
            o.status = status;
            o.tags = tags;
            o.vpcId = vpcId;
            o.vswitchName = vswitchName;
            o.vswitchOwnerId = vswitchOwnerId;
            o.vswitches = vswitches;
            o.zoneId = zoneId;
            return o;
        }
    }
}