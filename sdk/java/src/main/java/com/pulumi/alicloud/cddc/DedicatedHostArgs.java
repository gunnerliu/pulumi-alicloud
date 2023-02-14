// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cddc;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DedicatedHostArgs extends com.pulumi.resources.ResourceArgs {

    public static final DedicatedHostArgs Empty = new DedicatedHostArgs();

    /**
     * Specifies whether instances can be created on the host. Valid values: `Allocatable` or `Suspended`. `Allocatable`: Instances can be created on the host. `Suspended`: Instances cannot be created on the host.
     * 
     */
    @Import(name="allocationStatus")
    private @Nullable Output<String> allocationStatus;

    /**
     * @return Specifies whether instances can be created on the host. Valid values: `Allocatable` or `Suspended`. `Allocatable`: Instances can be created on the host. `Suspended`: Instances cannot be created on the host.
     * 
     */
    public Optional<Output<String>> allocationStatus() {
        return Optional.ofNullable(this.allocationStatus);
    }

    /**
     * Specifies whether to enable the auto-renewal feature.
     * 
     */
    @Import(name="autoRenew")
    private @Nullable Output<Boolean> autoRenew;

    /**
     * @return Specifies whether to enable the auto-renewal feature.
     * 
     */
    public Optional<Output<Boolean>> autoRenew() {
        return Optional.ofNullable(this.autoRenew);
    }

    /**
     * The ID of the dedicated cluster.
     * 
     */
    @Import(name="dedicatedHostGroupId", required=true)
    private Output<String> dedicatedHostGroupId;

    /**
     * @return The ID of the dedicated cluster.
     * 
     */
    public Output<String> dedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    /**
     * The instance type of the host. For more information about the supported instance types of hosts, see [Host specification details](https://www.alibabacloud.com/help/doc-detail/206343.htm).
     * 
     */
    @Import(name="hostClass", required=true)
    private Output<String> hostClass;

    /**
     * @return The instance type of the host. For more information about the supported instance types of hosts, see [Host specification details](https://www.alibabacloud.com/help/doc-detail/206343.htm).
     * 
     */
    public Output<String> hostClass() {
        return this.hostClass;
    }

    /**
     * The name of the host. The name must be `1` to `64` characters in length and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter.
     * 
     */
    @Import(name="hostName")
    private @Nullable Output<String> hostName;

    /**
     * @return The name of the host. The name must be `1` to `64` characters in length and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter.
     * 
     */
    public Optional<Output<String>> hostName() {
        return Optional.ofNullable(this.hostName);
    }

    /**
     * Host Image Category. Valid values: `WindowsWithMssqlEntAlwaysonLicense`, `WindowsWithMssqlStdLicense`, `WindowsWithMssqlEntLicense`, `WindowsWithMssqlWebLicense`, `AliLinux`.
     * 
     */
    @Import(name="imageCategory")
    private @Nullable Output<String> imageCategory;

    /**
     * @return Host Image Category. Valid values: `WindowsWithMssqlEntAlwaysonLicense`, `WindowsWithMssqlStdLicense`, `WindowsWithMssqlEntLicense`, `WindowsWithMssqlWebLicense`, `AliLinux`.
     * 
     */
    public Optional<Output<String>> imageCategory() {
        return Optional.ofNullable(this.imageCategory);
    }

    /**
     * Host password. **NOTE:** The creation of a host password is supported only when the database type is `Tair-PMem`.
     * 
     */
    @Import(name="osPassword")
    private @Nullable Output<String> osPassword;

    /**
     * @return Host password. **NOTE:** The creation of a host password is supported only when the database type is `Tair-PMem`.
     * 
     */
    public Optional<Output<String>> osPassword() {
        return Optional.ofNullable(this.osPassword);
    }

    /**
     * The payment type of the resource. Valid values: `Subscription`.
     * 
     */
    @Import(name="paymentType", required=true)
    private Output<String> paymentType;

    /**
     * @return The payment type of the resource. Valid values: `Subscription`.
     * 
     */
    public Output<String> paymentType() {
        return this.paymentType;
    }

    /**
     * The unit of the subscription duration. Valid values: `Year`, `Month`, `Week`.
     * 
     */
    @Import(name="period")
    private @Nullable Output<String> period;

    /**
     * @return The unit of the subscription duration. Valid values: `Year`, `Month`, `Week`.
     * 
     */
    public Optional<Output<String>> period() {
        return Optional.ofNullable(this.period);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The subscription duration of the host. Valid values:
     * * If the Period parameter is set to `Year`, the value of the UsedTime parameter ranges from `1` to `5`.
     * * If the Period parameter is set to `Month`, the value of the UsedTime parameter ranges from `1` to `9`.
     * * If the Period parameter is set to `Week`, the value of the UsedTime parameter ranges from `1`, `2` and `3`.
     * 
     */
    @Import(name="usedTime")
    private @Nullable Output<Integer> usedTime;

    /**
     * @return The subscription duration of the host. Valid values:
     * * If the Period parameter is set to `Year`, the value of the UsedTime parameter ranges from `1` to `5`.
     * * If the Period parameter is set to `Month`, the value of the UsedTime parameter ranges from `1` to `9`.
     * * If the Period parameter is set to `Week`, the value of the UsedTime parameter ranges from `1`, `2` and `3`.
     * 
     */
    public Optional<Output<Integer>> usedTime() {
        return Optional.ofNullable(this.usedTime);
    }

    /**
     * The ID of the vSwitch to which the host is connected.
     * 
     */
    @Import(name="vswitchId", required=true)
    private Output<String> vswitchId;

    /**
     * @return The ID of the vSwitch to which the host is connected.
     * 
     */
    public Output<String> vswitchId() {
        return this.vswitchId;
    }

    /**
     * The ID of the zone.
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return The ID of the zone.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private DedicatedHostArgs() {}

    private DedicatedHostArgs(DedicatedHostArgs $) {
        this.allocationStatus = $.allocationStatus;
        this.autoRenew = $.autoRenew;
        this.dedicatedHostGroupId = $.dedicatedHostGroupId;
        this.hostClass = $.hostClass;
        this.hostName = $.hostName;
        this.imageCategory = $.imageCategory;
        this.osPassword = $.osPassword;
        this.paymentType = $.paymentType;
        this.period = $.period;
        this.tags = $.tags;
        this.usedTime = $.usedTime;
        this.vswitchId = $.vswitchId;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DedicatedHostArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DedicatedHostArgs $;

        public Builder() {
            $ = new DedicatedHostArgs();
        }

        public Builder(DedicatedHostArgs defaults) {
            $ = new DedicatedHostArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allocationStatus Specifies whether instances can be created on the host. Valid values: `Allocatable` or `Suspended`. `Allocatable`: Instances can be created on the host. `Suspended`: Instances cannot be created on the host.
         * 
         * @return builder
         * 
         */
        public Builder allocationStatus(@Nullable Output<String> allocationStatus) {
            $.allocationStatus = allocationStatus;
            return this;
        }

        /**
         * @param allocationStatus Specifies whether instances can be created on the host. Valid values: `Allocatable` or `Suspended`. `Allocatable`: Instances can be created on the host. `Suspended`: Instances cannot be created on the host.
         * 
         * @return builder
         * 
         */
        public Builder allocationStatus(String allocationStatus) {
            return allocationStatus(Output.of(allocationStatus));
        }

        /**
         * @param autoRenew Specifies whether to enable the auto-renewal feature.
         * 
         * @return builder
         * 
         */
        public Builder autoRenew(@Nullable Output<Boolean> autoRenew) {
            $.autoRenew = autoRenew;
            return this;
        }

        /**
         * @param autoRenew Specifies whether to enable the auto-renewal feature.
         * 
         * @return builder
         * 
         */
        public Builder autoRenew(Boolean autoRenew) {
            return autoRenew(Output.of(autoRenew));
        }

        /**
         * @param dedicatedHostGroupId The ID of the dedicated cluster.
         * 
         * @return builder
         * 
         */
        public Builder dedicatedHostGroupId(Output<String> dedicatedHostGroupId) {
            $.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }

        /**
         * @param dedicatedHostGroupId The ID of the dedicated cluster.
         * 
         * @return builder
         * 
         */
        public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
            return dedicatedHostGroupId(Output.of(dedicatedHostGroupId));
        }

        /**
         * @param hostClass The instance type of the host. For more information about the supported instance types of hosts, see [Host specification details](https://www.alibabacloud.com/help/doc-detail/206343.htm).
         * 
         * @return builder
         * 
         */
        public Builder hostClass(Output<String> hostClass) {
            $.hostClass = hostClass;
            return this;
        }

        /**
         * @param hostClass The instance type of the host. For more information about the supported instance types of hosts, see [Host specification details](https://www.alibabacloud.com/help/doc-detail/206343.htm).
         * 
         * @return builder
         * 
         */
        public Builder hostClass(String hostClass) {
            return hostClass(Output.of(hostClass));
        }

        /**
         * @param hostName The name of the host. The name must be `1` to `64` characters in length and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter.
         * 
         * @return builder
         * 
         */
        public Builder hostName(@Nullable Output<String> hostName) {
            $.hostName = hostName;
            return this;
        }

        /**
         * @param hostName The name of the host. The name must be `1` to `64` characters in length and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter.
         * 
         * @return builder
         * 
         */
        public Builder hostName(String hostName) {
            return hostName(Output.of(hostName));
        }

        /**
         * @param imageCategory Host Image Category. Valid values: `WindowsWithMssqlEntAlwaysonLicense`, `WindowsWithMssqlStdLicense`, `WindowsWithMssqlEntLicense`, `WindowsWithMssqlWebLicense`, `AliLinux`.
         * 
         * @return builder
         * 
         */
        public Builder imageCategory(@Nullable Output<String> imageCategory) {
            $.imageCategory = imageCategory;
            return this;
        }

        /**
         * @param imageCategory Host Image Category. Valid values: `WindowsWithMssqlEntAlwaysonLicense`, `WindowsWithMssqlStdLicense`, `WindowsWithMssqlEntLicense`, `WindowsWithMssqlWebLicense`, `AliLinux`.
         * 
         * @return builder
         * 
         */
        public Builder imageCategory(String imageCategory) {
            return imageCategory(Output.of(imageCategory));
        }

        /**
         * @param osPassword Host password. **NOTE:** The creation of a host password is supported only when the database type is `Tair-PMem`.
         * 
         * @return builder
         * 
         */
        public Builder osPassword(@Nullable Output<String> osPassword) {
            $.osPassword = osPassword;
            return this;
        }

        /**
         * @param osPassword Host password. **NOTE:** The creation of a host password is supported only when the database type is `Tair-PMem`.
         * 
         * @return builder
         * 
         */
        public Builder osPassword(String osPassword) {
            return osPassword(Output.of(osPassword));
        }

        /**
         * @param paymentType The payment type of the resource. Valid values: `Subscription`.
         * 
         * @return builder
         * 
         */
        public Builder paymentType(Output<String> paymentType) {
            $.paymentType = paymentType;
            return this;
        }

        /**
         * @param paymentType The payment type of the resource. Valid values: `Subscription`.
         * 
         * @return builder
         * 
         */
        public Builder paymentType(String paymentType) {
            return paymentType(Output.of(paymentType));
        }

        /**
         * @param period The unit of the subscription duration. Valid values: `Year`, `Month`, `Week`.
         * 
         * @return builder
         * 
         */
        public Builder period(@Nullable Output<String> period) {
            $.period = period;
            return this;
        }

        /**
         * @param period The unit of the subscription duration. Valid values: `Year`, `Month`, `Week`.
         * 
         * @return builder
         * 
         */
        public Builder period(String period) {
            return period(Output.of(period));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param usedTime The subscription duration of the host. Valid values:
         * * If the Period parameter is set to `Year`, the value of the UsedTime parameter ranges from `1` to `5`.
         * * If the Period parameter is set to `Month`, the value of the UsedTime parameter ranges from `1` to `9`.
         * * If the Period parameter is set to `Week`, the value of the UsedTime parameter ranges from `1`, `2` and `3`.
         * 
         * @return builder
         * 
         */
        public Builder usedTime(@Nullable Output<Integer> usedTime) {
            $.usedTime = usedTime;
            return this;
        }

        /**
         * @param usedTime The subscription duration of the host. Valid values:
         * * If the Period parameter is set to `Year`, the value of the UsedTime parameter ranges from `1` to `5`.
         * * If the Period parameter is set to `Month`, the value of the UsedTime parameter ranges from `1` to `9`.
         * * If the Period parameter is set to `Week`, the value of the UsedTime parameter ranges from `1`, `2` and `3`.
         * 
         * @return builder
         * 
         */
        public Builder usedTime(Integer usedTime) {
            return usedTime(Output.of(usedTime));
        }

        /**
         * @param vswitchId The ID of the vSwitch to which the host is connected.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(Output<String> vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        /**
         * @param vswitchId The ID of the vSwitch to which the host is connected.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(String vswitchId) {
            return vswitchId(Output.of(vswitchId));
        }

        /**
         * @param zoneId The ID of the zone.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The ID of the zone.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public DedicatedHostArgs build() {
            $.dedicatedHostGroupId = Objects.requireNonNull($.dedicatedHostGroupId, "expected parameter 'dedicatedHostGroupId' to be non-null");
            $.hostClass = Objects.requireNonNull($.hostClass, "expected parameter 'hostClass' to be non-null");
            $.paymentType = Objects.requireNonNull($.paymentType, "expected parameter 'paymentType' to be non-null");
            $.vswitchId = Objects.requireNonNull($.vswitchId, "expected parameter 'vswitchId' to be non-null");
            $.zoneId = Objects.requireNonNull($.zoneId, "expected parameter 'zoneId' to be non-null");
            return $;
        }
    }

}