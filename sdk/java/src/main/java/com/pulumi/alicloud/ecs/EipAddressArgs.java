// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EipAddressArgs extends com.pulumi.resources.ResourceArgs {

    public static final EipAddressArgs Empty = new EipAddressArgs();

    /**
     * Special activity ID. This parameter is not required.
     * 
     */
    @Import(name="activityId")
    private @Nullable Output<String> activityId;

    /**
     * @return Special activity ID. This parameter is not required.
     * 
     */
    public Optional<Output<String>> activityId() {
        return Optional.ofNullable(this.activityId);
    }

    /**
     * The name of the EIP instance. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;,&#34;.&#34;,&#34;_&#34;, and must not begin or end with a hyphen, and must not begin with http:// or https://.
     * 
     */
    @Import(name="addressName")
    private @Nullable Output<String> addressName;

    /**
     * @return The name of the EIP instance. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;,&#34;.&#34;,&#34;_&#34;, and must not begin or end with a hyphen, and must not begin with http:// or https://.
     * 
     */
    public Optional<Output<String>> addressName() {
        return Optional.ofNullable(this.addressName);
    }

    /**
     * Whether to pay automatically. Valid values: `true` and `false`. Default value: `true`. When `auto_pay` is `true`, The order will be automatically paid. When `auto_pay` is `false`, The order needs to go to the order center to complete the payment. **NOTE:** When `payment_type` is `Subscription`, this parameter is valid.
     * 
     */
    @Import(name="autoPay")
    private @Nullable Output<Boolean> autoPay;

    /**
     * @return Whether to pay automatically. Valid values: `true` and `false`. Default value: `true`. When `auto_pay` is `true`, The order will be automatically paid. When `auto_pay` is `false`, The order needs to go to the order center to complete the payment. **NOTE:** When `payment_type` is `Subscription`, this parameter is valid.
     * 
     */
    public Optional<Output<Boolean>> autoPay() {
        return Optional.ofNullable(this.autoPay);
    }

    /**
     * The maximum bandwidth of the EIP. Valid values: `1` to `200`. Unit: Mbit/s. Default value: `5`.
     * 
     */
    @Import(name="bandwidth")
    private @Nullable Output<String> bandwidth;

    /**
     * @return The maximum bandwidth of the EIP. Valid values: `1` to `200`. Unit: Mbit/s. Default value: `5`.
     * 
     */
    public Optional<Output<String>> bandwidth() {
        return Optional.ofNullable(this.bandwidth);
    }

    /**
     * Whether the delete protection function is turned on.
     * - **true**: enabled.
     * - **false**: not enabled.
     * 
     */
    @Import(name="deletionProtection")
    private @Nullable Output<Boolean> deletionProtection;

    /**
     * @return Whether the delete protection function is turned on.
     * - **true**: enabled.
     * - **false**: not enabled.
     * 
     */
    public Optional<Output<Boolean>> deletionProtection() {
        return Optional.ofNullable(this.deletionProtection);
    }

    /**
     * The description of the EIP.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the EIP.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Whether the second-level monitoring is enabled for the EIP.
     * - **OFF**: not enabled.
     * - **ON**: enabled.
     * 
     */
    @Import(name="highDefinitionMonitorLogStatus")
    private @Nullable Output<String> highDefinitionMonitorLogStatus;

    /**
     * @return Whether the second-level monitoring is enabled for the EIP.
     * - **OFF**: not enabled.
     * - **ON**: enabled.
     * 
     */
    public Optional<Output<String>> highDefinitionMonitorLogStatus() {
        return Optional.ofNullable(this.highDefinitionMonitorLogStatus);
    }

    /**
     * . Field &#39;instance_charge_type&#39; has been deprecated from provider version 1.126.0. New field &#39;payment_type&#39; instead.
     * 
     * @deprecated
     * Field &#39;instance_charge_type&#39; has been deprecated since provider version 1.126.0. New field &#39;payment_type&#39; instead.
     * 
     */
    @Deprecated /* Field 'instance_charge_type' has been deprecated since provider version 1.126.0. New field 'payment_type' instead. */
    @Import(name="instanceChargeType")
    private @Nullable Output<String> instanceChargeType;

    /**
     * @return . Field &#39;instance_charge_type&#39; has been deprecated from provider version 1.126.0. New field &#39;payment_type&#39; instead.
     * 
     * @deprecated
     * Field &#39;instance_charge_type&#39; has been deprecated since provider version 1.126.0. New field &#39;payment_type&#39; instead.
     * 
     */
    @Deprecated /* Field 'instance_charge_type' has been deprecated since provider version 1.126.0. New field 'payment_type' instead. */
    public Optional<Output<String>> instanceChargeType() {
        return Optional.ofNullable(this.instanceChargeType);
    }

    /**
     * Renewal Payment type.
     * - **PayByBandwidth**: billed by fixed bandwidth.
     * - **PayByTraffic**: Billing by traffic.
     * 
     */
    @Import(name="internetChargeType")
    private @Nullable Output<String> internetChargeType;

    /**
     * @return Renewal Payment type.
     * - **PayByBandwidth**: billed by fixed bandwidth.
     * - **PayByTraffic**: Billing by traffic.
     * 
     */
    public Optional<Output<String>> internetChargeType() {
        return Optional.ofNullable(this.internetChargeType);
    }

    /**
     * The IP address of the EIP.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    /**
     * @return The IP address of the EIP.
     * 
     */
    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * The line type. You can set this parameter only when you create a `PayAsYouGo` EIP. Valid values:
     * 
     */
    @Import(name="isp")
    private @Nullable Output<String> isp;

    /**
     * @return The line type. You can set this parameter only when you create a `PayAsYouGo` EIP. Valid values:
     * 
     */
    public Optional<Output<String>> isp() {
        return Optional.ofNullable(this.isp);
    }

    /**
     * The Name of the logging service LogProject. Current parameter is required when configuring high precision second-by-second monitoring for EIP.
     * 
     */
    @Import(name="logProject")
    private @Nullable Output<String> logProject;

    /**
     * @return The Name of the logging service LogProject. Current parameter is required when configuring high precision second-by-second monitoring for EIP.
     * 
     */
    public Optional<Output<String>> logProject() {
        return Optional.ofNullable(this.logProject);
    }

    /**
     * The Name of the logging service LogStore. Current parameter is required when configuring high precision second-by-second monitoring for EIP.
     * 
     */
    @Import(name="logStore")
    private @Nullable Output<String> logStore;

    /**
     * @return The Name of the logging service LogStore. Current parameter is required when configuring high precision second-by-second monitoring for EIP.
     * 
     */
    public Optional<Output<String>> logStore() {
        return Optional.ofNullable(this.logStore);
    }

    /**
     * . Field &#39;name&#39; has been deprecated from provider version 1.126.0. New field &#39;address_name&#39; instead.
     * 
     * @deprecated
     * Field &#39;name&#39; has been deprecated since provider version 1.126.0. New field &#39;address_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'name' has been deprecated since provider version 1.126.0. New field 'address_name' instead. */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return . Field &#39;name&#39; has been deprecated from provider version 1.126.0. New field &#39;address_name&#39; instead.
     * 
     * @deprecated
     * Field &#39;name&#39; has been deprecated since provider version 1.126.0. New field &#39;address_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'name' has been deprecated since provider version 1.126.0. New field 'address_name' instead. */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The type of the network. Valid value is `public` (Internet).
     * 
     */
    @Import(name="netmode")
    private @Nullable Output<String> netmode;

    /**
     * @return The type of the network. Valid value is `public` (Internet).
     * 
     */
    public Optional<Output<String>> netmode() {
        return Optional.ofNullable(this.netmode);
    }

    /**
     * The billing method of the EIP. Valid values:  `Subscription`, `PayAsYouGo`.
     * 
     */
    @Import(name="paymentType")
    private @Nullable Output<String> paymentType;

    /**
     * @return The billing method of the EIP. Valid values:  `Subscription`, `PayAsYouGo`.
     * 
     */
    public Optional<Output<String>> paymentType() {
        return Optional.ofNullable(this.paymentType);
    }

    /**
     * When the PricingCycle is set to Month, the Period value ranges from 1 to 9.  When the PricingCycle is set to Year, the Period range is 1 to 5.  If the value of the InstanceChargeType parameter is PrePaid, this parameter is required. If the value of the InstanceChargeType parameter is PostPaid, this parameter is not filled in.
     * 
     */
    @Import(name="period")
    private @Nullable Output<Integer> period;

    /**
     * @return When the PricingCycle is set to Month, the Period value ranges from 1 to 9.  When the PricingCycle is set to Year, the Period range is 1 to 5.  If the value of the InstanceChargeType parameter is PrePaid, this parameter is required. If the value of the InstanceChargeType parameter is PostPaid, this parameter is not filled in.
     * 
     */
    public Optional<Output<Integer>> period() {
        return Optional.ofNullable(this.period);
    }

    /**
     * Value: Month (default): Pay monthly. Year: Pay per Year. This parameter is required when the value of the InstanceChargeType parameter is Subscription(PrePaid). This parameter is optional when the value of the InstanceChargeType parameter is PayAsYouGo(PostPaid).
     * 
     */
    @Import(name="pricingCycle")
    private @Nullable Output<String> pricingCycle;

    /**
     * @return Value: Month (default): Pay monthly. Year: Pay per Year. This parameter is required when the value of the InstanceChargeType parameter is Subscription(PrePaid). This parameter is optional when the value of the InstanceChargeType parameter is PayAsYouGo(PostPaid).
     * 
     */
    public Optional<Output<String>> pricingCycle() {
        return Optional.ofNullable(this.pricingCycle);
    }

    /**
     * The ID of the IP address pool to which the EIP belongs.
     * 
     */
    @Import(name="publicIpAddressPoolId")
    private @Nullable Output<String> publicIpAddressPoolId;

    /**
     * @return The ID of the IP address pool to which the EIP belongs.
     * 
     */
    public Optional<Output<String>> publicIpAddressPoolId() {
        return Optional.ofNullable(this.publicIpAddressPoolId);
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
     * Security protection level.
     * - When the return is empty, the basic DDoS protection is specified.
     * - When **antidos_enhanced** is returned, it indicates DDoS protection (enhanced version).
     * 
     */
    @Import(name="securityProtectionTypes")
    private @Nullable Output<List<String>> securityProtectionTypes;

    /**
     * @return Security protection level.
     * - When the return is empty, the basic DDoS protection is specified.
     * - When **antidos_enhanced** is returned, it indicates DDoS protection (enhanced version).
     * 
     */
    public Optional<Output<List<String>>> securityProtectionTypes() {
        return Optional.ofNullable(this.securityProtectionTypes);
    }

    /**
     * The tag of the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    /**
     * @return The tag of the resource.
     * 
     */
    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The zone of the EIP.  This parameter is returned only for whitelist users that are visible to the zone.
     * 
     * The following arguments will be discarded. Please use new fields as soon as possible:
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return The zone of the EIP.  This parameter is returned only for whitelist users that are visible to the zone.
     * 
     * The following arguments will be discarded. Please use new fields as soon as possible:
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private EipAddressArgs() {}

    private EipAddressArgs(EipAddressArgs $) {
        this.activityId = $.activityId;
        this.addressName = $.addressName;
        this.autoPay = $.autoPay;
        this.bandwidth = $.bandwidth;
        this.deletionProtection = $.deletionProtection;
        this.description = $.description;
        this.highDefinitionMonitorLogStatus = $.highDefinitionMonitorLogStatus;
        this.instanceChargeType = $.instanceChargeType;
        this.internetChargeType = $.internetChargeType;
        this.ipAddress = $.ipAddress;
        this.isp = $.isp;
        this.logProject = $.logProject;
        this.logStore = $.logStore;
        this.name = $.name;
        this.netmode = $.netmode;
        this.paymentType = $.paymentType;
        this.period = $.period;
        this.pricingCycle = $.pricingCycle;
        this.publicIpAddressPoolId = $.publicIpAddressPoolId;
        this.resourceGroupId = $.resourceGroupId;
        this.securityProtectionTypes = $.securityProtectionTypes;
        this.tags = $.tags;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EipAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EipAddressArgs $;

        public Builder() {
            $ = new EipAddressArgs();
        }

        public Builder(EipAddressArgs defaults) {
            $ = new EipAddressArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param activityId Special activity ID. This parameter is not required.
         * 
         * @return builder
         * 
         */
        public Builder activityId(@Nullable Output<String> activityId) {
            $.activityId = activityId;
            return this;
        }

        /**
         * @param activityId Special activity ID. This parameter is not required.
         * 
         * @return builder
         * 
         */
        public Builder activityId(String activityId) {
            return activityId(Output.of(activityId));
        }

        /**
         * @param addressName The name of the EIP instance. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;,&#34;.&#34;,&#34;_&#34;, and must not begin or end with a hyphen, and must not begin with http:// or https://.
         * 
         * @return builder
         * 
         */
        public Builder addressName(@Nullable Output<String> addressName) {
            $.addressName = addressName;
            return this;
        }

        /**
         * @param addressName The name of the EIP instance. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;,&#34;.&#34;,&#34;_&#34;, and must not begin or end with a hyphen, and must not begin with http:// or https://.
         * 
         * @return builder
         * 
         */
        public Builder addressName(String addressName) {
            return addressName(Output.of(addressName));
        }

        /**
         * @param autoPay Whether to pay automatically. Valid values: `true` and `false`. Default value: `true`. When `auto_pay` is `true`, The order will be automatically paid. When `auto_pay` is `false`, The order needs to go to the order center to complete the payment. **NOTE:** When `payment_type` is `Subscription`, this parameter is valid.
         * 
         * @return builder
         * 
         */
        public Builder autoPay(@Nullable Output<Boolean> autoPay) {
            $.autoPay = autoPay;
            return this;
        }

        /**
         * @param autoPay Whether to pay automatically. Valid values: `true` and `false`. Default value: `true`. When `auto_pay` is `true`, The order will be automatically paid. When `auto_pay` is `false`, The order needs to go to the order center to complete the payment. **NOTE:** When `payment_type` is `Subscription`, this parameter is valid.
         * 
         * @return builder
         * 
         */
        public Builder autoPay(Boolean autoPay) {
            return autoPay(Output.of(autoPay));
        }

        /**
         * @param bandwidth The maximum bandwidth of the EIP. Valid values: `1` to `200`. Unit: Mbit/s. Default value: `5`.
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(@Nullable Output<String> bandwidth) {
            $.bandwidth = bandwidth;
            return this;
        }

        /**
         * @param bandwidth The maximum bandwidth of the EIP. Valid values: `1` to `200`. Unit: Mbit/s. Default value: `5`.
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(String bandwidth) {
            return bandwidth(Output.of(bandwidth));
        }

        /**
         * @param deletionProtection Whether the delete protection function is turned on.
         * - **true**: enabled.
         * - **false**: not enabled.
         * 
         * @return builder
         * 
         */
        public Builder deletionProtection(@Nullable Output<Boolean> deletionProtection) {
            $.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * @param deletionProtection Whether the delete protection function is turned on.
         * - **true**: enabled.
         * - **false**: not enabled.
         * 
         * @return builder
         * 
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            return deletionProtection(Output.of(deletionProtection));
        }

        /**
         * @param description The description of the EIP.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the EIP.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param highDefinitionMonitorLogStatus Whether the second-level monitoring is enabled for the EIP.
         * - **OFF**: not enabled.
         * - **ON**: enabled.
         * 
         * @return builder
         * 
         */
        public Builder highDefinitionMonitorLogStatus(@Nullable Output<String> highDefinitionMonitorLogStatus) {
            $.highDefinitionMonitorLogStatus = highDefinitionMonitorLogStatus;
            return this;
        }

        /**
         * @param highDefinitionMonitorLogStatus Whether the second-level monitoring is enabled for the EIP.
         * - **OFF**: not enabled.
         * - **ON**: enabled.
         * 
         * @return builder
         * 
         */
        public Builder highDefinitionMonitorLogStatus(String highDefinitionMonitorLogStatus) {
            return highDefinitionMonitorLogStatus(Output.of(highDefinitionMonitorLogStatus));
        }

        /**
         * @param instanceChargeType . Field &#39;instance_charge_type&#39; has been deprecated from provider version 1.126.0. New field &#39;payment_type&#39; instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;instance_charge_type&#39; has been deprecated since provider version 1.126.0. New field &#39;payment_type&#39; instead.
         * 
         */
        @Deprecated /* Field 'instance_charge_type' has been deprecated since provider version 1.126.0. New field 'payment_type' instead. */
        public Builder instanceChargeType(@Nullable Output<String> instanceChargeType) {
            $.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * @param instanceChargeType . Field &#39;instance_charge_type&#39; has been deprecated from provider version 1.126.0. New field &#39;payment_type&#39; instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;instance_charge_type&#39; has been deprecated since provider version 1.126.0. New field &#39;payment_type&#39; instead.
         * 
         */
        @Deprecated /* Field 'instance_charge_type' has been deprecated since provider version 1.126.0. New field 'payment_type' instead. */
        public Builder instanceChargeType(String instanceChargeType) {
            return instanceChargeType(Output.of(instanceChargeType));
        }

        /**
         * @param internetChargeType Renewal Payment type.
         * - **PayByBandwidth**: billed by fixed bandwidth.
         * - **PayByTraffic**: Billing by traffic.
         * 
         * @return builder
         * 
         */
        public Builder internetChargeType(@Nullable Output<String> internetChargeType) {
            $.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * @param internetChargeType Renewal Payment type.
         * - **PayByBandwidth**: billed by fixed bandwidth.
         * - **PayByTraffic**: Billing by traffic.
         * 
         * @return builder
         * 
         */
        public Builder internetChargeType(String internetChargeType) {
            return internetChargeType(Output.of(internetChargeType));
        }

        /**
         * @param ipAddress The IP address of the EIP.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param ipAddress The IP address of the EIP.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        /**
         * @param isp The line type. You can set this parameter only when you create a `PayAsYouGo` EIP. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder isp(@Nullable Output<String> isp) {
            $.isp = isp;
            return this;
        }

        /**
         * @param isp The line type. You can set this parameter only when you create a `PayAsYouGo` EIP. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder isp(String isp) {
            return isp(Output.of(isp));
        }

        /**
         * @param logProject The Name of the logging service LogProject. Current parameter is required when configuring high precision second-by-second monitoring for EIP.
         * 
         * @return builder
         * 
         */
        public Builder logProject(@Nullable Output<String> logProject) {
            $.logProject = logProject;
            return this;
        }

        /**
         * @param logProject The Name of the logging service LogProject. Current parameter is required when configuring high precision second-by-second monitoring for EIP.
         * 
         * @return builder
         * 
         */
        public Builder logProject(String logProject) {
            return logProject(Output.of(logProject));
        }

        /**
         * @param logStore The Name of the logging service LogStore. Current parameter is required when configuring high precision second-by-second monitoring for EIP.
         * 
         * @return builder
         * 
         */
        public Builder logStore(@Nullable Output<String> logStore) {
            $.logStore = logStore;
            return this;
        }

        /**
         * @param logStore The Name of the logging service LogStore. Current parameter is required when configuring high precision second-by-second monitoring for EIP.
         * 
         * @return builder
         * 
         */
        public Builder logStore(String logStore) {
            return logStore(Output.of(logStore));
        }

        /**
         * @param name . Field &#39;name&#39; has been deprecated from provider version 1.126.0. New field &#39;address_name&#39; instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;name&#39; has been deprecated since provider version 1.126.0. New field &#39;address_name&#39; instead.
         * 
         */
        @Deprecated /* Field 'name' has been deprecated since provider version 1.126.0. New field 'address_name' instead. */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name . Field &#39;name&#39; has been deprecated from provider version 1.126.0. New field &#39;address_name&#39; instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;name&#39; has been deprecated since provider version 1.126.0. New field &#39;address_name&#39; instead.
         * 
         */
        @Deprecated /* Field 'name' has been deprecated since provider version 1.126.0. New field 'address_name' instead. */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param netmode The type of the network. Valid value is `public` (Internet).
         * 
         * @return builder
         * 
         */
        public Builder netmode(@Nullable Output<String> netmode) {
            $.netmode = netmode;
            return this;
        }

        /**
         * @param netmode The type of the network. Valid value is `public` (Internet).
         * 
         * @return builder
         * 
         */
        public Builder netmode(String netmode) {
            return netmode(Output.of(netmode));
        }

        /**
         * @param paymentType The billing method of the EIP. Valid values:  `Subscription`, `PayAsYouGo`.
         * 
         * @return builder
         * 
         */
        public Builder paymentType(@Nullable Output<String> paymentType) {
            $.paymentType = paymentType;
            return this;
        }

        /**
         * @param paymentType The billing method of the EIP. Valid values:  `Subscription`, `PayAsYouGo`.
         * 
         * @return builder
         * 
         */
        public Builder paymentType(String paymentType) {
            return paymentType(Output.of(paymentType));
        }

        /**
         * @param period When the PricingCycle is set to Month, the Period value ranges from 1 to 9.  When the PricingCycle is set to Year, the Period range is 1 to 5.  If the value of the InstanceChargeType parameter is PrePaid, this parameter is required. If the value of the InstanceChargeType parameter is PostPaid, this parameter is not filled in.
         * 
         * @return builder
         * 
         */
        public Builder period(@Nullable Output<Integer> period) {
            $.period = period;
            return this;
        }

        /**
         * @param period When the PricingCycle is set to Month, the Period value ranges from 1 to 9.  When the PricingCycle is set to Year, the Period range is 1 to 5.  If the value of the InstanceChargeType parameter is PrePaid, this parameter is required. If the value of the InstanceChargeType parameter is PostPaid, this parameter is not filled in.
         * 
         * @return builder
         * 
         */
        public Builder period(Integer period) {
            return period(Output.of(period));
        }

        /**
         * @param pricingCycle Value: Month (default): Pay monthly. Year: Pay per Year. This parameter is required when the value of the InstanceChargeType parameter is Subscription(PrePaid). This parameter is optional when the value of the InstanceChargeType parameter is PayAsYouGo(PostPaid).
         * 
         * @return builder
         * 
         */
        public Builder pricingCycle(@Nullable Output<String> pricingCycle) {
            $.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * @param pricingCycle Value: Month (default): Pay monthly. Year: Pay per Year. This parameter is required when the value of the InstanceChargeType parameter is Subscription(PrePaid). This parameter is optional when the value of the InstanceChargeType parameter is PayAsYouGo(PostPaid).
         * 
         * @return builder
         * 
         */
        public Builder pricingCycle(String pricingCycle) {
            return pricingCycle(Output.of(pricingCycle));
        }

        /**
         * @param publicIpAddressPoolId The ID of the IP address pool to which the EIP belongs.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddressPoolId(@Nullable Output<String> publicIpAddressPoolId) {
            $.publicIpAddressPoolId = publicIpAddressPoolId;
            return this;
        }

        /**
         * @param publicIpAddressPoolId The ID of the IP address pool to which the EIP belongs.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddressPoolId(String publicIpAddressPoolId) {
            return publicIpAddressPoolId(Output.of(publicIpAddressPoolId));
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
         * @param securityProtectionTypes Security protection level.
         * - When the return is empty, the basic DDoS protection is specified.
         * - When **antidos_enhanced** is returned, it indicates DDoS protection (enhanced version).
         * 
         * @return builder
         * 
         */
        public Builder securityProtectionTypes(@Nullable Output<List<String>> securityProtectionTypes) {
            $.securityProtectionTypes = securityProtectionTypes;
            return this;
        }

        /**
         * @param securityProtectionTypes Security protection level.
         * - When the return is empty, the basic DDoS protection is specified.
         * - When **antidos_enhanced** is returned, it indicates DDoS protection (enhanced version).
         * 
         * @return builder
         * 
         */
        public Builder securityProtectionTypes(List<String> securityProtectionTypes) {
            return securityProtectionTypes(Output.of(securityProtectionTypes));
        }

        /**
         * @param securityProtectionTypes Security protection level.
         * - When the return is empty, the basic DDoS protection is specified.
         * - When **antidos_enhanced** is returned, it indicates DDoS protection (enhanced version).
         * 
         * @return builder
         * 
         */
        public Builder securityProtectionTypes(String... securityProtectionTypes) {
            return securityProtectionTypes(List.of(securityProtectionTypes));
        }

        /**
         * @param tags The tag of the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tag of the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param zone The zone of the EIP.  This parameter is returned only for whitelist users that are visible to the zone.
         * 
         * The following arguments will be discarded. Please use new fields as soon as possible:
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone The zone of the EIP.  This parameter is returned only for whitelist users that are visible to the zone.
         * 
         * The following arguments will be discarded. Please use new fields as soon as possible:
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public EipAddressArgs build() {
            return $;
        }
    }

}
