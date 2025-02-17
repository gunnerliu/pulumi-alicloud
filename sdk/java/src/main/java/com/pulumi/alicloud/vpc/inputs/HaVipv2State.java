// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HaVipv2State extends com.pulumi.resources.ResourceArgs {

    public static final HaVipv2State Empty = new HaVipv2State();

    /**
     * EIP bound to HaVip.
     * 
     */
    @Import(name="associatedEipAddresses")
    private @Nullable Output<List<String>> associatedEipAddresses;

    /**
     * @return EIP bound to HaVip.
     * 
     */
    public Optional<Output<List<String>>> associatedEipAddresses() {
        return Optional.ofNullable(this.associatedEipAddresses);
    }

    /**
     * The type of the instance that is bound to the HaVip. Value:-**EcsInstance**: ECS instance.-**NetworkInterface**: ENI instance.
     * 
     */
    @Import(name="associatedInstanceType")
    private @Nullable Output<String> associatedInstanceType;

    /**
     * @return The type of the instance that is bound to the HaVip. Value:-**EcsInstance**: ECS instance.-**NetworkInterface**: ENI instance.
     * 
     */
    public Optional<Output<String>> associatedInstanceType() {
        return Optional.ofNullable(this.associatedInstanceType);
    }

    /**
     * An ECS instance that is bound to HaVip.
     * 
     */
    @Import(name="associatedInstances")
    private @Nullable Output<List<String>> associatedInstances;

    /**
     * @return An ECS instance that is bound to HaVip.
     * 
     */
    public Optional<Output<List<String>>> associatedInstances() {
        return Optional.ofNullable(this.associatedInstances);
    }

    /**
     * The creation time of the resource.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The creation time of the resource.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * The description of the HaVip instance. The length is 2 to 256 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the HaVip instance. The length is 2 to 256 characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The ID of the resource.
     * 
     */
    @Import(name="haVipId")
    private @Nullable Output<String> haVipId;

    /**
     * @return The ID of the resource.
     * 
     */
    public Optional<Output<String>> haVipId() {
        return Optional.ofNullable(this.haVipId);
    }

    /**
     * The name of the HaVip instance.
     * 
     */
    @Import(name="haVipName")
    private @Nullable Output<String> haVipName;

    /**
     * @return The name of the HaVip instance.
     * 
     */
    public Optional<Output<String>> haVipName() {
        return Optional.ofNullable(this.haVipName);
    }

    /**
     * Field &#39;havip_name&#39; has been deprecated from provider version 1.205.0. New field &#39;ha_vip_name&#39; instead.
     * 
     * @deprecated
     * Field &#39;havip_name&#39; has been deprecated from provider version 1.205.0. New field &#39;ha_vip_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead. */
    @Import(name="havipName")
    private @Nullable Output<String> havipName;

    /**
     * @return Field &#39;havip_name&#39; has been deprecated from provider version 1.205.0. New field &#39;ha_vip_name&#39; instead.
     * 
     * @deprecated
     * Field &#39;havip_name&#39; has been deprecated from provider version 1.205.0. New field &#39;ha_vip_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead. */
    public Optional<Output<String>> havipName() {
        return Optional.ofNullable(this.havipName);
    }

    /**
     * The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    /**
     * @return The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
     * 
     */
    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * The primary instance ID bound to HaVip.
     * 
     */
    @Import(name="masterInstanceId")
    private @Nullable Output<String> masterInstanceId;

    /**
     * @return The primary instance ID bound to HaVip.
     * 
     */
    public Optional<Output<String>> masterInstanceId() {
        return Optional.ofNullable(this.masterInstanceId);
    }

    /**
     * The ID of the resource group.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The status of this resource instance.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of this resource instance.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The tags of HaVip.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    /**
     * @return The tags of HaVip.
     * 
     */
    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The VPC ID to which the HaVip instance belongs.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return The VPC ID to which the HaVip instance belongs.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    /**
     * The switch ID to which the HaVip instance belongs.
     * 
     * The following arguments will be discarded. Please use new fields as soon as possible:
     * 
     */
    @Import(name="vswitchId")
    private @Nullable Output<String> vswitchId;

    /**
     * @return The switch ID to which the HaVip instance belongs.
     * 
     * The following arguments will be discarded. Please use new fields as soon as possible:
     * 
     */
    public Optional<Output<String>> vswitchId() {
        return Optional.ofNullable(this.vswitchId);
    }

    private HaVipv2State() {}

    private HaVipv2State(HaVipv2State $) {
        this.associatedEipAddresses = $.associatedEipAddresses;
        this.associatedInstanceType = $.associatedInstanceType;
        this.associatedInstances = $.associatedInstances;
        this.createTime = $.createTime;
        this.description = $.description;
        this.haVipId = $.haVipId;
        this.haVipName = $.haVipName;
        this.havipName = $.havipName;
        this.ipAddress = $.ipAddress;
        this.masterInstanceId = $.masterInstanceId;
        this.resourceGroupId = $.resourceGroupId;
        this.status = $.status;
        this.tags = $.tags;
        this.vpcId = $.vpcId;
        this.vswitchId = $.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HaVipv2State defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HaVipv2State $;

        public Builder() {
            $ = new HaVipv2State();
        }

        public Builder(HaVipv2State defaults) {
            $ = new HaVipv2State(Objects.requireNonNull(defaults));
        }

        /**
         * @param associatedEipAddresses EIP bound to HaVip.
         * 
         * @return builder
         * 
         */
        public Builder associatedEipAddresses(@Nullable Output<List<String>> associatedEipAddresses) {
            $.associatedEipAddresses = associatedEipAddresses;
            return this;
        }

        /**
         * @param associatedEipAddresses EIP bound to HaVip.
         * 
         * @return builder
         * 
         */
        public Builder associatedEipAddresses(List<String> associatedEipAddresses) {
            return associatedEipAddresses(Output.of(associatedEipAddresses));
        }

        /**
         * @param associatedEipAddresses EIP bound to HaVip.
         * 
         * @return builder
         * 
         */
        public Builder associatedEipAddresses(String... associatedEipAddresses) {
            return associatedEipAddresses(List.of(associatedEipAddresses));
        }

        /**
         * @param associatedInstanceType The type of the instance that is bound to the HaVip. Value:-**EcsInstance**: ECS instance.-**NetworkInterface**: ENI instance.
         * 
         * @return builder
         * 
         */
        public Builder associatedInstanceType(@Nullable Output<String> associatedInstanceType) {
            $.associatedInstanceType = associatedInstanceType;
            return this;
        }

        /**
         * @param associatedInstanceType The type of the instance that is bound to the HaVip. Value:-**EcsInstance**: ECS instance.-**NetworkInterface**: ENI instance.
         * 
         * @return builder
         * 
         */
        public Builder associatedInstanceType(String associatedInstanceType) {
            return associatedInstanceType(Output.of(associatedInstanceType));
        }

        /**
         * @param associatedInstances An ECS instance that is bound to HaVip.
         * 
         * @return builder
         * 
         */
        public Builder associatedInstances(@Nullable Output<List<String>> associatedInstances) {
            $.associatedInstances = associatedInstances;
            return this;
        }

        /**
         * @param associatedInstances An ECS instance that is bound to HaVip.
         * 
         * @return builder
         * 
         */
        public Builder associatedInstances(List<String> associatedInstances) {
            return associatedInstances(Output.of(associatedInstances));
        }

        /**
         * @param associatedInstances An ECS instance that is bound to HaVip.
         * 
         * @return builder
         * 
         */
        public Builder associatedInstances(String... associatedInstances) {
            return associatedInstances(List.of(associatedInstances));
        }

        /**
         * @param createTime The creation time of the resource.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The creation time of the resource.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param description The description of the HaVip instance. The length is 2 to 256 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the HaVip instance. The length is 2 to 256 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param haVipId The ID of the resource.
         * 
         * @return builder
         * 
         */
        public Builder haVipId(@Nullable Output<String> haVipId) {
            $.haVipId = haVipId;
            return this;
        }

        /**
         * @param haVipId The ID of the resource.
         * 
         * @return builder
         * 
         */
        public Builder haVipId(String haVipId) {
            return haVipId(Output.of(haVipId));
        }

        /**
         * @param haVipName The name of the HaVip instance.
         * 
         * @return builder
         * 
         */
        public Builder haVipName(@Nullable Output<String> haVipName) {
            $.haVipName = haVipName;
            return this;
        }

        /**
         * @param haVipName The name of the HaVip instance.
         * 
         * @return builder
         * 
         */
        public Builder haVipName(String haVipName) {
            return haVipName(Output.of(haVipName));
        }

        /**
         * @param havipName Field &#39;havip_name&#39; has been deprecated from provider version 1.205.0. New field &#39;ha_vip_name&#39; instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;havip_name&#39; has been deprecated from provider version 1.205.0. New field &#39;ha_vip_name&#39; instead.
         * 
         */
        @Deprecated /* Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead. */
        public Builder havipName(@Nullable Output<String> havipName) {
            $.havipName = havipName;
            return this;
        }

        /**
         * @param havipName Field &#39;havip_name&#39; has been deprecated from provider version 1.205.0. New field &#39;ha_vip_name&#39; instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;havip_name&#39; has been deprecated from provider version 1.205.0. New field &#39;ha_vip_name&#39; instead.
         * 
         */
        @Deprecated /* Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead. */
        public Builder havipName(String havipName) {
            return havipName(Output.of(havipName));
        }

        /**
         * @param ipAddress The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param ipAddress The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        /**
         * @param masterInstanceId The primary instance ID bound to HaVip.
         * 
         * @return builder
         * 
         */
        public Builder masterInstanceId(@Nullable Output<String> masterInstanceId) {
            $.masterInstanceId = masterInstanceId;
            return this;
        }

        /**
         * @param masterInstanceId The primary instance ID bound to HaVip.
         * 
         * @return builder
         * 
         */
        public Builder masterInstanceId(String masterInstanceId) {
            return masterInstanceId(Output.of(masterInstanceId));
        }

        /**
         * @param resourceGroupId The ID of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The ID of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param status The status of this resource instance.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of this resource instance.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags The tags of HaVip.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags of HaVip.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param vpcId The VPC ID to which the HaVip instance belongs.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The VPC ID to which the HaVip instance belongs.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        /**
         * @param vswitchId The switch ID to which the HaVip instance belongs.
         * 
         * The following arguments will be discarded. Please use new fields as soon as possible:
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(@Nullable Output<String> vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        /**
         * @param vswitchId The switch ID to which the HaVip instance belongs.
         * 
         * The following arguments will be discarded. Please use new fields as soon as possible:
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(String vswitchId) {
            return vswitchId(Output.of(vswitchId));
        }

        public HaVipv2State build() {
            return $;
        }
    }

}
